package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 5 船舶静态和航行相关数据
 */
@Entity
@Table
public class StaticsSailingData {
    public static int[] tag =new int[]{6,2,30,2,30,42,120,8,30,4,20,8,120,1,1};

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
    //AIS版本指示符
    @Column
    private String aisVersions;
    //IMO编号
    @Column
    private String imoNumber;
    //呼号
    @Column
    private String callOut;
    //名称
    @Column
    private String name;
    //船舶和货物类型
    @Column
    private String boatCargoType;
    //总体尺寸 位置参考
    @Column
    private String sizePosition;
    //电子定位装置的类型
    @Column
    private String locationType;
    //ETA
    @Column
    private String eta;
    //目前最大静态
    @Column
    private String maxStatic;
    //吃水
    @Column
    private String draftMark;
    //目的地
    @Column
    private String destination;
    //DTE
    @Column
    private String dte;
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

    public String getAisVersions() {
        return aisVersions;
    }

    public void setAisVersions(String aisVersions) {
        this.aisVersions = aisVersions;
    }

    public String getImoNumber() {
        return imoNumber;
    }

    public void setImoNumber(String imoNumber) {
        this.imoNumber = imoNumber;
    }

    public String getCallOut() {
        return callOut;
    }

    public void setCallOut(String callOut) {
        this.callOut = callOut;
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

    public String getSizePosition() {
        return sizePosition;
    }

    public void setSizePosition(String sizePosition) {
        this.sizePosition = sizePosition;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getMaxStatic() {
        return maxStatic;
    }

    public void setMaxStatic(String maxStatic) {
        this.maxStatic = maxStatic;
    }

    public String getDraftMark() {
        return draftMark;
    }

    public void setDraftMark(String draftMark) {
        this.draftMark = draftMark;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDte() {
        return dte;
    }

    public void setDte(String dte) {
        this.dte = dte;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    @Override
    public String toString() {
        return "StaticsSailingData{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", aisVersions='" + aisVersions + '\'' +
                ", imoNumber='" + imoNumber + '\'' +
                ", callOut='" + callOut + '\'' +
                ", name='" + name + '\'' +
                ", boatCargoType='" + boatCargoType + '\'' +
                ", sizePosition='" + sizePosition + '\'' +
                ", locationType='" + locationType + '\'' +
                ", eta='" + eta + '\'' +
                ", maxStatic='" + maxStatic + '\'' +
                ", draftMark='" + draftMark + '\'' +
                ", destination='" + destination + '\'' +
                ", dte='" + dte + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                '}';
    }
}
