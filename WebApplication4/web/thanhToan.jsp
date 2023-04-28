<%-- 
    Document   : trangthanhtoan
    Created on : 14-04-2023, 14:54:29
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
        <link rel="stylesheet" href="./thanhToan.css">

    </head>
    <body>
        <!-- --------------thanhtoan------------------>
        <section class="payment">
          <div class="container">
            <div class="payment-top-wrap">
              <div class="payment-top">
                <div class="payment-top-delivery payment-top-item">
                  <i class="fas fa-shopping-cart"></i>
                </div>
                <div class="payment-top-adress payment-top-item">
                  <i class="fas fa-map-market-alt"></i>
                </div>
                <div class="payment-top-payment payment-top-item">
                  <i class="fas fa-money-check-alt"></i>
                </div>
              </div>
            </div>
          </div>
          <div class="container">
            <div class="payment-content row">
              <div class="payment-content-left">
                <div class="payment-content-left-method-delivery">
                  <p style="font-weight: bold;">Phương thức giao hàng</p>
                  <div class="payment-content-left-method-payment-item-img">
                    <img src="image/visa.png" alt="">
                  </div>
                  <div class="payment-content-left-method-delivery-item">
                    <input checked type="radio">
                    <label for="">Giao hàng chuyển phát nhanh</label>
                  </div>
                  <div class="payment-content-left-method-payment-item-img">
                    <img src="image/visa.png" alt="">
                  </div>
                  <div class="payment-content-left-method-payment">
                    <p style="font-weight: bold;">Phương thức thanh toán</p>
                    <p style="color:red;">Mọi giao dịch đều được bảo mật và mã hóa. Thông tin thẻ tín dụng sẽ khongo bao giờ được lưu lại.</p>
                    <div class="payment-content-left-method-payment-item-img">
                      <img src="image/visa.png" alt="">
                    </div>
                    <div class="payment-content-left-method-payment-item">
                      <input checked name="method-payment" type="radio">
                      <label for="">Thanh toán bằng thẻ tín dụng (OnePay)</label>
                    </div>
                    <div class="payment-content-left-method-payment-item-img">
                      <img src="image/visa.png" alt="">
                    </div>
                    <div class="payment-content-left-method-payment-item">
                      <input name="method-payment" type="radio">
                      <label for="">Thanh toán bằng thẻ ATM (OnePay)</label>
                    </div>
                    <div class="payment-content-left-method-payment-item-img">
                      <img src="image/vcb.png" alt="">
                    </div>
                    <div class="payment-content-left-method-payment-item">
                      <input name="method-payment" type="radio">
                      <label for="">Thanh toán bằng MoMo</label>
                    </div>
                    <div class="payment-content-left-method-payment-item-img">
                      <img src="image/momo.png" alt="">
                    </div>
                    <div class="payment-content-left-method-payment-item">
                      <input name="method-payment" type="radio">
                      <label for="">Thu tiền tận nơi</label>
                  </div>
                </div>
              </div>
            </div>
              <div class="payment-content-right">
                <div class="payment-content-right-button">
                  <input type="text" placeholder="Mã giảm giá/Quà tặng">
                  <button><i class="fas fa-check"></i></button>
                </div>
                <div class="payment-content-right-button">
                  <input type="text" placeholder="Mã cộng tác viên">
                  <button><i class="fas fa-check"></i></button>
                </div>
                <div class="payment-content-right-mnv">
                  <select name="" id="">
                    <option value="">Chọn mã nhân viên thân thiết</option>
                    <option value="">D345</option>
                    <option value="">A345</option>
                    <option value="">E345</option>
                    <option value="">I345</option>
                  </select>
                </div>
              </div>
            </div>
            <div>
              <div class="payment-content-right-payment">
                <button>TIẾP TỤC THANH TOÁN</button>
              </div>
            </div>
          </div>
        </section>
        <!-- --------------footer------------------>
        <%@include file="footer.jsp" %>
    </body>
</html>
