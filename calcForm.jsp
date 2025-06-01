<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet版電卓</title>
</head>
<body>
	<h1>Serblet版電卓</h1>
	<form action = "Calc" method = "post">
		<input type = "number" name = "input1">
		<select name="symbol">
		  <option value="+">+</option>
		  <option value="-">-</option>
		  <option value="*">×</option>
		  <option value="/">/</option>
		</select>
		<input type = "number" name = "input2"><br>
		<input type = "submit" value = "送信">
	</form>
</body>
</html>