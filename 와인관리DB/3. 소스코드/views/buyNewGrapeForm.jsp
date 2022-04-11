<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포도 구매</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
</head>
<body>
<table>
	<tr>
		<td colspan="2">winery 포도 재고</td>
		<td></td>
	</tr>
	<tr>
		<td>화이트 : </td>
		<td>${winery.inv_white }</td>
	</tr>
	<tr>
		<td>레드 : </td>
		<td>${winery.inv_red }</td>
	</tr>	
</table>

<table>
	<tr>
		<td colspan="2">vineyard 포도 재고</td>
		<td></td>
	</tr>
	<tr>
		<td>화이트 : </td>
		<td>${vineyard.inv_white }</td>
	</tr>
	<tr>
		<td>레드 : </td>
		<td>${vineyard.inv_red }</td>
	</tr>	
</table>


<table>
	<tr>
		<td colsapn="2">포도 구매 갯수</td>
		<td></td>
	</tr>
	<tr>
		<td>화이트 : </td>
		<td><input  id="inv_white" type="number" min="0" max=${vineyard.inv_white }></td>
	</tr>
	<tr>
		<td>레드 : </td>
		<td><input id="inv_red" type="number" min="0" max=${vineyard.inv_red }></td>
	</tr>
	<tr>
		<td><input type="hidden" id="winery_ID" value=${winery_ID } ></td>
		<td><button id="buyGrape">구매</button></td>
	</tr>
</table>

</body>
</html>