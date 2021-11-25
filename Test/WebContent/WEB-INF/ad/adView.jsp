<%@page import="damanna.vo.AdVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
</head>
<body>
<%
	AdVO adVo = (AdVO)request.getAttribute("adVo");
%>
<h2>광고 정보 보기</h2>
<form id="adForm">
<input type="hidden" name="ad_code" id="ad_code" value="<%=adVo.getAd_code() %>">
 <table border="1">
<tr>
	<td>광고이미지</td>
	<td><%=adVo.getAd_img() %></td>
</tr>
</table>

</form>

</body>
</html>