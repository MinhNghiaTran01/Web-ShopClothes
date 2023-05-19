/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
import entity.danhmucsanpham;
import entity.sanpham;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
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
@WebServlet(name="timkiem_sapxep", urlPatterns={"/timkiem_sapxep"})
public class timkiem_sapxep extends HttpServlet {
   
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
        String sanphamtimkiem = request.getParameter("sanphamtimkiem");
        String sapxeptheo = request.getParameter("sapxeptheo");
        DAO DAO = new DAO();
        
        List<sanpham> list = DAO.getAllProduct();
        List<sanpham> listP = new ArrayList<>();
        for(sanpham p:list){
            String productName = p.getTitle(); // chuyển tên sản phẩm sang chữ thường
            if (productName.contains(sanphamtimkiem.toUpperCase())||productName.contains(sanphamtimkiem.toLowerCase())) {
                listP.add(p);
            }
        }
        
        List<danhmucsanpham> list_menu_nu = DAO.getAllDanhMucSanPham();
        List<danhmucsanpham> list_menu_nam = list_menu_nu;
        List<danhmucsanpham> list_menu_treEm = list_menu_nu;
        List<danhmucsanpham> list_menu_boSuuTap = list_menu_nu;
    
        request.setAttribute("listPNu", list_menu_nu);
        request.setAttribute("listPNam", list_menu_nam);
        request.setAttribute("listPTreEm", list_menu_treEm);
        request.setAttribute("listPboSuuTap", list_menu_boSuuTap);
        
        if(sapxeptheo.equals("tucaodenthap")){
            listP.sort(new Comparator<sanpham>(){
                @Override
                public int compare(sanpham o1, sanpham o2) {
                    if(o1.getGiaBan() > o2.getGiaBan()) {
                        return -1;
                    } else if(o1.getGiaBan() < o2.getGiaBan()) {
                        return 1;
                    }
                    return 0;
                }
            });
        }
        else if(sapxeptheo.equals("tuthapdencao")){
            listP.sort(new Comparator<sanpham>(){
                @Override
                public int compare(sanpham o1, sanpham o2) {
                    if(o1.getGiaBan() > o2.getGiaBan()) {
                        return 1;
                    } else if(o1.getGiaBan() < o2.getGiaBan()) {
                        return -1;
                    }
                    return 0;
                }
            });
        }
        
        request.setAttribute("sanphamtimkiem", sanphamtimkiem);
        request.setAttribute("listP", listP);
        request.getRequestDispatcher("timkiemsanpham.jsp").forward(request, response);
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
