<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 로그인 폼 페이지</title>
</head>
<body>
<!-- //로그인 되면 세션 정보가 서버로 가서 저장되고 -->
<!-- 처리된 결과(로그인된 결과)를 가지고 로그인 페이지로 다시 감 -->
<!-- 그렇게 될 때 로그인 되었습니다! 라는 말이 뜨도록 하는 과정 -->

<%
   // JSP 문서에서 세션은 'session'이라는 이름으로 저장되어 있다.
   // 세션에 어떤 데이터를 저장할지(setAttribute) <-loginservlet, 키값은 뭘로 할지 생각해야한다.
   // 로그인한 사람의 아이디가 저장될거고 키값은 userId
   // 로그인이 성공되면 해당 로그인한 사람의  id값이 'userId'라는 키값으로 세션에 저장한다.
   
   //값 가져오기
   String userid = (String)session.getAttribute("userId");
   
   
%>
<%
   // 로그인 못했을때 (아이디, 비번 틀릴때) 세션에 아이디 저장 X
   if(userid==null){   //해당 세션값이 없으면..
      
%>
<form method="post" action="<%=request.getContextPath()%>/sessionLogin.do">
      <table style="margin:0 auto;" border="1">
         <tr>
            <td>ID : </td>
            <td><input type="text" name="userid" placeholder="ID를 입력하세요"></td>
         </tr>
         <tr>
            <td>PASS : </td>
            <td><input type="password" name="pass" placeholder="Password를 입력하세요"></td>
         </tr>
         <tr>
            <td colspan="2" style="text-align:center;">
            <input type="submit" value ="Login"></td>
         </tr>
      </table>
   </form> 
<%
   }else{      //세션에 값이 있을 때...(로그인 성공했을때)
      
%>
<%=userid %>님 반갑습니다.<br><br>
<a href="<%=request.getContextPath() %>/sessionLogout.do">로그아웃</a><br><br>

<%
   }
%>

   
</body>
</html>