/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class DanhMucSanPham {
    private String idDanhMucSanPham,theloai,tenSanPham;

    public DanhMucSanPham() {
    }
    
    
    public DanhMucSanPham(String idDanhMucSanPham, String theloai, String tenSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
        this.theloai = theloai;
        this.tenSanPham = tenSanPham;
    }

    

    public String getIdDanhMucSanPham() {
        return idDanhMucSanPham;
    }

    public void setIdDanhMucSanPham(String idDanhMucSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }
    
}
