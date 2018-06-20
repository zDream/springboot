package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 25 单时隙二进制消息
 */
@Entity
@Table
public class SlotTimeBinaryMsg {
    public static int[] tag =new int[]{6,2,30,1,1,30,2,96};

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
    //目的地指示符
    @Column
    private String destinationIndicator;
    //二进制
    @Column
    private String binary;
    //数据标记
    @Column
    private String dataFlag;
    //目的地ID
    @Column
    private String destinationMmsi;
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

    public String getDestinationIndicator() {
        return destinationIndicator;
    }

    public void setDestinationIndicator(String destinationIndicator) {
        this.destinationIndicator = destinationIndicator;
    }

    public String getBinary() {
        return binary;
    }

    public void setBinary(String binary) {
        this.binary = binary;
    }

    public String getDataFlag() {
        return dataFlag;
    }

    public void setDataFlag(String dataFlag) {
        this.dataFlag = dataFlag;
    }

    public String getDestinationMmsi() {
        return destinationMmsi;
    }

    public void setDestinationMmsi(String destinationMmsi) {
        this.destinationMmsi = destinationMmsi;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    @Override
    public String toString() {
        return "SlotTimeBinaryMsg{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", destinationIndicator='" + destinationIndicator + '\'' +
                ", binary='" + binary + '\'' +
                ", dataFlag='" + dataFlag + '\'' +
                ", destinationMmsi='" + destinationMmsi + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                '}';
    }
}
