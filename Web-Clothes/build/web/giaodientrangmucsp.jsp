

<%@page import="java.util.ArrayList"%>
<%@page import="entity.sanpham"%>
<%@page import="entity.danhmucsanpham"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>danhmucsanpham</title>
        <title>@@</title>
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="./giaodientrangmucsp.css">
        
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
<!--            <div class="category-top row">
                <p>Trang chủ - <span style="color: blue">Nữ - </span> <span style="color: blue" >Hàng nữ mới về</span> </p>
            </div>-->

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
                 <c:set var="x"  value= "${requestScope.dmsp}" />
                 
                <div class="category-content-right">
                            <div class="category-content-right-top" style="display: flex;">
                                <div class="category-content-right-top p">
                                    <p>${x.tenLoaiSanPham}</p>
                                </div>

                                <div class="category-right-top-item">
                                    <button style="width:100px; height: 50px" > <span style="width:100px">Bộ lọc</span><i class="fas fa-sort-down"></i></button>
                                </div>

                                <div class="category-content-right-top-item">
                                    <form name="myForm" action="sapxep">
                                        <select style="width:200px; " name="sapxeptheo" onchange="myForm.submit()">
                                              <option value="tucaodenthap">Giá cao đến thấp</option>
                                              <option value="tuthapdencao">Giá thấp đến cao</option>
                                         </select>
                                        <input type="hidden" name="idDanhMucSanPham" value="${x.idDanhMucSanPham}">
                                     </form>
                                </div>
                            </div>
                                     
                             <div class="category-content-right-center">
                                <c:forEach items="${listP}" var="o">
                                    <div class="category-content-right-center-item">
                                        <a href="detail?idSanPham=${o.idSanPham}"><img src="${o.img}" alt=""></a>
                                        <a href="detail?idSanPham=${o.idSanPham}"><h2>${o.title}</h2></a>
                                        <p>${o.giaBan}<sup>đ</sup></p>
                                        <li>Them vao gio hang<a class="fa fa-shopping-bag" href="giohang?idSanPham=${o.idSanPham}"></a></li>
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
  <%--<%@include file="footer.jsp" %>--%>

</body>

</html>
