<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="${pageContext.request.contextPath}/update" method="post">
    <input type="hidden" name="aid" value="${param.aid }"/>
    <div align="center">标题:<input type="text" name="title" size="40" maxlength="50" value=${param.title }></div>
    <div align="center" style="margin-top:5px">内容:<textarea name="content" rows="30" cols="30">${param.content}</textarea></div>
    <div align="center" style="margin-top:5px">
      <input type="submit" value="提交"/>
      <input type="reset" value="重置"/>
    </div>
    </form>
  </body>
</html>
