<%-- 
    Document   : register
    Created on : 20-04-2023, 12:27:44
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        title>Đăng kí</title>
    <link rel="stylesheet" type="text/css" href="login.css">
    </head>
<body>
       <div class="header">
    <h2 class="">ĐĂNG KÝ</h2>
    </div>

    <div class="noidung nd1">
        <h4 class="header h1">Thông tin khách hàng</h4>
    <label>Họ:<span style="color: red">*</span></label>
    <input class="input" type="text"  value="" name="kh_ho" placeholder="Họ..." style="width: 100%"/>
    <label>Tên:<span style="color: red">*</span></label>
    <input class="input" type="text" value="" name="kh_ten" placeholder="Tên..." style="width: 100%"/>
    <label>Email:<span style="color: red">*</span></label>
    <input class="input" type="email" name="kh_email" value="" placeholder="Email..." style="width: 100%"/>
    <label>Điện thoại:<span style="color: red">*</span></label>
    <input class="input" type="text" value="" name="kh_dienthoai" placeholder="Điện thoại..." style="width: 100%"/>
    <label>Ngày sinh:<span style="color: red">*</span></label>
    <input class="input" type="text"  name="kh_ngaysinh" value="" placeholder="Ngày sinh..." style="width: 100%"/>
    <label>Giới tính:<span style="color: red">*</span></label>
    <select name="kh_gioitinh" style="width: 100%" >
        <option  value="0">Nữ</option>
        <option  value="1">Nam</option>
        <option  value="2">Khác</option>
    </select>
        <label>Tỉnh/TP:<span style="color: red">*</span></label>
        <input class="input" type="text"  name="kh_tinh" value="" placeholder="Tỉnh..." style="width: 100%"/>
                                            
        <label>Quận/Huyện:<span style="color: red">*</span></label>
        <input class="input" type="text"  name="kh_huyen" value="" placeholder="Huyện..." style="width: 100%"/>
        
        <label>Phường/Xã:<span style="color: red">*</span></label>
        <input class="input" type="text"  name="kh_xa" value="" placeholder="Xã..." style="width: 100%"/>

    </div>
    <div class="noidung nd2">
        <h4 class="header h2">Thông tin mật khẩu</h4>
        <label>Mật khẩu:<span style="color: red">*</span></label>
        <input class="input ip2" type="password" value="" name="kh_matkhau1" placeholder="Mật khẩu..."/>
        <label>Nhập lại mật khẩu:<span style="color: red">*</span></label>
        <input class="input" type="password" value="" name="kh_matkhau2" placeholder="Nhập lại mật khẩu..."/>
        <button class="bt" type="submit" style="width: 100%;margin-top: 40px">Đăng ký</button>
    </div>
</body>
</html>


