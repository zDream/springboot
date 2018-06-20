package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 26 带有通信状态的多时隙二进制消息
 */
@Entity
@Table
public class CommuBinaryMsg {
    public static int[] tag =new int[]{6,2,30,1,1,30,2};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    //消息id 6位
    @Column
    private String msgid;
    //转发指示符 2位
    @Column
    private String repeatIndicator;
    //信源id 30位
    @Column
    private String sourceMmsi;
    //目的地指示符
    @Column
    private String destinationFlag;
    //二进制数据标记
    @Column
    private String binaryFlag;
    //目的地ID
    @Column
    private String destMmsi;
    //备用 1位
    @Column
    private String standbyMes;
    //二进制数据
    @Column
    private String binaryData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getRepeatIndicator() {
        return repeatIndicator;
    }

    public void setRepeatIndicator(String repeatIndicator) {
        this.repeatIndicator = repeatIndicator;
    }

    public String getSourceMmsi() {
        return sourceMmsi;
    }

    public void setSourceMmsi(String sourceMmsi) {
        this.sourceMmsi = sourceMmsi;
    }

    public String getDestinationFlag() {
        return destinationFlag;
    }

    public void setDestinationFlag(String destinationFlag) {
        this.destinationFlag = destinationFlag;
    }

    public String getBinaryFlag() {
        return binaryFlag;
    }

    public void setBinaryFlag(String binaryFlag) {
        this.binaryFlag = binaryFlag;
    }

    public String getDestMmsi() {
        return destMmsi;
    }

    public void setDestMmsi(String destMmsi) {
        this.destMmsi = destMmsi;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    public String getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(String binaryData) {
        this.binaryData = binaryData;
    }

    @Override
    public String toString() {
        return "CommuBinaryMsg{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", destinationFlag='" + destinationFlag + '\'' +
                ", binaryFlag='" + binaryFlag + '\'' +
                ", destMmsi='" + destMmsi + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                ", binaryData='" + binaryData + '\'' +
                '}';
    }
}
