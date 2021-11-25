<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<script>
 $(function(){
	 var adCode = '&ad_code' + adCode;
	$('#btn').on('click', function(){
		$.ajax({
			url : "<%=request.getContextPath()%>/adView.do",
			data : {"ad_code" : adCode},
			dataType : "json",
			success : function(result){
				if(result=="OK"){
					alert("사용가능");
				}
				
			},
			error : function(xhr){
				alert(xhr.status);
			}
		});
	})
	
});
</script>
</head>
<body>
<input type="button" id="btn" value="확인">
</body>
</html>