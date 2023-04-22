/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.DanhMucSanPham;
import entity.GioHang;
import entity.KhachHang;
import entity.ProductImage;
import entity.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.jsp.jstl.sql.Result;

/**
 *
 * @author Admin
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public List<DanhMucSanPham> getAllDanhMucSanPham(){
        List<DanhMucSanPham> list = new ArrayList<>();
        try {
            String query = "select * from DanhMucSanPham";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                
                list.add( new DanhMucSanPham( rs.getString(1),rs.getString(2) ,rs.getString(3)) );
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public DanhMucSanPham getDanhMucSanPhamByID(String idDanhMucSanPham){
        DanhMucSanPham dmsp = new DanhMucSanPham();
        try {
            String query = "select * from DanhMucSanPham" + "  where idDanhMucSanPham = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhMucSanPham );
            rs = ps.executeQuery();
            while(rs.next()){
                
                dmsp = new DanhMucSanPham( rs.getString(1),rs.getString(2) ,rs.getString(3)) ;
            }
        } catch (Exception e) {
        }
        return dmsp;
    }

    public List<SanPham> getAllProductByID(String idDanhMucSanPham){
        List<SanPham> list = new ArrayList<>();
        try {
            String query = "select * from SanPham " + " where idDanhMucSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhMucSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(  new SanPham( rs.getString(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4) , rs.getString(5) , rs.getFloat(6),
                        rs.getFloat(7) , rs.getString(8), rs.getString(9) ) );
            }
            
      
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        Account acc = dao.getAccountByUserName("nam", "12");
//        if(acc==null)
//        {
//            System.out.println("1");
//        }
//        else System.out.println("2");
//        System.out.println(acc);
//    }
    
    
    public SanPham getProductByID(String idDanhMucSanPham){
        SanPham sp = new SanPham();
        try {
            String query = "select * from SanPham " + " where idDanhMucSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhMucSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                sp =  new SanPham( rs.getString(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4) , rs.getString(5) , rs.getFloat(6),
                        rs.getInt(7) , rs.getString(8), rs.getString(9) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }
    
    public List<GioHang> getProductBysdtKhachHang(String sdtKhachHang){
        List<GioHang>  list = new ArrayList<>();
        try {
            String query = "select * from giohang " + " where soDienThoaiKhachHang = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, sdtKhachHang);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(  new GioHang( rs.getString(1), rs.getString(2), rs.getString(3) ) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<ProductImage> getProductImageByID(String idSanPham){
        List<ProductImage> list = new ArrayList<>();
        try {
            String query = "select * from ProductImage " + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add( new ProductImage( rs.getString(1), rs.getString(2) ) );
                                         
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public List<GioHang> getProductBySDTKhachHang(String soDienThoaiKhachHang){
        List<GioHang> list = new ArrayList<>();
        try {
            String query = "select * from GioHang " + " where soDienThoaiKH = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add( new GioHang( rs.getString(1), rs.getString(2),rs.getString(3) ) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
    public void InsertGioHangByID (String soDienThoaiKhachHang,String idSanPham,int soLuong){
        List<GioHang> list = new ArrayList<>();
        try {
            String query = "insert into GioHang " + " values(?,?,?) ";
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
    
    public Account getAccountByUserName(String username,String pass){
        Account acc = new Account();
        try {
            String query = "select * from Account " + " where usename = ? and password = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
                acc =  new Account( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return acc;
    }
    
    public void InsertKhachHang(String sdtKhachHang,String tenKhachHang , String gioiTinh,
                            String diachi,String email ){
        try {
            KhachHang khachHang = new KhachHang();
            String query = " INSERT INTO KhachHang " + " values(?,?,?,?,?,?,?) " ;
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
  
    public void InsertAccount(String usename,String password ){
        try {
            Account account = new Account();
            String query = " INSERT INTO Account " + " values(?,?,?) " ;
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, usename);
            ps.setString(2, password);
            ps.setString(3, "1");
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
