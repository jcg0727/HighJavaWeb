<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<img src ="../images/수국.jpg" width="300" ><br>
<img src ="<%=request.getContextPath() %>/basic/images/수국.jpg" width="300" >
<img src ="<%=request.getContextPath() %>/images/imageView.do?filename=수국.jpg" width="300" >

</body>
</html>