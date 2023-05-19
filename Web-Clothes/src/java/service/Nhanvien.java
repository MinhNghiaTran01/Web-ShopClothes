/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "nhanvien")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nhanvien.findAll", query = "SELECT n FROM Nhanvien n"),
    @NamedQuery(name = "Nhanvien.findByIdNhanVien", query = "SELECT n FROM Nhanvien n WHERE n.idNhanVien = :idNhanVien"),
    @NamedQuery(name = "Nhanvien.findByTenNhanVien", query = "SELECT n FROM Nhanvien n WHERE n.tenNhanVien = :tenNhanVien"),
    @NamedQuery(name = "Nhanvien.findBySoDienThoai", query = "SELECT n FROM Nhanvien n WHERE n.soDienThoai = :soDienThoai"),
    @NamedQuery(name = "Nhanvien.findByDiaChi", query = "SELECT n FROM Nhanvien n WHERE n.diaChi = :diaChi"),
    @NamedQuery(name = "Nhanvien.findByEmail", query = "SELECT n FROM Nhanvien n WHERE n.email = :email")})
public class Nhanvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idNhanVien")
    private Integer idNhanVien;
    @Size(max = 200)
    @Column(name = "tenNhanVien")
    private String tenNhanVien;
    @Size(max = 200)
    @Column(name = "soDienThoai")
    private String soDienThoai;
    @Size(max = 200)
    @Column(name = "diaChi")
    private String diaChi;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 200)
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nhanvien")
    private Collection<Chucvu> chucvuCollection;
    @OneToMany(mappedBy = "idNhanVien")
    private Collection<Danhsachhoadon> danhsachhoadonCollection;
    @JoinColumn(name = "username", referencedColumnName = "username")
    @ManyToOne
    private Account username;

    public Nhanvien() {
    }

    public Nhanvien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
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

    @XmlTransient
    public Collection<Chucvu> getChucvuCollection() {
        return chucvuCollection;
    }

    public void setChucvuCollection(Collection<Chucvu> chucvuCollection) {
        this.chucvuCollection = chucvuCollection;
    }

    @XmlTransient
    public Collection<Danhsachhoadon> getDanhsachhoadonCollection() {
        return danhsachhoadonCollection;
    }

    public void setDanhsachhoadonCollection(Collection<Danhsachhoadon> danhsachhoadonCollection) {
        this.danhsachhoadonCollection = danhsachhoadonCollection;
    }

    public Account getUsername() {
        return username;
    }

    public void setUsername(Account username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNhanVien != null ? idNhanVien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.idNhanVien == null && other.idNhanVien != null) || (this.idNhanVien != null && !this.idNhanVien.equals(other.idNhanVien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Nhanvien[ idNhanVien=" + idNhanVien + " ]";
    }
    
}
