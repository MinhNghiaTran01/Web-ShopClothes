<%-- 
    Document   : GIAO_HANG
    Created on : 14-04-2023, 15:20:25
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./GIAO_HANG.css">
    </head>
    <body>
        <!-- --------------thanhtoan------------------>
        <section class="thanhtoan">
          <div class="container">
            <div class="thanhtoan-top-wrap">
              <div class="thanhtoan-top">
                <div class="thanhtoan-top-thanhtoan thanhtoan-top-item">
                  <i class="fas fa-shopping-thanhtoan"></i>
                </div>
                <div class="thanhtoan-top-adress thanhtoan-top-item">
                  <i class="fas fa-map-market-alt"></i>
                </div>
                <div class="thanhtoan-top-payment thanhtoan-top-item">
                  <i class="fas fa-money-check-alt"></i>
                </div>
              </div>
            </div>
          </div>
          <div class="container">
            <div class="thanhtoan-content">
              <div class="thanhtoan-content-left">
                <p>Vui lòng chọn địa chỉ giao hàng</p>
                <div class="thanhtoan-content-left-dangnhap row">
                  <i class="fas fa-sign-in-alt"></i>
                  <p style="font-size: 16px">Đăng nhập (Nếu bạn đã có tài khoản của IVY)</p>
                </div>
                <div class="thanhtoan-content-left-khachle row">
                  <input checked name="loaikhach" type="radio">
                  <p style="font-size: 16px"><span style="font-weight:bold;">Khách lẻ</span>(Nếu bạn không lưu lại thông tin)</p>
                </div>
                <div class="thanhtoan-content-left-dangky row">
                  <input type="radio" name="loaikhach">
                  <p style="font-size: 16px"><span style="font-weight:bold;">Đăng ký</span>(Tạo tài khoản mới với thông tin bên dưới)</p>
                </div>
                <div class="thanhtoan-content-left-input-top row">
                  <div class="thanhtoan-content-left-input-top-item">
                    <label for="">Họ tên <span style="color:red;">*</span></label>
                    <input type="text">
                  </div>
                  <div class="thanhtoan-content-left-input-top-item">
                    <label for="">Điện thoại <span style="color:red;">*</span></label>
                    <input type="text">
                  </div>
                  <div class="thanhtoan-content-left-input-top-item">
                    <label for="">Tỉnh/TP <span style="color:red;">*</span></label>
                    <input type="text">
                  </div>
                  <div class="thanhtoan-content-left-input-top-item">
                    <label for="">Quận/Huyện <span style="color:red;">*</span></label>
                    <input type="text">
                  </div>
                  <div class="thanhtoan-content-left-input-top-item">
                    <label for="">Địa chỉ <span style="color:red;">*</span></label>
                    <input type="text">
                  </div>
                </div>

                <div class="thanhtoan-content-left-input-bottom row">
                  <a href=""><span>&#171;</span><p>Quay lại giỏ hàng</p></a>
                  <button style="float:right; padding:14px"><p style="font-weight:bold">THANH TOÁN GIAO HÀNG</p></button>
                </div>
              </div>
              <div class="thanhtoan-content-right">
                <table>
                  <tr>
                    <th>Tên sản phẩm</th>
                    <th>Giảm giá</th>
                    <th>Số lượng</th>
                    <th>Thành tiền</th>
                  </tr>
                  <tr>
                    <td>Áo polo kẻ ngang MS 57E2940</td>
                    <td>-30%</td>
                    <td>1</td>
                    <td>590.000 <sup>đ</sup></td>
                  </tr>
                  <tr>
                    <td>Áo Nam kẻ ngang MS 57E2941</td>
                    <td>-20%</td>
                    <td>1</td>
                    <td>690.000 <sup>đ</sup></td>
                  </tr>
                  <tr>
                    <td style="font-weight:bold;" colspan="3">Tổng</td>
                    <td style="font-weight:bold;"><p>690.000 <sup>đ</sup></p></td>
                  </tr>
                  <tr>
                    <td style="font-weight:bold;" colspan="3">Thuế VAT</td>
                    <td style="font-weight:bold;"><p>69.000 <sup>đ</sup></p></td>
                  </tr>
                  <tr>
                    <td style="font-weight:bold;" colspan="3">Tổng tiền hàng</td>
                    <td style="font-weight:bold;"><p>759.000 <sup>đ</sup></p></td>
                  </tr>
                </table>
              </div>
            </div>
          </div>
          <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </section>
<!-- --------------footer------------------>
    <%@include file="footer.jsp" %>
    </body>
</html>