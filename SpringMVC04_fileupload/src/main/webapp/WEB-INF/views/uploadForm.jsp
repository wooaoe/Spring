<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <!-- 스프링 폼태그 = 일반 폼 태그에 스프링 관련 기능이 추가 된 태그 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Form</title>
</head>
<body>

	<form:form method = "post" enctype = "multipart/form-data" modelAttribute="uploadFile" action="upload">
		<h3>Upload File</h3>
		파일: <input type = "file" name = "file"/><br>
		<p style = "color:red; font-weight:bold;">
			<form:errors path="file"></form:errors>
		</p>
		설명: <br>
		<textarea rows = "10" cols = "60" name = "desc"></textarea>
		<input type = "submit" value = "전송">
	</form:form>

</body>
</html>