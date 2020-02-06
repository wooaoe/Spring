<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>

	<h1>list</h1>
	<table border = "1">
		<colgroup>
			<col width = "50">
			<col width = "100">
			<col width = "300">
			<col width = "100">
		</colgroup>
	
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:choose>
			<c:when test="${empty list}">
				<tr>
					<td colspan = "4" align = "center">-----작성된 글이 없습니다.-----</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items = "${list}" var = "vo">
					<tr>
						<td>${vo.myno}</td>
						<td>${vo.myname}</td>
						<td><a href = "detail.do?myno=${vo.myno}">${vo.mytitle}</a></td>
						<td>${vo.mydate}</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan = "4" align = "right">
				<input type = "button" value = "글작성"
					onclick = "location.href = 'insertform.do'">
			</td>
		</tr>
	</table>


</body>
</html>