/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
<<<<<<< HEAD
import entity.danhmucsanpham;
import entity.sanpham;
=======
import entity.DanhMucSanPham;
import entity.SanPham;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name="category", urlPatterns={"/category"})
public class category extends HttpServlet {
   
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
        
        String idDanhMucSanPham =  request.getParameter("idDanhMucSanPham");
        
        DAO DAO = new DAO();
        
<<<<<<< HEAD
        List<sanpham> listP = DAO.getAllProductByID(idDanhMucSanPham);
        danhmucsanpham dmsp = DAO.getdanhmucsanphamByID(idDanhMucSanPham);
        
        List<danhmucsanpham> list_menu_nu = DAO.getAllDanhMucSanPham();
        List<danhmucsanpham> list_menu_nam = DAO.getAllDanhMucSanPham();
        List<danhmucsanpham> list_menu_treEm = DAO.getAllDanhMucSanPham();
        List<danhmucsanpham> list_menu_boSuuTap = DAO.getAllDanhMucSanPham();
=======
        List<SanPham> listP = DAO.getAllProductByID(idDanhMucSanPham);
        DanhMucSanPham dmsp = DAO.getDanhMucSanPhamByID(idDanhMucSanPham);
        
        List<DanhMucSanPham> list_menu_nu = DAO.getAllDanhMucSanPham();
        List<DanhMucSanPham> list_menu_nam = DAO.getAllDanhMucSanPham();
        List<DanhMucSanPham> list_menu_treEm = DAO.getAllDanhMucSanPham();
        List<DanhMucSanPham> list_menu_boSuuTap = DAO.getAllDanhMucSanPham();
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
        request.setAttribute("listPNu", list_menu_nu);
        request.setAttribute("listPNam", list_menu_nam);
        request.setAttribute("listPTreEm", list_menu_treEm);
        request.setAttribute("listPboSuuTap", list_menu_boSuuTap);
        
        request.setAttribute("listP", listP);
        request.setAttribute("dmsp", dmsp);
        
        request.getRequestDispatcher("giaodientrangmucsp.jsp").forward(request, response);
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
