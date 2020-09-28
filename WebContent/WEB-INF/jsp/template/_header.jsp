<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
   <header>
   
	<div><h1><img src=${pageContext.request.contextPath}/image/pizza-slice.png> <a href="?command=main">Papa PIZZA</a></h1></div>
<nav>		
<%
String role = "";
int setRole = 0;
try {
	role = session.getAttribute("role").toString();

	if (role.equals("ADMIN"))
	{
		setRole = 1;
	}
	else if (role.equals("EMPLOYEE")){
		setRole = 2;
	}
	else if (role.equals("USER")){
		setRole = 3;
	}	
}
catch(Exception e) {  //Роль не установлена - значит обычный пользователь
	setRole = 0;
}   
	
	switch(setRole){
	   case 1: %>   
			<a href="#">Пользователи</a>
			<a href="#">Сотрудники</a>
			<a href="#">Промокоды</a>
			<a href="FrontController?command=logout">Выход</a>
		<%
		break;
	   case 2:%>
	  
			<a href="#">Заказы</a>
			<a href="FrontController?command=logout">Выход</a>
		<%
		break;
	   case 3:%>
	   
			<a href="#">Меню</a>
			<a href="#">Акции</a>
			<a href="#">Корзина</a>
			<a href="#">Заказы</a>
			<a href="#">Профиль</a>
			<a href="FrontController?command=logout">Выход</a>
		<%	
		break;
	   case 0:%>
			<a href="FrontController?command=load_all">Меню</a>
			<a href="#">Акции</a>
			<a href="#">Корзина</a>
			<a href="FrontController?page=login">Вход</a>
		<%	
		break;}
%>
		
</nav>
		
</header>