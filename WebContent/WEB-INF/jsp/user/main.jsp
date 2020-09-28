<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>



<body>

<jsp:include page="../template/_header.jsp" /> 
	<h1 class="default">
		<c:out value="${condition}" />
	</h1>
	<h1 class="authorization">Страница авторизованного пользователя</h1>
</body>
<footer> &copy; JAVA EE </footer>
</html>