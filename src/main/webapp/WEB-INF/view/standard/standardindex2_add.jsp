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
.input{
	margin-top:10px
}
#button{
	text-align:center
}
</style>
<script type="text/javascript">
	$(function(){
		var standardSn=parent.$('#cc2').combobox('getValue');
		var row=parent.$("#standard").treegrid("getSelected");
		$('#standard-add').form('load',{
			standardSn:standardSn
		});
		//数字框
		$('#nn2').numberbox({    
		    min:0,
		    precision:0,
		    width:240
		}); 
		//提交
		$("#reset").click(function(){
	  		$("#standard-add").form("reset");
	  			});
		//开始禁止验证
		$("#standard-add").form("disableValidation");
		$("#submit").click(function(){
			//开启验证
			$("#standard-add").form("enableValidation");
			if($("#standard-add").form("validate")){
				//ajax提交
				$("#standard-add").form("submit",{
					url:'standard/standardindexAction_save.action',
					success:function(data){
						var result = eval('(' + data + ')');
						var status=result.status;
						var msg=result.message;
						if(status=="ok"){
							parent.$.messager.alert("提示信息",msg);
							$("#standard-add").form("reset");
							parent.$("#standard-win").window("close");
							var url='standard/standardindexAction_queryPart.action';
							parent.$("#standard").treegrid("options").url = url;
							parent.$("#standard").treegrid("reload",{
								standardSn:standardSn
							});
						}else{
							parent.$.messager.alert("提示信息",msg,'error');
						}
						
					}
				});
			}
		});
		
	})
</script>
</head>
<body>
	<form id="standard-add" method="post">
		<div class="input">
			<lable for="indexSn">标准编号：</lable>
			<input class="easyui-textbox" name="indexSn" data-options="required:true,missingMessage:'指标名称必填!',width:240"/>
		</div>
		<div class="input">
			<lable for="parentindexSn">父级编号：</lable>
			<input class="easyui-textbox" name="parentindexSn" data-options="prompt:'顶级标准不填！',width:240"/>
		</div>
		<div class="input">
			<lable for="indexName">考核标准：</lable>
			<input class="easyui-textbox" name="indexName" data-options="required:true,missingMessage:'指标名称必填!',width:240,height:66,multiline:true"/>
		</div>
		<div class="input">
			<lable for="pdca">所属阶段：</lable>
			<input class="easyui-combobox" name="pdca" data-options="
				valueField: 'label',
				textField: 'value',
				panelHeight:'auto',
				width:240,
				data: [{
					label: 'P',
					value: 'P'
				},{
					label: 'D',
					value: 'D'
				},{
					label: 'C',
					value: 'C'
				},
				{
					label: 'A',
					value: 'A'
				}]" />
		</div>
		<div class="input">
			<lable for="isKeyIndex">关键指标：</lable>
			<input class="easyui-combobox" name="isKeyIndex" data-options="
				valueField: 'label',
				width:240,
				textField: 'value',
				panelHeight:'auto',
				data: [{
					label: 'true',
					value: '是'
				},{
					label: 'false',
					value: '否'
				}]" />
		</div>
		<div class="input">
			<lable for="auditKeyPoints">考核要点：    </lable>
			<input class="easyui-textbox" name="auditKeyPoints" data-options="multiline:true,height:66,width:240" name="way"/>
		</div>
		<div class="input">
			<lable for="integerScore">设计分值：   </lable>
			<input id="nn2" class="easyui-textbox" name="integerScore"/>
		</div>
		<input type="hidden" name="standardSn">
		<div class="input" id="button">
		<a id="submit" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">添 加</a> 
		<a id="reset" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-undo'">重 置</a>			
		</div>
	</form>
</body>
</html>