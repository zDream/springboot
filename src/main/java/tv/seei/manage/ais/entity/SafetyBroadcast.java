package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 14 安全相关广播信息
 */
@Entity
@Table
public class SafetyBroadcast {
    public static int[] tag =new int[]{6,2,30,2};

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

    public String getStandbyMes() {
        return standbyMes;
    }

    public void setStandbyMes(String standbyMes) {
        this.standbyMes = standbyMes;
    }

    @Override
    public String toString() {
        return "SafetyBroadcast{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes='" + standbyMes + '\'' +
                '}';
    }
}
