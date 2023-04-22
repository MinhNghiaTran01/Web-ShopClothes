<%-- 
    Document   : home
    Created on : 04-04-2023, 11:34:15
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>trang chủ</title>
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
    <body>
            <section>
                <div class="aspect-ratio-169">
                    <img  src="https://pubcdn.ivymoda.com/files/news/2023/03/20/99081d779a7f7cab71eead17a00494b6.jpg" alt="">
                    <img  src="https://pubcdn.ivymoda.com/files/news/2023/03/20/ebcda271b884a7994e3660ed4f8d13c2.jpg" alt="">
                    <img  src="https://pubcdn.ivymoda.com/files/news/2023/03/06/63de1b697d785a9f15c3bef27024e165.jpg" alt="">
                </div>
                <div class="dot-container">
                    <div class='dot active'></div>
                    <div class='dot'></div>
                    <div class='dot'></div>
                </div>
            </section>
    </body>
<!-- --------------app-container------------------>
<section class="app-container">
    <p>Tải ứng dụng IVYmoda</p>
    <div class="app-google">
        <a href="https://apps.apple.com/app/id1430094474?fbclid=IwAR3xAzj-xTmtj35aQUB8KhTLk1zFgyw2zssisSyn9qkRA6w4fgt6kI7j8Q8"><img src="https://pubcdn.ivymoda.com/ivy2/images/appstore.png" alt=""></a>
        <a href="https://play.google.com/store/apps/details?id=com.ivymoda.app&fbclid=IwAR2Ki0MhC0MdCSEqmnP9BUNLhKg7ZresCBqA8BfRkPBBswJ99-YNqOX4cL8&pli=1"><img src="https://pubcdn.ivymoda.com/ivy2/images/googleplay.png" alt=""></a> 
    </div>
    <p>Nhận bản tin Ivymoda</p>
    <div class="email-container">
        <form action="action">
            <input class="imp-email" type="text" placeholder="Nhập email của bạn" >
            <input class="send-email" type="submit" name="sub-email">
        </form>
    </div>
</section>
<!-- --------------footer------------------>
<%@include file="footer.jsp" %>
<!-- Chuyển giữa các Slider tự động và khi nhấn vào sẽ chuyển sang slider khác -->
<script id="Slider">
     
    const imgPosittion = document.querySelectorAll(".aspect-ratio-169 img")
    const imgContainer = document.querySelector(".aspect-ratio-169")
    const dotItem = document.querySelectorAll(".dot")
    // console.log(imgPosittion)
    let imgNumber = imgPosittion.length
    let index = 0;
    imgPosittion.forEach(function(image,index){
        image.style.left = index*100 + "%"; 
        dotItem[index].addEventListener("click",function(){
            slider(index)
        })
    })
    function imgSlide(){
        index++;
        if(index>=imgNumber){
            index = 0;
        }
        slider(index)
    }
    function slider(index){
        imgContainer.style.left = "-" + index*100 + "%"
        const dotActive = document.querySelector(".active")
        dotActive.classList.remove('active')
        dotItem[index].classList.add("active")

    }
    setInterval(imgSlide,5000)
</script>
<!-- Scroll thanh meunu thì đổi màu (Hiện đang lỗi) -->
<script>
    window.addEventListener('scroll', function() {
      var header = document.querySelector('.header');
      var scrollPosition = window.pageXOffset;
      if (scrollPosition > 100) {
        header.classList.add('sticky');
      } else {
        header.classList.remove('sticky');
      }
    });
  </script>

</html>