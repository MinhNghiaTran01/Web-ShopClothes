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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "khachhang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khachhang.findAll", query = "SELECT k FROM Khachhang k"),
    @NamedQuery(name = "Khachhang.findBySdt", query = "SELECT k FROM Khachhang k WHERE k.sdt = :sdt"),
    @NamedQuery(name = "Khachhang.findByTenKhachHang", query = "SELECT k FROM Khachhang k WHERE k.tenKhachHang = :tenKhachHang"),
    @NamedQuery(name = "Khachhang.findByDiaChi", query = "SELECT k FROM Khachhang k WHERE k.diaChi = :diaChi"),
    @NamedQuery(name = "Khachhang.findByEmail", query = "SELECT k FROM Khachhang k WHERE k.email = :email"),
    @NamedQuery(name = "Khachhang.findByGioiTinh", query = "SELECT k FROM Khachhang k WHERE k.gioiTinh = :gioiTinh")})
public class Khachhang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "sdt")
    private String sdt;
    @Size(max = 200)
    @Column(name = "tenKhachHang")
    private String tenKhachHang;
    @Size(max = 200)
    @Column(name = "diaChi")
    private String diaChi;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "email")
    private String email;
    @Size(max = 200)
    @Column(name = "gioiTinh")
    private String gioiTinh;
    @JoinColumn(name = "sdt", referencedColumnName = "username", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;
    @OneToMany(mappedBy = "soDienThoaiKH")
    private Collection<Danhsachhoadon> danhsachhoadonCollection;
    @OneToMany(mappedBy = "soDienThoaiKH")
    private Collection<Giohang> giohangCollection;

    public Khachhang() {
    }

    public Khachhang(String sdt) {
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @XmlTransient
    public Collection<Danhsachhoadon> getDanhsachhoadonCollection() {
        return danhsachhoadonCollection;
    }

    public void setDanhsachhoadonCollection(Collection<Danhsachhoadon> danhsachhoadonCollection) {
        this.danhsachhoadonCollection = danhsachhoadonCollection;
    }

    @XmlTransient
    public Collection<Giohang> getGiohangCollection() {
        return giohangCollection;
    }

    public void setGiohangCollection(Collection<Giohang> giohangCollection) {
        this.giohangCollection = giohangCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sdt != null ? sdt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khachhang)) {
            return false;
        }
        Khachhang other = (Khachhang) object;
        if ((this.sdt == null && other.sdt != null) || (this.sdt != null && !this.sdt.equals(other.sdt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Khachhang[ sdt=" + sdt + " ]";
    }
    
}
