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
@Table(name = "kichco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kichco.findAll", query = "SELECT k FROM Kichco k"),
    @NamedQuery(name = "Kichco.findByIdKC", query = "SELECT k FROM Kichco k WHERE k.idKC = :idKC"),
    @NamedQuery(name = "Kichco.findBySize", query = "SELECT k FROM Kichco k WHERE k.size = :size"),
    @NamedQuery(name = "Kichco.findBySoLuong", query = "SELECT k FROM Kichco k WHERE k.soLuong = :soLuong")})
public class Kichco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idKC")
    private Integer idKC;
    @Size(max = 200)
    @Column(name = "size")
    private String size;
    @Column(name = "soLuong")
    private Integer soLuong;
    @JoinColumn(name = "idSanPham", referencedColumnName = "idSanPham")
    @ManyToOne
    private Sanpham idSanPham;

    public Kichco() {
    }

    public Kichco(Integer idKC) {
        this.idKC = idKC;
    }

    public Integer getIdKC() {
        return idKC;
    }

    public void setIdKC(Integer idKC) {
        this.idKC = idKC;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
        hash += (idKC != null ? idKC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kichco)) {
            return false;
        }
        Kichco other = (Kichco) object;
        if ((this.idKC == null && other.idKC != null) || (this.idKC != null && !this.idKC.equals(other.idKC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Kichco[ idKC=" + idKC + " ]";
    }
    
}
