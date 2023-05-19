/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "sanpham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sanpham.findAll", query = "SELECT s FROM Sanpham s"),
    @NamedQuery(name = "Sanpham.findByIdSanPham", query = "SELECT s FROM Sanpham s WHERE s.idSanPham = :idSanPham"),
    @NamedQuery(name = "Sanpham.findByImg", query = "SELECT s FROM Sanpham s WHERE s.img = :img"),
    @NamedQuery(name = "Sanpham.findByTitle", query = "SELECT s FROM Sanpham s WHERE s.title = :title"),
    @NamedQuery(name = "Sanpham.findByGiaBan", query = "SELECT s FROM Sanpham s WHERE s.giaBan = :giaBan"),
    @NamedQuery(name = "Sanpham.findByGiamGia", query = "SELECT s FROM Sanpham s WHERE s.giamGia = :giamGia"),
    @NamedQuery(name = "Sanpham.findByMoTa", query = "SELECT s FROM Sanpham s WHERE s.moTa = :moTa"),
    @NamedQuery(name = "Sanpham.findByNgayNhap", query = "SELECT s FROM Sanpham s WHERE s.ngayNhap = :ngayNhap")})
public class Sanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSanPham")
    private Integer idSanPham;
    @Size(max = 2000)
    @Column(name = "img")
    private String img;
    @Size(max = 200)
    @Column(name = "title")
    private String title;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "giaBan")
    private Float giaBan;
    @Column(name = "giamGia")
    private Float giamGia;
    @Size(max = 2000)
    @Column(name = "moTa")
    private String moTa;
    @Size(max = 200)
    @Column(name = "ngayNhap")
    private String ngayNhap;
    @JoinColumn(name = "idDanhMucSanPham", referencedColumnName = "idDanhMucSanPham")
    @ManyToOne
    private Danhmucsanpham idDanhMucSanPham;
    @JoinColumn(name = "idMau", referencedColumnName = "idMau")
    @ManyToOne
    private Mau idMau;
    @OneToMany(mappedBy = "idSanPham")
    private Collection<Danhsachhoadon> danhsachhoadonCollection;
    @OneToMany(mappedBy = "idSanPham")
    private Collection<Kichco> kichcoCollection;
    @OneToMany(mappedBy = "idSanPham")
    private Collection<Giohang> giohangCollection;
    @OneToMany(mappedBy = "idSanPham")
    private Collection<Chitiethoadon> chitiethoadonCollection;

    public Sanpham() {
    }

    public Sanpham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public Integer getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(Integer idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Float giaBan) {
        this.giaBan = giaBan;
    }

    public Float getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(Float giamGia) {
        this.giamGia = giamGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public Danhmucsanpham getIdDanhMucSanPham() {
        return idDanhMucSanPham;
    }

    public void setIdDanhMucSanPham(Danhmucsanpham idDanhMucSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
    }

    public Mau getIdMau() {
        return idMau;
    }

    public void setIdMau(Mau idMau) {
        this.idMau = idMau;
    }

    @XmlTransient
    public Collection<Danhsachhoadon> getDanhsachhoadonCollection() {
        return danhsachhoadonCollection;
    }

    public void setDanhsachhoadonCollection(Collection<Danhsachhoadon> danhsachhoadonCollection) {
        this.danhsachhoadonCollection = danhsachhoadonCollection;
    }

    @XmlTransient
    public Collection<Kichco> getKichcoCollection() {
        return kichcoCollection;
    }

    public void setKichcoCollection(Collection<Kichco> kichcoCollection) {
        this.kichcoCollection = kichcoCollection;
    }

    @XmlTransient
    public Collection<Giohang> getGiohangCollection() {
        return giohangCollection;
    }

    public void setGiohangCollection(Collection<Giohang> giohangCollection) {
        this.giohangCollection = giohangCollection;
    }

    @XmlTransient
    public Collection<Chitiethoadon> getChitiethoadonCollection() {
        return chitiethoadonCollection;
    }

    public void setChitiethoadonCollection(Collection<Chitiethoadon> chitiethoadonCollection) {
        this.chitiethoadonCollection = chitiethoadonCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSanPham != null ? idSanPham.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanpham)) {
            return false;
        }
        Sanpham other = (Sanpham) object;
        if ((this.idSanPham == null && other.idSanPham != null) || (this.idSanPham != null && !this.idSanPham.equals(other.idSanPham))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Sanpham[ idSanPham=" + idSanPham + " ]";
    }
    
}
