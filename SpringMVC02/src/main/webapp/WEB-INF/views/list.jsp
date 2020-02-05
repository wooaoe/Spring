<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>

	<h1>고객 정보</h1>
	<c:choose>
		<c:when test="${empty list}">
			<h3>*** 고객 정보가 존재하지 않습니다. ***</h3>
		</c:when>
		<c:otherwise>
			<table>
				<col width = "100">
				<col width = "300">
				<col width = "200">
				<col width = "300">
				<col width = "100">
				
				<thead>
					<tr>
						<th>ID</th>
						<th>PASSWORD</th>
						<th>NAME</th>
						<th>UPDATE</th>
						<th>DELETE</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items = "${list}" var = "vo">
						<tr>
							<td>${vo.id}</td>						
							<td>${vo.password}</td>						
							<td>${vo.name}</td>						
							<td><a href = "#">수정</a></td>						
							<td><a href = "#">삭제</a></td>						
						</tr>
					</c:forEach>
				</tbody>
				<tfoot>
					<tr>
						<td colspan = "5">
							<input type = "button" value = "처음으로"/>
							<input type = "button" value = "글 작성"/>
						</td>
					</tr>
				</tfoot>
			</table>
		</c:otherwise>
	</c:choose>

</body>
</html>