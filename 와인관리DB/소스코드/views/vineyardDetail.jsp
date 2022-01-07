<%@page import="mc.sn.wine.vo.grapeProductionVO"%>
<%@page import="java.util.List"%>
<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포도농장 상세 정보</title>
<style>
  table {
    width: 30%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
</head>
<body>
<table>
	<tr>
		<td>vineyard_ID : </td>
		<td>${vo.vineyard_ID }</td>
	</tr>
	<tr>
		<td>owner : </td>
		<td>${vo.owner }</td>
	</tr>
	<tr>
		<td>address : </td>
		<td>${vo.address }</td>
	</tr>
	<tr>
		<td>tel_number : </td>
		<td>${vo.tel_number }</td>
	</tr>
	<tr>
		<td>inv_white : </td>
		<td>${vo.inv_white }</td>
	</tr>
	<tr>
		<td>inv_red : </td>
		<td>${vo.inv_red }</td>
	</tr>
	<tr>
		<td>money : </td>
		<td>${vo.money}</td>
	</tr>
	<tr>
		<td>올해 포도 생산량 : </td>
		<%grapeProductionVO vo1 = (grapeProductionVO)request.getAttribute("vo1");
		int amount = 0;
		if(vo1!=null){
			amount = vo1.getAmount();
		}%>
		<td><%=amount %></td>
	</tr>
	<tr>
		<td colspan="2">소유한 밭 리스트</td>
	</tr>
	<%List<fieldVO> fieldList = (List)request.getAttribute("fieldList"); %>
	<%for(fieldVO vo2 : fieldList){ %>
	<tr>
		<td colspan="2"><%=vo2 %></td>
	</tr>
	<%} %>
	<tr>
		<td><a href="./vineyardChange?vineyard_ID=${vo.vineyard_ID }">수정</a></td>
	</tr>
</table>
</body>
</html>