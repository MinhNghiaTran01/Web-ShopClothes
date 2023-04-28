/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class chitiethoadon {
    private int idHoaDon,idSanPham;
    private int soLuong;

    public chitiethoadon() {
    }

    public chitiethoadon(int idHoaDon, int idSanPham, float giaBan, int soLuong) {
        this.idHoaDon = idHoaDon;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }


    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
