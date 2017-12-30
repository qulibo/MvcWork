<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
   	<a href="add.jsp">新增</a><br/>
   	<c:forEach var="tmp" items="${requestScope.arcList}">
   	  <font color=green>${pageScope.tmp.title}</font><br/>
   	  ${pageScope.tmp.content} 
   	  <a href="${pageContext.request.contextPath}/delete?aid=${pageScope.tmp.aid}">删除</a>
      <a href="${pageContext.request.contextPath}/update.jsp?aid=${pageScope.tmp.aid}&title=${pageScope.tmp.title}&content=${pageScope.tmp.content}">修改</a>
      <br/>
   	  ---------------------------------------------------------------------------------<br/>
   	</c:forEach>
  </body>
</html>
