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
<title>Insert title here</title>
</head>
<body>
<%
	int seq = Integer.parseInt(request.getParameter("seq"));
	
	MdboardDao dao = new MdboardDao();
	int res = dao.delete(seq);
	
	if(res > 0){
%>
	<script type="text/javascript">
		alert("삭제 성공!");
		location.href = "boardlist.jsp";
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert("삭제 실패!");
		location.href = "boardDetail.jsp";
	</script>
<%
	}
%>

</body>
</html>