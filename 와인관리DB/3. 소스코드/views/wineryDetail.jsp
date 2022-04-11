<%@page import="java.util.List"%>
<%@page import="mc.sn.wine.vo.inventorySumVO"%>
<%@page import="mc.sn.wine.vo.productionSumVO"%>
<%@page import="mc.sn.wine.vo.tradeSumVO"%>
<%@page import="mc.sn.wine.vo.wineryVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이너리 상세 정보</title>

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
<%wineryVO vo = (wineryVO)request.getAttribute("vo");
List<tradeSumVO> tradeSumList = (List)request.getAttribute("tradeSumList");
List<productionSumVO> productionSumList = (List)request.getAttribute("productionSumList");
List<inventorySumVO> inventorySumList = (List)request.getAttribute("inventorySumList");
List<productionSumVO> productionSumList2 = (List)request.getAttribute("productionSumList2");
List<tradeSumVO> tradeSumList2 = (List)request.getAttribute("tradeSumList2");
%>

<table>
	<tr>
		<td>winery_ID : </td>
		<td><%=vo.getWinery_ID() %></td>
	</tr>
	<tr>
		<td>owner : </td>
		<td><%=vo.getOwner() %></td>
	</tr>
	<tr>
		<td>address : </td>
		<td><%=vo.getAddress() %></td>
	</tr>
	<tr>
		<td>tel_number : </td>
		<td><%=vo.getTel_number() %></td>
	</tr>
	<tr>
		<td>inv_white : </td>
		<td><%=vo.getInv_white() %></td>
	</tr>
	<tr>
		<td>inv_red : </td>
		<td><%=vo.getInv_red() %></td>
	</tr>
	<tr>
		<td>money : </td>
		<td><%=vo.getMoney() %></td>
	</tr>
	<tr>
		<td>grade_ID : </td>
		<td><%=vo.getGrade_ID() %></td>
	</tr>
	<tr>
		<td>vineyard_ID : </td>
		<td><%=vo.getVineyard_ID() %></td>
	</tr>
	<tr>
		<td><a href="./winery_changeForm?winery_ID=<%=vo.getWinery_ID()%>">수정</a></td>
	</tr>	
</table>
<br>

<table>
	<tr>
		<td colspan="2">와인 판매량</td>
	</tr>
	<tr>
		<td>category_ID</td>
		<td>amount</td>
	</tr>
	<%for(tradeSumVO vo1 : tradeSumList){ %>
	<tr>
		<td><%=vo1.getCategory_ID() %></td>
		<td><%=vo1.getAmount() %></td>
	</tr>
	<%} %>
</table>
<br>

<table>
	<tr>
		<td colspan="2">와인 생산량</td>
	</tr>
	<tr>
		<td>category_ID</td>
		<td>amount</td>
	</tr>
	<%for(productionSumVO vo2 : productionSumList){ %>
	<tr>
		<td><%=vo2.getCategory_ID() %></td>
		<td><%=vo2.getAmount() %></td>
	</tr>
	<%} %>
</table>
<br>

<table>
	<tr>
		<td colspan="2">와인 재고량</td>
	</tr>
	<tr>
		<td>category_ID</td>
		<td>amount</td>
	</tr>
	<%for(inventorySumVO vo3 : inventorySumList){ %>
	<tr>
		<td><%=vo3.getCategory_ID() %></td>
		<td><%=vo3.getAmount() %></td>
	</tr>
	<%} %>
</table>
<br>

<table>
	<tr>
		<td colspan="2">올해의 와인 생산 목록</td>
	</tr>
	<tr>
		<td>category_ID</td>
		<td>amount</td>
	</tr>
	<%for(productionSumVO vo4 : productionSumList2){ %>
	<tr>
		<td><%=vo4.getCategory_ID()%></td>
		<td><%=vo4.getAmount()%></td>
	</tr>
	<%} %>
</table>
<br>

<table>
	<tr>
		<td colspan="2">올해의 와인 판매 목록</td>
	</tr>
	<tr>
		<td>category_ID</td>
		<td>amount</td>
	</tr>
	<%for(inventorySumVO vo5 : inventorySumList){ %>
	<tr>
		<td><%=vo5.getCategory_ID()%></td>
		<td><%=vo5.getAmount()%></td>
	</tr>
	<%} %>
</table>
<br>

<table>
	<tr>
		<td><a href="./buyNewGrapeForm?winery_ID=<%=vo.getWinery_ID()%>">구매</a></td>
		<td><a href="./WPForm?winery_ID=<%=vo.getWinery_ID()%>">생산</a></td>
		<td><a href="./WTForm?winery_ID=<%=vo.getWinery_ID()%>">판매</a></td>
		<td><a href="./WPChange?winery_ID=<%=vo.getWinery_ID()%>">생산내역 수정</a></td>
		<td><a href="./WTChange?winery_ID=<%=vo.getWinery_ID()%>">판매내역 수정</a></td>
	</tr>
</table>
</body>
</html>