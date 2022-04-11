<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src = "resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src = "resources/js/wine.js"></script>
<title>생산량 등록</title>
</head>
<body>
	<table>
		<tr>
			<td>GP_ID</td>
			<td><input type="text" id="GP_ID"></td>
		</tr>
		<tr>
			<td>year</td>
			<td><input type="text" id="year"></td>
		</tr>
		<tr>
			<td>amount</td>
			<td><input type="text" id="amount"></td>
		</tr>
		<tr>
			<td id="field_ID" style="display:none">${field_ID}</td>
		</tr>
		<tr>
			<td><button id="grapeProductionRegister">등록</button></td>
			<td></td>
		</tr>
		
	</table>
</body>
</html>