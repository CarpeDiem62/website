<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<link href=${pageContext.request.contextPath}/css/slider.css rel="stylesheet" type="text/css">


  <div class="slider">
    <div class="slider__wrapper">
      <div class="slider__item">
       <a href="#"><img src=${pageContext.request.contextPath}/image/1.png></a>
      </div>
      <div class="slider__item">
       <a href="#"><img src=${pageContext.request.contextPath}/image/2.jpeg></a>
      </div>
      <div class="slider__item">
       <a href="#"><img src=${pageContext.request.contextPath}/image/3.jpeg></a>
      </div>
    </div>
    <a class="slider__control slider__control_left" href="#" role="button"></a>
    <a class="slider__control slider__control_right slider__control_show" href="#" role="button"></a>
  </div>
    
  <script src=${pageContext.request.contextPath}/JS/slider.js></script>