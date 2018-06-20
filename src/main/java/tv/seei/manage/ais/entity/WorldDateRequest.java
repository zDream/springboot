package tv.seei.manage.ais.entity;

import javax.persistence.*;

/**
 * 消息 10 协调世界时/日期询问
 */
@Entity
@Table
public class WorldDateRequest {
    public static int[] tag =new int[]{6,2,30,2,30,2,72};

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
    //目的地Id 30位
    @Column
    private String destMmsi;
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

    public String getDestMmsi() {
        return destMmsi;
    }

    public void setDestMmsi(String destMmsi) {
        this.destMmsi = destMmsi;
    }

    public String getStandbyMes2() {
        return standbyMes2;
    }

    public void setStandbyMes2(String standbyMes2) {
        this.standbyMes2 = standbyMes2;
    }

    @Override
    public String toString() {
        return "WorldDateRequest{" +
                "id='" + id + '\'' +
                ", repeatIndicator='" + repeatIndicator + '\'' +
                ", sourceMmsi='" + sourceMmsi + '\'' +
                ", standbyMes1='" + standbyMes1 + '\'' +
                ", destMmsi='" + destMmsi + '\'' +
                ", standbyMes2='" + standbyMes2 + '\'' +
                '}';
    }
}
