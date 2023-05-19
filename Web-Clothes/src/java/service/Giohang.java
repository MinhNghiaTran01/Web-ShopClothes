/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "giohang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Giohang.findAll", query = "SELECT g FROM Giohang g"),
    @NamedQuery(name = "Giohang.findByIdGH", query = "SELECT g FROM Giohang g WHERE g.idGH = :idGH"),
    @NamedQuery(name = "Giohang.findBySoLuong", query = "SELECT g FROM Giohang g WHERE g.soLuong = :soLuong")})
public class Giohang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGH")
    private Integer idGH;
    @Column(name = "soLuong")
    private Integer soLuong;
    @JoinColumn(name = "soDienThoaiKH", referencedColumnName = "sdt")
    @ManyToOne
    private Khachhang soDienThoaiKH;
    @JoinColumn(name = "idSanPham", referencedColumnName = "idSanPham")
    @ManyToOne
    private Sanpham idSanPham;

    public Giohang() {
    }

    public Giohang(Integer idGH) {
        this.idGH = idGH;
    }

    public Integer getIdGH() {
        return idGH;
    }

    public void setIdGH(Integer idGH) {
        this.idGH = idGH;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Khachhang getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(Khachhang soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
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
        hash += (idGH != null ? idGH.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Giohang)) {
            return false;
        }
        Giohang other = (Giohang) object;
        if ((this.idGH == null && other.idGH != null) || (this.idGH != null && !this.idGH.equals(other.idGH))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Giohang[ idGH=" + idGH + " ]";
    }
    
}
