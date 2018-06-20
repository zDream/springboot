package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 24 静态数据报告
 */
@Entity
@Table
public class StaticDataReport {
    public static int[] tagA =new int[]{6,2,30,2,120,160};
    public static int[] tagB =new int[]{6,2,30,2,8,42,42,30,4,2};

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
    //部分编号
    @Column
    private String partNumber;
    //船舶类型和
    @Column
    private String boatType;
    //货物类型
    @Column
    private String cargoType;
    //供应商ID
    @Column
    private String supplierId;
    //呼号
    @Column
    private String callOut;
    //船舶大小/位置参考
    @Column
    private String sizeLocation;
    //电子定位装置的类型
    @Column
    private String gpsType;
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

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getBoatType() {
        return boatType;
    }

    public void setBoatType(String boatType) {
        this.boatType = boatType;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getCallOut() {
        return callOut;
    }

    public void setCallOut(String callOut) {
        this.callOut = callOut;
    }

    public String getSizeLocation() {
        return sizeLocation;
    }

    public void setSizeLocation(String sizeLocation) {
        this.sizeLocation = sizeLocation;
    }

    public String getGpsType() {
        return gpsType;
    }

    public void setGpsType(String gpsType) {
        this.gpsType = gpsType;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    @Override
    public String toString() {
        return "StaticDataReport{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", boatType='" + boatType + '\'' +
                ", cargoType='" + cargoType + '\'' +
                ", supplierId='" + supplierId + '\'' +
                ", callOut='" + callOut + '\'' +
                ", sizeLocation='" + sizeLocation + '\'' +
                ", gpsType='" + gpsType + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                '}';
    }
}
