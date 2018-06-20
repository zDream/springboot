package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 13 安全相关确认
 */
@Entity
@Table
public class SafetyVerification {
    public static int[] tag =new int[]{6,2,30,2,30,2,30,2,30,2,30,2};
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
    private String standbyMes;
    //目的地Id 30位
    @Column
    private String destinationMmsi1;//目的地ID1
    //序列编号 2位
    @Column
    private String seqNum1;//序列编号
    //目的地Id 30位
    @Column
    private String destinationMmsi2;//目的地ID2
    //序列编号 2位
    @Column
    private String seqNum2;//序列编号
    //目的地Id 30位
    @Column
    private String destinationMmsi3;//目的地ID3
    //序列编号 2位
    @Column
    private String seqNum3;//序列编号
    //目的地Id 30位
    @Column
    private String destinationMmsi4;//目的地ID4
    //序列编号 2位
    @Column
    private String seqNum4;//序列编号

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

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    public String getDestinationMmsi1() {
        return destinationMmsi1;
    }

    public void setDestinationMmsi1(String destinationMmsi1) {
        this.destinationMmsi1 = destinationMmsi1;
    }

    public String getSeqNum1() {
        return seqNum1;
    }

    public void setSeqNum1(String seqNum1) {
        this.seqNum1 = seqNum1;
    }

    public String getDestinationMmsi2() {
        return destinationMmsi2;
    }

    public void setDestinationMmsi2(String destinationMmsi2) {
        this.destinationMmsi2 = destinationMmsi2;
    }

    public String getSeqNum2() {
        return seqNum2;
    }

    public void setSeqNum2(String seqNum2) {
        this.seqNum2 = seqNum2;
    }

    public String getDestinationMmsi3() {
        return destinationMmsi3;
    }

    public void setDestinationMmsi3(String destinationMmsi3) {
        this.destinationMmsi3 = destinationMmsi3;
    }

    public String getSeqNum3() {
        return seqNum3;
    }

    public void setSeqNum3(String seqNum3) {
        this.seqNum3 = seqNum3;
    }

    public String getDestinationMmsi4() {
        return destinationMmsi4;
    }

    public void setDestinationMmsi4(String destinationMmsi4) {
        this.destinationMmsi4 = destinationMmsi4;
    }

    public String getSeqNum4() {
        return seqNum4;
    }

    public void setSeqNum4(String seqNum4) {
        this.seqNum4 = seqNum4;
    }

    @Override
    public String toString() {
        return "SafetyVerification{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                ", destinationMmsi1='" + destinationMmsi1 + '\'' +
                ", seqNum1='" + seqNum1 + '\'' +
                ", destinationMmsi2='" + destinationMmsi2 + '\'' +
                ", seqNum2='" + seqNum2 + '\'' +
                ", destinationMmsi3='" + destinationMmsi3 + '\'' +
                ", seqNum3='" + seqNum3 + '\'' +
                ", destinationMmsi4='" + destinationMmsi4 + '\'' +
                ", seqNum4='" + seqNum4 + '\'' +
                '}';
    }
}
