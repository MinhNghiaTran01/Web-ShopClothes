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
@Table(name = "mau")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mau.findAll", query = "SELECT m FROM Mau m"),
    @NamedQuery(name = "Mau.findByIdMau", query = "SELECT m FROM Mau m WHERE m.idMau = :idMau"),
    @NamedQuery(name = "Mau.findByMau", query = "SELECT m FROM Mau m WHERE m.mau = :mau")})
public class Mau implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMau")
    private Integer idMau;
    @Size(max = 200)
    @Column(name = "mau")
    private String mau;
    @OneToMany(mappedBy = "idMau")
    private Collection<Sanpham> sanphamCollection;

    public Mau() {
    }

    public Mau(Integer idMau) {
        this.idMau = idMau;
    }

    public Integer getIdMau() {
        return idMau;
    }

    public void setIdMau(Integer idMau) {
        this.idMau = idMau;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
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
        hash += (idMau != null ? idMau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mau)) {
            return false;
        }
        Mau other = (Mau) object;
        if ((this.idMau == null && other.idMau != null) || (this.idMau != null && !this.idMau.equals(other.idMau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.Mau[ idMau=" + idMau + " ]";
    }
    
}
