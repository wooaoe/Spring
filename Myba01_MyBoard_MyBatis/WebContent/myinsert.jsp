<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import = "com.my.dao.MyBoardDao" %>
    <%@ page import = "com.my.vo.MyBoardVo" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Insert</title>
</head>
<body>

	<h1>글쓰기</h1>
	<form action="myinsert_res.jsp" method = "post">
		<table>
			<tr>
				<th>이름 :</th>
				<td><input type = "text" name = "myname"/></td>
			</tr>
			<tr>
				<th>제목 :</th>
				<td><input type = "text" name = "mytitle"></td>
			</tr>
			<tr>
				<th>내용 :</th>
				<td><textarea rows = "10" cols = "60" name = "mycontent"></textarea></td>
			</tr>
			<tr>
				<td colspan = "2" align = "right">
					<input type = "submit" value = "입력"/>
					<input type = "button" value = "취소" onclick = "location.href = 'mylist.jsp'"/>
				</td>
			</tr>
		
		</table>
	</form>




</body>
</html>