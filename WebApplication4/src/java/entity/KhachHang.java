/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class KhachHang {
    private String sdtKhachHang,tenKhachHang,diaChi;
    private String email,gioiTinh;

    public KhachHang() {
    }

    public KhachHang(String sdtKhachHang, String tenKhachHang, String diaChi, String email,String gioiTinh) {
        this.sdtKhachHang = sdtKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.email = email;
        this.gioiTinh = gioiTinh;
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

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
            
}
