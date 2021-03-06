<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/easyui/locale/easyui-lang-zh_CN.js"></script>
<style type="text/css">
	#fb{
	float:left
	}
	#submit{
		height:22px
	}
	

</style>
<script type="text/javascript">	
//判断附件是否存在并下载
	function downLoadFile(index){
		var rows=$('#d-a').datagrid('getRows');
		$.post("${pageContext.request.contextPath}/interior/work/interiorWork_queryInteriorWorkFile.action",{attachmentPath:rows[index].physicalFileName},function(result){
			if(result=="success"){
				var url ='${pageContext.request.contextPath}/standard/download.action?fileName='+rows[index].physicalFileName+'&&newName='+rows[index].logicalFileName;
				$('<form method="post" action="' + url + '"></form>').appendTo('body').submit().remove();
			}else{
				$.messager.alert('警告','文件已丢失，下载失败！');
			}
		},"json");
	}
	$(function(){
		var subunit=parent.$('#subunit').val();
		if(subunit=="subunit"){
			var parentrow=parent.$("iframe").get(0).contentWindow.$("#dg").datagrid("getSelected");
		}else{
			var parentrow=parent.$("iframe").get(1).contentWindow.$("#dg").datagrid("getSelected");
		}		
		var inconformityItemSn=parentrow.inconformityItemSn;
		$("#d-a").datagrid({
		    url:'${pageContext.request.contextPath}/inconformity/item/inconformityAttachmentAction_queryJoinInconformityItem',
			idField:"id",// id字段为标识字段,那么此字段状态将会被dg记录下来
			queryParams:{'inconformityItemSn':inconformityItemSn},//请求远程数据发送额外的参数
			striped:true,/*斑马线效果  */
			nowrap:true,/*数据同一行*/
			loadmsg:'请等待',
			rownumbers:true,/* 行号*/
			remoteSort:false,/*禁止使用远程排序*/
			singleSelect:true,
			checkOnSelect:false,
		    columns:[[ 
				{field:'id',title:'逻辑主键',hidden:true},
				{field:'attachmentType',title:'附件类型'},
		        {field:'logicalFileName',title:'附件逻辑路径',formatter:function(value,row,index){
		        	return "<a href='javascript:' onclick='downLoadFile("+index+")'>" + value + "</a>";
					//return "<a href='${pageContext.request.contextPath}/standard/download.action?fileName="+row.physicalFileName+"&&newName="+value+"'>" + value + "</a>";} 
		        }},
		        {field:'physicalFileName',title:'附件物理路径',hidden:true,formatter:function(value,row,index){
					return "<a href="+ value +">" + value + "</a>";} 
		        }
		    ]]    
		});
	});
</script>
</head>
<body style="margin: 1px;">
	<table id="d-a"></table>  
</body>
</html>