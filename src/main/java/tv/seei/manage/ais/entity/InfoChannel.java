package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 22 信道管理
 */
@Entity
@Table
public class InfoChannel {
    public static int[] tag =new int[]{6,2,30,2,12,12,4,1,18,17,18,17,1,1,1,3,23};

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
    //信道A
    @Column
    private String channelA;
    //信道B
    @Column
    private String channelB;
    //Tx/Rx模式
    @Column
    private String txrxMode;
    //功率
    @Column
    private String power;
    //经度1
    @Column
    private String longitude1;
    //纬度1
    @Column
    private String latitude1;
    //经度2
    @Column
    private String longitude2;
    //纬度2
    @Column
    private String latitude2;
    //寻址或广播消息指示符
    @Column
    private String broadcastIndicator;
    //信道A带宽
    @Column
    private String channelABandwidth;
    //信道B带宽
    @Column
    private String channelBBandwidth;
    //切换区范围
    @Column
    private String areaScope;
    //备用 2位
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

    public String getStandbyMes1() {
        return standbyMes1;
    }

    public void setStandbyMes1(String standbyMes1) {
        this.standbyMes1 = standbyMes1;
    }

    public String getChannelA() {
        return channelA;
    }

    public void setChannelA(String channelA) {
        this.channelA = channelA;
    }

    public String getChannelB() {
        return channelB;
    }

    public void setChannelB(String channelB) {
        this.channelB = channelB;
    }

    public String getTxrxMode() {
        return txrxMode;
    }

    public void setTxrxMode(String txrxMode) {
        this.txrxMode = txrxMode;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
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

    public String getBroadcastIndicator() {
        return broadcastIndicator;
    }

    public void setBroadcastIndicator(String broadcastIndicator) {
        this.broadcastIndicator = broadcastIndicator;
    }

    public String getChannelABandwidth() {
        return channelABandwidth;
    }

    public void setChannelABandwidth(String channelABandwidth) {
        this.channelABandwidth = channelABandwidth;
    }

    public String getChannelBBandwidth() {
        return channelBBandwidth;
    }

    public void setChannelBBandwidth(String channelBBandwidth) {
        this.channelBBandwidth = channelBBandwidth;
    }

    public String getAreaScope() {
        return areaScope;
    }

    public void setAreaScope(String areaScope) {
        this.areaScope = areaScope;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    @Override
    public String toString() {
        return "InfoChannel{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", channelA='" + channelA + '\'' +
                ", channelB='" + channelB + '\'' +
                ", txrxMode='" + txrxMode + '\'' +
                ", power='" + power + '\'' +
                ", longitude1='" + longitude1 + '\'' +
                ", latitude1='" + latitude1 + '\'' +
                ", longitude2='" + longitude2 + '\'' +
                ", latitude2='" + latitude2 + '\'' +
                ", broadcastIndicator='" + broadcastIndicator + '\'' +
                ", channelABandwidth='" + channelABandwidth + '\'' +
                ", channelBBandwidth='" + channelBBandwidth + '\'' +
                ", areaScope='" + areaScope + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                '}';
    }
}
