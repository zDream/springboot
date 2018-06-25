package tv.seei.manage.ais.controller;

import gnu.io.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.seei.manage.ais.dao.*;
import tv.seei.manage.ais.entity.*;
import tv.seei.manage.ais.exception.*;
import tv.seei.manage.ais.service.AisService;
import tv.seei.manage.ais.util.ArrayUtils;
import tv.seei.manage.ais.util.SerialPortManager;

import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/ais")
public class AisController implements Runnable{

    @Autowired
    public AisService aisService;

    @RequestMapping(value="test",method = RequestMethod.GET)
    public void ais() throws Exception{
        String file = "C:\\Users\\tongt\\Desktop\\saab\\test\\2.txt";
        InputStream inputStream = new FileInputStream(new File(file));
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.read()>0){
            String s = bufferedReader.readLine();
            String[] split = s.split(",");
            char[] chars = split[5].toCharArray();
            String[] msgdata = s.split(";");
            if(msgdata.length==2){
                aisService.decodeConvert(split[5],msgdata[1]);
            }else{
                aisService.decodeConvert(split[5],msgdata[0]);
            }
        }
        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();
    }

    private List<String> commList = null;
    private SerialPort serialport;

    @RequestMapping(value = "serialport",method = RequestMethod.GET)
    public void serialPort(){
        // 获取串口名称
        String commName = "";
        // 获取波特率
        int baudrate = 38400;

        commList = findPort();
        // 检查是否有可用串口，有则加入选项中
        if (commList == null || commList.size() < 1) {
            System.out.println("没有搜索到有效串口！");
        } else {
            for (String s : commList) {
//                commChoice.addItem(s);
                System.out.println("串口名称："+s);
                commName = s;
            }
        }

//        baudrateChoice.addItem("9600");
//        baudrateChoice.addItem("19200");
//        baudrateChoice.addItem("38400");
//        baudrateChoice.addItem("57600");
//        baudrateChoice.addItem("115200");

        try {
            serialport = openPort(commName, baudrate);
            if (serialport != null) {
//                dataView.setText("串口已打开" + "\r\n");
//                serialPortOperate.setText("关闭串口");
                System.out.println("串口已打开");
            }
        } catch (SerialPortParameterFailure e) {
            e.printStackTrace();
        } catch (NotASerialPort e) {
            e.printStackTrace();
        } catch (NoSuchPort e) {
            e.printStackTrace();
        } catch (PortInUse e) {
            e.printStackTrace();
//            ShowUtils.warningMessage("串口已被占用！");
            System.out.println("串口已被占用！");
        }

        try {
            SerialPortManager.addListener(serialport, new SerialListener());
        } catch (TooManyListeners e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "closeserialport",method = RequestMethod.GET)
    public void closeSerial(){
        if (this.serialport != null) {
            serialport.close();
            serialport = null;
        }
    }

    private class SerialListener implements SerialPortEventListener {
        /**
         * 处理监控到的串口事件
         */
        public void serialEvent(SerialPortEvent serialPortEvent) {

            switch (serialPortEvent.getEventType()) {

                case SerialPortEvent.BI: // 10 通讯中断
//                    ShowUtils.errorMessage("与串口设备通讯中断");
                    System.out.println("与串口设备通讯中断");
                    break;

                case SerialPortEvent.OE: // 7 溢位（溢出）错误

                case SerialPortEvent.FE: // 9 帧错误

                case SerialPortEvent.PE: // 8 奇偶校验错误

                case SerialPortEvent.CD: // 6 载波检测

                case SerialPortEvent.CTS: // 3 清除待发送数据

                case SerialPortEvent.DSR: // 4 待发送数据准备好了

                case SerialPortEvent.RI: // 5 振铃指示

                case SerialPortEvent.OUTPUT_BUFFER_EMPTY: // 2 输出缓冲区已清空
                    break;

                case SerialPortEvent.DATA_AVAILABLE: // 1 串口存在可用数据
                    byte[] data = null;
                    try {
                        if (serialport == null) {
//                            ShowUtils.errorMessage("串口对象为空！监听失败！");
                            System.out.println("串口对象为空！监听失败！");
                        } else {
                            // 读取串口数据
                            data = SerialPortManager.readFromPort(serialport);
//						dataView.append(ByteUtils.byteArrayToHexString(data,
//								true) + "\r\n");

                            String result = "";
                            char temp;
                            int length = data.length;
                            for (int i = 0; i < length; i++) {
                                temp = (char) data[i];
                                result += temp;
                            }
                            System.out.print(result);

                            String[] split = result.split(",");
                            aisService.decodeConvert(split[5],result);

                        }
                    } catch (Exception e) {
                        System.out.println("发生错误");
                        System.out.println(e.toString());
//                        ShowUtils.errorMessage(e.toString());
                        // 发生读取错误时显示错误信息后退出系统
//                        System.exit(0);
                    }
                    break;
            }
        }
    }

    /**
     * 从串口读取数据
     *
     * @param serialPort
     *            当前已建立连接的SerialPort对象
     * @return 读取到的数据
     */
    public byte[] readFromPort(SerialPort serialPort) {
        InputStream in = null;
        byte[] bytes = {};
        try {
            in = serialPort.getInputStream();
            // 缓冲区大小为一个字节
            byte[] readBuffer = new byte[1];
            int bytesNum = in.read(readBuffer);
            while (bytesNum > 0) {
                bytes = ArrayUtils.concat(bytes, readBuffer);
                bytesNum = in.read(readBuffer);
            }
        } catch (IOException e) {
            new ReadDataFromSerialPortFailure().printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                    in = null;
                }
            } catch (IOException e) {
                new SerialPortInputStreamCloseFailure().printStackTrace();
            }
        }
        return bytes;
    }

    @SuppressWarnings("unchecked")
    public final ArrayList<String> findPort() {
        // 获得当前所有可用串口
        Enumeration<CommPortIdentifier> portList = CommPortIdentifier
                .getPortIdentifiers();

        ArrayList<String> portNameList = new ArrayList<String>();
        // 将可用串口名添加到List并返回该List
        while (portList.hasMoreElements()) {
            String portName = portList.nextElement().getName();
            portNameList.add(portName);
        }
        return portNameList;
    }

    /**
     * 打开串口
     *
     * @param portName
     *            端口名称
     * @param baudrate
     *            波特率
     * @return 串口对象
     * @throws SerialPortParameterFailure
     *             设置串口参数失败
     * @throws NotASerialPort
     *             端口指向设备不是串口类型
     * @throws NoSuchPort
     *             没有该端口对应的串口设备
     * @throws PortInUse
     *             端口已被占用
     */
    public SerialPort openPort(String portName, int baudrate)
            throws SerialPortParameterFailure, NotASerialPort, NoSuchPort,
            PortInUse {
        try {
            // 通过端口名识别端口
            CommPortIdentifier portIdentifier = CommPortIdentifier
                    .getPortIdentifier(portName);
            // 打开端口，并给端口名字和一个timeout（打开操作的超时时间）
            CommPort commPort = portIdentifier.open(portName, 2000);
            // 判断是不是串口
            if (commPort instanceof SerialPort) {
                SerialPort serialPort = (SerialPort) commPort;
                try {
                    // 设置一下串口的波特率等参数
                    serialPort.setSerialPortParams(baudrate,
                            SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
                            SerialPort.PARITY_NONE);
                } catch (UnsupportedCommOperationException e) {
                    throw new SerialPortParameterFailure();
                }
                return serialPort;
            } else {
                // 不是串口
                throw new NotASerialPort();
            }
        } catch (NoSuchPortException e1) {
            throw new NoSuchPort();
        } catch (PortInUseException e2) {
            throw new PortInUse();
        }
    }

    @Override
    public void run() {

    }
}
