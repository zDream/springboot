package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 27 远距离自动识别系统广播消息
 */
@Entity
@Table
public class RemoteAutoIdentification {
    public static int[] tag =new int[]{6,2,30,1,1,4,18,17,6,9,1,1};

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
    //位置准确度
    @Column
    private String posAccuracy;
    //RAIM标志
    @Column
    private String raimFlag;
    //航行状态
    //经度 28位
    @Column
    private String longitude;
    //纬度 27位
    @Column
    private String latitude;
    //SOG
    @Column
    private String sog;
    //COG
    @Column
    private String cog;
    //位置等待时间
    @Column
    private String waitTime;
    //备用
    @Column
    private String standbyMes;

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

    public String getPosAccuracy() {
        return posAccuracy;
    }

    public void setPosAccuracy(String posAccuracy) {
        this.posAccuracy = posAccuracy;
    }

    public String getRaimFlag() {
        return raimFlag;
    }

    public void setRaimFlag(String raimFlag) {
        this.raimFlag = raimFlag;
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

    public String getSog() {
        return sog;
    }

    public void setSog(String sog) {
        this.sog = sog;
    }

    public String getCog() {
        return cog;
    }

    public void setCog(String cog) {
        this.cog = cog;
    }

    public String getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(String waitTime) {
        this.waitTime = waitTime;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    @Override
    public String toString() {
        return "RemoteAutoIdentification{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", posAccuracy='" + posAccuracy + '\'' +
                ", raimFlag='" + raimFlag + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", sog='" + sog + '\'' +
                ", cog='" + cog + '\'' +
                ", waitTime='" + waitTime + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                '}';
    }
}
