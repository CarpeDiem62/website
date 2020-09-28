<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
 <head>
<meta charset="utf-8">
  <title>Create user</title>
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
    
    <form name="loginForm" method="POST" action="FrontController">
			<input type="hidden" name="command" value="create_user" />
			<input type="text" name="id" placeholder="Укажите id нового пользователя"  value="" />
			<input type="text" name="name" placeholder="Укажите имя нового пользователя"  value="" />
			<input type="text" name="pass" placeholder="Укажите пароль нового пользователя" value="" />
			<label>Выбирете уровень доступа</label>
			<select name="access" > 
			  <option value="1">User</option>
  				<option value="0">Admin</option>
			</select>
    
			<input name="submit" class="btn" type="submit" value="Создать" />
	</form>
  
 </body>
 <footer>
  &copy; JAVA EE
  </footer> 
</html>