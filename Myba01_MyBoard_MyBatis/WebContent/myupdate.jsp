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
<title>MyUpdate</title>
</head>
<body>

	<%
		int myno = Integer.parseInt(request.getParameter("myno"));
		MyBoardDao dao = new MyBoardDao();
		MyBoardVo vo = dao.selectOne(myno);
	%>
	
	<form action="myupdate_res.jsp" method = "get">
	<input type = "hidden" name = "myno" value = "<%=myno%>">
	<table>
		<tr>
			<th>이름 :</th>
			<td><input type = "text" name = "myname" value ="<%=vo.getMyname()%>"></td>
		</tr>
		<tr>
			<th>제목 :</th>
			<td><input type = "text" name = "mytitle" value = "<%=vo.getMytitle()%>"></td>
		</tr>
		<tr>
			<th>내용 :</th>
			<td>
				<textarea rows="10" cols="60" name = "mycontent">
					<%=vo.getMycontent()%>
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan = "2" align = "right">
				<input type = "submit" value = "수정"/>
				<input type = "button" value = "삭제" onclick = "location.href = 'mylist.jsp'"/>
			</td>
		</tr>
	</table>
	</form>
	
</body>
</html>