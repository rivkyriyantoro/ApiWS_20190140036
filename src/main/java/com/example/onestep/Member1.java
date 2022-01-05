/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.onestep;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author RIVKY RIYANTORO
 */
@Entity
@Table(name = "member")
@NamedQueries({
    @NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"),
    @NamedQuery(name = "Member1.findById", query = "SELECT m FROM Member1 m WHERE m.id = :id"),
    @NamedQuery(name = "Member1.findByNama", query = "SELECT m FROM Member1 m WHERE m.nama = :nama"),
    @NamedQuery(name = "Member1.findBySepatu", query = "SELECT m FROM Member1 m WHERE m.sepatu = :sepatu"),
    @NamedQuery(name = "Member1.findByTreatment", query = "SELECT m FROM Member1 m WHERE m.treatment = :treatment"),
    @NamedQuery(name = "Member1.findByTanggal", query = "SELECT m FROM Member1 m WHERE m.tanggal = :tanggal")})
public class Member1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "sepatu")
    private String sepatu;
    @Column(name = "treatment")
    private String treatment;
    @Column(name = "tanggal")
    private String tanggal;

    public Member1() {
    }

    public Member1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.onestep.Member1[ id=" + id + " ]";
    }
    
}
