<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Catalog</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

	<jsp:include page="template/_header.jsp" />
 

 <table class="info">
   <tr>
    <th>Автор</th>
    <th>Процессор</th>
    <th>Материнская плата</th>
    <th>Видеокарта</th>
    <th>Оперативная память</th>
    <th>Корпус</th>
    <th>Устройство хранения</th>
    <th>Блок питания</th>
	<th>Комментарий</th>   
   </tr>
   <tr>

<c:forEach var="build" items="${listBuilds}"><tr>
	<td>${build.getUserName()}</td>
	<td>"${build.getProcessor()}</td>
	<td>"${build.getMotherBoadr()}</td>
	<td>${build.getVideoCards()}</td> 
	<td>${build.getRam()}</td>  
	<td>${build.getComputerCase()}</td>  
	<td>${build.getStorage()}</td> 
	<td>${build.getPower()}</td>	
	<td>${build.getComment()}</td></tr>  					
</c:forEach>
    </tr>
 </table>
 
  
        
	<jsp:include page="template/_footer.jsp" />   
</html>