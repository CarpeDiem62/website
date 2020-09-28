<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
 <head>

  <title>Main</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">

	<link href=${pageContext.request.contextPath}/css/TableStyle.css rel="stylesheet" type="text/css">
 </head>
 
 
<!--#include virtual="include/header.txt"-->
 <body>	
 
<jsp:include page="template/_header.jsp" /> 

<jsp:include page="template/_sliderMain.jsp" /> 
  
<jsp:include page="template/_catalog.jsp" />



<h1 class="no_authorization">Страница неавторизованного пользователя</h1>
 </body>
<jsp:include page="template/_footer.jsp"/> 
</html>