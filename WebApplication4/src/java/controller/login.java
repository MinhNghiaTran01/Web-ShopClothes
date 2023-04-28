/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import dao.DAO;
<<<<<<< HEAD
import entity.account;
=======
import entity.Account;
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
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
@WebServlet(name="login", urlPatterns={"/login"})
public class login extends HttpServlet {
   
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
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String rem =  request.getParameter("rem");
        
<<<<<<< HEAD
            DAO DAO = new DAO();
            account acc = DAO.getAccountByUserName(user,pass);
=======
        DAO DAO = new DAO();
            Account acc = DAO.getAccountByUserName(user,pass);
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
            if(acc.getIdAccount()!=null)
            {
                Cookie cuser = new Cookie("cuser", user);
                Cookie cpass = new Cookie("cpass", pass);
                Cookie crem = new Cookie("crem", rem);
<<<<<<< HEAD
                if(rem!=null){
=======
                if(crem!=null){
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
                    cuser.setMaxAge(24*60*60);
                    cpass.setMaxAge(24*60*60);
                    crem.setMaxAge(24*60*60);
                }
                else{
                    cuser.setMaxAge(0);
                    cpass.setMaxAge(0);
                    crem.setMaxAge(0);
                }
                response.addCookie(cuser);
                response.addCookie(cpass);
                response.addCookie(crem);
                HttpSession session = request.getSession();
                session.setAttribute("user", acc.getUsename());
                session.setAttribute("pass", acc.getPassword());
                response.sendRedirect("menuServlet");
            }
<<<<<<< HEAD
=======
       
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
        
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
