/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class danhsachhoadon {
    private int idDSHD,idSanPham;
    private String soDienThoaiKH;
    private int idNhanVien;
    private String ngayBan;

    public danhsachhoadon() {
    }

    public danhsachhoadon(int idDSHD, int idSanPham, String soDienThoaiKH, int idNhanVien, String ngayBan) {
        this.idDSHD = idDSHD;
        this.idSanPham = idSanPham;
        this.soDienThoaiKH = soDienThoaiKH;
        this.idNhanVien = idNhanVien;
        this.ngayBan = ngayBan;
    }

    public int getIdDSHD() {
        return idDSHD;
    }

    public void setIdDSHD(int idDSHD) {
        this.idDSHD = idDSHD;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(String ngayBan) {
        this.ngayBan = ngayBan;
    }
    
    
}
