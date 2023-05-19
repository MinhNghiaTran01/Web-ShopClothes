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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Nghia
 */
@Entity
@Table(name = "dathang")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dathang.findAll", query = "SELECT d FROM Dathang d"),
    @NamedQuery(name = "Dathang.findByIdHoaDon", query = "SELECT d FROM Dathang d WHERE d.idHoaDon = :idHoaDon"),
    @NamedQuery(name = "Dathang.findByDiaChiNhanHang", query = "SELECT d FROM Dathang d WHERE d.diaChiNhanHang = :diaChiNhanHang"),
    @NamedQuery(name = "Dathang.findBySoDienThoaiNhanHang", query = "SELECT d FROM Dathang d WHERE d.soDienThoaiNhanHang = :soDienThoaiNhanHang"),
    @NamedQuery(name = "Dathang.findByHinhThucThanhToan", query = "SELECT d FROM Dathang d WHERE d.hinhThucThanhToan = :hinhThucThanhToan")})
public class Dathang implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idHoaDon")
    private Integer idHoaDon;
    @Size(max = 1000)
    @Column(name = "diaChiNhanHang")
    private String diaChiNhanHang;
    @Size(max = 200)
    @Column(name = "soDienThoaiNhanHang")
    private String soDienThoaiNhanHang;
    @Size(max = 200)
    @Column(name = "hinhThucThanhToan")
    private String hinhThucThanhToan;

    public Dathang() {
    }

    public Dathang(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public String getDiaChiNhanHang() {
        return diaChiNhanHang;
    }

    public void setDiaChiNhanHang(String diaChiNhanHang) {
        this.diaChiNhanHang = diaChiNhanHang;
    }

    public String getSoDienThoaiNhanHang() {
        return soDienThoaiNhanHang;
    }

    public void setSoDienThoaiNhanHang(String soDienThoaiNhanHang) {
        this.soDienThoaiNhanHang = soDienThoaiNhanHang;
    }

    public String getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(String hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
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
        if (!(object instanceof Dathang)) {
            return false;
        }
        Dathang other = (Dathang) object;
        if ((this.idHoaDon == null && other.idHoaDon != null) || (this.idHoaDon != null && !this.idHoaDon.equals(other.idHoaDon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Dathang[ idHoaDon=" + idHoaDon + " ]";
    }
    
}
