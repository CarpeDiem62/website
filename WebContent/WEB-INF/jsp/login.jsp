<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

		<jsp:include page="template/_header.jsp" />
  

<form name="loginForm" method="POST" action="FrontController">
			<input type="hidden" name="command" value="login" />
			<input type="text" name="name" placeholder="Укажите ваше имя!"  value="" />
			<input type="password" name="pass" placeholder="Укажите ваш пароль!" value="" />
    
			${errorLoginPassMessage} <br /> ${wrongAction} <br /> ${nullPage} <br />
			<input name="submit" class="btn" type="submit" value="Отправить" />
</form>
        
        
</body>
	<jsp:include page="template/_footer.jsp" /> 
</html>
