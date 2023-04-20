<%-- 
    Document   : register
    Created on : 20-04-2023, 12:27:44
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
        <form action="./register" method="POST">
          <label for="phone">Số điện thoại:</label>
          <input type="tel" id="sdtKhachHang" name="sdtKhachHang" required>

          <label for="fullname">Họ tên:</label>
          <input type="text" id="tenKhachHang" name="tenKhachHang" required>

          <label for="email">Email:</label>
          <input type="email" id="email" name="email" required>

          <label for="address">Địa chỉ:</label>
          <textarea id="diachi" name="diachi" required></textarea>

          <label for="gender">Giới tính:</label>
          <select id="gioiTinh" name="gioiTinh" required>
            <option value="male">Nam</option>
            <option value="female">Nữ</option>
            <option value="other">Khác</option>
          </select>

          <label for="username">Username:</label>
          <input type="text" id="user" name="username" required>

          <label for="password">Password:</label>
          <input type="password" id="pass" name="password" required>

          <button type="submit">Đăng kí</button>
        </form>

    </body>
</html>
