<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import = "com.multi.dao.MdboardDao" %>
    <%@ page import = "com.multi.vo.MdboardVo" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board Write_res</title>
</head>
<body>
<%
	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	MdboardDao dao = new MdboardDao();
	MdboardVo vo = new MdboardVo(writer, title, content);
	int res = dao.insert(vo);
	
	if(res > 0){
%>
	<script type="text/javascript">
		alert("글 등록 성공!");
		location.href = "boardlist.jsp";
	</script>
<% } else { %>
	<script type="text/javascript">
		alert("글 등록 실패!");
		location.href = "boardwrite.jsp";
	</script>
<% } %>



</body>
</html>