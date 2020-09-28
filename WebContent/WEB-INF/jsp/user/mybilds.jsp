<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
    <title>My builds</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

  <header>
		<div><h1><img src=${pageContext.request.contextPath}/image/pizza-slice.png> <a href="?page=main">Papa PIZZA</a></h1></div>
    <nav>
   <a href="FrontController?command=load_all">Catalog</a>
        <a href="FrontController?command=creation_build">Create builds</a>
   		<a href="FrontController?command=user_builds">My builds</a>		
   		<a href="FrontController?command=profile&id=<%=session.getAttribute("UserId")%>">Profile </a>
   		<a href="FrontController?command=logout">LogOut</a>
    </nav>   
  </header> 
  

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

<c:forEach var="elem" items="${list}" varStatus="status"><tr>
	<td><c:out value="${ elem.getUserName() }" /></td>
	<td><c:out value="${ elem.getProcessor() }" /></td>
	<td><c:out value="${ elem.getMotherBoadr() }" /></td>
	<td><c:out value="${ elem.getVideoCards() }" /></td> 
	<td><c:out value="${ elem.getRam() }" /></td>  
	<td><c:out value="${ elem.getComputerCase() }" /></td>  
	<td><c:out value="${ elem.getStorage() }" /></td> 
	<td><c:out value="${ elem.getPower() }" /></td>	
	<td><c:out value="${ elem.getComment() }" /></td></tr>  				
</c:forEach>
    </tr>
 </table>
 
  
        
<footer>
  &copy; JAVA EE
  </footer>     
</html>