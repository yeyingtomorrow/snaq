/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-21 16:38:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>神华宁煤安全风险预控管理信息系统</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/login.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"formlogin\">\r\n");
      out.write("\t<div id=\"login\">\t\r\n");
      out.write("\t\t\t<input type=\"password\" style=\"display:none\" />\r\n");
      out.write("\t\t<p>账号：<input type=\"text\" name=\"personId\" id=\"personId\" class=\"easyui-validatebox\" ></p>\r\n");
      out.write("\t\t<p>密码：<input type=\"password\" name=\"password\"  id=\"password\" data-oldPwd=\"\" data-loginIp=\"\" class=\"easyui-validatebox\" ></p>\r\n");
      out.write("\r\n");
      out.write("\t\t<p id=\"remember\"><input type=\"checkbox\"  name=\"chkRemember\" id=\"chkRemember\" />记住用户名和密码</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"btn\">\r\n");
      out.write("\t\t<a href=\"#\" class=\"easyui-linkbutton\" >登录</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/login.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/js/jquery.cookie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("getLocalIPs(function(ips) { // <!-- ips is an array of local IP addresses.\r\n");
      out.write("\t$(\"#password\").data(\"loginIp\",ips.join(' '));\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function getLocalIPs(callback) {\r\n");
      out.write("    var ips = [];\r\n");
      out.write("\r\n");
      out.write("    var RTCPeerConnection = window.RTCPeerConnection ||\r\n");
      out.write("        window.webkitRTCPeerConnection || window.mozRTCPeerConnection;\r\n");
      out.write("\r\n");
      out.write("    var pc = new RTCPeerConnection({\r\n");
      out.write("        // Don't specify any stun/turn servers, otherwise you will\r\n");
      out.write("        // also find your public IP addresses.\r\n");
      out.write("        iceServers: []\r\n");
      out.write("    });\r\n");
      out.write("    // Add a media line, this is needed to activate candidate gathering.\r\n");
      out.write("    pc.createDataChannel('');\r\n");
      out.write("    \r\n");
      out.write("    // onicecandidate is triggered whenever a candidate has been found.\r\n");
      out.write("    pc.onicecandidate = function(e) {\r\n");
      out.write("        if (!e.candidate) { // Candidate gathering completed.\r\n");
      out.write("            pc.close();\r\n");
      out.write("            callback(ips);\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("        var ip = /^candidate:.+ (\\S+) \\d+ typ/.exec(e.candidate.candidate)[1];\r\n");
      out.write("        if (ips.indexOf(ip) == -1) // avoid duplicate entries (tcp/udp)\r\n");
      out.write("            ips.push(ip);\r\n");
      out.write("    };\r\n");
      out.write("    pc.createOffer(function(sdp) {\r\n");
      out.write("        pc.setLocalDescription(sdp);\r\n");
      out.write("    }, function onerror() {});\r\n");
      out.write("}\r\n");
      out.write("function getRandomString(len) {  \r\n");
      out.write("    len = len || 32;  \r\n");
      out.write("    var $chars = 'ABCDEFGHJKMNPQRSTWXYZabcdefhijkmnprstwxyz2345678'; // 默认去掉了容易混淆的字符oOLl,9gq,Vv,Uu,I1  \r\n");
      out.write("    var maxPos = $chars.length;  \r\n");
      out.write("    var pwd = '';  \r\n");
      out.write("    for (i = 0; i < len; i++) {  \r\n");
      out.write("        pwd += $chars.charAt(Math.floor(Math.random() * maxPos));  \r\n");
      out.write("    }  \r\n");
      out.write("    return pwd;  \r\n");
      out.write("}  \r\n");
      out.write("\t//初始化页面时验证是否记住了密码\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tif(window.top.$(\"#divHeader\").length>0){\r\n");
      out.write("\t\t\twindow.top.location.href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar counter = 0;\r\n");
      out.write("\t\tif (window.history && window.history.pushState) {\r\n");
      out.write("\t\t\t$(window).on('popstate', function () {\r\n");
      out.write("\t\t\t\twindow.history.pushState('forward', null, '#');\r\n");
      out.write("\t\t\t\twindow.history.forward(1);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\twindow.history.pushState('forward', null, '#'); //在IE中必须得有这两行\r\n");
      out.write("\t\twindow.history.forward(1);\r\n");
      out.write("\t\tvar a=1;\r\n");
      out.write("\t    if ($.cookie(\"chkRemember\") == \"true\") {\r\n");
      out.write("\t        $(\"#chkRemember\").attr(\"checked\", true);\r\n");
      out.write("\t        $(\"#personId\").val($.cookie(\"personId\"));\t        \r\n");
      out.write("\t        $(\"#password\").val(getRandomString(8));//产生8位随机数赋值给密码框\r\n");
      out.write("\t        $(\"#password\").data(\"oldPwd\",$(\"#password\").val());//设置密码框的data-oldPwd属性\r\n");
      out.write("\t    }\r\n");
      out.write("\t});\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t//回车登录\r\n");
      out.write("\t\t$(\"body\").keydown(function() {\r\n");
      out.write("\t\t    if (event.keyCode == \"13\") {//keyCode=13是回车键\r\n");
      out.write("\t\t    \t$(\"#btn a\").click();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//密码聚焦时改变属性\r\n");
      out.write("// \t\t$(\"#password\").focus(function(event) {\r\n");
      out.write("// \t\t\t $(this).attr('type','password');\r\n");
      out.write("// \t\t});\r\n");
      out.write("\t\t$(\"#login\").dialog({\r\n");
      out.write("\t\t\ttitle:'神宁安全风险预控管理信息系统',\r\n");
      out.write("\t\t\twidth:300,\r\n");
      out.write("\t\t\theight:195, \r\n");
      out.write("\t\t\ticonCls:'icon-login',\r\n");
      out.write("\t\t\tclosable:false,\r\n");
      out.write("\t\t\tdraggable:false,\r\n");
      out.write("\t\t\tmodal:true,\r\n");
      out.write("\t\t\tbuttons:'#btn'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#personId\").validatebox({\r\n");
      out.write("\t\t\trequired:true,\r\n");
      out.write("\t\t\tmissingMessage:'请输入账号！',\r\n");
      out.write("\t\t\ticonCls:'icon-man',\r\n");
      out.write("\t\t\ticonAlign:'right',\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\"#password\").validatebox({\r\n");
      out.write("\t\t\trequired:true, \r\n");
      out.write("\t\t\tmissingMessage:'请输入密码！',\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tif(!$(\"#personId\").validatebox('isValid')){\r\n");
      out.write("\t\t\t$(\"#personId\").focus();\r\n");
      out.write("\t\t}else if(!$(\"#password\").validatebox('isValid')){\r\n");
      out.write("\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t//提交\r\n");
      out.write("\t\t$(\"#btn a\").click(function(){\r\n");
      out.write("\t\t\tif(!$(\"#personId\").validatebox('isValid')){\r\n");
      out.write("\t\t\t\t$(\"#personId\").focus();\t\t\t\r\n");
      out.write("\t\t\t}else if(!$(\"#password\").validatebox('isValid')){\r\n");
      out.write("\t\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t\t}else if($(\"#password\").data('loginIp')==''){\r\n");
      out.write("\t\t\t\t$.messager.alert('警告','请开启浏览器的WebRTC功能！'); \r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/person/login\",{personId:$('#personId').val(),password:$('#password').val(),rememberPwd:$(\"#chkRemember\").prop(\"checked\"),oldPwd:jQuery(\"#password\").data('oldPwd'),loginIp:jQuery(\"#password\").data('loginIp')},function(text, status){if(text.result==\"success\"){\t\t\t\t\t \t \r\n");
      out.write("\t\t\t\t\t\tif($(\"#chkRemember\").prop(\"checked\")){\r\n");
      out.write("\t\t\t\t\t\t\t$.cookie(\"personId\", text.personId, { expires: 7 });\r\n");
      out.write("\t\t\t\t\t        $.cookie(\"password\", text.password, { expires: 7 });\r\n");
      out.write("\t\t\t\t\t        $.cookie(\"chkRemember\", $(\"#chkRemember\").prop(\"checked\"), { expires: 7 });\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t        $.cookie(\"personId\", '', { expires: -1 });\r\n");
      out.write("\t\t\t\t\t\t        $.cookie(\"password\", '', { expires: -1 });\r\n");
      out.write("\t\t\t\t\t\t        $.cookie(\"chkRemember\", \"false\", { expires: -1 });\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tlocation.href =\"main\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tif(text.result==\"error\"){\r\n");
      out.write("\t\t\t\t\t\t$.cookie(\"personId\", '', { expires: -1 });\r\n");
      out.write("\t\t\t\t        $.cookie(\"password\", '', { expires: -1 });\r\n");
      out.write("\t\t\t\t        $.cookie(\"chkRemember\", \"false\", { expires: -1 });\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('警告','用户名密码不正确！');    \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},'json');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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