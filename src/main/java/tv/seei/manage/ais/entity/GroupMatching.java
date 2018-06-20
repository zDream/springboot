package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 23 群组指配命令
 */
@Entity
@Table
public class GroupMatching {
    public static int[] tag =new int[]{6,2,30,2,18,17,18,17,4,8,22,2,4,4,6};

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
    //备用 2位
    @Column
    private String standbyMes1;
    //经度1 28位
    @Column
    private String longitude1;
    //纬度1 27位
    @Column
    private String latitude1;
    //经度2 28位
    @Column
    private String longitude2;
    //纬度2 27位
    @Column
    private String latitude2;
    //台站类型
    @Column
    private String  siteType;
    //船舶类型和货物类型
    @Column
    private String boatCargoType;
    //备用 2位
    @Column
    private String standbyMes2;
    //Tx/Rx模式
    @Column
    private String txrxMode;
    //报告间隔
    @Column
    private String reportSpace;
    //寂静时间
    @Column
    private String silenceTime;
    //备用 2位
    @Column
    private String standbyMes3;

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

    public String getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(String longitude1) {
        this.longitude1 = longitude1;
    }

    public String getLatitude1() {
        return latitude1;
    }

    public void setLatitude1(String latitude1) {
        this.latitude1 = latitude1;
    }

    public String getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(String longitude2) {
        this.longitude2 = longitude2;
    }

    public String getLatitude2() {
        return latitude2;
    }

    public void setLatitude2(String latitude2) {
        this.latitude2 = latitude2;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getBoatCargoType() {
        return boatCargoType;
    }

    public void setBoatCargoType(String boatCargoType) {
        this.boatCargoType = boatCargoType;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    public String getTxrxMode() {
        return txrxMode;
    }

    public void setTxrxMode(String txrxMode) {
        this.txrxMode = txrxMode;
    }

    public String getReportSpace() {
        return reportSpace;
    }

    public void setReportSpace(String reportSpace) {
        this.reportSpace = reportSpace;
    }

    public String getSilenceTime() {
        return silenceTime;
    }

    public void setSilenceTime(String silenceTime) {
        this.silenceTime = silenceTime;
    }

    public String getStandbyMes3() {
        return standbyMes3;
    }

    public void setStandbyMes3(String standbyMes3) {
        this.standbyMes3 = standbyMes3;
    }

    @Override
    public String toString() {
        return "GroupMatching{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", longitude1='" + longitude1 + '\'' +
                ", latitude1='" + latitude1 + '\'' +
                ", longitude2='" + longitude2 + '\'' +
                ", latitude2='" + latitude2 + '\'' +
                ", siteType='" + siteType + '\'' +
                ", boatCargoType='" + boatCargoType + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                ", txrxMode='" + txrxMode + '\'' +
                ", reportSpace='" + reportSpace + '\'' +
                ", silenceTime='" + silenceTime + '\'' +
                ", standbyMes3='" + standbyMes3 + '\'' +
                '}';
    }
}
