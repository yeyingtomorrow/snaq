/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-12 15:34:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.inconformity_002ditem.unit_002dselfcheck;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dynamic_005fcheck_005fadd_005funsafeAct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t\t.tr-height{height:35px;}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar a=1;\r\n");
      out.write("\tfunction selectPerson(){\r\n");
      out.write("\t\tvar violatorValue=$('#violator').combogrid('getValue');\r\n");
      out.write("\t\tif($.trim(violatorValue)!=\"\" && violatorValue!=null){\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\tvar actDescriptionSn=\"\";\r\n");
      out.write("// \t\tparent.$('#win2').window({\r\n");
      out.write("// \t\t\tonClose:function(){\r\n");
      out.write("// \t\t\t\t$(\"#ff\").form(\"reset\");\r\n");
      out.write("// \t\t\t}\r\n");
      out.write("// \t\t});\r\n");
      out.write("\t\t//行为描述\r\n");
      out.write("\t\t$('#actDescription').textbox({\r\n");
      out.write("\t\t\tmultiline:true,\r\n");
      out.write("\t\t\tonChange:function(newValue, oldValue){\r\n");
      out.write("\t\t\t\tif(selectPerson()==true){\r\n");
      out.write("\t\t\t\t\tactDescriptionSn=newValue;\r\n");
      out.write("\t\t\t\t\t//$('#cc3').combogrid('clear');\r\n");
      out.write("\t\t\t\t\t$('#cc3').combogrid('grid').datagrid('load',{'q':$('#cc3').combogrid('getValue'),'actDescription':actDescriptionSn,'violatorId':$('#violator').combogrid('getValue')});\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示','请先选择不安全行为人员！');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//对应标准\r\n");
      out.write("\t\t$('#cc3').combogrid({          \r\n");
      out.write("    \t\tidField:'id',\r\n");
      out.write("   \t \t\ttextField:'text',    \r\n");
      out.write("    \t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/unsafeActAction_findStandard.action', \r\n");
      out.write("    \t\tdelay: 500, \r\n");
      out.write("    \t\trequired:true, \r\n");
      out.write("    \t\tpanelHeight:180,\r\n");
      out.write("\t\t    //mode:'remote',\r\n");
      out.write("\t\t    prompt:'输入名称或编号搜索相应标准',\r\n");
      out.write("\t\t    columns:[[\r\n");
      out.write("\t\t        \t\t{field:'id',title:'标准编号',width:95},    \r\n");
      out.write("\t\t        \t\t{field:'text',title:'标准名称',width:430}\r\n");
      out.write("\t\t    ]],\r\n");
      out.write("\t\t    onBeforeLoad:function(){\r\n");
      out.write("\t\t    \tif(actDescriptionSn==\"\" && $('#cc3').combogrid('getValue')==\"\"){\r\n");
      out.write("\t\t    \t\treturn false;\r\n");
      out.write("\t\t    \t}else{\r\n");
      out.write("\t\t    \t\treturn true;\r\n");
      out.write("\t\t    \t}\r\n");
      out.write("\t\t    },\r\n");
      out.write("        \tonChange:function(newValue, oldValue){\r\n");
      out.write("        \t\tif(selectPerson()==true){\r\n");
      out.write("\t        \t\tif(newValue==null||newValue==\"\"){\r\n");
      out.write("\t        \t\t\t$('#inconformityLevel').textbox('setValue',\"\");\r\n");
      out.write("\t        \t\t}\r\n");
      out.write("\t        \t\t$('#cc3').combogrid('grid').datagrid('load',{'q':newValue,'actDescription':actDescriptionSn,'violatorId':$('#violator').combogrid('getValue')});\r\n");
      out.write("\t        \t\t\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$('#cc3').combogrid('hidePanel');\r\n");
      out.write("\t\t\t\t\t$.messager.alert('提示','请先选择不安全行为人员！');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("        \t},\r\n");
      out.write("\t\t\tonSelect: function(index, row){\r\n");
      out.write("\t\t\t\t//不安全行为等级\r\n");
      out.write("//\t\t\t\tconsole.log(row);\r\n");
      out.write("\t\t\t\t$('#inconformityLevel').textbox('setValue',row.value);\r\n");
      out.write("            \t//专业\r\n");
      out.write("             \tif(row.speciality!=null && row.speciality!=\"\"){\r\n");
      out.write("             \t\tvar spSn=row.speciality.split(',');\r\n");
      out.write("             \t\t$('#cc5').combobox({\r\n");
      out.write("             \t\t\tformatter: function(row){\r\n");
      out.write("                     \t\t\tif($.inArray(row.specialitySn, spSn)!=-1){\r\n");
      out.write("                     \t\t\t\treturn '<span style=\"color:red\">' + row.specialityName + '</span>';\r\n");
      out.write("                     \t\t\t}else{\r\n");
      out.write("                     \t\t\t\treturn '<span>' + row.specialityName + '</span>';\r\n");
      out.write("                     \t\t\t}           \t\t\t\t\r\n");
      out.write("             \t\t\t}\r\n");
      out.write("             \t\t});\r\n");
      out.write("             \t}else{\r\n");
      out.write("            \t\t$('#cc5').combobox({\r\n");
      out.write("            \t\t\tformatter: function(row){\r\n");
      out.write("                    \t\treturn '<span>' + row.specialityName + '</span>';         \t\t\t\t\r\n");
      out.write("            \t\t\t}\r\n");
      out.write("            \t\t});\r\n");
      out.write("             \t}\r\n");
      out.write("        \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//不安全行为专业\r\n");
      out.write("\t\t$('#cc5').combobox({    \r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/specialityAction_query',\r\n");
      out.write("\t\t\tpanelHeight:200,\r\n");
      out.write("\t\t\trequired:true, \r\n");
      out.write("\t\t   \tvalueField:'specialitySn',    \r\n");
      out.write("\t\t    textField:'specialityName',\r\n");
      out.write("\t\t    editable:false\t \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//被检单位\r\n");
      out.write("\t\tvar department=\"\";\r\n");
      out.write("\t\t$(\"#cc6\").combotree({\r\n");
      out.write("\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/department/treeAll.action',\r\n");
      out.write("\t\t\trequired:true,\r\n");
      out.write("\t\t\teditable:false,\r\n");
      out.write("\t\t\tqueryParams:{'resourceSn':'01'},\r\n");
      out.write("\t\t\tpanelWidth: 300,\r\n");
      out.write("\t\t\tpanelHeight:340,\r\n");
      out.write("\t\t\tonLoadSuccess:function(node,data){\r\n");
      out.write("\t\t\t\tif(a==1 && data.length>0){\r\n");
      out.write("\t\t\t\t\tdepartment=$('#cc6').combotree('tree').tree('getRoot').id;\r\n");
      out.write("\t\t\t\t\ta++;\r\n");
      out.write("\t\t\t\t\tif(data.length == 1){\r\n");
      out.write("\t\t\t\t\t\tvar node = $('#cc6').combotree('tree').tree('find', data[0].id);\r\n");
      out.write("\t\t        \t\t$('#cc6').combotree('tree').tree('expand', node.target);\r\n");
      out.write("\t\t        \t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonSelect:function(rec){\r\n");
      out.write("\t\t\t\tdepartment=rec.id;\r\n");
      out.write("\t\t\t\t$('#violator').combogrid('clear');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//不安全行为人员\r\n");
      out.write("\t\t$('#violator').combogrid({    \r\n");
      out.write("\t\t\tdelay: 500,\r\n");
      out.write("\t\t\trequired:true,\r\n");
      out.write("\t\t\twidth:200,\r\n");
      out.write("\t\t    panelWidth:200,\r\n");
      out.write("\t\t    prompt:'请输入搜索信息',\r\n");
      out.write("   \t\t \ticonAlign:'right',\r\n");
      out.write("\t\t    idField:'personId',    \r\n");
      out.write("\t\t    textField:'personName',    \r\n");
      out.write("\t\t    url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/unsafeCondition/query/queryAction_showPerson.action',\r\n");
      out.write("    \t\tcolumns:[[\r\n");
      out.write("\t\t\t\t        {field:'personId',title:'编号',width:90},    \r\n");
      out.write("\t\t\t\t        {field:'personName',title:'姓名',width:108}\r\n");
      out.write("\t\t\t]],\r\n");
      out.write("\t\t\tonChange:function(newValue, oldValue){\r\n");
      out.write("\t\t\t\t$('#violator').combogrid('grid').datagrid('load',{'q':newValue,'departmentSn':department});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonSelect:function(){\r\n");
      out.write("\t\t\t\t$('#actDescription').textbox('clear');\r\n");
      out.write("\t\t\t\t$('#cc3').combogrid('clear');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//检查人员\r\n");
      out.write("\t\t$('#cc7').combogrid({    \r\n");
      out.write("    \t\tpanelWidth:450,\r\n");
      out.write("   \t\t\tidField:'id',    \r\n");
      out.write("    \t\ttextField:'personName',\r\n");
      out.write("    \t\tprompt:'下拉进行检索',\r\n");
      out.write("    \t\teditable:false,\r\n");
      out.write("    \t\tmultiple:true,\r\n");
      out.write("    \t\t//queryParams:{'departmentSn':department},\r\n");
      out.write("   \t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/inconformityItemAction_getPerson.action',\r\n");
      out.write("   \t\t\ttoolbar:[{\r\n");
      out.write("   \t\t\t\ttext:'<input id=\"tb\" style=\"width:300px\">', \r\n");
      out.write("   \t\t\t}],\r\n");
      out.write("   \t\t\tcolumns:[[    \r\n");
      out.write("   \t        \t{field:'id',title:'逻辑主键',hidden:true},\r\n");
      out.write("        \t\t{field:'personId',title:'人员编号',width:120},    \r\n");
      out.write("       \t \t\t{field:'personName',title:'人员姓名',width:120},    \r\n");
      out.write("        \t\t{field:'gender',title:'性别',width:60}\r\n");
      out.write("    \t\t]]    \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//搜索人员\r\n");
      out.write("\t\t$('#tb').textbox({    \r\n");
      out.write("    \t\tbuttonText:'搜索',    \r\n");
      out.write("    \t\ticonCls:'icon-man',\r\n");
      out.write("   \t\t \ticonAlign:'left',\r\n");
      out.write("   \t\t \tprompt:'输入姓名或编号搜索人员',\r\n");
      out.write("   \t\t \tonChange:function(newValue, oldValue){\r\n");
      out.write("   \t\t \t\tif(newValue!=\"\"){\r\n");
      out.write("   \t\t \t\t\t$('#cc7').combogrid('grid').datagrid('load',{'q':newValue,'departmentSn':department});\r\n");
      out.write("   \t\t \t\t}\r\n");
      out.write("   \t\t \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t//检查时间\r\n");
      out.write("\t\t$('#checkDateTime').datetimebox('calendar').calendar({\r\n");
      out.write("\t\t\tvalidator:function(date){\r\n");
      out.write("\t\t\t\tvar mydate = new Date();\r\n");
      out.write("\t\t\t\tif( mydate >= date && (mydate - date) <= 48 * 60 * 60 * 1000){\r\n");
      out.write("\t\t\t\t\treturn true;\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#btn2').click(function(){\r\n");
      out.write("\t\t\tif(selectPerson()==true){\r\n");
      out.write("\t            if($('#j3').css('display')==\"none\"){\r\n");
      out.write("\t            \t $('#cc10').combotree({\r\n");
      out.write("\t                    url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/inconformityItemAction_findAllStandard.action',\r\n");
      out.write("\t                 \teditable:false,\r\n");
      out.write("\t     \t\t\t\tqueryParams:{'violatorId':$('#violator').combogrid('getValue')},\r\n");
      out.write("\t     \t\t\t\tpanelHeight:200,\r\n");
      out.write("\t     \t\t\t\tprompt:'下拉选择标准！',\r\n");
      out.write("\t     \t\t\t\tformatter:function(node){\r\n");
      out.write("\t     \t\t\t\t\treturn '<span title=\"'+ node.text+'\">'+node.text+'</span>';\r\n");
      out.write("\t     \t\t\t\t},\r\n");
      out.write("\t     \t\t\t\tonSelect:function(row){\r\n");
      out.write("\t\t\t\t\t\t\t$('#cc3').combogrid('setValue',{'id':row.id,'text':row.text});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\t\t\t\t   type: \"POST\",\r\n");
      out.write("\t\t\t\t\t\t\t\t   url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/inconformityItemAction_questLevel.action',\r\n");
      out.write("\t\t\t\t\t\t\t\t   data:{'id':row.id},\r\n");
      out.write("\t\t\t\t\t\t\t\t   success: function(msg){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   var rec=eval('(' + msg + ')');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   //console.log(rec[0].level);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   //console.log(rec[0].speciality);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t   $('#inconformityLevel').textbox('setValue',rec[0].level);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t//专业\r\n");
      out.write("\t\t\t\t\t\t             \tif(rec[0].speciality!=null && rec[0].speciality!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t             \t\tvar spSn=rec[0].speciality.split(',');\r\n");
      out.write("\t\t\t\t\t\t             \t\t$('#cc5').combobox({\r\n");
      out.write("\t\t\t\t\t\t             \t\t\tformatter: function(row){\r\n");
      out.write("\t\t\t\t\t\t                     \t\t\tif($.inArray(row.specialitySn, spSn)!=-1){\r\n");
      out.write("\t\t\t\t\t\t                     \t\t\t\treturn '<span style=\"color:red\">' + row.specialityName + '</span>';\r\n");
      out.write("\t\t\t\t\t\t                     \t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t                     \t\t\t\treturn '<span>' + row.specialityName + '</span>';\r\n");
      out.write("\t\t\t\t\t\t                     \t\t\t}           \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t             \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t             \t\t});\r\n");
      out.write("\t\t\t\t\t\t             \t}else{\r\n");
      out.write("\t\t\t\t\t\t            \t\t$('#cc5').combobox({\r\n");
      out.write("\t\t\t\t\t\t            \t\t\tformatter: function(row){\r\n");
      out.write("\t\t\t\t\t\t                    \t\treturn '<span>' + row.specialityName + '</span>';         \t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t            \t\t\t}\r\n");
      out.write("\t\t\t\t\t\t            \t\t});\r\n");
      out.write("\t\t\t\t\t\t             \t}\r\n");
      out.write("\t\t\t\t\t\t\t\t   }\r\n");
      out.write("\t\t\t\t\t\t\t});\r\n");
      out.write("\t         \t\t\t}\r\n");
      out.write("\t                 });\r\n");
      out.write("\t            \t $('#j3').css('display','');\r\n");
      out.write("\t            }else{\r\n");
      out.write("\t            \t$('#j3').css('display','none');\r\n");
      out.write("\t            }\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.messager.alert('提示','请先选择不安全行为人员！');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("        });\r\n");
      out.write("\t\t//设置默认值\r\n");
      out.write("\t\t//1、被检单位\r\n");
      out.write("\t   var departmentSn=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.departmentSn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t   var departmentName=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.departmentName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t   var id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.pId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t   var personName=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.personName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t   $('#cc6').combotree('setValue',[{id:departmentSn,text:departmentName}]);\r\n");
      out.write("\t   $('#cc7').combogrid('setValue',[{id:id,personName:personName}]);\r\n");
      out.write("\t\t//提交\r\n");
      out.write("\t\t//开始禁止验证\r\n");
      out.write("\t\t$(\"#ff\").form(\"disableValidation\");\r\n");
      out.write("\t\t$(\"#submit\").click(function(){\r\n");
      out.write("\t\t\t//开启验证\r\n");
      out.write("\t\t\t$(\"#ff\").form(\"enableValidation\");\r\n");
      out.write("\t\t\t//将检查人员数组处理一下\r\n");
      out.write("\t\t\tvar personIds=\"\";\r\n");
      out.write("\t\t\tvar cc7=$('#cc7').combogrid('getValues');\r\n");
      out.write("\t\t\tfor(var i=0;i<cc7.length;i++){\r\n");
      out.write("\t\t\t\tpersonIds+=cc7[i]+\",\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tpersonIds=personIds.substring(0,personIds.length-1);\r\n");
      out.write("\r\n");
      out.write("\t\t\tif($(\"#ff\").form(\"validate\")){\r\n");
      out.write("\t\t\t\t//ajax提交\r\n");
      out.write("\t\t\t\t$(\"#ff\").form(\"submit\",{\r\n");
      out.write("\t\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/inconformity/item/unsafeActAction_saveUnsafeAct.action',\r\n");
      out.write("\t\t\t\t\tqueryParams:{'ids':personIds},\r\n");
      out.write("\t\t\t\t\tsuccess:function(data){\r\n");
      out.write("\t\t\t\t\t\tvar result = eval(data);\r\n");
      out.write("\t\t\t\t\t\tif(result==\"login\"){\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('警告','对应标准应选择末级标准，请重新选择');\r\n");
      out.write("\t\t\t\t\t\t\t$('#cc3').combogrid('clear');\r\n");
      out.write("\t\t\t\t\t\t\t$('#cc5').combobox('clear');\r\n");
      out.write("\t\t\t\t\t\t\t$('#inconformityLevel').textbox('clear');\r\n");
      out.write("\t\t\t\t\t\t}else if(result==\"success\"){\r\n");
      out.write("\t\t\t\t\t\t\tparent.$.messager.show({\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle:'提示',\r\n");
      out.write("\t\t\t\t\t\t\t\tmsg:'添加信息成功！',\r\n");
      out.write("\t\t\t\t\t\t\t\ttimeout:2000,\r\n");
      out.write("\t\t\t\t\t\t\t\tshowType:'slide'\r\n");
      out.write("\t\t\t\t\t\t\t});\t\r\n");
      out.write("\t \t\t\t\t\t\t//$(\"#ff\").form(\"reset\");\r\n");
      out.write("\t \t\t\t\t\t\tparent.$(\"#dg2\").datagrid(\"reload\");\r\n");
      out.write("\t \t\t\t\t\t\t//parent.$(\"#win2\").window(\"close\");\r\n");
      out.write("\t \t\t\t\t\t\t//禁止验证\r\n");
      out.write("\t \t\t\t\t\t\t//重置选项\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#ff\").form(\"disableValidation\");\r\n");
      out.write("\t\t\t\t\t\t\t//$('#cc7').combogrid('setValue',[{id:id,personName:personName}]);\r\n");
      out.write("\t \t\t\t\t\t\t//$('#checkDateTime').datetimebox('clear');\r\n");
      out.write("\t \t\t\t\t\t\t//$('#checkLocation').textbox('setValue',\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$('#actDescription').textbox('setValue',\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$('#inconformityLevel').textbox('setValue',\"\");\r\n");
      out.write("\t \t\t\t\t\t\t$('#cc3').combogrid('clear');\r\n");
      out.write("\t \t\t\t\t\t\tif($('#j3').css('display') != \"none\"){\r\n");
      out.write("\t \t\t\t\t\t\t\t$('#cc10').combotree('setValue',\"\");\r\n");
      out.write("\t \t\t\t\t\t\t}\r\n");
      out.write("\t \t\t\t\t\t\t$('#cc5').combobox('clear');\r\n");
      out.write("\t \t\t\t\t\t\t$('#violator').combogrid('clear');\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert(\"警告\",\"添加异常，请重新操作！\",'error');\r\n");
      out.write("\t\t\t\t\t\t\t//$(\"#ff\").form(\"reset\");\r\n");
      out.write("\t \t\t\t\t\t\t//parent.$(\"#win2\").window(\"close\");\r\n");
      out.write("\t \t\t\t\t\t\tparent.$(\"#dg2\").datagrid(\"reload\"); \r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t})\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"w\" style=\"width:680px; height: 300px; padding: 10px;\">\r\n");
      out.write("\t<form method=\"post\" id=\"ff\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"行为\" name=\"inconformityItemNature\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"动态检查\" name=\"checkType\">\r\n");
      out.write("\t\t<input type=\"hidden\" value=\"单位\" name=\"checkerFrom\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">被检单位/部门:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input id=\"cc6\" name=\"checkedDepartmentSn\" style=\"width: 200px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"label\">不安全行为人员:</td>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t<input name=\"violatorId\" id=\"violator\" style=\"width: 200px;\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">检查时间：</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input id=\"checkDateTime\" name=\"checkDateTime\" class=\"easyui-datetimebox\" \r\n");
      out.write("\t\t\t\t\t\tdata-options=\"required:true,editable:false\" style=\"width:200px\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"label\">检查地点:</td>\r\n");
      out.write("\t\t\t\t<td>\t\r\n");
      out.write("\t\t\t\t\t<input id=\"checkLocation\" name=\"checkLocation\" class=\"easyui-textbox\" style=\"width:200px;\">\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">检查成员:</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<input id=\"cc7\" style=\"width:530px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">行为描述:</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<input name=\"actDescription\" id=\"actDescription\" style=\"width:530px; height:44px;\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">对应标准:</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<input name=\"unsafeActStandardSn\" id=\"cc3\" style=\"width: 530px;\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td class=\"label\"><a id=\"btn2\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\">没搜到标准？点我查找</a></td>\r\n");
      out.write("\t\t\t\t<td id=\"j3\" colspan=\"2\" style=\"display: none\">\r\n");
      out.write("\t\t\t\t\t<input id=\"cc10\" style=\"width:320px;\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">不安全行为专业:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input id=\"cc5\" name=\"specialitySn\" style=\"width: 200px;\">  \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td class=\"label\">不安全行为等级:</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input id=\"inconformityLevel\" name=\"inconformityLevel\" type=\"text\" style=\"width:200px\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"easyui-textbox\" data-options=\"readonly:true\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"tr-height\">\r\n");
      out.write("\t\t\t\t<td class=\"label\">不安全行为痕迹:</td>\r\n");
      out.write("\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t<select id=\"unsafeActMark\" class=\"easyui-combobox\" name=\"unsafeActMark\" \r\n");
      out.write("\t\t\t\t\t\tdata-options=\"panelWidth:200,panelHeight:'auto',editable:false\" style=\"width:200px;\">   \r\n");
      out.write("\t\t\t\t\t    <option value=\"有痕\" selected=\"selected\">有痕</option>   \r\n");
      out.write("\t\t\t\t\t    <option value=\"无痕\">无痕</option> \r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"ft\" style=\"padding: 5px; text-align: center;\">\r\n");
      out.write("\t\t\t<a id=\"submit\" href=\"#\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-add'\">添加</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
