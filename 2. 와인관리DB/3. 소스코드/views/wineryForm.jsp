<%@page import="java.util.List"%>
<%@page import="mc.sn.wine.vo.vineyardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src = "resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src = "resources/js/wine.js"></script>
<title>새로운 와인 양조장 등록</title>
</head>
<body>
<%List<vineyardVO> vineyardList = (List)request.getAttribute("vineyardList");%>
	<table>
		<tr>
			<td>winery_ID</td>
			<td><input type="text" id="winery_ID"></td>
		</tr>
		<tr>
			<td>owner</td>
			<td><input type="text" id="owner"></td>
		</tr>
		<tr>
			<td>address</td>
			<td><input type="text" id="address"></td>
		</tr>
		<tr>
			<td>tel_number</td>
			<td><input type="text" id="tel_number"></td>
		</tr>
		<tr>
			<td>money</td>
			<td><input type="text" id="money"></td>
		</tr>	
		<tr>
			<td>grade_ID</td>
			<td><input type="text" id="grade_ID"></td>
		</tr>
			<div class="chkclass">	
				<div>
					거래 가능한 포도 농장
				</div>	
			<%for(vineyardVO vo : vineyardList){
					%>	
				<div>
					<tr><input type="radio" name="vineyard" value=<%=vo.getVineyard_ID() %>><%=vo%></tr> <br>
				</div>
			<%} %>	
			</div>		
		<tr>
			<td><button id="wineryRegister">등록</button></td>
			<td></td>
		</tr>
	</table>
</body>
</html>