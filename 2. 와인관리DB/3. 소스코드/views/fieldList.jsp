<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밭 상세 출력</title>
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
<%List<fieldVO> fieldList = (List)request.getAttribute("fieldList");%>
<table>
	<tr><td>field_ID</td></tr>
	<%for(fieldVO vo : fieldList) {%>
		<tr>
			<td><a href="./fieldDetail?field_ID=<%=vo.getField_ID()%>"><%=vo.getField_ID() %></a></td>
		</tr>
	<%} %>
</table>

</body>
</html>