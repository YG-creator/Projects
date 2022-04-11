<%@page import="mc.sn.wine.vo.WTVO"%>
<%@page import="mc.sn.wine.vo.WPVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매내역 수정</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
</head>
<body>
<%WTVO vo = (WTVO)request.getAttribute("vo"); %>
<table>
	<tr>
		<td>WT_ID : </td>
		<td><input type="text" id="WT_ID" value=<%=vo.getWT_ID() %> readonly="readonly"></td>
	</tr>
	<tr>
		<td>category_ID : </td>
		<td><input type="text" id="category_ID" value=<%=vo.getCategory_ID() %>></td>
	</tr>
	<tr>
		<td>year : </td>
		<td><input type="text" id="year" value=<%=vo.getYear() %>></td>
	</tr>
	<tr>
		<td>amount : </td>
		<td><input type="text" id="amount" value=<%=vo.getAmount() %>></td>
	</tr>
	<tr>
		<td>winery_ID : </td>
		<td><input type="text" id="winery_ID" value=<%=vo.getWinery_ID() %>></td>
	</tr>
	<tr>
		<td><button id="WTUpdate">수정</button></td>
		<td></td>
	</tr>
</table>
</body>
</html>