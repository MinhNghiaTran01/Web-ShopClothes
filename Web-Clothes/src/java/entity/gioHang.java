/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class gioHang {
    private String idGH,soDienThoaiKhachHang,idSanPham,soLuong;
    
    public gioHang() {
    }

    public gioHang(String idGH, String soDienThoaiKhachHang, String idSanPham, String soLuong) {
        this.idGH = idGH;
        this.soDienThoaiKhachHang = soDienThoaiKhachHang;
        this.idSanPham = idSanPham;
        this.soLuong = soLuong;
    }

    public String getIdGH() {
        return idGH;
    }

    public void setIdGH(String idGH) {
        this.idGH = idGH;
    }

    public String getSoDienThoaiKhachHang() {
        return soDienThoaiKhachHang;
    }

    public void setSoDienThoaiKhachHang(String soDienThoaiKhachHang) {
        this.soDienThoaiKhachHang = soDienThoaiKhachHang;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
    
    
    public List<gioHang> getAllItem(String txt){
        List<gioHang> list = new ArrayList<>();
        txt = txt.substring(0,txt.length()-1);
        String[] str = txt.split("/");
        for(String tmp: str){
            String x[] = tmp.split(":");
            gioHang gh = new gioHang();
            gh.setIdSanPham(x[0]);
            gh.setSoLuong(x[1]);
            list.add(gh);
        }
        return list;
    }
}
