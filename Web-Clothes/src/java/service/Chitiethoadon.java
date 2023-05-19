/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "chitiethoadon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chitiethoadon.findAll", query = "SELECT c FROM Chitiethoadon c"),
    @NamedQuery(name = "Chitiethoadon.findByIdHoaDon", query = "SELECT c FROM Chitiethoadon c WHERE c.idHoaDon = :idHoaDon"),
    @NamedQuery(name = "Chitiethoadon.findByGiaBan", query = "SELECT c FROM Chitiethoadon c WHERE c.giaBan = :giaBan"),
    @NamedQuery(name = "Chitiethoadon.findBySoLuong", query = "SELECT c FROM Chitiethoadon c WHERE c.soLuong = :soLuong")})
public class Chitiethoadon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idHoaDon")
    private Integer idHoaDon;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "giaBan")
    private Float giaBan;
    @Column(name = "soLuong")
    private Integer soLuong;
    @JoinColumn(name = "idSanPham", referencedColumnName = "idSanPham")
    @ManyToOne
    private Sanpham idSanPham;

    public Chitiethoadon() {
    }

    public Chitiethoadon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Sanpham getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Sanpham idSanPham) {
        this.idSanPham = idSanPham;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHoaDon != null ? idHoaDon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitiethoadon)) {
            return false;
        }
        Chitiethoadon other = (Chitiethoadon) object;
        if ((this.idHoaDon == null && other.idHoaDon != null) || (this.idHoaDon != null && !this.idHoaDon.equals(other.idHoaDon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Chitiethoadon[ idHoaDon=" + idHoaDon + " ]";
    }
    
}
