<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>

	<form action="updateRes.do" method = "post">
		<input type = "hidden" name = "myno" value = "${vo.myno}">
		<table>
			<tr>
				<th>작성자</th>			
				<td>${vo.myname}</td>
			</tr>
			<tr>
				<th>제 목</th>			
				<td><input type = "text" name = "mytitle" value = "${vo.mytitle}"></td>
			</tr>
			<tr>
				<th>내 용</th>			
				<td><textarea rows = "10" cols = "60" name = "mycontent">${vo.mycontent}</textarea></td>
			</tr>
			<tr>
				<td colspan = "2" align = "right">
					<input type = "submit" value = "완료"/>
					<input type = "button" value = "취소" onclick = "location.href = 'list.do'"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>