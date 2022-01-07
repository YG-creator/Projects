<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산 등록</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
</head>
<body>
<%String winery_ID = (String)request.getAttribute("winery_ID"); %>
<table>
	<tr>
		<td>WP_ID : </td>
		<td><input type="text" id="WP_ID"></td>
	</tr>
	<tr>
		<td>category_ID : </td>
		<td><input type="text" id="category_ID"></td>
	</tr>	
	<tr>
		<td>year : </td>
		<td><input type="text" id="year"></td>
	</tr>	
	<tr>
		<td>amount : </td>
		<td><input type="text" id="amount"></td>
	</tr>	
	<tr>
		<td>winery_ID : </td>
		<td><input type="text" id="winery_ID" value=<%=winery_ID %> readonly="readonly"></td>
	</tr>
	<tr>
		<td><button id="WPRegister">등록</button></td>
		<td></td>
	</tr>	
</table>
</body>
</html>