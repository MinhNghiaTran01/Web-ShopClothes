<%-- 
    Document   : trangsanpham
    Created on : 10-04-2023, 09:45:45
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./trangsanpham.css">
    </head>
    
    <!--header-->
    <%@include file="header.jsp" %>
    
    
    <!--body-->
    <body>
    <!-------------------------product------------------------->
    <c:set var="o" value="${requestScope.detailP}" />
    <c:set var="list" value="${requestScope.listPimg}" />
    <form name="f" action="" method="post">
        <section class="product">
                <div class="container">
                        <div class="product-top">
                          <p>Trang chủ</p><span>&#10230;</span><p>Nữ</p><span>&#10230;</span><p>Hàng nữ mới về</p><span>&#10230;</span><p>${o.title}</p>
                        </div>
                     
                    <div class="product-content">
                        <div class="product-content-left">
                          <div class="product-content-left-big-img">
                            <img src="${o.img}" alt="">
                          </div>
                        </div>
                        <div class="product-content-right">
                            
                            
                            <div class="product-content-right-small-img">
                                <img src="${list.get(0).img}" alt="alt"/>
                                <img src="${list.get(1).img}" alt="alt"/>
                                <img src="${list.get(2).img}" alt="alt"/>
                            </div>
                        </div>
                        <div class="right-right">
                          <div class="product-content">
                            <div class="product-content-right-product-name">
                              <h1>${o.title}</h1>
                              <p>${o.idSanPham}</p>
                            </div>
                            <div class="product-content-right-product-price">
                              <p>${o.giaBan}<sup>đ</sup></p>
                            </div>
                            <div class="product-content-right-product-color">
                              <p><span style="font-weight: bold;">Màu sắc</span>${o.mauSac}</p>
                            </div>
                            <div class="product-content-right-product-size">
                              <p style="font-weight: bold;">Size</p>
                              <div class="size">
                                <span>S</span>
                                <span>M</span>
                                <span>L</span>
                                <span>XL</span>
                                <span>XXL</span>
                              </div>
                            </div>
                            <div class="quantily">
                              <p style="font-weight: bold;">Số lượng: </p>
                              <input type="number" name="soLuong" min="0" value="1">
                            </div>
                            <p style="color:red;">Vui lòng chọn size</p>
                            <div class="product-content-right-product-button">
                                <button onclick=buy(${o.idSanPham}) ><i class="fas fa-shopping-cart"></i><p>MUA HÀNG</p></button>
                              <button><p>TÌM TẠI CỬA HÀNG</p></button>
                            </div>
                            <div class="product-content-right-product-icon">
                                <div class="product-content-right-product-icon-item">
                                    <i class="fas fa-phone-alt"></i><p>Hotline</p>
                                </div>
                                <div class="product-content-right-product-icon-item">
                                    <i class="fas fa-comments"></i><p>Chat</p>
                                </div>
                                <div class="product-content-right-product-icon-item">
                                    <i class="fas fa-envelope"></i><p>Mail</p>
                                </div>
                            </div>
                            <div class="product-content-right-bottom">
                              <div class="product-content-right-bottom-top"></div>
                            </div>
                          </div>
                        </div>
                    </div>
                    
                </div>
      </section>
    </form>
    <!-- --------------footer------------------>
    <%@include file="footer.jsp" %>
    </body>
    <script>
        function buy(idSanPham){
            var soLuong = document.f.soLuong.value;
            document.f.action = "buy?idsanPham = " + idSanPham + "&soLuong = " + soLuong;
            document.f.submit();
        }
    </script>
</html>
