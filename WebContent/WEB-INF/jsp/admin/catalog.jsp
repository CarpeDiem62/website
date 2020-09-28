<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>Catalog</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

  <header>
		<div><h1><img src=${pageContext.request.contextPath}/image/pizza-slice.png> <a href="?page=main">Papa PIZZA</a></h1></div>
    <nav>
        <a href="FrontController?page=create_user">Create User</a>
        <a href="FrontController?command=users_list">List User</a>
   		<a href="FrontController?command=load_all">List Builds</a>	
   		<a href="FrontController?command=logout">LogOut</a>

    </nav>   
  </header> 
 

 <table>
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
	<th>Функции</th>   
   </tr>
   <tr>

<c:forEach var="build" items="${listBuilds}"><tr>
	<td>${build.getUserName()}</td>
	<td>${build.getProcessor()}</td>
	<td>${build.getMotherBoadr()}</td>
	<td>${build.getVideoCards()}</td> 
	<td>${build.getRam()}</td>  
	<td>${build.getComputerCase()}</td>  
	<td>${build.getStorage()}</td> 
	<td>${build.getPower()}</td>	
	<td>${build.getComment()}</td>
	<td>
	<form name="catalog" method="POST" action="FrontController">
	<button>Удалить</button> 
	<input type="hidden" name="type" value="config"/>
	<input type="hidden" name="id" value="${build.getIdBuild() }"/>
	<input type="hidden" name="command" value="delete" />
	</form>	
	</td>
	</tr>
</c:forEach>
    </tr>
 </table>
 
</body>  
        
<footer>
  &copy; JAVA EE
  </footer>     
</html>