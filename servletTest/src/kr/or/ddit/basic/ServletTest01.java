package kr.or.ddit.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 이 예제는 배포 서술자(DD, Deployment Descriptor - web.xml파일)를 이용해서
// 실행할 Servlet 예제이다.

/*
   http://localhost:80/servletTest/servletTest01.do
   
   - http ==> 프로토콜 
   - localhost ==> 컴퓨터이름(도메인명) 또는 IP주소
   - 80 ==> 포트번호(80번은 생략 가능)
   - /servletTest ==> 컨텍스트 패스( 보통 '프로젝트 이름'으로 지정한다.)
   - /servletTest01.do ==> 서블릿 요청 URL 패턴
*/
public class ServletTest01 extends HttpServlet{
   private static final long serialVersionUID = 1L;
   // 직렬화할 때 객체가 역직렬화할 때 객체와 같은 객체인지 확인하기 위한 시리얼넘버
   
   // 이 부분에는 대부분 service()메서드 또는 doGet()메서드나 doPost()메서드를 
   // 재정의해서 작성한다.
   
   // doGet()메서드나 doPost()메서드는 service()메서드를 통해서 호출된다.
   // 위 메서드들은 다음과 같은 객체를 파라미터로 받는다.
   // - HttpServletRequest객체 : 서비스 요청에 관련된 정보 및 메서드를 제공하는 객체
   // - HttpServletResponse객체 : 서비스 응답에 관련된 정보 및 메서드를 제공하는 객체
   
   // doGet()메서드 ==> GET방식의 요청을 처리하는 메서드 
   @Override
   protected void doGet(HttpServletRequest request, 
         HttpServletResponse response) throws ServletException, IOException {
      response.setCharacterEncoding("UTF-8"); // 응답 문서의 인코딩 방식 지정
      response.setContentType("text/html; charset=utf-8"); // 응답 문서의 Content Type 지정
      
      // 처리한 내용을 응답으로 보내기 위한 PrintWriter객체 생성하기
      PrintWriter out = response.getWriter();
      
      // 처리한 내용을 출력한다.
      // 방법1 : append()메서드 이용하기
      out.append("<html>");
      out.append("<head>");
      out.append("<meta charset='utf-8'>")
         .append("<title>첫번째 Servlet 연습</title>")
         .append("</head")
         .append("<body>")
         .append("<h1 style='text-align:center;'>")
         .append("안녕하세요. 첫번째 servlet 프로그램입니다.<br>")
         .append(" context Path : " + request.getContextPath())
         .append("</h1>")
         .append("</body>")
         .append("</html>");
      
   }
   
   // doPost()메서드 ==> POST방식의 요청을 처리하는 메서드
   @Override
   protected void doPost(HttpServletRequest request, 
         HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      super.doPost(request, response);
   }

}