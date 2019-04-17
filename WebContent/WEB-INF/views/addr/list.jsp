<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ADDRESS</h1>
<table border="1">
<tr>
<th>번호</th>
<th>코드</th>
<th>시도</th>
<th>구군</th>
<th>동</th>
<th>리</th>
<th>번지</th>
</tr>


<c:forEach items="${list}" var="list">
<tr>
<td>${list.ad_num}</td>
<td>${list.ad_code}</td>
<td>${list.ad_sido}</td>
<td>${list.ad_gugun}</td>
<td>${list.ad_dong}</td>
<td>${list.ad_lee}</td>
<td>${list.ad_bunji}</td>
</tr>

</c:forEach>

</table>

</body>
</html>