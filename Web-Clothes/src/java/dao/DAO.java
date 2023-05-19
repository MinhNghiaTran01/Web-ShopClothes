/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.chitiethoadon;
import entity.danhsachhoadon;
import entity.dathang;
import entity.kichco;
import entity.mau;
import entity.account;
import entity.sanpham;
import entity.khachhang;
import entity.gioHang;
import entity.danhmucsanpham;
import entity.productimage;

        
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<danhmucsanpham> getAllDanhMucSanPham(){
        List<danhmucsanpham> list = new ArrayList<>();
        try {
            String query = "SELECT * FROM danhmucsanpham";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                
                list.add( new danhmucsanpham( rs.getString(1),rs.getString(2) ,rs.getString(3)) );
            }
        } catch (Exception e) {
        }
        return list;
    }
    
   
    public danhmucsanpham getDanhMucSanPhamByID(String iddanhmucsanpham){
        danhmucsanpham dmsp = new danhmucsanpham();
        try {
            String query = "select * from danhmucsanpham" + "  where idDanhMucSanPham = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, iddanhmucsanpham );
            rs = ps.executeQuery();
            while(rs.next()){
                

                dmsp = new danhmucsanpham( rs.getString(1),rs.getString(2) ,rs.getString(3)) ;

                dmsp = new danhmucsanpham( rs.getString(1),rs.getString(2) ,rs.getString(3)) ;

            }
        } catch (Exception e) {
        }
        return dmsp;
    }


    public List<sanpham> getAllProductByID(String iddanhmucsanpham){
        List<sanpham> list = new ArrayList<>();
        try {
            String query = "select * from sanpham " + " where idDanhMucSanPham = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, iddanhmucsanpham);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(  new sanpham( rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5) , rs.getFloat(6) , rs.getFloat(7),
                        rs.getString(8) , rs.getString(9) ) );
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<sanpham> getAllProductByNameSanPham(String namesanpham){
        List<sanpham> list = new ArrayList<>();
        try {
            String query = "select * from sanpham " + " where title = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, namesanpham);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(  new sanpham( rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5) , rs.getFloat(6) , rs.getFloat(7),
                        rs.getString(8) , rs.getString(9) ) );
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
        
    public List<sanpham> getAllProduct(){
        List<sanpham> list = new ArrayList<>();
        try {
            String query = "select * from sanpham ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(  new sanpham( rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5) , rs.getFloat(6) , rs.getFloat(7),
                        rs.getString(8) , rs.getString(9) ) );
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
//    public static void main(String[] args) {
//        DAO dao = new DAO();

//        account acc = dao.getaccountByUserName("nam", "12");

//        Account acc = dao.getAccountByUserName("nam", "12");

//        if(acc==null)
//        {
//            System.out.println("1");
//        }
//        else System.out.println("2");
//        System.out.println(acc);
//    }
    
    

    public sanpham getProductByID(String idSanPham){
        sanpham sp = new sanpham();
        try {
            String query = "select * from sanpham " + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                sp =  new sanpham( rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4) , rs.getString(5) , rs.getFloat(6),
                        rs.getInt(7) , rs.getString(8), rs.getString(9) );

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }
    

    
    

    public List<productimage> getProductImageByID(String idsanpham){
        List<productimage> list = new ArrayList<>();
        try {
            String query = "select * from productimage " + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idsanpham);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add( new productimage( rs.getString(1), rs.getString(2) ) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    

//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        List<productimage> list = DAO.getproductimageByID("1");
//        System.out.println(list.size());
//    };
    
   
    public List<gioHang> getProductBySDTKhachHang(String soDienThoaiKhachHang){
        List<gioHang> list = new ArrayList<>();
        try {
            String query = "select * from giohang " + " where soDienThoaiKH = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            rs = ps.executeQuery();
            while(rs.next()){

                list.add( new gioHang( rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4) ) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    

    
    public void InsertGioHangByID (String soDienThoaiKhachHang,String idSanPham,int soLuong){
        List<gioHang> list = new ArrayList<>();
        try {
            String query = "insert into giohang " + " values(?,?,?) ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            ps.setString(2, idSanPham);
            ps.setInt(3, soLuong);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    

//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        DAO.InsertGioHangByID("nam", "1", 2);
//    }
    
    public account getAccountByUserName(String username,String pass){
        account acc = new account();
        try {
            String query = "select * from account " + " where username = ? and password = ? ";

            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){

                acc =  new account( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return acc;
    }
    
    public void InsertKhachHang(String sdtKhachHang,String tenKhachHang , String gioiTinh,
                            String diachi,String email ){
        try {

            khachhang khachHang = new khachhang();
            String query = " INSERT INTO khachhang " + " values(?,?,?,?,?,?,?) " ;
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, sdtKhachHang);
            ps.setString(2, "3");
            ps.setString(3, tenKhachHang);
            ps.setString(4, gioiTinh);
            ps.setString(5, diachi);
            ps.setString(6, email);
            ps.setString(7, "1");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
  
    public void InsertAccount(String usename,String password, String hoaDong, String chucVu ){
        try {

            account account = new account();
            String query = " INSERT INTO account " + " values(?,?,?,?) " ;
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, usename);
            ps.setString(2, password);
            ps.setString(3, "1");
            ps.setString(4, "1");
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    
    public void DeleteAccount(String usename,String password){
        try {

            account account = new account();
            String query = " Delete from account " + " where username= ? and password = ? " ;
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, usename);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
    
    public void PutAccount(String username, String password, String hoatDong, String chucVu) {
        try {
            Connection conn = new DBContext().getConnection();
            String query = "UPDATE account SET password = ?, hoatDong = ?, chucvu = ? WHERE username = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, hoatDong);
            ps.setString(3, chucVu);
            ps.setString(4, username);
            ps.executeUpdate();
            System.out.println("Dữ liệu đã được cập nhật thành công!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        DAO.PutAccount("acb", "123", "0", "Nhân Viên");
//    }
    public mau getMauByID(String idMau) {
        mau mau = new mau();
        try {
            String query = "select * from mau " + " where idMau = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idMau);
            rs = ps.executeQuery();
            while(rs.next()){
                mau =  new mau( rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return mau;
    }
    
    public kichco getKichCoByID(String idSanPham) {
        kichco kc = new kichco();
        try {
            String query = "select * from kichco" + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                kc =  new kichco(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)) ;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return kc;
    }

}
