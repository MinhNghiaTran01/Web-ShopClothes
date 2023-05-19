/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Nghia
 */
@Embeddable
public class ChucvuPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idNhanVien")
    private int idNhanVien;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "tenChucVu")
    private String tenChucVu;

    public ChucvuPK() {
    }

    public ChucvuPK(int idNhanVien, String tenChucVu) {
        this.idNhanVien = idNhanVien;
        this.tenChucVu = tenChucVu;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idNhanVien;
        hash += (tenChucVu != null ? tenChucVu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChucvuPK)) {
            return false;
        }
        ChucvuPK other = (ChucvuPK) object;
        if (this.idNhanVien != other.idNhanVien) {
            return false;
        }
        if ((this.tenChucVu == null && other.tenChucVu != null) || (this.tenChucVu != null && !this.tenChucVu.equals(other.tenChucVu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "service.ChucvuPK[ idNhanVien=" + idNhanVien + ", tenChucVu=" + tenChucVu + " ]";
    }
    
}
