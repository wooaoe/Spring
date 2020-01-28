<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% request.setCharacterEncoding("UTF-8"); %>
    <% response.setContentType("text/html; charset=UTF-8"); %>
    
    <%@ page import = "com.multi.vo.MdboardVo" %>
    <%@ page import = "com.multi.dao.MdboardDao" %>
    <%@ page import = "java.util.List" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>

<script type="text/javascript" src = "https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	function allChk(bool){
		var chks = document.getElementsByName("chk");
		for(var i = 0; i < chks.length; i++){
			chks[i].checked = bool;
		}
		
	}


</script>



</head>
<body>
	
<%
	MdboardDao dao = new MdboardDao();
	List<MdboardVo> list = dao.selectAll();
%>
	
	<h1>글 목록</h1>
	<form action="muldel.jsp" method = "post" id = "muldelform">
		<table border = "1">
			<col width = "30px">
			<col width = "50px">
			<col width = "100px">
			<col width = "300px">
			<col width = "100px">
			
			<tr>
				<th><input type = "checkbox" name = "all" onclick = "allChk(this.checked);"/></th>			
				<th>번호</th>			
				<th>작성자</th>			
				<th>제목</th>			
				<th>작성일</th>			
			</tr>
<%
			if(list.size() == 0){
%>
			<tr>
				<td colspan = "5">-----글이 존재하지 않습니다.-----</td>
			</tr>
<%
			}else{
				for(MdboardVo vo : list){
%>
			<tr>
				<td><input type = "checkbox" name = "chk" value = "<%=vo.getSeq()%>"></td>
				<td><%=vo.getSeq()%></td>
				<td><%=vo.getWriter()%></td>
				<td><a href = "boardDetail.jsp?seq=<%=vo.getSeq()%>"><%=vo.getTitle()%></a></td>
				<td><%=vo.getRegdate()%></td>
			</tr>
<%
				}
			}
%>
		<tr>
			<td colspan = "5">
			<input type = "button" value = "글쓰기" onclick = "location.href = 'boardwrite.jsp'">
			<input type = "submit" value = "삭제">
			</td>
		
		</tr>
		</table>
	
	</form>
	

</body>
</html>