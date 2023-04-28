package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class trangthanhtoan_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/1147679ae7.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"./thanhtoan.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- --------------thanhtoan------------------>\n");
      out.write("        <section class=\"payment\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"payment-top-wrap\">\n");
      out.write("              <div class=\"payment-top\">\n");
      out.write("                <div class=\"payment-top-delivery payment-top-item\">\n");
      out.write("                  <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment-top-adress payment-top-item\">\n");
      out.write("                  <i class=\"fas fa-map-market-alt\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment-top-payment payment-top-item\">\n");
      out.write("                  <i class=\"fas fa-money-check-alt\"></i>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"payment-content row\">\n");
      out.write("              <div class=\"payment-content-left\">\n");
      out.write("                <div class=\"payment-content-left-method-delivery\">\n");
      out.write("                  <p style=\"font-weight: bold;\">Phương thức giao hàng</p>\n");
      out.write("                  <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                    <img src=\"image/visa.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"payment-content-left-method-delivery-item\">\n");
      out.write("                    <input checked type=\"radio\">\n");
      out.write("                    <label for=\"\">Giao hàng chuyển phát nhanh</label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                    <img src=\"image/visa.png\" alt=\"\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"payment-content-left-method-payment\">\n");
      out.write("                    <p style=\"font-weight: bold;\">Phương thức thanh toán</p>\n");
      out.write("                    <p style=\"color:red;\">Mọi giao dịch đều được bảo mật và mã hóa. Thông tin thẻ tín dụng sẽ khongo bao giờ được lưu lại.</p>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                      <img src=\"image/visa.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item\">\n");
      out.write("                      <input checked name=\"method-payment\" type=\"radio\">\n");
      out.write("                      <label for=\"\">Thanh toán bằng thẻ tín dụng (OnePay)</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                      <img src=\"image/visa.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item\">\n");
      out.write("                      <input name=\"method-payment\" type=\"radio\">\n");
      out.write("                      <label for=\"\">Thanh toán bằng thẻ ATM (OnePay)</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                      <img src=\"image/vcb.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item\">\n");
      out.write("                      <input name=\"method-payment\" type=\"radio\">\n");
      out.write("                      <label for=\"\">Thanh toán bằng MoMo</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item-img\">\n");
      out.write("                      <img src=\"image/momo.png\" alt=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"payment-content-left-method-payment-item\">\n");
      out.write("                      <input name=\"method-payment\" type=\"radio\">\n");
      out.write("                      <label for=\"\">Thu tiền tận nơi</label>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <div class=\"payment-content-right\">\n");
      out.write("                <div class=\"payment-content-right-button\">\n");
      out.write("                  <input type=\"text\" placeholder=\"Mã giảm giá/Quà tặng\">\n");
      out.write("                  <button><i class=\"fas fa-check\"></i></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment-content-right-button\">\n");
      out.write("                  <input type=\"text\" placeholder=\"Mã cộng tác viên\">\n");
      out.write("                  <button><i class=\"fas fa-check\"></i></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"payment-content-right-mnv\">\n");
      out.write("                  <select name=\"\" id=\"\">\n");
      out.write("                    <option value=\"\">Chọn mã nhân viên thân thiết</option>\n");
      out.write("                    <option value=\"\">D345</option>\n");
      out.write("                    <option value=\"\">A345</option>\n");
      out.write("                    <option value=\"\">E345</option>\n");
      out.write("                    <option value=\"\">I345</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("              <div class=\"payment-content-right-payment\">\n");
      out.write("                <button>TIẾP TỤC THANH TOÁN</button>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- --------------footer------------------>\n");
      out.write("        <div class=\"footer-top\">\n");
      out.write("          <li><a href=\"index.html\"><img src=\"https://pubcdn.ivymoda.com/ivy2/images/logo-footer.png\" alt=\"\"></a></li>\n");
      out.write("          <li><a href=\"http://online.gov.vn/Home/WebDetails/36596\"><img src=\"https://pubcdn.ivymoda.com/ivy2/images/img-congthuong.png\" alt=\"\"></a></li>\n");
      out.write("          <li><a href=\"\">Liên hệ</a></li>\n");
      out.write("          <li><a href=\"\">Tuyển dụng</a></li>\n");
      out.write("          <li><a href=\"\">Giới thiệu</a></li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"\" class=\"fab fa-facebook\"></a>\n");
      out.write("            <a href=\"\" class=\"fab fa-twitter\"></a>\n");
      out.write("            <a href=\"\" class=\"fab fa-youtube\"></a>\n");
      out.write("          </li>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-center\">\n");
      out.write("          <p>Công ty Cổ phần Dự Kim với số đăng ký kinh doanh: 0105777650</p>\n");
      out.write("          <p> <b>Địa chỉ đăng ký:</b>  Tổ dân phố Tháp, P.Đại Mỗ, Q.Nam Từ Liêm, TP.Hà Nội, Việt Nam</p>\n");
      out.write("          <p> <b> Số điện thoại:</b> 0243 205 2222/ 090 589 8683</p>\n");
      out.write("          <p> <b>Email:</b>  cskh@ivy.com.vn</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("          ©IVYmoda All rights reserved\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
