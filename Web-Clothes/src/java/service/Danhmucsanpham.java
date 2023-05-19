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
@Table(name = "danhmucsanpham")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Danhmucsanpham.findAll", query = "SELECT d FROM Danhmucsanpham d"),
    @NamedQuery(name = "Danhmucsanpham.findByIdDanhMucSanPham", query = "SELECT d FROM Danhmucsanpham d WHERE d.idDanhMucSanPham = :idDanhMucSanPham"),
    @NamedQuery(name = "Danhmucsanpham.findByTheloai", query = "SELECT d FROM Danhmucsanpham d WHERE d.theloai = :theloai"),
    @NamedQuery(name = "Danhmucsanpham.findByTenLoaiSanPham", query = "SELECT d FROM Danhmucsanpham d WHERE d.tenLoaiSanPham = :tenLoaiSanPham")})
public class Danhmucsanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDanhMucSanPham")
    private Integer idDanhMucSanPham;
    @Size(max = 200)
    @Column(name = "theloai")
    private String theloai;
    @Size(max = 200)
    @Column(name = "tenLoaiSanPham")
    private String tenLoaiSanPham;
    @OneToMany(mappedBy = "idDanhMucSanPham")
    private Collection<Sanpham> sanphamCollection;

    public Danhmucsanpham() {
    }

    public Danhmucsanpham(Integer idDanhMucSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
    }

    public Integer getIdDanhMucSanPham() {
        return idDanhMucSanPham;
    }

    public void setIdDanhMucSanPham(Integer idDanhMucSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTenLoaiSanPham() {
        return tenLoaiSanPham;
    }

    public void setTenLoaiSanPham(String tenLoaiSanPham) {
        this.tenLoaiSanPham = tenLoaiSanPham;
    }

    @XmlTransient
    public Collection<Sanpham> getSanphamCollection() {
        return sanphamCollection;
    }

    public void setSanphamCollection(Collection<Sanpham> sanphamCollection) {
        this.sanphamCollection = sanphamCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDanhMucSanPham != null ? idDanhMucSanPham.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhmucsanpham)) {
            return false;
        }
        Danhmucsanpham other = (Danhmucsanpham) object;
        if ((this.idDanhMucSanPham == null && other.idDanhMucSanPham != null) || (this.idDanhMucSanPham != null && !this.idDanhMucSanPham.equals(other.idDanhMucSanPham))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Danhmucsanpham[ idDanhMucSanPham=" + idDanhMucSanPham + " ]";
    }
    
}
