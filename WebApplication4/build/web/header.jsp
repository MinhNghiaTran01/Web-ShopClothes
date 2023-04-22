
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="header.css"/>
        <script src="https://kit.fontawesome.com/1147679ae7.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="trangchu.css">
        <style>
            header{
                font-size: 14px;
            }
            .menu > li:hover .sub-menu_treEm{
            display: flex;
            }
            .sub-menu_treEm{
            display: none;
            line-height: 5px;
            position: absolute;
            width: 1200px;
            border: 1px solid #ccc;
            padding: 10px 0 10px 20px;
            z-index: 1;
            background: #fff;
            }
            
            .menu > li:hover .sub-menu_boSuuTap{
                display: flex;
            }
            .sub-menu_boSuuTap{
            display: none;
            line-height: 5px;
            position: absolute;
            width: 1000px;
            border: 1px solid #ccc;
            padding: 10px 0 10px 20px;
            z-index: 1;
            background: #fff;
            }
        </style>
    </head>
    <header>
        <div class="menu">
            <li> 
                <a href="">NỮ</a> 
                <ul class="sub-menu_nu">   
                    <ul>
                        <li><a style="font-weight: bold" href="">Hàng mới về</a></li>
                        <li><a style="font-weight: bold" href="">Colection</a></li>
                        <li><a style="font-weight: bold" href="">SALE GIẢI NHIỆT</a></li>
                        <li><a style="font-weight: bold" href="">IVY you</a></li>
                        <li><a style="font-weight: bold" href="">Bloomtime</a></li>
                        <li><a style="font-weight: bold" href="">TIMELESS</a></li>
                        <li><a style="font-weight: bold" href="">Áo dài Tết</a></li>
                        <li><a style="font-weight: bold" href="">Merino Wool</a></li>
                        <li><a style="font-weight: bold" href="">Quà tặng tháng 3</a></li>
                    </ul>
                        <ul>
                            <li><a style="font-weight: bold" href="">Áo</a>
                                <c:forEach items="${listPNu}" var="o" begin="0" end="7">
                                    <c:if test="${o.theloai=='nu_ao'}">
                                        <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                                    </c:if>    
                                </c:forEach>
                        </ul>
                    
                        <ul>
                            <li><a style="font-weight: bold" href="">Áo Khoác</a>
                                <c:forEach items="${listPNu}" var="o" begin="8" end="13">
                                   <c:if test="${o.theloai=='nu_quan'}">
                                        <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                                    </c:if>      
                                </c:forEach>
                        </ul>
                    
                        <ul>
                            <li><a style="font-weight: bold" href="">Quần</a>
                                <c:forEach items="${listPNu}" var="o" begin="14" end="18">
                                    <c:if test="${o.theloai=='nu_quan'}">
                                        <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                                    </c:if>  
                                </c:forEach>
                        </ul>
                        
                        <ul>
                            <li><a style="font-weight: bold" href="">Chân váy</a>
                                <c:forEach items="${listPNu}" var="o" begin="19" end="21">
                                     <c:if test="${o.theloai=='nu_chanvay'}">
                                        <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                                    </c:if>  
                                </c:forEach>
                        </ul>
                        
                        <ul>
                            <li><a style="font-weight: bold" href="">Đầm</a>
                                <c:forEach items="${listPNu}" var="o" begin="22" end="25">
                                    <c:if test="${o.theloai=='nu_dam'}">
                                        <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                                    </c:if>  
                                </c:forEach>
                        </ul>
                    '   
                    
                </ul>
            </li>
            
            <li> 
                <a href="">NAM</a> 
                <ul class="sub-menu_nam">   
                    <ul>
                        <li><a style="font-weight: bold" href="">METAGENT</a></li>
                        <li><a style="font-weight: bold" href="">Essential Sweatsuit Men</a></li>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">Áo</a>
                        <c:forEach items="${listPNam}" var="o" begin="0" end="6">
                            <c:if test="${o.theloai=='nam_ao'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">Quần</a>
                        <c:forEach items="${listPNam}" var="o" begin="7" end="11">
                            <c:if test="${o.theloai=='nam_quan'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">GIÀY & DÉP</a>
                        <c:forEach items="${listPNam}" var="o" begin="12" end="12">
                            <c:if test="${o.theloai=='nam_giaydep'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">PHỤ KIỆN</a>
                        <c:forEach items="${listPNam}" var="o" begin="13" end="13">
                            <c:if test="${o.theloai=='nam_phukien'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                </ul>
            </li>
            
            <li> 
                <a href="">TRẺ EM</a> 
                <ul class="sub-menu_treEm">   
                    <ul>
                        <li><a style="font-weight: bold" href="">Cotton kháng khuẩn</a></li>
                        <li><a style="font-weight: bold" href="">Hàng mới về</a></li>
                        <li><a style="font-weight: bold" href="">Fashion Show SS 2022</a></li>
                        <li><a style="font-weight: bold" href="">Adorable Sweatsuit</a></li>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">BÉ GÁI</a>
                        <c:forEach items="${listPTreEm}" var="o" begin="0" end="6">
                            <c:if test="${o.theloai=='treem_begai'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">BÉ TRAI</a>
                        <c:forEach items="${listPTreEm}" var="o" begin="7" end="10">
                            <c:if test="${o.theloai=='treem_betrai'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                </ul>
            </li>
            
            <li> <a href="">GIÁ CUỐI TỪ 99K</a> </li>
            
            <li> 
                <a href="">BỘ SƯU TẬP</a> 
                <ul class="sub-menu_boSuuTap">   
                    <ul>
                        <li><a style="font-weight: bold" href="">NỮ</a>
                        <c:forEach items="${listPboSuuTap}" var="o" begin="0" end="13">
                            <c:if test="${o.theloai=='bosuutap_nu'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">NAM</a>
                        <c:forEach items="${listPboSuuTap}" var="o" begin="14" end="19">
                            <c:if test="${o.theloai=='bosuutap_nam'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                    
                    <ul>
                        <li><a style="font-weight: bold" href="">TRẺ EM</a>
                        <c:forEach items="${listPboSuuTap}" var="o" begin="20" end="22">
                            <c:if test="${o.theloai=='bosuutap_treem'}">
                                <li><a style="font-weight: normal" href="category?idDanhMucSanPham=${o.o.idDanhMucSanPham}">${o.tenSanPham}</a>
                            </c:if>  
                        </c:forEach>
                    </ul>
                </ul>
            </li>
            <li> <a href="">LIFESTYLE</a> </li>
            <li> <a href="">VỀ CHÚNG TÔI</a> </li>
        </div>
        <div class="logo">
            <img src="https://pubcdn.ivymoda.com/ivy2/images/logo.png" alt="ảnh lỗi"/>
        </div>
        <div class="orthers">
            <li><input type="text" placeholder="Tìm kiếm sản phẩm"> <i class="fas fa-search"></i></li>
            <li><a class="fa fa-paw" href=""></a></li>
            <li><a class="fa fa-user" href=""></a></li>
            <li><a class="fa fa-shopping-bag" href=""></a></li>
        </div>
    </header>
    <body>
        
    </body>
</html>
