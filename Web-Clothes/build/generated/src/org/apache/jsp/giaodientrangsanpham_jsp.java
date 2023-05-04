package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class giaodientrangsanpham_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"./giaodientrangmucsp.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"category\">\n");
      out.write("        <div class=\"category-top\">\n");
      out.write("            <p>Trang chủ</p><span>&#10230;</span><p>Nữ</p><span>&#10230;</span><p>Hàng nữ mới về</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"category-content\">\n");
      out.write("            <div class=\"category-content-left\">\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"category-left-li\"><a href=\"#\">NỮ</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">HÀNG NỮ MỚI VỀ</a></li>\n");
      out.write("                            <li><a href=\"\">BEYOND TRENDY</a></li>\n");
      out.write("                            <li><a href=\"\">QUẦN JEAN NỮ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"category-content-left-li\"><a href=\"#\">NAM</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">HÀNG NAM MỚI VỀ</a></li>\n");
      out.write("                            <li><a href=\"\">BEYOND TRENDY</a></li>\n");
      out.write("                            <li><a href=\"\">QUẦN JEANS NAM</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"category-content-left-li\"><a href=\"\">TRẺ EM</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">HÀNG TRẺ EM MỚI VỀ</a></li>\n");
      out.write("                            <li><a href=\"\">ÁO CHO BÉ</a></li>\n");
      out.write("                            <li><a href=\"\">QUẦN CHO BÉ</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"category-content-left-li\"><a href=\"\">BỘ SƯU TẬP</a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"\">HÀNG MỚI VỀ</a></li>\n");
      out.write("                            <li><a href=\"\">BỘ SƯU TẬP XUÂN HÈ 2023</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"category-content-right\">\n");
      out.write("                <div class=\"category-content-right-top\">\n");
      out.write("                    <div class=\"category-content-right-top p\">\n");
      out.write("                        <p>HÀNG NỮ MỚI VỀ</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-top-item\">\n");
      out.write("                        <button><span>Bộ lọc</span><i class=\"fas fa-sort-down\"></i></button>\n");
      out.write("                        <select name=\"\" id=\"\">\n");
      out.write("                            <option value=\"\">Sắp xếp</option>\n");
      out.write("                            <option value=\"\">Giá cao đến thấp</option>\n");
      out.write("                            <option value=\"\">Giá thấp đến cao</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"category-content-right-center\">\n");
      out.write("                    <div class=\"category-content-right-center-item\"> \n");
      out.write("                        <img src=\"sp1.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM MAXI TAY HẾN</h2>\n");
      out.write("                        <p>1.790.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp2.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM HAI DÂY TENCEL DÁNG MAXI</h2>\n");
      out.write("                        <p>1.990.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp3.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM LỤA LỆCH VAI</h2>\n");
      out.write("                        <p>2.890.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp4.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM DẬP NỔI DÁNG TULIP</h2>\n");
      out.write("                        <p>2.090.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp5.jpg\" alt=\"\" />\n");
      out.write("                        <h2>SET ÁO BLAZER VÀ QUẦN SUÔNG DÀI</h2>\n");
      out.write("                        <p>2.590.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp6.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM CUT-OUT HỌA TIẾT KẺ</h2>\n");
      out.write("                        <p>2.190.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp8.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM QUÂY NGỰC ĐÍNH KHUY</h2>\n");
      out.write("                        <p>1.320.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-center-item\">\n");
      out.write("                        <img src=\"sp9.jpg\" alt=\"\" />\n");
      out.write("                        <h2>ĐẦM CHIFFON CỔ V</h2>\n");
      out.write("                        <p>1.250.000<sup>đ</sup></p>\n");
      out.write("                        <li>Them vao gio hang<a class=\"fa fa-shopping-bag\" href=\"\"></a></li>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"category-content-right-bottom\">\n");
      out.write("                    <div class=\"category-content-right-bottom-items 1\">\n");
      out.write("                        <p>Hiển thị 2 <span>|</span> 4 sản phẩm</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"category-content-right-bottom-items 2\">\n");
      out.write("                        <p><span>&#171;</span>1 2 3 4<span>&#187;</span>Trang cuối</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
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
