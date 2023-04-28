/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import entity.danhmucsanpham;
import entity.gioHang;
import entity.productimage;
import entity.sanpham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name="themvaogiohang", urlPatterns={"/themvaogiohang"})
public class themvaogiohang extends HttpServlet {
   
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
        HttpSession session = request.getSession();
        String idSanPham = request.getParameter("idSanPham");
        String soLuong = request.getParameter("soLuong");
        String sdtKhachHang = (String) session.getAttribute("user");
        DAO DAO = new DAO();
        if(sdtKhachHang!=null){
            DAO.InsertGioHangByID( sdtKhachHang, idSanPham,Integer.parseInt(soLuong) );
        }
        else{
            Cookie[] carr = request.getCookies();
            String txt = "";
            if(carr!=null){
                for(Cookie o : carr){
                    if(o.getName().equals("cart")){
                        txt += o.getValue();
                        o.setMaxAge(0);
                        response.addCookie(o);
                    }
                }
            }
            
            txt+= idSanPham + ":" + soLuong + "/";
            Cookie c = new Cookie("cart", txt);
            c.setMaxAge(24*60*60);
            response.addCookie(c);
            request.getRequestDispatcher("trangsanpham.jsp").forward(request, response);
        }
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
