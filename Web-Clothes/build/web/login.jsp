<%-- 
    Document   : login
    Created on : 20-04-2023, 10:34:52
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%--<%@include file="header.jsp" %>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <title>Đăng nhập</title>
        <link rel="stylesheet" type="text/css" href="login.css">
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container"> 
            <div class="header">
                <h2 class="">ĐĂNG NHẬP</h2>
            </div>
            <div class="noidung dn nd1">
                <form action=login>
                    <div class="header h1">
                     <h4 class="">Bạn đã có tài khoản IVY</h4>
                     <p class="">Nếu bạn đã có tài khoản, hãy đăng nhập để tích lũy điểm thành viên và nhận được những ưu đãi tốt hơn!</p>
                    </div>
                     <input type="text" class="input dn" placeholder="Email/SDT...">
                     <input type="text" class="input dn" placeholder="Mat khau...">
                    <label>
                         <input class="" value="1"  type="checkbox" name="crem"/>
                         <span style="margin-left: 5px"> Ghi nhớ đăng nhập</span>
                     </label>
                    <button class="bt dn" type="submit" style="width: 100%;margin-top: 40px">Đăng nhập</button>
               </form>
            </div>
            <div class="noidung dn nd2">
                <h4 class="header h2">Khách hàng mới của IVY moda</h4>
                <p class="">Nếu bạn chưa có tài khoản trên ivymoda.com, hãy sử dụng tùy chọn này để truy cập biểu mẫu đăng ký.

                    Bằng cách cung cấp cho IVY moda thông tin chi tiết của bạn, quá trình mua hàng trên ivymoda.com sẽ là một trải nghiệm thú vị và nhanh chóng hơn!</p>
               <a href="register_start" class="">
                <button class="bt dn" type="submit" style="width: 100%;margin-top: 40px;margin-left: 0px">Đăng ký</button>
               </a>
            </div>
        </div>
    </body>
</html>
