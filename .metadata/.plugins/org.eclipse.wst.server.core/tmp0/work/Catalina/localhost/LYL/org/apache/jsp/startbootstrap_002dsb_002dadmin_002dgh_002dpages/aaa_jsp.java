/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.46
 * Generated at: 2021-06-12 05:24:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.startbootstrap_002dsb_002dadmin_002dgh_002dpages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aaa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/startbootstrap-sb-admin-gh-pages/top.jsp", Long.valueOf(1623475415661L));
    _jspx_dependants.put("/startbootstrap-sb-admin-gh-pages/bottom.jsp", Long.valueOf(1623475050524L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<title>Tables - SB Admin</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!-- í©ì³ì§ê³  ìµìíë ìµì  CSS -->\r\n");
      out.write("<!-- <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\"> -->\r\n");
      out.write("<link href=\"../css/bootstrap.min.css\">\r\n");
      out.write("<!-- <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script> -->\r\n");
      out.write("<script src=\"../js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("<title>Web hello</title>\r\n");
      out.write("</head>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"sb-nav-fixed\">\r\n");
      out.write("	<nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\r\n");
      out.write("		<!-- Navbar Brand-->\r\n");
      out.write("		<a class=\"navbar-brand ps-3\" href=\"index.html\">LYL project</a>\r\n");
      out.write("		<!-- Sidebar Toggle-->\r\n");
      out.write("		<button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\"\r\n");
      out.write("			id=\"sidebarToggle\" href=\"#!\">\r\n");
      out.write("			<i class=\"fas fa-bars\"></i>\r\n");
      out.write("		</button>\r\n");
      out.write("		<!-- Navbar Search-->\r\n");
      out.write("		<form\r\n");
      out.write("			class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\r\n");
      out.write("			<div class=\"input-group\">\r\n");
      out.write("				<input class=\"form-control\" type=\"text\" placeholder=\"Search for...\"\r\n");
      out.write("					aria-label=\"Search for...\" aria-describedby=\"btnNavbarSearch\" />\r\n");
      out.write("				<button class=\"btn btn-primary\" id=\"btnNavbarSearch\" type=\"button\">\r\n");
      out.write("					<i class=\"fas fa-search\"></i>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("		<!-- Navbar-->\r\n");
      out.write("		<ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\r\n");
      out.write("			<li class=\"nav-item dropdown\"><a\r\n");
      out.write("				class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\r\n");
      out.write("				role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i\r\n");
      out.write("					class=\"fas fa-user fa-fw\"></i></a>\r\n");
      out.write("				<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("					aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Settings</a></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Activity Log</a></li>\r\n");
      out.write("					<li><hr class=\"dropdown-divider\" /></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Logout</a></li>\r\n");
      out.write("				</ul></li>\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("	<div id=\"layoutSidenav\">\r\n");
      out.write("		<div id=\"layoutSidenav_nav\">\r\n");
      out.write("			<nav class=\"sb-sidenav accordion sb-sidenav-dark\"\r\n");
      out.write("				id=\"sidenavAccordion\">\r\n");
      out.write("				<div class=\"sb-sidenav-menu\">\r\n");
      out.write("					<div class=\"nav\">\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Core</div>\r\n");
      out.write("						<a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-tachometer-alt\"></i>\r\n");
      out.write("							</div> Dashboard\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Interface</div>\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapseLayouts\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-columns\"></i>\r\n");
      out.write("							</div> Layouts\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"collapse\" id=\"collapseLayouts\"\r\n");
      out.write("							aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("								<a class=\"nav-link\" href=\"layout-static.html\">Static\r\n");
      out.write("									Navigation</a> <a class=\"nav-link\" href=\"layout-sidenav-light.html\">Light\r\n");
      out.write("									Sidenav</a>\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("							data-bs-target=\"#collapsePages\" aria-expanded=\"false\"\r\n");
      out.write("							aria-controls=\"collapsePages\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-book-open\"></i>\r\n");
      out.write("							</div> Pages\r\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("							</div>\r\n");
      out.write("						</a>\r\n");
      out.write("						<div class=\"collapse\" id=\"collapsePages\"\r\n");
      out.write("							aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\r\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav accordion\"\r\n");
      out.write("								id=\"sidenavAccordionPages\">\r\n");
      out.write("								<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("									data-bs-target=\"#pagesCollapseAuth\" aria-expanded=\"false\"\r\n");
      out.write("									aria-controls=\"pagesCollapseAuth\"> Authentication\r\n");
      out.write("									<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("										<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</a>\r\n");
      out.write("								<div class=\"collapse\" id=\"pagesCollapseAuth\"\r\n");
      out.write("									aria-labelledby=\"headingOne\"\r\n");
      out.write("									data-bs-parent=\"#sidenavAccordionPages\">\r\n");
      out.write("									<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("										<a class=\"nav-link\" href=\"login.html\">Login</a> <a\r\n");
      out.write("											class=\"nav-link\" href=\"register.html\">Register</a> <a\r\n");
      out.write("											class=\"nav-link\" href=\"password.html\">Forgot Password</a>\r\n");
      out.write("									</nav>\r\n");
      out.write("								</div>\r\n");
      out.write("								<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\r\n");
      out.write("									data-bs-target=\"#pagesCollapseError\" aria-expanded=\"false\"\r\n");
      out.write("									aria-controls=\"pagesCollapseError\"> Error\r\n");
      out.write("									<div class=\"sb-sidenav-collapse-arrow\">\r\n");
      out.write("										<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</a>\r\n");
      out.write("								<div class=\"collapse\" id=\"pagesCollapseError\"\r\n");
      out.write("									aria-labelledby=\"headingOne\"\r\n");
      out.write("									data-bs-parent=\"#sidenavAccordionPages\">\r\n");
      out.write("									<nav class=\"sb-sidenav-menu-nested nav\">\r\n");
      out.write("										<a class=\"nav-link\" href=\"401.html\">401 Page</a> <a\r\n");
      out.write("											class=\"nav-link\" href=\"404.html\">404 Page</a> <a\r\n");
      out.write("											class=\"nav-link\" href=\"500.html\">500 Page</a>\r\n");
      out.write("									</nav>\r\n");
      out.write("								</div>\r\n");
      out.write("							</nav>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Addons</div>\r\n");
      out.write("						<a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-chart-area\"></i>\r\n");
      out.write("							</div> Charts\r\n");
      out.write("						</a> <a class=\"nav-link\" href=\"tables.html\">\r\n");
      out.write("							<div class=\"sb-nav-link-icon\">\r\n");
      out.write("								<i class=\"fas fa-table\"></i>\r\n");
      out.write("							</div> Tables\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"sb-sidenav-footer\">\r\n");
      out.write("					<div class=\"small\">Logged in as:</div>\r\n");
      out.write("					Start Bootstrap\r\n");
      out.write("				</div>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div id=\"layoutSidenav_content\">\r\n");
      out.write("			<main>\r\n");
      out.write("				<div class=\"container-fluid px-4\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<h1>테스트_aaa</h1>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	</main>\r\n");
      out.write("			<footer class=\"py-4 bg-light mt-auto\">\r\n");
      out.write("				<div class=\"container-fluid px-4\">\r\n");
      out.write("					<div class=\"d-flex align-items-center justify-content-between small\">\r\n");
      out.write("						<div class=\"text-muted\">Copyright &copy; Your Website 2021</div>\r\n");
      out.write("						<div>\r\n");
      out.write("							<a href=\"#\">Privacy Policy</a> &middot; <a href=\"#\">Terms &amp;\r\n");
      out.write("								Conditions</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</footer>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"js/scripts.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
