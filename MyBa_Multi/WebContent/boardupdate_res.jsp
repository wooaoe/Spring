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
<title>BoardUpdate_res</title>
</head>
<body>

<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	MdboardDao dao = new MdboardDao();
	MdboardVo vo = new MdboardVo(seq, title, content);
	
	int res = dao.update(vo);
	if(res > 0){
	
%>
	<script type="text/javascript">
		alert("수정 완료!");
		location.href = "boardlist.jsp";
	</script>
<% }else { %>
	<script type="text/javascript">
		alert("수정 실패!");
		location.href = "boardDetail.jsp";
	</script>
<% } %>


</body>
</html>