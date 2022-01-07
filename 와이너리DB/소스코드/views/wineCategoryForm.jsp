<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src = "resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src = "resources/js/wine.js"></script>
<title>와인종류테이블(WineCategory) 정보 등록</title>
</head>
<body>
	<table>
		<tr>
			<td>category_ID</td>
			<td><input type="text" id="category_ID"></td>
		</tr>
		<tr>
			<td>title</td>
			<td><input type="text" id="title"></td>
		</tr>
		<tr>
			<td>standardPrice</td>
			<td><input type="text" id="standardPrice"></td>
		</tr>
		<tr>
			<td><button id="wineCategoryRegister">등록</button></td>
			<td></td>
		</tr>		
	</table>
</body>
</html>