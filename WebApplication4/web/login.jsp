<%-- 
    Document   : login
    Created on : 20-04-2023, 10:34:52
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./login" method="post">
            <label for="user">Tên đăng nhập:</label>
            <input type="text" id="user" name="user" required>
            <br>
            <label for="pass">Mật khẩu:</label>
            <input type="password" id="pass" name="pass" required>
            <br>
            <input type="submit" value="Đăng nhập">
        </form>

    </body>
</html>
