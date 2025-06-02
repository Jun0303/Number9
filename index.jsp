<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP版電卓</title>
</head>
<body>
	<h1>JSP版電卓</h1>
	
	<form action="CalcJSP" method="post">
		 <input type="text" name="inputData1">
		 <select name="operator">
		  <option value="+">+</option>
		  <option value="-">-</option>
		  <option value="*">×</option>
		  <option value="/">/</option>
		</select>
		 <input type="text" name="inputData2">
		 <input type="submit" value="送信">
	</form>
</body>
</html>