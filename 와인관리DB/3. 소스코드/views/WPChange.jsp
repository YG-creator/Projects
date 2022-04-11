<%@page import="mc.sn.wine.vo.WTVO"%>
<%@page import="mc.sn.wine.vo.WPVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산내역</title>
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
<%List<WPVO> WPList=(List)request.getAttribute("WPList"); %>
<table>
<tr>생산내역</tr>
<%for(WPVO vo : WPList){ %>
	<tr>
		<td><%=vo %></td>
		<td><a href="./WPChangeForm?WP_ID=<%=vo.getWP_ID()%>&winery_ID=${winery_ID}">수정</a></td>
	</tr>
<%} %>
</table>
</body>
</html>