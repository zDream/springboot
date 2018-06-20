package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 16 指配模式命令
 */
@Entity
@Table
public class MatchingModel {
    public static int[] tag =new int[]{6,2,30,2,30,12,10,30,12,10,4};

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
    //目的地Id A
    @Column
    private String destMmsiA;//目的地ID1
    //偏置位置指示符A
    @Column
    private String positionIndicatorA;
    //增量A
    @Column
    private String  incrementA;
    //目的地Id B
    @Column
    private String destMmsiB;//目的地ID1
    //偏置位置指示符 B
    @Column
    private String positionIndicatorB;
    //增量 B
    @Column
    private String  incrementB;


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

    public String getDestMmsiA() {
        return destMmsiA;
    }

    public void setDestMmsiA(String destMmsiA) {
        this.destMmsiA = destMmsiA;
    }

    public String getPositionIndicatorA() {
        return positionIndicatorA;
    }

    public void setPositionIndicatorA(String positionIndicatorA) {
        this.positionIndicatorA = positionIndicatorA;
    }

    public String getIncrementA() {
        return incrementA;
    }

    public void setIncrementA(String incrementA) {
        this.incrementA = incrementA;
    }

    public String getDestMmsiB() {
        return destMmsiB;
    }

    public void setDestMmsiB(String destMmsiB) {
        this.destMmsiB = destMmsiB;
    }

    public String getPositionIndicatorB() {
        return positionIndicatorB;
    }

    public void setPositionIndicatorB(String positionIndicatorB) {
        this.positionIndicatorB = positionIndicatorB;
    }

    public String getIncrementB() {
        return incrementB;
    }

    public void setIncrementB(String incrementB) {
        this.incrementB = incrementB;
    }

    @Override
    public String toString() {
        return "MatchingModel{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", destMmsiA='" + destMmsiA + '\'' +
                ", positionIndicatorA='" + positionIndicatorA + '\'' +
                ", incrementA='" + incrementA + '\'' +
                ", destMmsiB='" + destMmsiB + '\'' +
                ", positionIndicatorB='" + positionIndicatorB + '\'' +
                ", incrementB='" + incrementB + '\'' +
                '}';
    }
}
