/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.jdt.internal.compiler.batch.Main;

/**
 *
 * @author Admin
 */
public class gioHang {
    private String idGH, soDienThoaiKH , idSanPham, soLuong ;
    
    public gioHang() {
    }

    public gioHang(String soDienThoaiKH, String idSanPham, String soLuong) {
        this.soDienThoaiKH = soDienThoaiKH;
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
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKhachHang(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
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
        String[] items = txt.split("/");
        for(String str: items){
            String [] x = str.split(":");
            gioHang tmp = new gioHang();
            tmp.setIdSanPham(x[0]);
            tmp.setSoLuong(x[1]);
            list.add(tmp);
        }
        return list;
    }
//    public static void main(String[] args) {
//        gioHang g = new gioHang();
//        List<gioHang> list = g.getAllItem("1:1/1:1/");
//        for(gioHang tmp:list){
//            System.out.println(tmp.idSanPham);
//        }
//    }
}
