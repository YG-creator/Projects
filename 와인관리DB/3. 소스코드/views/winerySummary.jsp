<%@page import="mc.sn.wine.vo.tradeSumVO"%>
<%@page import="mc.sn.wine.vo.productionSumVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이너리 통계정보 요약</title>
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
<%productionSumVO vo = (productionSumVO)request.getAttribute("totalWP");
tradeSumVO vo1 = (tradeSumVO)request.getAttribute("totalWT");
int a = 0;
if(vo!=null){
	a = vo.getAmount();
}
int b = 0;
if(vo1!=null){
	b = vo.getAmount();
}%>
<table>
	<tr>
		<td>총 와인 생산량 : </td>
		<td><%=a %></td>
	</tr>
	<tr>
		<td>총 와인 거래량 : </td>
		<td><%=b %></td>
	</tr>
	
</table>
</body>
</html>