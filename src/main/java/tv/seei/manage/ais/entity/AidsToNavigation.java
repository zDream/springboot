package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 21 助航设备报告
 */
@Entity
@Table
public class AidsToNavigation {
    public static int[] tag =new int[]{6,2,30,5,120,1,28,27,30,4,6,1,8,1,1,1,1,4};

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
    //助航设备类型
    @Column
    private String antType;
    //助航设备名称
    @Column
    private String antName;
    //位置准确度
    @Column
    private String posAccuracy;
    //经度 28位
    @Column
    private String longitude;
    //纬度 27位
    @Column
    private String latitude;
    //尺寸/ 位置 /参考点
    @Column
    private String dimension;
    //电子定位装置的类型
    @Column
    private String elecDeviceType;
    //时戳
    @Column
    private String timeStamp;
    //偏置位置指示符
    @Column
    private String positionIndicator;
    //AtoN状态
    @Column
    private String atonFlag;
    //RAIM标志
    @Column
    private String raimFlag;
    //虚拟AtoN标志
    @Column
    private String virtualAntoFlag;
    //指配模式标志
    @Column
    private String assignedModeFlag;
    //备用 1位
    @Column
    private String standbyMes1;
    //助航设备名称扩展
    @Column
    private String extAntName;
    //备用 1位
    @Column
    private String standbyMes2;

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

    public String getAntType() {
        return antType;
    }

    public void setAntType(String antType) {
        this.antType = antType;
    }

    public String getAntName() {
        return antName;
    }

    public void setAntName(String antName) {
        this.antName = antName;
    }

    public String getPosAccuracy() {
        return posAccuracy;
    }

    public void setPosAccuracy(String posAccuracy) {
        this.posAccuracy = posAccuracy;
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

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getElecDeviceType() {
        return elecDeviceType;
    }

    public void setElecDeviceType(String elecDeviceType) {
        this.elecDeviceType = elecDeviceType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getPositionIndicator() {
        return positionIndicator;
    }

    public void setPositionIndicator(String positionIndicator) {
        this.positionIndicator = positionIndicator;
    }

    public String getAtonFlag() {
        return atonFlag;
    }

    public void setAtonFlag(String atonFlag) {
        this.atonFlag = atonFlag;
    }

    public String getRaimFlag() {
        return raimFlag;
    }

    public void setRaimFlag(String raimFlag) {
        this.raimFlag = raimFlag;
    }

    public String getVirtualAntoFlag() {
        return virtualAntoFlag;
    }

    public void setVirtualAntoFlag(String virtualAntoFlag) {
        this.virtualAntoFlag = virtualAntoFlag;
    }

    public String getAssignedModeFlag() {
        return assignedModeFlag;
    }

    public void setAssignedModeFlag(String assignedModeFlag) {
        this.assignedModeFlag = assignedModeFlag;
    }

    public String getStandbyMes1() {
        return standbyMes1;
    }

    public void setStandbyMes1(String standbyMes1) {
        this.standbyMes1 = standbyMes1;
    }

    public String getExtAntName() {
        return extAntName;
    }

    public void setExtAntName(String extAntName) {
        this.extAntName = extAntName;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    @Override
    public String toString() {
        return "AidsToNavigation{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", antType='" + antType + '\'' +
                ", antName='" + antName + '\'' +
                ", posAccuracy='" + posAccuracy + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", dimension='" + dimension + '\'' +
                ", elecDeviceType='" + elecDeviceType + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", positionIndicator='" + positionIndicator + '\'' +
                ", atonFlag='" + atonFlag + '\'' +
                ", raimFlag='" + raimFlag + '\'' +
                ", virtualAntoFlag='" + virtualAntoFlag + '\'' +
                ", assignedModeFlag='" + assignedModeFlag + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", extAntName='" + extAntName + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                '}';
    }
}