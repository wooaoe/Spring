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
<title>Insert title here</title>
</head>
<body>

<%
	String myname = request.getParameter("myname");
	String mytitle = request.getParameter("mytitle");
	String mycontent = request.getParameter("mycontent");
	int myno = Integer.parseInt(request.getParameter("myno"));
	
	MyBoardVo vo = new MyBoardVo(myname, mytitle, mycontent, myno);
	MyBoardDao dao = new MyBoardDao();
	
	int res = dao.update(vo);

	if(res > 0){
%>
	<script type="text/javascript">
		alert("글 수정 성공!");
		location.href = "mylist.jsp";
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert("글 수정 실패!");
		location.href = "myupdate.jsp"
	
	</script>
<%
	}
%>


</body>
</html>