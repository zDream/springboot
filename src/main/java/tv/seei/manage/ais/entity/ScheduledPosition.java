package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 1
 */
@Entity
@Table
public class ScheduledPosition {
    public static int[] tag =new int[]{6,2,30,4,8,10,1,28,27,12,9,6,2,3,1,19};

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
    //导航状态
    @Column
    private String gpsStatus;
    //旋转速率 ROTAIS
    @Column
    private String rotais;
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
    //实际航向
    @Column
    private String  actualHeading;
    //时戳
    @Column
    private String timeStamp;
    //特定操纵指示符
    @Column
    private String specificOperate;
    //备用
    @Column
    private String standbyMes;
    //RAIM标志
    @Column
    private String raimFlag;
    //通信状态
    @Column
    private String commuStatus;

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

    public String getGpsStatus() {
        return gpsStatus;
    }

    public void setGpsStatus(String gpsStatus) {
        this.gpsStatus = gpsStatus;
    }

    public String getRotais() {
        return rotais;
    }

    public void setRotais(String rotais) {
        this.rotais = rotais;
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

    public String getActualHeading() {
        return actualHeading;
    }

    public void setActualHeading(String actualHeading) {
        this.actualHeading = actualHeading;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSpecificOperate() {
        return specificOperate;
    }

    public void setSpecificOperate(String specificOperate) {
        this.specificOperate = specificOperate;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    public String getRaimFlag() {
        return raimFlag;
    }

    public void setRaimFlag(String raimFlag) {
        this.raimFlag = raimFlag;
    }

    public String getCommuStatus() {
        return commuStatus;
    }

    public void setCommuStatus(String commuStatus) {
        this.commuStatus = commuStatus;
    }

}
