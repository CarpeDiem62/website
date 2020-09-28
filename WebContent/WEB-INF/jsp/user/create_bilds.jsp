<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="Windows-1251">
<title>Create builds</title>
	<link href=${pageContext.request.contextPath}/css/FormStyle.css rel="stylesheet" type="text/css">
	<link href=${pageContext.request.contextPath}/css/mysite.css rel="stylesheet" type="text/css">
</head>

<body>

	<header>
		<div><h1><img src=${pageContext.request.contextPath}/image/pizza-slice.png> <a href="?page=main">Papa PIZZA</a></h1></div>
		<nav>

			<a href="FrontController?command=load_all">Catalog</a> <a
				href="FrontController?command=creation_build">Create builds</a> <a
				href="FrontController?command=user_builds">My builds</a> <a
				href="FrontController?command=profile&id=<%=session.getAttribute("UserId")%>">Profile
			</a> <a href="FrontController?command=logout">LogOut</a>
		</nav>
	</header>




	<form name="loginForm" method="POST" action="FrontController">

		<input type="hidden" name="command" value="create_build" /> <input
			type="hidden" name="id" value="<%=session.getAttribute("UserId")%>" />

		<a>ID сборки</a>
		<p>
			<input class="input" name="id_build" value="" />
		</p>

		<a>Материнская плата</a>
		<p>
			<select name="motherboard">
				<c:forEach var="elemMotherBoard" items="${motherBoards}">
					<option value="${elemMotherBoard.getId()}">${elemMotherBoard.getName()}</option>
				</c:forEach>
			</select>
		</p>

		<br> <a>Процессор</a>
		<div>
			<select name="processor">
				<c:forEach var="elemProcessor" items="${processors}">
					<option value="${elemProcessor.getId()}">${elemProcessor.getName()}</option>
				</c:forEach>
			</select>
		</div>

		<br> <a>Видеокарта</a>
		<div>
			<select name="videocard">
				<c:forEach var="elemVideoCard" items="${videoCards}">
					<option value="${elemVideoCard.getId()}">${elemVideoCard.getName()}</option>
				</c:forEach>
			</select>
		</div>

		<br> <a>Оперативная память</a>
		<div>
			<select name="ram">
				<c:forEach var="elemRAM" items="${ram}">
					<option value="${elemRAM.getId()}">${elemRAM.getName()}</option>
				</c:forEach>
			</select>
		</div>

		<br> <a>Хранение данных</a>
		<div>
			<select name="datastorage">
				<c:forEach var="elemDataStorage" items="${dataStorage}">
					<option value="${elemDataStorage.getId()}">${elemDataStorage.getName()}</option>
				</c:forEach>
			</select>
		</div>

		<br> <a>Блок питания</a>
		<div>
			<select name="powersypply">
				<c:forEach var="elemPower" items="${powerSupply}">
					<option value="${elemPower.getId()}">${elemPower.getName()}</option>
				</c:forEach>
			</select>
		</div>

		<br> <a>Корпус</a>
		<div>
			<select name="casing">
				<c:forEach var="elemCasing" items="${casing}">
					<option value="${elemCasing.getId()}">${elemCasing.getName()}</option>
				</c:forEach>
			</select>
		</div>
		<a>Комментарий</a>
		<p>
			<input class="inpt" name="comment" value="" />
		</p>

		<input name="submit" class="btn" type="submit" value="Создать" />

	</form>




	<footer> &copy; JAVA EE </footer>
</body>
</html>