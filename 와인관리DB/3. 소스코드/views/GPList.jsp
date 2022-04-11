<%@page import="mc.sn.wine.vo.grapeProductionVO"%>
<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산 정보</title>
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
<%List<grapeProductionVO> GPList = (List)request.getAttribute("GPList");%>
<table>
	<tr><td>GP_ID</td><td>year</td><td>amount</td><td>field_ID</td><td>수정</td></tr>
	<%for(grapeProductionVO vo : GPList) {%>
		<tr>
			<td id="GP_ID"><%=vo.getGP_ID() %></td>
			<td id="year"><%=vo.getYear() %></td>
			<td id="amount"><%=vo.getAmount() %></td>
			<td id="field_ID"><%=vo.getField_ID() %></td>
			<td><a href="./GP_changeForm?GP_ID=<%=vo.getGP_ID() %>">수정</a></td>
		</tr>
	<%} %>
</table>

</body>
</html>