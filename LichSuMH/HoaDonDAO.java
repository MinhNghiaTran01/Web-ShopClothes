/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.danhsachhoadon;
import entity.sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THANG
 */
public class HoaDonDAO {
     Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DAO dao = new DAO();
    public List<danhsachhoadon> getAllDanhSachHoaDon(){
        List<danhsachhoadon> list = new ArrayList<>();
        try {
            String query = "SELECT idDSHD, idSanPham, soDienThoaiKH, idNhanVien, ngayBan, thanhtien, soluong "
                    + "FROM danhsachhoadon";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                int idDSHD = rs.getInt(1);
                int idSP = rs.getInt(2);
                String SDT = rs.getString(3);
                int idNV = rs.getInt(4);
                String ngay = rs.getString(5);
                int thanhtien = rs.getInt(6);
                int soluong = rs.getInt(7);
                
                sanpham a = dao.getProductByID(String.valueOf(idSP));
                String img = a.getImg();
                int gia =  Math.round(a.getGiaBan()-a.getGiamGia());
                String title = a.getTitle();
                
                danhsachhoadon hd = new danhsachhoadon(ngay, gia, thanhtien, img, title, soluong, SDT);
                list.add(hd);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
