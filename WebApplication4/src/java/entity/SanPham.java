/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String idSanPham;
    private int idDanhMucSanPham;
    private String img, title ,  mauSac;
    private float giaBan ;
    private float giamGia;
    private String moTa; 
    private String ngayNhap;

    public SanPham() {
    }
    
    public SanPham(String idSanPham, int idDanhMucSanPham, String img, String title, String mauSac, float giaBan, float giamGia, String moTa, String ngayNhap) {
        this.idSanPham = idSanPham;
        this.idDanhMucSanPham = idDanhMucSanPham;
        this.img = img;
        this.title = title;
        this.mauSac = mauSac;
        this.giaBan = giaBan;
        this.giamGia = giamGia;
        this.moTa = moTa;
        this.ngayNhap = ngayNhap;
    }
    
    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getIdDanhMucSanPham() {
        return idDanhMucSanPham;
    }

    public void setIdDanhMucSanPham(int idDanhMucSanPham) {
        this.idDanhMucSanPham = idDanhMucSanPham;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getGiamGia() {
        return giamGia;
      }

    public void setGiamGia(int giamGia) {
        this.giamGia = giamGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    
    
}
