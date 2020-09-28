<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <title>List users</title>
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
    <th>Id</th>
    <th>Логин пользователя</th>
    <th>Пароль</th>
    <th>Группа</th>
    <th>Активность</th> 
    <th>Функции</th> 
   </tr>
   <tr>

<c:forEach var="elem" items="${list}" varStatus="status"><tr>
	<td><c:out value="${ elem.getId() }" /></td>
	<td><a href="FrontController?command=profile&id=${ elem.getId()}"><c:out value="${ elem.getName() }" /></a></td>
	<td><c:out value="${ elem.getPass() }" /></td>
	<td><c:out value="${ elem.getGroup() }" /></td> 
	<c:if test="${elem.getActived() == 0}">
            <td bgcolor="#996666">Неактивен</td>
     </c:if> 
     <c:if test="${elem.getActived() == 1}">
            <td bgcolor="#00FF66">На сайте</td>
     </c:if>     
	<td>
	<form name="catalog" method="POST" action="FrontController">	
	<button>Удалить</button> 
	<input type="hidden" name="type" value="user"/>
	<input type="hidden" name="id" value="${ elem.getId() }"/>
	<input type="hidden" name="command" value="delete" />
	</form>	
	<form name="catalog" method="POST" action="FrontController">
	<button>Изменить</button> 
	<input type="hidden" name="type" value="user"/>
	<input type="hidden" name="id" value="${ elem.getId() }"/>
	<input type="hidden" name="command" value="profile" />

	</form>	
	</td>
	</tr>
</c:forEach>
    </tr>
 </table>
 
  
        
<footer>
  &copy; JAVA EE
  </footer>     
</html>