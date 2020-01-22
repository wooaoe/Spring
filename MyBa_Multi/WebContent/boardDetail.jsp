<%@page import="org.eclipse.jdt.internal.compiler.codegen.IntegerCache"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import = "com.multi.dao.MdboardDao" %>
    <%@ page import = "com.multi.vo.MdboardVo" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardDetail</title>
<script type="text/javascript" src = "https://code.jquery.com/jquery-3.4.1.min.js"></script>

	<style type="text/css">
		#updateform{
			display: none;
		}
	</style>
	
	<script type="text/javascript">
		function updateFormView(){
			$("#detailform").hide();
			$("#updateform").show();
		}
		function detailFromView(){
			$("#updateform").hide();
			$("#detailform").show();
		}
	</script>


</head>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	MdboardDao dao = new MdboardDao();
	MdboardVo vo = dao.selectOne(seq);
%>
<body>


	<div id = "detailform">
	<h1>게시글 보기</h1>
	<table>
		
		<tr>
			<th>작성자 :</th>
			<td><%=vo.getWriter() %></td>
		</tr>
		<tr>
			<th>작성일 :</th>
			<td><%=vo.getRegdate()%></td>
		</tr>
		<tr>
			<th>제목 :</th>
			<td><%=vo.getTitle() %></td>
		</tr>
		<tr>
			<th>내용 :</th>
			<td>
				<textarea rows="10" cols="60" readonly>
					<%=vo.getContent() %>
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan = "2">
				<input type = "button" value = "수정" onclick = "updateFormView();">
				<input type = "button" value = "삭제" onclick = "location.href = 'boarddelete.jsp?seq=<%=vo.getSeq()%>'">
				<input type = "button" value = "목록" onclick = "location.href = 'boardlist.jsp'">
			</td>
		
		</tr>
	</table>
	</div>

	<div id = "updateform">
		<h1>글 수정</h1>
		
		<form action="boardupdate_res.jsp" method = "post">
		<input type = "hidden" name = "seq" value = "<%=vo.getSeq()%>"/>		
		<table>
		<tr>
			<th>작성자 :</th>
			<td><%=vo.getWriter() %></td>
		</tr>
		<tr>
			<th>작성일 :</th>
			<td><%=vo.getRegdate()%>"</td>
		</tr>
		<tr>
			<th>제목 :</th>
			<td><input type = "text" name = "title" value = "<%=vo.getTitle() %>"></td>
		</tr>
		<tr>
			<th>내용 :</th>
			<td>
				<textarea rows="10" cols="60" name = "content">
					<%=vo.getContent() %>
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan = "2">
			<input type = "submit" value = "수정완료">
			<input type = "button" value = "취소" onclick = "detailFromView();">
			</td>
		</tr>
	</table>
	</form>
		
	</div>
	
</body>
</html>