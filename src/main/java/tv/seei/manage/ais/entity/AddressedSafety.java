package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 12 寻址安全相关消息
 */
@Entity
@Table
public class AddressedSafety {
    public static int[] tag =new int[]{6,2,30,2,30,1,1};

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
    //序列编号 2位
    @Column
    private String seqNum;
    //目的地Id 30位
    @Column
    private String destMmsi;//目的地ID1
    //重发标志
    @Column
    private String retransmitFlag;
    //备用 2位
    @Column
    private String standbyMes;
    //安全相关文本
    @Column
    private String safeText;
    //最大比特总数
    @Column
    private String maxBit;

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

    public String getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(String seqNum) {
        this.seqNum = seqNum;
    }

    public String getDestMmsi() {
        return destMmsi;
    }

    public void setDestMmsi(String destMmsi) {
        this.destMmsi = destMmsi;
    }

    public String getRetransmitFlag() {
        return retransmitFlag;
    }

    public void setRetransmitFlag(String retransmitFlag) {
        this.retransmitFlag = retransmitFlag;
    }

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    public String getSafeText() {
        return safeText;
    }

    public void setSafeText(String safeText) {
        this.safeText = safeText;
    }

    public String getMaxBit() {
        return maxBit;
    }

    public void setMaxBit(String maxBit) {
        this.maxBit = maxBit;
    }

    @Override
    public String toString() {
        return "AddressedSafety{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", seqNum='" + seqNum + '\'' +
                ", destMmsi='" + destMmsi + '\'' +
                ", retransmitFlag='" + retransmitFlag + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                ", safeText='" + safeText + '\'' +
                ", maxBit='" + maxBit + '\'' +
                '}';
    }
}
