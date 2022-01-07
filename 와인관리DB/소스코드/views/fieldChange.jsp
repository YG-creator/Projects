<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밭 정보 수정</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
</head>
<body>
<table>
	<tr>
		<td>"field_ID"</td>
		<td><input type="text" readonly="readonly" id="field_ID" value=${vo.field_ID }></td>
	</tr>
	<tr>
		<td>location</td>
		<td><input type="text" id="location" value=${vo.location }></td>
	</tr>
	<tr>
		<td>area</td>
		<td><input type="text" id="area" value=${vo.area }></td>
	</tr>
	<tr>
		<td>variety</td>
		<td><input type="text" id="variety" value=${vo.variety }></td>
	</tr>
	<tr>
		<td>vineyard_ID</td>
		<td><input type="text" id="vineyard_ID" value=${vo.vineyard_ID }></td>
	</tr>
	<tr>
		<td><input type="button" id = "fieldUpdate" value = "수정"></td>
		<td></td>
	</tr>
</table>
</body>
</html>