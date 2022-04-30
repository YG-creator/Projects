<%@page import="mc.sn.wine.vo.grapeProductionVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
<title>생산내역 수정</title>
</head>
<body>
<table>
	<tr>
		<td>GP_ID : </td>
		<td><input type="text" id="GP_ID" value=${vo.GP_ID } readonly="readonly" ></td>
	</tr>
	<tr>
		<td>year : </td>
		<td><input type="text" id="year" value=${vo.year } ></td>
	</tr>
	<tr>
		<td>amount : </td>
		<td><input type="text" id="amount" value=${vo.amount } ></td>
	</tr>
	<tr>
		<td>field_ID : </td>
		<td><input type="text" id="field_ID" value=${vo.field_ID } ></td>
	</tr>
	<tr>
		<td><button id="GP_update">수정</button></td>
		<td></td>
	</tr>
	
	
</table>
</body>
</html>