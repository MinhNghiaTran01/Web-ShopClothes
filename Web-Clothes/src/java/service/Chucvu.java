/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "chucvu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chucvu.findAll", query = "SELECT c FROM Chucvu c"),
    @NamedQuery(name = "Chucvu.findByIdNhanVien", query = "SELECT c FROM Chucvu c WHERE c.chucvuPK.idNhanVien = :idNhanVien"),
    @NamedQuery(name = "Chucvu.findByTenChucVu", query = "SELECT c FROM Chucvu c WHERE c.chucvuPK.tenChucVu = :tenChucVu"),
    @NamedQuery(name = "Chucvu.findByMoTa", query = "SELECT c FROM Chucvu c WHERE c.moTa = :moTa")})
public class Chucvu implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChucvuPK chucvuPK;
    @Size(max = 2000)
    @Column(name = "moTa")
    private String moTa;
    @JoinColumn(name = "idNhanVien", referencedColumnName = "idNhanVien", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Nhanvien nhanvien;

    public Chucvu() {
    }

    public Chucvu(ChucvuPK chucvuPK) {
        this.chucvuPK = chucvuPK;
    }

    public Chucvu(int idNhanVien, String tenChucVu) {
        this.chucvuPK = new ChucvuPK(idNhanVien, tenChucVu);
    }

    public ChucvuPK getChucvuPK() {
        return chucvuPK;
    }

    public void setChucvuPK(ChucvuPK chucvuPK) {
        this.chucvuPK = chucvuPK;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Nhanvien getNhanvien() {
        return nhanvien;
    }

    public void setNhanvien(Nhanvien nhanvien) {
        this.nhanvien = nhanvien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chucvuPK != null ? chucvuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chucvu)) {
            return false;
        }
        Chucvu other = (Chucvu) object;
        if ((this.chucvuPK == null && other.chucvuPK != null) || (this.chucvuPK != null && !this.chucvuPK.equals(other.chucvuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Chucvu[ chucvuPK=" + chucvuPK + " ]";
    }
    
}
