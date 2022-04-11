<%@page import="mc.sn.wine.vo.vineyardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포도농장 정보 수정</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src = "resources/js/wine.js"></script>
</head>
<body>
<%vineyardVO vo = (vineyardVO)request.getAttribute("vo"); %>
<table>
	<tr>
		<td>vineyard_ID</td>
		<td><input type="text" readonly="readonly" id="vineyard_ID" value=<%=vo.getVineyard_ID()%>></td>
	</tr>
	<tr>
		<td>owner</td>
		<td><input type="text" id="owner" value=<%=vo.getOwner()%>></td>
	</tr>
	<tr>
		<td>address</td>
		<td><input type="text" id="address" value=<%=vo.getAddress()%>></td>
	</tr>
	<tr>
		<td>tel_number</td>
		<td><input type="text" id="tel_number"  value=<%=vo.getTel_number()%>></td>
	</tr>
	<tr>
		<td>inv_white</td>
		<td><input type="text" id="inv_white" value=<%=vo.getInv_white()%>></td>
	</tr>
	<tr>
		<td>inv_red</td>
		<td><input type="text" id="inv_red" value=<%=vo.getInv_red()%>></td>
	</tr>
	<tr>
		<td>money</td>
		<td><input type="text" id="money" value=<%=vo.getMoney()%>></td>
	</tr>
	<tr>
		<td><button id = "vineyardUpdate">수정</button></td>
		<td></td>
	</tr>
</table>
</body>
</html>