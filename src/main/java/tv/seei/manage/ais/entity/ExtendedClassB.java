package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 19 扩展的B类设备位置报告
 */
@Entity
@Table
public class ExtendedClassB {
    public static int[] tag =new int[]{6,2,30,8,10,1,28,27,12,9,6,4,120,8,30,4,1,1,1,4};

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
    //备用
    @Column
    private String standbyMes1;
    //SOG 由消息18提供
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
    //COG 由消息18提供
    @Column
    private String cog;
    //实际航向 由消息18提供
    @Column
    private String actualHeading;
    //时戳
    @Column
    private String timeStamp;
    //备用
    @Column
    private String standbyMes2;
    //名称 由消息24A提供	120	最长20字符的6比特ASCII码，如表47的规定。
    @Column
    private String name;
    //船舶类型或货物类型
    @Column
    private String boatCargoType;
    //船舶尺寸/参考位置
    @Column
    private String boatSizePosition;
    //电子定位装置的类型
    @Column
    private String elecPositionType;
    //RAIM标志
    @Column
    private String ramiFlag;
    //DTE
    @Column
    private String dte;
    //指配模式标志
    @Column
    private String configModeFlag;
    //备用3
    @Column
    private String standbyMes3;

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

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoatCargoType() {
        return boatCargoType;
    }

    public void setBoatCargoType(String boatCargoType) {
        this.boatCargoType = boatCargoType;
    }

    public String getBoatSizePosition() {
        return boatSizePosition;
    }

    public void setBoatSizePosition(String boatSizePosition) {
        this.boatSizePosition = boatSizePosition;
    }

    public String getElecPositionType() {
        return elecPositionType;
    }

    public void setElecPositionType(String elecPositionType) {
        this.elecPositionType = elecPositionType;
    }

    public String getRamiFlag() {
        return ramiFlag;
    }

    public void setRamiFlag(String ramiFlag) {
        this.ramiFlag = ramiFlag;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }

    public String getConfigModeFlag() {
        return configModeFlag;
    }

    public void setConfigModeFlag(String configModeFlag) {
        this.configModeFlag = configModeFlag;
    }

    public String getStandbyMes3() {
        return standbyMes3;
    }

    public void setStandbyMes3(String standbyMes3) {
        this.standbyMes3 = standbyMes3;
    }

    @Override
    public String toString() {
        return "ExtendedClassBRepository{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", sog='" + sog + '\'' +
                ", posAccuracy='" + posAccuracy + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", cog='" + cog + '\'' +
                ", actualHeading='" + actualHeading + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                ", name='" + name + '\'' +
                ", boatCargoType='" + boatCargoType + '\'' +
                ", boatSizePosition='" + boatSizePosition + '\'' +
                ", elecPositionType='" + elecPositionType + '\'' +
                ", ramiFlag='" + ramiFlag + '\'' +
                ", dte='" + dte + '\'' +
                ", configModeFlag='" + configModeFlag + '\'' +
                ", standbyMes3='" + standbyMes3 + '\'' +
                '}';
    }
}
