<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/basic/js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	
	$("#LprodBtn").on("click", function(){
		$.ajax({
			url : "<%=request.getContextPath()%>/lprodList.do",
			type : "POST" ,
			success : function(data){
				
				var htmlCode = "<table border = '1'>";
				htmlCode += "<tr><td>LPROD_ID</td><td>LPROD_GU</td><td>LPROD_NM</td></tr>";
				$.each(data, function(i,v){
					htmlCode += "<tr><td>" + v.lprod_id + "</td>";
					htmlCode += "<td>" + v.lprod_gu + "</td>";
					htmlCode += "<td>" + v.lprod_nm + "</td></tr>";
				});
					htmlCode += "</table>";
					$("#result").html(htmlCode);
			},
			dataType : "json"
		
		});//ajax
	});//onclick
		
	
	$("#LprodBtn2").on("click", function(){
		location.href = "<%=request.getContextPath()%>/lprodList2.do";
	});
	
	
	
	
});//function

</script>

</head>
<body>

<form>
	<input type="button" id="LprodBtn" value="Lprod 자료 가져오기(Ajax)">
	<input type="button" id="LprodBtn2" value="Lprod 자료 가져오기(Non Ajax)">
</form>

<hr>

<h2>Lprod 자료 목록 </h2>
<div id="result"></div>


</body>
</html>