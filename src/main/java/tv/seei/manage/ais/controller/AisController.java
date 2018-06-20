package tv.seei.manage.ais.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tv.seei.manage.ais.dao.*;
import tv.seei.manage.ais.entity.*;

import java.beans.PropertyDescriptor;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/ais")
public class AisController {

    @Autowired
    AddressedBinaryRepository addressedBinaryRepository;

    @Autowired
    AddressedSafetyRepository addressedSafetyRepository;

    @Autowired
    AidsToNavigationRepository aidsToNavigationRepository;

    @Autowired
    BaseStationRepository baseStationRepository;

    @Autowired
    BinaryAcknowledgeRepository binaryAcknowledgeRepository;

    @Autowired
    BinaryBroadcastRepository binaryBroadcastRepository;

    @Autowired
    CommuBinaryMsgRepository commuBinaryMsgRepository;

    @Autowired
    DataLinkManagementRepository dataLinkManagementRepository;

    @Autowired
    ExtendedClassBRepository extendedClassBRepository;

    @Autowired
    GlobalNavigationSatelliteRepository globalNavigationSatelliteRepository;

    @Autowired
    GroupMatchingRepository groupMatchingRepository;

    @Autowired
    InfoChannelRepository infoChannelRepository;

    @Autowired
    MatchingModelRepository matchingModelRepository;

    @Autowired
    RemoteAutoIdentificationRepository remoteAutoIdentificationRepository;

    @Autowired
    RequestRepository requestRepository;

    @Autowired
    RescueAviationRepository rescueAviationRepository;

    @Autowired
    SafetyBroadcastRepository safetyBroadcastRepository;

    @Autowired
    SafetyVerificationRepository safetyVerificationRepository;

    @Autowired
    ScheduledPositionRepository scheduledPositionRepository;

    @Autowired
    SlotTimeBinaryMsgRepository slotTimeBinaryMsgRepository;

    @Autowired
    SpecialPositionRepository specialPositionRepository;

    @Autowired
    StandardClassBRepository standardClassBRepository;

    @Autowired
    StaticDataReportRepository staticDataReportRepository;

    @Autowired
    StaticsSailingDataRepository staticsSailingDataRepository;

    @Autowired
    UnknownPositionRepository unknownPositionRepository;

    @Autowired
    WorldDateRequestRepository worldDateRequestRepository;

    @Autowired
    WorldDateResponseRepository worldDateResponseRepository;

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
                decodeConvert(split[5],msgdata[1]);
            }else{
                decodeConvert(split[5],msgdata[0]);
            }
        }
        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();
    }

    //解密算法
    private void decodeConvert(String s,String msgdata) {
//        String s="H6:Qr3m66DeiliiPPPPPPP7P<6:0";
        //解密算法步骤1.对单个字符解析算法
        char[] chars = s.toCharArray();
        for(int i =0;i<chars.length;i++){
            chars[i] += 0x28;
            if(chars[i]>0x80){
                chars[i] += 0x20;
            }else {
                chars[i] += 0x28;
            }
        }
        //步骤2.对每个字符取后6位 组成二进制字第串，
        // 然后按比特数取值，最后转换成10进制数，即是我们要的数据
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            String s2 = Integer.toBinaryString(chars[i]);
            result += s2.substring(2);
        }
//        System.out.println("result="+result);
//        System.out.println();
        String substring = result.substring(0, 6);
        int i = Integer.parseInt(substring,2);
        System.out.print("message id = "+i+" result.length="+result.length());
        System.out.println();
        select(result,msgdata, i);
    }

    private void select(String result,String msgdata, int i) {
        switch (i){
            case 1:
                one(result);break;
            case 2:
                two(result,msgdata);break;
            case 3:
                three(result);break;
            case 4:
                four(result);break;
            case 5:
                five(result);break;
            case 6:
                six(result);break;
            case 7:
                seven(result);break;
            case 8:
                eight(result);break;
            case 9:
                nine(result);break;
            case 10:
                ten(result);break;
            case 11:
                eleven(result);break;
            case 12:
                twelve(result);break;
            case 13:
                thirteen(result);break;
            case 14:
                fourteen(result);break;
            case 15:
                fifteen(result);break;
            case 16:
                sixteen(result);break;
            case 17:
                seventeen(result);break;
            case 18:
                eighteen(result);break;
            case 19:
                nineteen(result);break;
            case 20:
                twenty(result);break;
            case 21:
                twenty_one(result);break;
            case 22:
                twenty_two(result);break;
            case 23:
                twenty_three(result);break;
            case 24:
                twenty_four(result);break;
            case 25:
                twenty_five(result);break;
            case 26:
                twenty_six(result);break;
            case 27:
                twenty_seven(result);break;
        }
    }

    //反射实现 数组赋值给java对象
    public <T> T invokeMethod(List list,Class<T> clazz) throws Exception {
        T t = clazz.newInstance();
//        Object obj = RemoteAutoIdentification.class.newInstance();//创建对象实例
        Field[] fields = t.getClass().getDeclaredFields();
        for (int i = 0,j=0; i<list.size()+2;i++){
            Field f = fields[i];
            if(Modifier.isStatic(f.getModifiers()) || f.getName()=="id"){
                continue;
            }
            PropertyDescriptor pd = new PropertyDescriptor(f.getName(), t.getClass());
            Method m = pd.getWriteMethod();//获取对象的写入方法
            m.invoke(t, list.get(j++).toString());
        }
        return t;
    }

    //27
    private void twenty_seven(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < RemoteAutoIdentification.tag.length ){
            endIndex += RemoteAutoIdentification.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
            list.add(new BigInteger(substring, 2));
            beginIndex += RemoteAutoIdentification.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, RemoteAutoIdentification.class);
            remoteAutoIdentificationRepository.save((RemoteAutoIdentification)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //26
    private void twenty_six(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        //加判断，防止数据过多
        while (beginIndex < result.length() && i < CommuBinaryMsg.tag.length ){
            endIndex += CommuBinaryMsg.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += CommuBinaryMsg.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, CommuBinaryMsg.class);
            commuBinaryMsgRepository.save((CommuBinaryMsg)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //25
    private void twenty_five(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        //加判断，防止数据过多
        while (beginIndex < result.length() && i < SlotTimeBinaryMsg.tag.length ){
            endIndex += SlotTimeBinaryMsg.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += SlotTimeBinaryMsg.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, SlotTimeBinaryMsg.class);
            slotTimeBinaryMsgRepository.save((SlotTimeBinaryMsg)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 24
    private void twenty_four(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < StaticDataReport.tagB.length){
            endIndex += StaticDataReport.tagB[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += StaticDataReport.tagB[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, StaticDataReport.class);
            staticDataReportRepository.save((StaticDataReport)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //23
    private void twenty_three(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        //加判断，防止数据过多
        while (beginIndex < result.length() && i < GroupMatching.tag.length ){
            endIndex += GroupMatching.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += GroupMatching.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, GroupMatching.class);
            groupMatchingRepository.save((GroupMatching)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //22
    private void twenty_two(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        //加判断，防止数据过多
        while (beginIndex < result.length() && i < InfoChannel.tag.length ){
            endIndex += InfoChannel.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += InfoChannel.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, InfoChannel.class);
            infoChannelRepository.save((InfoChannel)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //21
    private void twenty_one(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < AidsToNavigation.tag.length ){
            endIndex += AidsToNavigation.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += AidsToNavigation.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, AidsToNavigation.class);
            aidsToNavigationRepository.save((AidsToNavigation)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //20
    private void twenty(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < DataLinkManagement.tag.length ){
            endIndex += DataLinkManagement.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += DataLinkManagement.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, DataLinkManagement.class);
            dataLinkManagementRepository.save((DataLinkManagement)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //19
    private void nineteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < ExtendedClassB.tag.length){
            endIndex += ExtendedClassB.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
            list.add(new BigInteger(substring, 2));
            beginIndex += ExtendedClassB.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, ExtendedClassB.class);
            extendedClassBRepository.save((ExtendedClassB)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //17
    private void seventeen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        //加判断，防止数据过多
        while (beginIndex < result.length() && i < GlobalNavigationSatellite.tag.length ){
            endIndex += GlobalNavigationSatellite.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += GlobalNavigationSatellite.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, GlobalNavigationSatellite.class);
            globalNavigationSatelliteRepository.save((GlobalNavigationSatellite)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //16
    private void sixteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < MatchingModel.tag.length ){
            endIndex += MatchingModel.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += MatchingModel.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, MatchingModel.class);
            matchingModelRepository.save((MatchingModel)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //15
    private void fifteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < Request.tag.length){
            endIndex += Request.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(" "+substring);
            list.add(new BigInteger(substring, 2));
            beginIndex += Request.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, Request.class);
            requestRepository.save((Request)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //14
    private void fourteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        // 加判断，防止tag太少而导致溢出
        while (beginIndex < result.length() && i < SafetyBroadcast.tag.length){
            endIndex += SafetyBroadcast.tag[i];
            //加判断，防止数据太少而导致解析错误
            if(endIndex>result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += SafetyBroadcast.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, SafetyBroadcast.class);
            safetyBroadcastRepository.save((SafetyBroadcast)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //13
    private void thirteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < SafetyVerification.tag.length){
            endIndex += SafetyVerification.tag[i];
            if(endIndex>result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += SafetyVerification.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, SafetyVerification.class);
            safetyVerificationRepository.save((SafetyVerification)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //12
    private void twelve(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < AddressedBinary.tag.length){
            endIndex += AddressedSafety.tag[i];
            if(endIndex>result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += AddressedSafety.tag[i];
            i++;
        }
//        if(beginIndex < result.length()){
//            String substring = result.substring(beginIndex, result.length());
//            list.add(substring);
//        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, AddressedSafety.class);
            addressedSafetyRepository.save((AddressedSafety)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //11
    private void eleven(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < BaseStation.tag.length){
            endIndex += BaseStation.tag[i];
            if(endIndex>result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            BigInteger bigInteger = new BigInteger(substring, 2);
            if(i == 10 || i == 11){
                double v = bigInteger.doubleValue();
                list.add(v/10000/60);
            }else {
                list.add(bigInteger);
            }
            beginIndex += BaseStation.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, BaseStation.class);
            baseStationRepository.save((BaseStation)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //10
    private void ten(String result) {

    }

    //9
    private void nine(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length()  && i < RescueAviation.tag.length){
            endIndex += RescueAviation.tag[i];
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += RescueAviation.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, RescueAviation.class);
            rescueAviationRepository.save((RescueAviation)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //8
    private void eight(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < BinaryBroadcast.tag.length){
            endIndex += BinaryBroadcast.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += BinaryBroadcast.tag[i];
            i++;
        }
        if(beginIndex < result.length()){
            String substring = result.substring(beginIndex, result.length());
            list.add(new BigInteger(substring, 2));
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, BinaryBroadcast.class);
            binaryBroadcastRepository.save((BinaryBroadcast)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 6
    private void six(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < AddressedBinary.tag.length){
            endIndex += AddressedBinary.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += AddressedBinary.tag[i];
            i++;
        }
        if(beginIndex < result.length()){
            String substring = result.substring(beginIndex, result.length());
            list.add(new BigInteger(substring, 2));
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, AddressedBinary.class);
            addressedBinaryRepository.save((AddressedBinary)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //5
    private void five(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < StaticsSailingData.tag.length){
            endIndex += StaticsSailingData.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += StaticsSailingData.tag[i];
            i++;
        }
        if(beginIndex < result.length()){
            String substring = result.substring(beginIndex, result.length());
            list.add(new BigInteger(substring, 2));
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, StaticsSailingData.class);
            staticsSailingDataRepository.save((StaticsSailingData)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 4
    private void four(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < BaseStation.tag.length ){
            endIndex += BaseStation.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            BigInteger bigInteger = new BigInteger(substring, 2);
            if(i == 10 || i == 11){
                double v = bigInteger.doubleValue();
                list.add(v/10000/60);
            }else {
                list.add(bigInteger);
            }
            beginIndex += BaseStation.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, BaseStation.class);
            baseStationRepository.save((BaseStation)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //2
    private void two(String result,String msgData) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List<Object> list = new ArrayList<Object>();
        while (beginIndex < result.length() && i < UnknownPosition.tag.length){
            endIndex += UnknownPosition.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += UnknownPosition.tag[i];
            i++;
        }
        //把整条ais数据存储 进去
        list.add(msgData);
        try {
            Object remoteAutoIdentification = invokeMethod(list, UnknownPosition.class);
            unknownPositionRepository.save((UnknownPosition)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 3
    private void three(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < SpecialPosition.tag.length){
            endIndex += SpecialPosition.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += SpecialPosition.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, SpecialPosition.class);
            specialPositionRepository.save((SpecialPosition)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //18
    private void eighteen(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < StandardClassB.tag.length){
            endIndex += StandardClassB.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += StandardClassB.tag[i];
            i++;
        }
        if(beginIndex < result.length()){
            String substring = result.substring(beginIndex, result.length());
            list.add(new BigInteger(substring, 2));
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, StandardClassB.class);
            standardClassBRepository.save((StandardClassB)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //7
    private void seven(String result) {
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < BinaryAcknowledge.tag.length){
            endIndex += BinaryAcknowledge.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += BinaryAcknowledge.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, BinaryAcknowledge.class);
            binaryAcknowledgeRepository.save((BinaryAcknowledge)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void one(String result){
        int i =0;
        int beginIndex = 0;
        int endIndex = 0;
        List list = new ArrayList<>();
        while (beginIndex < result.length() && i < ScheduledPosition.tag.length ){
            endIndex += ScheduledPosition.tag[i];
            //防止数据过少而截取串失败
            if(endIndex > result.length()){
                break;
            }
            String substring = result.substring(beginIndex,endIndex);
//            System.out.print(substring+" ");
            list.add(new BigInteger(substring, 2));
            beginIndex += ScheduledPosition.tag[i];
            i++;
        }
        try {
            Object remoteAutoIdentification = invokeMethod(list, ScheduledPosition.class);
            scheduledPositionRepository.save((ScheduledPosition)remoteAutoIdentification);
            System.out.println(remoteAutoIdentification.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
