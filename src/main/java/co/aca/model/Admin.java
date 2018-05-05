package co.aca.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "iscepfake")
@JsonIgnoreProperties("inspection")
public class Admin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type")
    private int type;

    @Column(name = "tc")
    private String tcNo;

    @Column(name = "ticari_mus_no")
    private String ticariMusNo;

    @Column(name = "kul_kod")
    private String kulKodu;

    @Column(name = "pass")
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTicariMusNo() {
        return ticariMusNo;
    }

    public void setTicariMusNo(String ticariMusNo) {
        this.ticariMusNo = ticariMusNo;
    }

    public String getKulKodu() {
        return kulKodu;
    }

    public void setKulKodu(String kulKodu) {
        this.kulKodu = kulKodu;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}