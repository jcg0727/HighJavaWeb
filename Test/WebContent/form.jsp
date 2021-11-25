<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>    
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-3.6.0.min.js"></script>
<style>
span {
	width: 60px;
	display: inline-block;
}

textarea {
	width: 40%;
	height: 280px;
}
</style>
<script>
$(function(){
	$('#mem').on('change',function(){
		$('#totalPrice').val($('#mem').val());
	});
});
</script>
</head>
<body>
<form action="payment.jsp">

		<p>
			<span>이름:</span> <input name="name">
		</p>
		<p>
			<span>아이디:</span> <input name="id">
		</p>
		<p>
			<span>핸드폰:</span><input name="phone">
		</p>
		
		<p>
		<span>회원권:</span>
			<select id="mem">
				<option value="1000">1일권</option>
				<option value="5000">7일권</option>
				<option value="20000">30일권</option>
			</select>
		</p>
	
		<p>
			<span>이벤트코드:</span><input type="text" name="code">
		</p>
		
		<p>
  			<span>결제금액:</span> <input id="totalPrice" name="totalPrice">  
		</p>
		<input type="submit" value="결제하기"> <input type="reset" value="취소하기">
	</form>
	
	
</body>
</html>