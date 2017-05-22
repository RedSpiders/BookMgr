<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link type="text/css" rel="stylesheet" href="common/easyui/themes/default/easyui.css">
	<link type="text/css" rel="stylesheet" href="common/easyui/themes/icon.css">
	<script type="text/javascript" src="common/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="common/easyui/jquery.easyui.min.js"></script>
	
	<script type="text/javascript">
	
		
		function logion(){
		var username = $("#txtUsrname").val();
		var password = $("#password").val();
		
		$.get("login");
		
// 			checkinp(username,password);
// 			$.ajax({
// 				url:"login",
// 				cache:false,
// 				async:false,
// 				data:{
// 					"username":username,
// 					"password":password
// 				}
// 				,
// 				success:function(res){
// 					alert(res);
// 					if(res != "success"){
// 						alert("请检查用户名和密码");
// 					}
// 				}
// 			});
			}
		function checkinp(username,password){
			if(username == null || username == "" ){
				alert("用户名不能为空!");
				return;
			}
			if(password == null || password == "" ){
				alert("密码不能为空!");
				return;
			}
		}
	</script>
	
  </head>
  
  <body>
  	<form action="login">
   	<div>
   		<div>
   			<ul>
   				<li>用户名：
   				<input id="txtUsrname" class="easyui-textbox"  type="text"/></li>
   			</ul>
   			<ul>
   				<li>密&nbsp;&nbsp;&nbsp;码：
   				<input id="password" class="easyui-textbox"  type="password"/></li>
   			</ul>
   			<ul>
   				<li></li>
   				<li>
   					<div>
   						<button id="login" class="btn" onclick="logion()">登录</button>
   						<button id="reset" class="btn">重置</button>
   					</div>
   				</li>
   			</ul>
   		</div>
   		<div>
   			
   		</div>
   	</div>
   	</form>
  </body>
</html>
