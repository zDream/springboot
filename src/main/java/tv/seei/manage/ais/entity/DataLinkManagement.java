package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 20 数据链路管理消息
 */
@Entity
@Table
public class DataLinkManagement {
    public static int[] tag =new int[]{6,2,30,2,12,4,3,11,12,4,3,11,12,4,3,11,12,4,3,6};
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
    //偏置数目1
    @Column
    private String skewingNumber1;
    //时隙数目1
    @Column
    private String slotTimeNumber1;
    //超时1
    @Column
    private String timeout1;
    //增量1
    @Column
    private String  increment1;
    //偏置数目2
    @Column
    private String skewingNumber2;
    //时隙数目2
    @Column
    private String slotTimeNumber2;
    //超时2
    @Column
    private String timeout2;
    //增量2
    @Column
    private String  increment2;
    //偏置数目3
    @Column
    private String skewingNumber3;
    //时隙数目3
    @Column
    private String slotTimeNumber3;
    //超时3
    @Column
    private String timeout3;
    //增量3
    @Column
    private String  increment3;
    //偏置数目4
    @Column
    private String skewingNumber4;
    //时隙数目4
    @Column
    private String slotTimeNumber4;
    //超时4
    @Column
    private String timeout4;
    //增量4
    @Column
    private String  increment4;
    //备用
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

    public String getSkewingNumber1() {
        return skewingNumber1;
    }

    public void setSkewingNumber1(String skewingNumber1) {
        this.skewingNumber1 = skewingNumber1;
    }

    public String getSlotTimeNumber1() {
        return slotTimeNumber1;
    }

    public void setSlotTimeNumber1(String slotTimeNumber1) {
        this.slotTimeNumber1 = slotTimeNumber1;
    }

    public String getTimeout1() {
        return timeout1;
    }

    public void setTimeout1(String timeout1) {
        this.timeout1 = timeout1;
    }

    public String getIncrement1() {
        return increment1;
    }

    public void setIncrement1(String increment1) {
        this.increment1 = increment1;
    }

    public String getSkewingNumber2() {
        return skewingNumber2;
    }

    public void setSkewingNumber2(String skewingNumber2) {
        this.skewingNumber2 = skewingNumber2;
    }

    public String getSlotTimeNumber2() {
        return slotTimeNumber2;
    }

    public void setSlotTimeNumber2(String slotTimeNumber2) {
        this.slotTimeNumber2 = slotTimeNumber2;
    }

    public String getTimeout2() {
        return timeout2;
    }

    public void setTimeout2(String timeout2) {
        this.timeout2 = timeout2;
    }

    public String getIncrement2() {
        return increment2;
    }

    public void setIncrement2(String increment2) {
        this.increment2 = increment2;
    }

    public String getSkewingNumber3() {
        return skewingNumber3;
    }

    public void setSkewingNumber3(String skewingNumber3) {
        this.skewingNumber3 = skewingNumber3;
    }

    public String getSlotTimeNumber3() {
        return slotTimeNumber3;
    }

    public void setSlotTimeNumber3(String slotTimeNumber3) {
        this.slotTimeNumber3 = slotTimeNumber3;
    }

    public String getTimeout3() {
        return timeout3;
    }

    public void setTimeout3(String timeout3) {
        this.timeout3 = timeout3;
    }

    public String getIncrement3() {
        return increment3;
    }

    public void setIncrement3(String increment3) {
        this.increment3 = increment3;
    }

    public String getSkewingNumber4() {
        return skewingNumber4;
    }

    public void setSkewingNumber4(String skewingNumber4) {
        this.skewingNumber4 = skewingNumber4;
    }

    public String getSlotTimeNumber4() {
        return slotTimeNumber4;
    }

    public void setSlotTimeNumber4(String slotTimeNumber4) {
        this.slotTimeNumber4 = slotTimeNumber4;
    }

    public String getTimeout4() {
        return timeout4;
    }

    public void setTimeout4(String timeout4) {
        this.timeout4 = timeout4;
    }

    public String getIncrement4() {
        return increment4;
    }

    public void setIncrement4(String increment4) {
        this.increment4 = increment4;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    @Override
    public String toString() {
        return "DataLinkManagement{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", skewingNumber1='" + skewingNumber1 + '\'' +
                ", slotTimeNumber1='" + slotTimeNumber1 + '\'' +
                ", timeout1='" + timeout1 + '\'' +
                ", increment1='" + increment1 + '\'' +
                ", skewingNumber2='" + skewingNumber2 + '\'' +
                ", slotTimeNumber2='" + slotTimeNumber2 + '\'' +
                ", timeout2='" + timeout2 + '\'' +
                ", increment2='" + increment2 + '\'' +
                ", skewingNumber3='" + skewingNumber3 + '\'' +
                ", slotTimeNumber3='" + slotTimeNumber3 + '\'' +
                ", timeout3='" + timeout3 + '\'' +
                ", increment3='" + increment3 + '\'' +
                ", skewingNumber4='" + skewingNumber4 + '\'' +
                ", slotTimeNumber4='" + slotTimeNumber4 + '\'' +
                ", timeout4='" + timeout4 + '\'' +
                ", increment4='" + increment4 + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                '}';
    }
}
