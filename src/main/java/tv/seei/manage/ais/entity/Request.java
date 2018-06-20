package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 15 询问
 */
@Entity
@Table
public class Request {
    public static int[] tag =new int[]{6,2,30,2,30,6,12,2,6,12,6,12,2,30,6,12,2};

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
    private String destMmsi1;//目的地ID1
    //消息ID 1.1
    @Column
    private String msg1;
    //时隙偏置1.1
    @Column
    private String soltTime1;
    //备用
    @Column
    private String standbyMesg2;
    //消息ID 1.2
    @Column
    private String msg2;
    //时隙偏置1.2
    @Column
    private String soltTime2;
    //备用
    @Column
    private String standbyMesg3;
    //目的地ID 2
    @Column
    private String destMmsi2;//目的地ID1
    //消息ID 2.1
    @Column
    private String msg3;
    //时隙偏置2.1
    @Column
    private String soltTime3;
    //备用
    @Column
    private String standbyMesg4;

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

    public String getDestMmsi1() {
        return destMmsi1;
    }

    public void setDestMmsi1(String destMmsi1) {
        this.destMmsi1 = destMmsi1;
    }

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public String getSoltTime1() {
        return soltTime1;
    }

    public void setSoltTime1(String soltTime1) {
        this.soltTime1 = soltTime1;
    }

    public String getStandbyMesg2() {
        return standbyMesg2;
    }

    public void setStandbyMesg2(String standbyMesg2) {
        this.standbyMesg2 = standbyMesg2;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public String getSoltTime2() {
        return soltTime2;
    }

    public void setSoltTime2(String soltTime2) {
        this.soltTime2 = soltTime2;
    }

    public String getStandbyMesg3() {
        return standbyMesg3;
    }

    public void setStandbyMesg3(String standbyMesg3) {
        this.standbyMesg3 = standbyMesg3;
    }

    public String getDestMmsi2() {
        return destMmsi2;
    }

    public void setDestMmsi2(String destMmsi2) {
        this.destMmsi2 = destMmsi2;
    }

    public String getMsg3() {
        return msg3;
    }

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }

    public String getSoltTime3() {
        return soltTime3;
    }

    public void setSoltTime3(String soltTime3) {
        this.soltTime3 = soltTime3;
    }

    public String getStandbyMesg4() {
        return standbyMesg4;
    }

    public void setStandbyMesg4(String standbyMesg4) {
        this.standbyMesg4 = standbyMesg4;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", destMmsi1='" + destMmsi1 + '\'' +
                ", msg1='" + msg1 + '\'' +
                ", soltTime1='" + soltTime1 + '\'' +
                ", standbyMesg2='" + standbyMesg2 + '\'' +
                ", msg2='" + msg2 + '\'' +
                ", soltTime2='" + soltTime2 + '\'' +
                ", standbyMesg3='" + standbyMesg3 + '\'' +
                ", destMmsi2='" + destMmsi2 + '\'' +
                ", msg3='" + msg3 + '\'' +
                ", soltTime3='" + soltTime3 + '\'' +
                ", standbyMesg4='" + standbyMesg4 + '\'' +
                '}';
    }
}
