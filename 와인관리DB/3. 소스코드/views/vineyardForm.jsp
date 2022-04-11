<%@page import="java.util.List"%>
<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새로운 포도농장 등록</title>
<script type="text/javascript" src = "resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src = "resources/js/wine.js"></script>
</head>
<body>
<%List<fieldVO> emptyFieldList = (List)request.getAttribute("emptyFieldList");%>
	<table>
		<tr>
			<td>vineyard_ID</td>
			<td><input type="text" id="vineyard_ID"></td>
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
			<div class="chkclass">	
				<div>
					소유 가능한 밭
				</div>	
				<%for(fieldVO vo : emptyFieldList){
						%>	
					<div>
						<input type="checkbox" name="field" value=<%=vo.getField_ID() %>><%=vo%>
					</div>
				<%} %>
			</div>

		<tr>
			<td><button id="vineyardRegister">등록</button></td>
			<td></td>
		</tr>
	</table>
</body>
</html>