<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>작성자</th>
			<td>${vo.myname }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${vo.mytitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="60" readonly="readonly">${vo.mycontent }</textarea> </td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="목록" 
				onclick="location.href='list.do'" >
				
				<input type="button" value="수정" 
				onclick="location.href='updateform.do?myno=${vo.myno}'" >
				
				<input type="button" value="삭제" 
				onclick="location.href='delete.do?myno=${vo.myno}'" >					
			</td>
		</tr>
		
	</table>













</body>
</html>