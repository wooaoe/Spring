<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import = "com.multi.vo.MdboardVo" %>
    <%@ page import = "com.multi.dao.MdboardDao" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String[] seq = request.getParameterValues("chk");
	
	if(seq == null || seq.length == 0){
%>
	<script type="text/javascript">
		alert("삭제할 글을 1개 이상 선택해주세요.");
		location.href = "boardlist.jsp";
	</script>
<%
	}else{
		MdboardDao dao = new MdboardDao();
		int res = dao.multiDelete(seq);
		
		if(res == seq.length){
%>
	<script type="text/javascript">
		alert("선택 삭제 성공");
		location.href = "boardlist.jsp";
	</script>
<%
		}else{
%>
	<script type="text/javascript">
		alert("선택 삭제 실패");
		location.href = "boardlist.jsp";
	</script>
<%
		}
	}
%>


</body>
</html>