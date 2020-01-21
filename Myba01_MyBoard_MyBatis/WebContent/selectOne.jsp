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
<title>SelectOne</title>
</head>
<body>

	<%
		int myno = Integer.parseInt(request.getParameter("myno"));
		MyBoardDao dao = new MyBoardDao();
		MyBoardVo vo = dao.selectOne(myno);
	%>
	
	<table>
		<tr>
			<th>이름 :</th>
			<td><%=vo.getMyname()%></td>
		</tr>
		<tr>
			<th>제목 :</th>
			<td><%=vo.getMytitle() %></td>
		</tr>
		<tr>
			<th>내용 :</th>
			<td>
				<textarea rows="10" cols="60" readonly>
					<%=vo.getMycontent()%>
				</textarea>
			</td>
		</tr>
	</table>
	
	
</body>
</html>