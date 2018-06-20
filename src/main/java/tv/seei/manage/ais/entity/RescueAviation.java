package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 9 标准的搜救航空器位置报告
 */
@Entity
@Table
public class RescueAviation {
    public static int[] tag =new int[]{6,2,30,12,10,1,28,27,12,6,1,7,1,3,1,1,1,19};

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
    //高度（GNSS）
    @Column
    private String gnss;
    //SOG
    @Column
    private String sog;
    //位置准确度
    @Column
    private String posAccuracy;
    //经度 28位
    @Column
    private String longitude;
    //纬度 27位
    @Column
    private String latitude;
    //COG
    @Column
    private String cog;
    //时戳
    @Column
    private String timeStamp;
    //高度传感器
    @Column
    private String highSensor;
    //备用
    @Column
    private String standbyMes;
    //DTE
    @Column
    private String dte;
    //备用
    @Column
    private String standbyMes1;
    //指配模式标志
    @Column
    private String modelFlag;
    //RAIM标志
    @Column
    private String raimFlag;
    //通信状态选择器标志
    @Column
    private String comnuFlag;
    //通信状态
    @Column
    private String comnuStatus;

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

    public String getGnss() {
        return gnss;
    }

    public void setGnss(String gnss) {
        this.gnss = gnss;
    }

    public String getSog() {
        return sog;
    }

    public void setSog(String sog) {
        this.sog = sog;
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

    public String getCog() {
        return cog;
    }

    public void setCog(String cog) {
        this.cog = cog;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHighSensor() {
        return highSensor;
    }

    public void setHighSensor(String highSensor) {
        this.highSensor = highSensor;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }

    public String getStandbyMes1() {
        return standbyMes1;
    }

    public void setStandbyMes1(String standbyMes1) {
        this.standbyMes1 = standbyMes1;
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

    public String getComnuFlag() {
        return comnuFlag;
    }

    public void setComnuFlag(String comnuFlag) {
        this.comnuFlag = comnuFlag;
    }

    public String getComnuStatus() {
        return comnuStatus;
    }

    public void setComnuStatus(String comnuStatus) {
        this.comnuStatus = comnuStatus;
    }

    @Override
    public String toString() {
        return "RescueAviation{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", gnss='" + gnss + '\'' +
                ", sog='" + sog + '\'' +
                ", posAccuracy='" + posAccuracy + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", cog='" + cog + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", highSensor='" + highSensor + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                ", dte='" + dte + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", modelFlag='" + modelFlag + '\'' +
                ", raimFlag='" + raimFlag + '\'' +
                ", comnuFlag='" + comnuFlag + '\'' +
                ", comnuStatus='" + comnuStatus + '\'' +
                '}';
    }
}
