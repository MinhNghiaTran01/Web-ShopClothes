/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import entity.gioHang;
import dao.DAO;
import entity.danhmucsanpham;
import entity.kichco;
import entity.mau;
import entity.sanpham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name="giohang", urlPatterns={"/giohang"})
public class giohang extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Cookie[] ctmp = request.getCookies();
        String sdtKhachHang = "";
        boolean check = false;
        
        for(Cookie o: ctmp){
            if(o.getName().equals("cuser")){
                sdtKhachHang = o.getValue();
                check = true;
                break;
            }
        }
        
        DAO DAO = new DAO();
        

        List<danhmucsanpham> list_menu_nu = DAO.getAllDanhMucSanPham();
        List<danhmucsanpham> list_menu_nam = list_menu_nu;
        List<danhmucsanpham> list_menu_treEm = list_menu_nu;
        List<danhmucsanpham> list_menu_boSuuTap = list_menu_nu;
        
        request.setAttribute("listPNu", list_menu_nu);
        request.setAttribute("listPNam", list_menu_nam);
        request.setAttribute("listPTreEm", list_menu_treEm);
        request.setAttribute("listPboSuuTap", list_menu_boSuuTap);
        
       if(check==true){
            List<gioHang> listGioHang = DAO.getProductBySDTKhachHang(sdtKhachHang);
            List<sanpham> listsanpham = new ArrayList<>();
            
            for(gioHang tmp: listGioHang){
                listsanpham.add(DAO.getProductByID( tmp.getIdSanPham()) );
            }
            request.setAttribute("listSanPham", listsanpham);
       }
       else{
            String txt = "";
            Cookie[] carr = request.getCookies();
            if(carr!=null){
                for(Cookie o : carr){
                    if(o.getName().equals("cart")){
                        txt += o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
            }
            List<sanpham> listSanPham = new ArrayList<>();
            List<kichco>  listKichCo = new ArrayList<>();
            List<mau> listMau = new ArrayList<>();
            if(txt.length()>0){
                Cookie c = new Cookie("cart", txt);
                response.addCookie(c);
                gioHang gioHang = new gioHang();
                List<gioHang> listGioHang = gioHang.getAllItem(txt);
                for(gioHang tmp: listGioHang){
                    listSanPham.add(DAO.getProductByID(tmp.getIdSanPham()));
                    listKichCo.add( (kichco) DAO.getKichCoByID(listSanPham.get(listSanPham.size()-1).getIdSanPham()) );
                    listMau.add( DAO.getMauByID ( listSanPham.get(listSanPham.size()-1).getIdMau()) );
                }
            }
            request.setAttribute("listSanPham", listSanPham);
            request.setAttribute("listKichCo", listKichCo);
            request.setAttribute("listMau", listMau);
       }
        request.getRequestDispatcher("GIO_HANG.jsp").forward(request, response);
        
        
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
