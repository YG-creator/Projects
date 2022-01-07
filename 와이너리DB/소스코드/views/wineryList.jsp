<%@page import="mc.sn.wine.vo.wineryVO"%>
<%@page import="mc.sn.wine.vo.vineyardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이너리 리스트</title>
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
<%List<wineryVO> wineryList = (List)request.getAttribute("wineryList");%>
<table>
	<tr><td>winery_ID</td><td>통계요약</td></tr>
	<%for(wineryVO vo : wineryList) {%>
		<tr>
			<td><a href="./winery_detail?winery_ID=<%=vo.getWinery_ID()%>"><%=vo.getWinery_ID() %></a></td>
			<td><a href="./winery_summary?winery_ID=<%=vo.getWinery_ID()%>">요약</a></td>
		</tr>
	<%} %>
</table>

</body>
</html>