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
</head>
<body>
<%List<WTVO> WTList=(List)request.getAttribute("WTList"); %>
<table>
<tr>판매내역</tr>
<%for(WTVO vo : WTList){ %>
	<tr>
		<td><%=vo %></td>
		<td><a href="./WTChangeForm?WT_ID=<%=vo.getWT_ID()%>&winery_ID=${winery_ID}">수정</a></td>
	</tr>
<%} %>
</table>
</body>
</html>