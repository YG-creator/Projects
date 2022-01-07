<%@page import="mc.sn.wine.vo.vineyardVO"%>
<%@page import="mc.sn.wine.vo.fieldVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새로운 밭 구매</title>
<script type="text/javascript" src="resources/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="resources/js/wine.js"></script>
</head>
<body>
<% List<fieldVO> emptyFieldList = (List) request.getAttribute("emptyFieldList");%>
<% List<vineyardVO> vineyardList = (List) request.getAttribute("vineyardList");%>

<div class="checkFields">	
	<div>
		새로운 밭
	</div>	
	<%for(fieldVO vo : emptyFieldList){
			%>	
		<div>
			<input type="radio" name="field" value=<%=vo.getField_ID() %>><%=vo%>
		</div>
	<%} %>
	</div>
</div>

<div class="checkVineyards">	
	<div>
		밭을 구매하는 포도농장
	</div>	
	<%for(vineyardVO vo1 : vineyardList){
			%>	
		<div>
			<input type="radio" name="vineyard" value=<%=vo1.getVineyard_ID() %>><%=vo1%>
		</div>
	<%} %>
	</div>
</div>
	
<div><button id="buyNewFieldsRegister">구매</button></div>

<table>

</table>

</body>
</html>