<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
#logo
{
    height: 50;
    padding: 5px;
	}
.dropdown:hover .dropdown-menu {
	display : block;
}
.margin{
margin-bottom: 50px;
}
.btn{
padding:8px;
}

</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">  
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Products<span class="caret"></span></a>
       <ul class="dropdown-menu">
          <li><a href="#">View Product</a></li>
          <li><a href="#">Add Product</a></li>
      </ul>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
       <ul class="dropdown-menu">
       <c:url value="/ViewCategory" var="ViewCategory"> </c:url>
          <li><a href="${ViewCategory}">View Category</a></li>
           <c:url value="/AddCategory" var="AddCategory"> </c:url>
          <li><a href="${AddCategory}">Add Category</a></li>
      </ul>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Supplier<span class="caret"></span></a>
       <ul class="dropdown-menu">
          <li><a href="#">View Supplier</a></li>
          <li><a href="#">New Supplier</a></li>
      </ul>
       <li><a href="#">Contact</a></li>
     <li><a href="#">About Us</a></li>
    </ul>
    <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search" name="search">
      </div>
      <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"></span></button>
      
    </form>
    <ul class="nav navbar-nav navbar-right">
    	
       	
    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Log-In<span class="caret"></span></a>
       <ul class="dropdown-menu">
       	<c:url value="/login" var="login"> </c:url>
       	<c:url value="/signup" var="signup"> </c:url>
          <li><a href="${login}"><span class="glyphicon glyphicon-log-in"></span> User-Login</a></li>
          <li><a href="#"></span> Admin-Login</a></li>
          <li><a href="${signup}"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
    </ul>
      </li>
        <c:url value="/cart" var="cart"></c:url>
    <li><a href="${cart}"><span class="glyphicon glyphicon-shopping-cart"></span> MyCart</a></li>
   </ul>
   </div>
</nav>
</body>
</html>