<%@ include file="header.jsp"%>
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
body {
background: white;
	color: white;
	font-family: Arial;
	font-size: 12px;
	background-image: url("http://coolwallpaperz.info/user-content/uploads/wall/o/74/abstract-vector-wide-and-hd-black-79553.jpg");

}
label{
	color: white;
}
</style>
<title>Login</title>
</head>
<body>
<br> <br> <br>
<br> <br> <br>
<form class="form-horizontal" action="isvaliduser" method="post">
  <div class="form-group">
    <label class="control-label col-sm-offset-2 col-sm-3" for="email">Email:</label>
    <div class="col-sm-3">
      <input type="email" class="form-control" name="email" id="email" placeholder="Enter email" required>
    </div>
  </div>
  <div class="form-group">
    <label class="control-label col-sm-offset-2 col-sm-3" for="pwd">Password:</label>
    <div class="col-sm-3"> 
      <input type="password" class="form-control" name="pwd" id="pwd" placeholder="Enter password" required>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-5 col-sm-3">
      <div class="checkbox">
        <label><input type="checkbox"> Remember me</label>
      </div>
    </div>
  </div>
  <div class="form-group"> 
    <div class="col-sm-offset-5 col-sm-3">
      <button type="submit" class="btn btn-dark" id="subbutton">Login</button>
      <c:url value="/signup" var="register"></c:url>
	  <u><a href="${register}">New User?</a></u><br>
    </div>
  </div>
</form>
<br> <br> <br>
<br> <br> <br>
<br> <br> <br>
<br> <br> <br>
</body>
<%@ include file="footer.jsp"%>
<