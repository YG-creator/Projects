<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포도농장 통계정보 요약</title>
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
	<tr>
		<td>총 밭 면적 : </td>
		<td>${totalArea}</td>
	</tr>
	<tr>
		<td>총 포도 생산량 : </td>
		<td>${totalGP}</td>
	</tr>
	<tr>
		<td>거래량 : </td>
		<td>${totalGT}</td>
	</tr>
</table>
</body>
</html>