/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ti.umy.webservice.webservice.c.project.satu;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RIVKY RIYANTORO
 */
@Entity
@Table(name = "member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Memberone.findAll", query = "SELECT m FROM Memberone m"),
    @NamedQuery(name = "Memberone.findById", query = "SELECT m FROM Memberone m WHERE m.id = :id"),
    @NamedQuery(name = "Memberone.findByNama", query = "SELECT m FROM Memberone m WHERE m.nama = :nama"),
    @NamedQuery(name = "Memberone.findBySepatu", query = "SELECT m FROM Memberone m WHERE m.sepatu = :sepatu"),
    @NamedQuery(name = "Memberone.findByWarna", query = "SELECT m FROM Memberone m WHERE m.warna = :warna")})
public class Memberone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "sepatu")
    private String sepatu;
    @Column(name = "warna")
    private String warna;

    public Memberone() {
    }

    public Memberone(Integer id, String nama, String sepatu, String warna) {
         this.id = id;
        this.nama = nama;
        this.sepatu = sepatu;
        this.warna = warna;
    }


    public Memberone(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSepatu() {
        return sepatu;
    }

    public void setSepatu(String sepatu) {
        this.sepatu = sepatu;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Memberone)) {
            return false;
        }
        Memberone other = (Memberone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id; = " + getId() + "Nama = "+ getNama()+"Sepatu = "+getSepatu()+"Warna = "+getWarna();
    }
    
}
