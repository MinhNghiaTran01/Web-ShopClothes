<%-- 
    Document   : login
    Created on : 20-04-2023, 10:34:52
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="cookie" value="${pageContext.request.cookies}"/>
        <form action="./login" method="post">
            <label for="user">Tên đăng nhập:</label>
            <input type="text" id="user" name="user" value="${cookie.cuser.value}" required>
            <br>
            <label for="pass">Mật khẩu:</label>
            <input type="password" id="pass" name="pass" value="${cookie.cpass.value}" required>
            <br>
            <input type="checkbox" ${cookie.crem!=null?'checked':''} name="rem" value="ON" /> 
        <input type="submit" value="Đăng nhập">
        </form>

    </body>
</html>
