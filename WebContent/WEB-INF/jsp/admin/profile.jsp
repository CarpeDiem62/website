<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Profile user</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

	<header>
		<div><h1><img src=${pageContext.request.contextPath}/image/pizza-slice.png> <a href="?page=main">Papa PIZZA</a></h1></div>
		<nav>
		
			<a href="FrontController?page=create_user">Create User</a> <a
				href="FrontController?command=users_list">List User</a> <a
				href="FrontController?command=load_all">List Builds</a> <a
				href="FrontController?command=logout">LogOut</a>
		</nav>
	</header>

	<div>
		<img
			src="https://im0-tub-ru.yandex.net/i?id=f4cb173b082e8c7bd9ab8941a0d27f4d-l&n=13"
			width="10%" height="20%">
	</div>
	<a>User ${user.getName()}</a>


	<form name="loginForm" method="POST" action="FrontController">
		<input type="hidden" name="command" value="change_user_info" /> <input
			type="hidden" name="id" value="${user.getId()}" /> <label>Имя
			пользователя</label> <input type="text" name="name" value="${user.getName()}" />
		<label>Пароль пользователя</label> <input type="text" name="pass"
			value="${user.getPass()}" /> <label>Уровень доступа</label> <select
			name="access">
			<option value="1">User</option>
			<option value="0">Admin</option>
		</select> <input name="submit" class="btn" type="submit" value="Изменить" />
	</form>


</body>
<footer> &copy; JAVA EE </footer>
</html>