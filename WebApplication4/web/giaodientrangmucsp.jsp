

<%@page import="java.util.ArrayList"%>
<<<<<<< HEAD
<%@page import="entity.sanpham"%>
<%@page import="entity.danhmucsanpham"%>
=======
<%@page import="entity.SanPham"%>
<%@page import="entity.DanhMucSanPham"%>
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<<<<<<< HEAD
        <title>danhmucsanpham</title>
=======
        <title>@@</title>
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./giaodientrangmucsp.css">
        
        <!-- <script src="danhmucsanpham.js"></script> -->
        <style>
            header{
                border-bottom: solid 1px #57585A;
            }
            .container{
                margin-left: 40px;
            }
            .container-body{
                display: flex;
            }
            .category-right{
                width: 70%;
                display: flex;
                flex-direction: column;
            }
            .category-right-content-item h2 {
                font-size: 12px;
                font-family: var(--main-text-font);
                margin-top: 6px;
                color: #57585A;
            }
            .header-bottem{
                top: 200px;
                border-bottom: solid 1px #57585A;
            }
        </style>
    </head>
    
    <body>
<!----------------Giao dien trang muc----------->
    <section class="category">
        <div class="container">
            <div class="category-top row">
                <p>Trang chủ - <span style="color: blue">Nữ - </span> <span style="color: blue" >Hàng nữ mới về</span> </p>
            </div>

            <div class="container-body">
                <div class="category-left">
                    <ul>
                        <li class="category-left-li"><a href="#">NỮ</a>
                            <ul>
                                <li><a href="">HÀNG NỮ MỚI VỀ</a></li>
                                <li><a href="">BEYOND TRENDY</a></li>
                                <li><a href="">QUẦN JEAN NỮ</a></li>
                            </ul>
                        </li>
                        <li class="category-left-li"><a href="#">NAM</a>
                            <ul>
                                <li><a href="">HÀNG NAM MỚI VỀ</a></li>
                                <li><a href="">BEYOND TRENDY</a></li>
                                <li><a href="">QUẦN JEANS NAM</a></li>
                            </ul>
                        </li>
                        <li class="category-left-li"><a href="#">TRẺ EM</a>
                            <ul>
                                <li><a href="">HÀNG TRẺ EM MỚI VỀ</a></li>
                                <li><a href="">ÁO CHO BÉ</a></li>
                                <li><a href="">QUẦN CHO BÉ</a></li>
                            </ul>
                        </li>

                        <li class="category-left-li"><a href="#">BỘ SƯU TẬP</a>
                            <ul>
                                <li><a href="">HÀNG MỚI VỀ</a></li>
                                <li><a href="">BỘ SƯU TẬP XUÂN HÈ 2023</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>

                <div class="category-right">
                            <div class="category-right-top" style="display: flex;">
                                <div class="category-right-top-item">
                                    <c:set var="x"  value= "${requestScope.dmsp}" />
<<<<<<< HEAD
                                    <p>${x.tenLoaiSanPham}</p>
=======
                                    <p>${x.tenSanPham}</p>
>>>>>>> 88610dba7d3f194111e5470ddfd41247a15bad40
                                </div>

                                <div class="category-right-top-item">
                                    <button><span>Bộ lọc</span><i class="fas fa-sort-down"></i></button>
                                </div>

                                <div class="category-right-top-item">
                                    <select name=""id="">
                                        <option value="">Sắp xếp</option>
                                        <option value="">Giá cao đến thấp</option>
                                        <option value="">Giá thấp đến cao</option>
                                    </select>
                                </div>
                            </div>

                            <div class="category-right-content">
                                <c:forEach items="${listP}" var="o">
                                    <div class="category-right-content-item">
                                        <a href="detail?idSanPham=${o.idSanPham}"><img src="${o.img}" alt=""></a>
                                        <a href="detail?idSanPham=${o.idSanPham}"><h2>${o.title}</h2></a>
                                        <p>${o.giaBan}<sup>đ</sup></p>
                                        <a href="giohang?idSanPham=${o.idSanPham}">thêm vào giỏ hàng</a>
                                    </div>
                                </c:forEach>
                            </div>

                            <div class="category-right-bottom">
                                <div class="category-right-bottom-items">
                                    <p>Hiển thị 2 <span>|</span> 4 sản phẩm</p>
                                </div>
                                <div class="category-right-bottom-items">
                                    <p><span>&#171;</span>1 2 3 4<span>&#187;</span>Trang cuối</p>
                                </div>
                            </div>
                    </div>
    </section>
   
    <script>
        const itemsliderbar = document.querySelectorAll(".category-left-li")
        itemsliderbar.forEach( function(menu,index){
           menu.addEventListener("click",function(){
               menu.classList.toggle("block");
           })
        })
    </script>
  <%@include file="footer.jsp" %>

</body>

</html>
