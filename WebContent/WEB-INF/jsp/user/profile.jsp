<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta charset="UTF-8">
    <title>Profile</title>
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
  
  <div><img src="https://im0-tub-ru.yandex.net/i?id=f4cb173b082e8c7bd9ab8941a0d27f4d-l&n=13" width="10%" height="20%"></div>
    <a>Its you, ${user.getName()}	!</a>
         

        
</body>
  <footer>
  &copy; JAVA EE
  </footer>
</html>