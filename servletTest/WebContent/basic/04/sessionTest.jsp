<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Session 연습</title>
</head>
<body>
<a href="<%=request.getContextPath() %>/sessionAdd.do">Session정보 저장하기</a>
<br><br>
<a href="<%=request.getContextPath() %>/sessionRead.do">Session정보 읽어오기</a>
<br><br>
<a href="<%=request.getContextPath() %>/sessionDelete.do">Session정보 삭제하기</a>
</body>
</html>