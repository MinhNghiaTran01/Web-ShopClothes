package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <title>Đăng nhập</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"login.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h2 class=\"\">ĐĂNG NHẬP</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"noidung dn nd1\">\r\n");
      out.write("            <form action=login>\r\n");
      out.write("                <div class=\"header h1\">\r\n");
      out.write("                 <h4 class=\"\">Bạn đã có tài khoản IVY</h4>\r\n");
      out.write("                 <p class=\"\">Nếu bạn đã có tài khoản, hãy đăng nhập để tích lũy điểm thành viên và nhận được những ưu đãi tốt hơn!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                 <input type=\"text\" class=\"input dn\" placeholder=\"Email/SDT...\">\r\n");
      out.write("                 <input type=\"text\" class=\"input dn\" placeholder=\"Mat khau...\">\r\n");
      out.write("                <label>\r\n");
      out.write("                     <input class=\"\" value=\"1\"  type=\"checkbox\" name=\"crem\"/>\r\n");
      out.write("                     <span style=\"margin-left: 5px\"> Ghi nhớ đăng nhập</span>\r\n");
      out.write("                 </label>\r\n");
      out.write("                <button class=\"bt dn\" type=\"submit\" style=\"width: 100%;margin-top: 40px\">Đăng nhập</button>\r\n");
      out.write("           </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"noidung dn nd2\">\r\n");
      out.write("            <h4 class=\"header h2\">Khách hàng mới của IVY moda</h4>\r\n");
      out.write("            <p class=\"\">Nếu bạn chưa có tài khoản trên ivymoda.com, hãy sử dụng tùy chọn này để truy cập biểu mẫu đăng ký.\r\n");
      out.write("\r\n");
      out.write("                Bằng cách cung cấp cho IVY moda thông tin chi tiết của bạn, quá trình mua hàng trên ivymoda.com sẽ là một trải nghiệm thú vị và nhanh chóng hơn!</p>\r\n");
      out.write("           <a href=\"register.jsp\" class=\"\">\r\n");
      out.write("            <button class=\"bt dn\" type=\"submit\" style=\"width: 100%;margin-top: 40px;margin-left: 0px\">Đăng ký</button>\r\n");
      out.write("           </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
