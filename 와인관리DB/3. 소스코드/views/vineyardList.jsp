<%@page import="mc.sn.wine.vo.vineyardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포도농장 상세 출력</title>
<style>
  table {
    width: 40%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
</head>
<body>
<%List<vineyardVO> vineyardList = (List)request.getAttribute("vineyardList");%>
<table>
	<tr><td>vineyard_ID</td><td>owner</td><td>address</td><td>tel_nuber</td><td>inv_white</td><td>inv_red</td><td>money</td>
	<td>요약</td>
	</tr>
	<%for(vineyardVO vo : vineyardList) {%>
		<tr>
			<td id="vineyard_ID" style="display:none"><%=vo.getVineyard_ID() %></td>
			<td><a href="vineyard_detail?vineyard_ID=<%=vo.getVineyard_ID() %>"><%=vo.getVineyard_ID() %></a></td>
			<td id="owner"><%=vo.getOwner() %></td>
			<td id="address"><%=vo.getAddress() %></td>
			<td id="tel_number"><%=vo.getTel_number() %></td>
			<td id="inv_white"><%=vo.getInv_white() %></td>
			<td id="inv_red"><%=vo.getInv_red() %></td>
			<td id="money"><%=vo.getMoney() %></td>
			<td><a href="./vineyardSummary?vineyard_ID=<%=vo.getVineyard_ID()%>">요약</a></td>
			
			<%-- <td><a href="./vineyardChange?vineyard_ID=<%=vo.getVineyard_ID()%>">수정</a></td> --%>
		</tr>
	<%} %>
</table>

</body>
</html>