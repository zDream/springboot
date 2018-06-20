package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 18 标准的B类设备位置报告
 */
@Entity
@Table
public class StandardClassB {
    public static int[] tag =new int[]{6,2,30,8,10,1,28,27,12,9,6,2,1,1,1,1,1,1,1,1,19};

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
    //备用 8位
    @Column
    private String standbyMes1;
    //SOG
    @Column
    private String sog;
    //位置准确度
    @Column
    private String positionAccuracy;
    //经度 28位
    @Column
    private String longitude;
    //纬度 27位
    @Column
    private String latitude;
    //COG 12位
    @Column
    private String cog;
    //实际航向 9位
    @Column
    private String trueHeading;
    //时间戳 6位
    @Column
    private String timeStamp;
    //备用 2位
    @Column
    private String standbyMes2;
    //装置标志 1位
    @Column
    private String deviceFlag;
    //显示器标志 1位
    @Column
    private String displayFlag;
    //DSC标志 1位
    @Column
    private String dscFlag;
    //带宽标志 1位
    @Column
    private String bandwidthFlag;
    //消息22标志 1位
    @Column
    private String messageFlag;
    //模式标志 1位
    @Column
    private String modelFlag;
    //RAIM标志 1 位
    @Column
    private String raimFlag;
    //通信状态选择器标志 1位
    @Column
    private String commuStateFlag;
    //通信状态 19位
    @Column
    private String communicationState;

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

    public String getStandbyMes1() {
        return standbyMes1;
    }

    public void setStandbyMes1(String standbyMes1) {
        this.standbyMes1 = standbyMes1;
    }

    public String getSog() {
        return sog;
    }

    public void setSog(String sog) {
        this.sog = sog;
    }

    public String getPositionAccuracy() {
        return positionAccuracy;
    }

    public void setPositionAccuracy(String positionAccuracy) {
        this.positionAccuracy = positionAccuracy;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCog() {
        return cog;
    }

    public void setCog(String cog) {
        this.cog = cog;
    }

    public String getTrueHeading() {
        return trueHeading;
    }

    public void setTrueHeading(String trueHeading) {
        this.trueHeading = trueHeading;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    public String getDeviceFlag() {
        return deviceFlag;
    }

    public void setDeviceFlag(String deviceFlag) {
        this.deviceFlag = deviceFlag;
    }

    public String getDisplayFlag() {
        return displayFlag;
    }

    public void setDisplayFlag(String displayFlag) {
        this.displayFlag = displayFlag;
    }

    public String getDscFlag() {
        return dscFlag;
    }

    public void setDscFlag(String dscFlag) {
        this.dscFlag = dscFlag;
    }

    public String getBandwidthFlag() {
        return bandwidthFlag;
    }

    public void setBandwidthFlag(String bandwidthFlag) {
        this.bandwidthFlag = bandwidthFlag;
    }

    public String getMessageFlag() {
        return messageFlag;
    }

    public void setMessageFlag(String messageFlag) {
        this.messageFlag = messageFlag;
    }

    public String getModelFlag() {
        return modelFlag;
    }

    public void setModelFlag(String modelFlag) {
        this.modelFlag = modelFlag;
    }

    public String getRaimFlag() {
        return raimFlag;
    }

    public void setRaimFlag(String raimFlag) {
        this.raimFlag = raimFlag;
    }

    public String getCommuStateFlag() {
        return commuStateFlag;
    }

    public void setCommuStateFlag(String commuStateFlag) {
        this.commuStateFlag = commuStateFlag;
    }

    public String getCommunicationState() {
        return communicationState;
    }

    public void setCommunicationState(String communicationState) {
        this.communicationState = communicationState;
    }

    @Override
    public String toString() {
        return "StandardClassB{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", sog='" + sog + '\'' +
                ", positionAccuracy='" + positionAccuracy + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", cog='" + cog + '\'' +
                ", trueHeading='" + trueHeading + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                ", deviceFlag='" + deviceFlag + '\'' +
                ", displayFlag='" + displayFlag + '\'' +
                ", dscFlag='" + dscFlag + '\'' +
                ", bandwidthFlag='" + bandwidthFlag + '\'' +
                ", messageFlag='" + messageFlag + '\'' +
                ", modelFlag='" + modelFlag + '\'' +
                ", raimFlag='" + raimFlag + '\'' +
                ", commuStateFlag='" + commuStateFlag + '\'' +
                ", communicationState='" + communicationState + '\'' +
                '}';
    }
}
