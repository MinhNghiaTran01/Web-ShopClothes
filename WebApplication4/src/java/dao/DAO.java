/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
<<<<<<< HEAD
import entity.account;
import entity.danhmucsanpham;
import entity.gioHang;
import entity.khachhang;
import entity.khachhang;
import entity.kichco;
import entity.mau;
import entity.productimage;
import entity.sanpham;
=======
import entity.Account;
import entity.DanhMucSanPham;
import entity.GioHang;
import entity.KhachHang;
import entity.ProductImage;
import entity.SanPham;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40

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
<<<<<<< HEAD
    public List<danhmucsanpham> getAllDanhMucSanPham(){
        List<danhmucsanpham> list = new ArrayList<>();
        try {
            String query = "select * from danhmucsanpham";
=======
    public List<DanhMucSanPham> getAllDanhMucSanPham(){
        List<DanhMucSanPham> list = new ArrayList<>();
        try {
            String query = "select * from DanhMucSanPham";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                
<<<<<<< HEAD
                list.add( new danhmucsanpham( rs.getString(1),rs.getString(2) ,rs.getString(3)) );
=======
                list.add( new DanhMucSanPham( rs.getString(1),rs.getString(2) ,rs.getString(3)) );
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
        }
        return list;
    }
    
<<<<<<< HEAD
//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        List<danhmucsanpham> list = DAO.getAllDanhMucSanPham();
//        for(danhmucsanpham tmp : list){
//            System.out.println(tmp.getIdDanhMucSanPham());
//        }
//    }
    public danhmucsanpham getdanhmucsanphamByID(String idDanhMucSanPham){
        danhmucsanpham dmsp = new danhmucsanpham();
        try {
            String query = "select * from danhmucsanpham" + "  where idDanhMucSanPham = ?";
=======
    public DanhMucSanPham getDanhMucSanPhamByID(String idDanhMucSanPham){
        DanhMucSanPham dmsp = new DanhMucSanPham();
        try {
            String query = "select * from DanhMucSanPham" + "  where idDanhMucSanPham = ?";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhMucSanPham );
            rs = ps.executeQuery();
            while(rs.next()){
                
<<<<<<< HEAD
                dmsp = new danhmucsanpham( rs.getString(1),rs.getString(2) ,rs.getString(3)) ;
=======
                dmsp = new DanhMucSanPham( rs.getString(1),rs.getString(2) ,rs.getString(3)) ;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
        }
        return dmsp;
    }

<<<<<<< HEAD
    public List<sanpham> getAllProductByID(String idDanhMucSanPham){
        List<sanpham> list = new ArrayList<>();
        try {
            String query = "select * from sanpham " + " where idDanhMucSanPham = ? ";
=======
    public List<SanPham> getAllProductByID(String idDanhMucSanPham){
        List<SanPham> list = new ArrayList<>();
        try {
            String query = "select * from SanPham " + " where idDanhMucSanPham = ? ";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idDanhMucSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
<<<<<<< HEAD
                list.add(  new sanpham( rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5) , rs.getFloat(6) , rs.getFloat(7),
                        rs.getString(8) , rs.getString(9) ) );
            }
            
            
=======
                list.add(  new SanPham( rs.getString(1), rs.getInt(2),
                        rs.getString(3), rs.getString(4) , rs.getString(5) , rs.getFloat(6),
                        rs.getFloat(7) , rs.getString(8), rs.getString(9) ) );
            }
            
      
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
//    public static void main(String[] args) {
//        DAO dao = new DAO();
<<<<<<< HEAD
//        account acc = dao.getaccountByUserName("nam", "12");
=======
//        Account acc = dao.getAccountByUserName("nam", "12");
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
//        if(acc==null)
//        {
//            System.out.println("1");
//        }
//        else System.out.println("2");
//        System.out.println(acc);
//    }
    
    
<<<<<<< HEAD
    public sanpham getProductByID(String idSanPham){
        sanpham sp = new sanpham();
        try {
            String query = "select * from sanpham " + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                sp =  new sanpham( rs.getString(1), rs.getString(2), rs.getString(3), 
                        rs.getString(4), rs.getString(5) , rs.getFloat(6) , rs.getFloat(7),
                        rs.getString(8) , rs.getString(9) )  ;
=======
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
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return sp;
    }
    
<<<<<<< HEAD
    public List<gioHang> getProductBysdtKhachHang(String sdtKhachHang){
        List<gioHang>  list = new ArrayList<>();
        try {
            String query = "select * from giohang " + " where soDienThoaiKH = ? ";
=======
    public List<GioHang> getProductBysdtKhachHang(String sdtKhachHang){
        List<GioHang>  list = new ArrayList<>();
        try {
            String query = "select * from giohang " + " where soDienThoaiKhachHang = ? ";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, sdtKhachHang);
            rs = ps.executeQuery();
            while(rs.next()){
<<<<<<< HEAD
                list.add(  new gioHang( rs.getString(1), rs.getString(2), rs.getString(3) ) );
=======
                list.add(  new GioHang( rs.getString(1), rs.getString(2), rs.getString(3) ) );
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
<<<<<<< HEAD
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
=======
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
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
                                         
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
<<<<<<< HEAD
//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        List<productimage> list = DAO.getproductimageByID("1");
//        System.out.println(list.size());
//    };
    
    public List<gioHang> getProductBySDTKhachHang(String soDienThoaiKhachHang){
        List<gioHang> list = new ArrayList<>();
        try {
            String query = "select * from gioHang " + " where soDienThoaiKH = ? ";
=======
    public List<GioHang> getProductBySDTKhachHang(String soDienThoaiKhachHang){
        List<GioHang> list = new ArrayList<>();
        try {
            String query = "select * from GioHang " + " where soDienThoaiKH = ? ";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            rs = ps.executeQuery();
            while(rs.next()){
<<<<<<< HEAD
                list.add( new gioHang( rs.getString(1), rs.getString(2),rs.getString(3) ) );
=======
                list.add( new GioHang( rs.getString(1), rs.getString(2),rs.getString(3) ) );
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
<<<<<<< HEAD
    public void InsertGioHangByID (String soDienThoaiKhachHang,String idsanpham,int soLuong){
        try {
            String query = "insert into gioHang " + " values(?,?,?) ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            ps.setString(2, idsanpham);
=======
    public void InsertGioHangByID (String soDienThoaiKhachHang,String idSanPham,int soLuong){
        List<GioHang> list = new ArrayList<>();
        try {
            String query = "insert into GioHang " + " values(?,?,?) ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, soDienThoaiKhachHang);
            ps.setString(2, idSanPham);
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            ps.setInt(3, soLuong);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
<<<<<<< HEAD
//    public static void main(String[] args) {
//        DAO DAO = new DAO();
//        DAO.InsertGioHangByID("nam", "1", 2);
//    }
    public account getAccountByUserName(String username,String pass){
        account acc = new account();
        try {
            String query = "select * from account " + " where usename = ? and password = ? ";
=======
    public Account getAccountByUserName(String username,String pass){
        Account acc = new Account();
        try {
            String query = "select * from Account " + " where usename = ? and password = ? ";
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()){
<<<<<<< HEAD
                acc =  new account( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4) );
=======
                acc =  new Account( rs.getString(1), rs.getString(2),rs.getString(3), rs.getString(4) );
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return acc;
    }
    
    public void InsertKhachHang(String sdtKhachHang,String tenKhachHang , String gioiTinh,
                            String diachi,String email ){
        try {
<<<<<<< HEAD
            khachhang khachHang = new khachhang();
            String query = " INSERT INTO khachhang " + " values(?,?,?,?,?,?,?) " ;
=======
            KhachHang khachHang = new KhachHang();
            String query = " INSERT INTO KhachHang " + " values(?,?,?,?,?,?,?) " ;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
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
<<<<<<< HEAD
            account account = new account();
            String query = " INSERT INTO account " + " values(?,?,?) " ;
=======
            Account account = new Account();
            String query = " INSERT INTO Account " + " values(?,?,?) " ;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
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
<<<<<<< HEAD

    public kichco getKichCoByID(String idSanPham) {
        kichco kichCo = new kichco();
        try {
            String query = "select * from kichco " + " where idSanPham = ? ";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, idSanPham);
            rs = ps.executeQuery();
            while(rs.next()){
                kichCo =  new kichco( rs.getString(1), rs.getString(2),rs.getString(3), rs.getInt(4) );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return kichCo;
    }

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
=======
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
}
