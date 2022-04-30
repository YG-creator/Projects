<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>밭 상세 정보</title>
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
<table>
	<tr><td>field_ID</td><td>location</td><td>area</td><td>variety</td><td>vineyard_ID</td><td>수정</td><td>생산</td><td>생산내역 수정</td></tr>
	<tr>
		<td id="field_ID">${vo.field_ID }</td>
		<td id="location">${vo.location }</td>
		<td id="area">${vo.area }</td>
		<td id="variety">${vo.variety }</td>
		<td id="vineyard_ID">${vo.vineyard_ID }</td>
		<td><a href="./fieldChange?field_ID=${vo.field_ID }">수정</a></td>
		<td><a href="./GrapeProduction_form?field_ID=${vo.field_ID }">생산</a></td>
		<td><a href="./GPList?field_ID=${vo.field_ID }">생산내역 수정</a></td>
	</tr>
</table>
</body>
</html>