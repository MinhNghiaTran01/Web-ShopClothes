<%-- 
    Document   : giohang
    Created on : 14-04-2023, 15:06:19
    Author     : Admin
--%>

<%@page import="entity.sanpham"%>
<%@page import="dao.DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./GIO_HANG.css">
    </head>
    <body>
        <section class="cart">
          <div class="container">
            <div class="cart-top-wrap">
              <div class="cart-top">
                <div class="car-top-cart cart-top-item">
                  <i class="fas fa-shopping-cart"></i>
                </div>
                <div class="cart-top-adress cart-top-item">
                  <i class="fas fa-map-market-alt"></i>
                </div>
                <div class="cart-top-payment cart-top-item">
                  <i class="fas fa-money-check-alt"></i>
                </div>
              </div>
            </div>
          </div>
          <div class="container">
            <div class="cart-content row">
              <div class="cart-content-left">
                <table>
                  <tr>
                    <th>Sản phẩm</th>
                    <th>Tên sản phẩm</th>
                    <th>Màu</th>
                    <th>Size</th>
                    <th>SL</th>
                    <th>Thành tiền</th>
                    <th>Xóa</th>
                  </tr>
                  <c:set var="tongTien" value="0" />
                  <c:set var="listKichCo" value="${requestScope.listKichCo}" />
                  <c:set var="listMau" value="${requestScope.listMau}" />
                  <c:forEach var="o" items="${listSanPham}" varStatus="loop" >
                    <tr>
                      <td><img src="${o.img}" alt=""></td>
                      <td><p>${o.title}</p></td>
                      <td>${listMau.get(loop.index).color}</td>
                      <td><p>${listKichCo.get(loop.index).size}</p></td>
                      <td>1</td>
                      <td>${o.giaBan}</td>
                      <td><span>X</span></td>
                    </tr>
                    <c:set var="tongTien" value="${tongTien + o.giaBan}" />
                  </c:forEach>
                </table>
              </div>
              <div class="cart-content-right">
                <table>
                  <tr>
                    <th colspan="2">TỔNG TIỀN GIỎ HÀNG</th>
                  </tr>
                  <tr>
                    <td>TỔNG SẢN PHẨM</td>
                    <td>${fn:length(listSanPham)} </td>
                  </tr>
                  <tr>
                    <td>TỔNG TIiỀN HÀNG</td>
                    <td><p> ${tongTien} <sub>đ</sub></p></td>
                  </tr>
                  <tr>
                    <td>TẠM TÍNH</td>
                    <td><p style="color:black;front-weight: bold;"> ${tongTien} <sub>đ</sub></p></td>
                  </tr>
                </table>
                <div class="cart-content-right-text">
                  <p>Bạn sẽ được miễn phí ship khi đơn hàng của bạn có tổng giá trị trên 2.000.000 đ</p>
                  <br>
                  <p style="color:red; front-weight:bold;">Mua thêm <span style="front-size: 18px;">131.000</span> để được miễn phí ship.</p>
                </div>
                <div class="cart-content-right-button">
                  <button>TIẾP TỤC MUA SẮM</button>
                  <button>THANH TOÁN</button>
                </div>
              </div>
            </div>
          </div>
          <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        </section>
        <!-- --------------footer------------------>
    </body>
</html>
<%@include file="footer.jsp" %>
