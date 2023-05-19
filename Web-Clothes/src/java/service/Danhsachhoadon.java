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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "danhsachhoadon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhsachhoadon.findAll", query = "SELECT d FROM Danhsachhoadon d"),
    @NamedQuery(name = "Danhsachhoadon.findByIdDSHD", query = "SELECT d FROM Danhsachhoadon d WHERE d.idDSHD = :idDSHD"),
    @NamedQuery(name = "Danhsachhoadon.findByNgayBan", query = "SELECT d FROM Danhsachhoadon d WHERE d.ngayBan = :ngayBan")})
public class Danhsachhoadon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDSHD")
    private Integer idDSHD;
    @Size(max = 200)
    @Column(name = "ngayBan")
    private String ngayBan;
    @JoinColumn(name = "soDienThoaiKH", referencedColumnName = "sdt")
    @ManyToOne
    private Khachhang soDienThoaiKH;
    @JoinColumn(name = "idNhanVien", referencedColumnName = "idNhanVien")
    @ManyToOne
    private Nhanvien idNhanVien;
    @JoinColumn(name = "idSanPham", referencedColumnName = "idSanPham")
    @ManyToOne
    private Sanpham idSanPham;

    public Danhsachhoadon() {
    }

    public Danhsachhoadon(Integer idDSHD) {
        this.idDSHD = idDSHD;
    }

    public Integer getIdDSHD() {
        return idDSHD;
    }

    public void setIdDSHD(Integer idDSHD) {
        this.idDSHD = idDSHD;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }

    public Khachhang getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(Khachhang soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public Nhanvien getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Nhanvien idNhanVien) {
        this.idNhanVien = idNhanVien;
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
        hash += (idDSHD != null ? idDSHD.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhsachhoadon)) {
            return false;
        }
        Danhsachhoadon other = (Danhsachhoadon) object;
        if ((this.idDSHD == null && other.idDSHD != null) || (this.idDSHD != null && !this.idDSHD.equals(other.idDSHD))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Danhsachhoadon[ idDSHD=" + idDSHD + " ]";
    }
    
}
