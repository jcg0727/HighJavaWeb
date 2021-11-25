<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Servlet을 이용한 File Upload 연습</title>
</head>
<body>
<h1>File Upload 연습</h1>

<!-- 파일 업로드 할 때 반드시 form 태그에 설정해야 하는 속성
	  ==> enctype="multipart/form-data" // 메소드도 post 방식밖에 사용할수 없다
 -->
<form method="post" enctype="multipart/form-data" action="<%=request.getContextPath()%>/fileUpload.do">
	ID : <input type="text" name="memid"><br><br>
	Upload File 선택 1 : <input type="file" name="uploadFile1" multiple><br><br>
	Upload File 선택 2 : <input type="file" name="uploadFile2"><br><br>
	<input type="submit" value="파일 Upload">
</form>
<br><hr><hr>
<a href="<%=request.getContextPath() %>/uploadFileList.do">
전체 Upload 파일 보기></a>
</body>
</html>