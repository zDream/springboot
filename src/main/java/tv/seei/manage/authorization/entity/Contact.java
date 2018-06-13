package tv.seei.manage.authorization.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String mail;

    public Contact() {
        super();
    }

    public Contact(String name, String phone, String mail) {
        super();
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        this.phone = value;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String value) {
        this.mail = value;
    }
}
