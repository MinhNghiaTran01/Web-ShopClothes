/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import static jdk.nashorn.internal.codegen.CompilerConstants.className;
/**
 *
 * @author Admin
 */
public class DBContext {
    
    public Connection getConnection()throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://us-cdbr-east-06.cleardb.net:3306/heroku_66eceb5b3cb2b5b","be588ed25e0b60","618973a9");
    }   
}
