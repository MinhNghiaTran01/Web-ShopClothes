/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package API;

import com.google.gson.Gson;
import dao.DAO;
import entity.account;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nghia
 */
@WebServlet(name="apiaccount", urlPatterns={"/api/account"})
public class APIaccount extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        account a = gson.fromJson(reader, account.class);
        DAO dao = new DAO();        
        account user = dao.getAccountByUserName(a.getUsername(), a.getPassword());
        response.getWriter().write(gson.toJson(user));
    } 

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("application/json");
            BufferedReader reader = request.getReader();
            Gson gson = new Gson();
            account a = gson.fromJson(reader, account.class);
            DAO dao = new DAO();
            dao.InsertAccount(a.getUsername(), a.getPassword(), a.getHoatDong(), a.getchucVu());
            response.getWriter().write(gson.toJson(a));

    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        account a = gson.fromJson(reader, account.class);
        DAO dao = new DAO();
        dao.DeleteAccount(a.getUsername(), a.getPassword());
        response.getWriter().write(gson.toJson(a));
    }
    

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        BufferedReader reader = request.getReader();
        Gson gson = new Gson();
        account a = gson.fromJson(reader, account.class);
        DAO dao = new DAO();
        dao.PutAccount(a.getUsername(), a.getPassword(), a.getHoatDong(), a.getchucVu());
        response.getWriter().write(gson.toJson(a));
    }

    
}
