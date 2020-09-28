<%@page import="ru.rsreu.palagin0812.data.entity.Catalog"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List" %>



<%
List<Catalog> listProduct = (List<Catalog>)request.getAttribute("listCatalog");
int countItem = listProduct.size();
int row = countItem/4;

for (int i = 0; i<row; i++){
	%><div class="pricing-box-container"><% //открываем основной блок (блок строки)
		for (int j = 0; j<4; j++){
			Catalog currentProduct = listProduct.get(i*4+j);%>
			
			
		<div class="pricing-box text-center">
		<h5><%= currentProduct.getName()%></h5>
		<img class="image-row" src="${pageContext.request.contextPath}/image/pizza/<%=currentProduct.getPictureName()%>.png">
		<ul class="features-list">
			<li><strong>Состав: <%= currentProduct.getComponents()%></strong></li>
		<p class="price"><%= String.valueOf(currentProduct.getCost())%> р.</p>
		</ul>
		<button class="btn-primary">Добавить в корзину</button>
		</div>
		
		<% }%>
	</div><%
}
%>