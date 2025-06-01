<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>

<%
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");

String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>九九JSP</title>
</head>
<body>
	<h1>九九JSP</h1>
	<p><%= today %>
	<table border="1">
	<% for(int i=9;i>=1;i--){ %>
		<tr>
			<%for(int j=9;j>=1;j--){ %>
			<td><%=i*j %></td>
			<%} %>
		</tr>
	<%} %>
	
</table>
<p><a href= index.html>もどる</a></p>
</body>
</html>