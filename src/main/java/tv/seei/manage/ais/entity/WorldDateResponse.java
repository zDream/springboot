package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 11 协调世界时/日期响应
 */
@Entity
@Table
public class WorldDateResponse {
    public static int[] tag =new int[]{6,2,30,14,4,5,5,6,6,1,28,27,4,1,9,1,19};

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
    @Column
    private String utcYear;
    @Column
    private String utcMonth;
    @Column
    private String utcDay;
    @Column
    private String utcHour;
    @Column
    private String utcMin;
    @Column
    private String utcSec;
    //位置准确度
    @Column
    private String positionAccuracy;
    //经度 28位
    @Column
    private String Longitude;
    //纬度 27位
    @Column
    private String Latitude;
    @Column
    private String positioningType;
    @Column
    private String radioTransmissionControl;
    //备用 9位
    @Column
    private String standbyMes;
    //RAIM标志 1 位
    @Column
    private String raimFlag;
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

    public String getUtcYear() {
        return utcYear;
    }

    public void setUtcYear(String utcYear) {
        this.utcYear = utcYear;
    }

    public String getUtcMonth() {
        return utcMonth;
    }

    public void setUtcMonth(String utcMonth) {
        this.utcMonth = utcMonth;
    }

    public String getUtcDay() {
        return utcDay;
    }

    public void setUtcDay(String utcDay) {
        this.utcDay = utcDay;
    }

    public String getUtcHour() {
        return utcHour;
    }

    public void setUtcHour(String utcHour) {
        this.utcHour = utcHour;
    }

    public String getUtcMin() {
        return utcMin;
    }

    public void setUtcMin(String utcMin) {
        this.utcMin = utcMin;
    }

    public String getUtcSec() {
        return utcSec;
    }

    public void setUtcSec(String utcSec) {
        this.utcSec = utcSec;
    }

    public String getPositionAccuracy() {
        return positionAccuracy;
    }

    public void setPositionAccuracy(String positionAccuracy) {
        this.positionAccuracy = positionAccuracy;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getPositioningType() {
        return positioningType;
    }

    public void setPositioningType(String positioningType) {
        this.positioningType = positioningType;
    }

    public String getRadioTransmissionControl() {
        return radioTransmissionControl;
    }

    public void setRadioTransmissionControl(String radioTransmissionControl) {
        this.radioTransmissionControl = radioTransmissionControl;
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

    public String getCommunicationState() {
        return communicationState;
    }

    public void setCommunicationState(String communicationState) {
        this.communicationState = communicationState;
    }

    @Override
    public String toString() {
        return "WorldDateResponseRepository{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", utcYear='" + utcYear + '\'' +
                ", utcMonth='" + utcMonth + '\'' +
                ", utcDay='" + utcDay + '\'' +
                ", utcHour='" + utcHour + '\'' +
                ", utcMin='" + utcMin + '\'' +
                ", utcSec='" + utcSec + '\'' +
                ", positionAccuracy='" + positionAccuracy + '\'' +
                ", Longitude='" + Longitude + '\'' +
                ", Latitude='" + Latitude + '\'' +
                ", positioningType='" + positioningType + '\'' +
                ", radioTransmissionControl='" + radioTransmissionControl + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                ", raimFlag='" + raimFlag + '\'' +
                ", communicationState='" + communicationState + '\'' +
                '}';
    }
}
