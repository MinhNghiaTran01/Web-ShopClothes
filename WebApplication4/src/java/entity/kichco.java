/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class kichco {
    private String idKC;
    private String idSanPham,size;
    private int soLuong;

    public kichco() {
    }

    public kichco(String idKC, String idSanPham, String size, int soLuong) {
        this.idKC = idKC;
        this.idSanPham = idSanPham;
        this.size = size;
        this.soLuong = soLuong;
    }

    public String getIdKC() {
        return idKC;
    }

    public void setIdKC(String idKC) {
        this.idKC = idKC;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
}
