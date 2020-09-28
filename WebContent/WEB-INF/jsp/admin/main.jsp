<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>Main</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>



<body>

	<jsp:include page="../template/_header.jsp" /> 
	
	
	
	<h1 class="info_admin">
		<c:out value="${condition}" />
	</h1>

</body>

<jsp:include page="../template/_footer.jsp" /> 
</html>