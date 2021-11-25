<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!-- 자바스크립트 차단된 콘텐츠 자동 허용 실시 -->
<!-- saved from url=(0013)about:internet -->

<!-- 표시 언어 지정 -->
<html lang="ko">

<!-- 헤더 정의 부분 -->
<head>
    <title>HTML TEST</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">  
    

    <!-- 내부 CSS 스타일 지정 -->
    <style>
      /* 
      [CSS 요소 설명] 
      1. font-family : 폰트 표시 형태 스타일 지정
      2. width : 가로 크기 지정
      3. height : 세로 크기 지정
      4. margin : 마진 (외부) 여백 설정
      5. padding : 패딩 (내부) 여백 설정
      6. border : 테두리 (선) 표시 설정
      7. background : 배경 표시 설정
      8. overflow : 범위를 벗어난 콘텐츠 표시 여부 설정 (스크롤)
      9. float : 정렬 기준 설정
      10. div : 레이아웃 표시 블록
      11. position : 레이아웃 위치 정렬 설정
      12. display : 해당 div 영역을 표시 여부 설정
      */
                             
       
      /* html, body 영역 스타일 지정 */
      html, body{
         width : 100%;
         height : 100%;
         margin : 0;
         padding : 0;
         border : none;   
         
         /* 스크롤바 표시 지정 */
         overflow : auto;               
      }
      
      
      /* body 스크롤바 메인 스타일 지정 */
      body::-webkit-scrollbar {
         /* 스크롤바 너비 지정 */
         width: 10px;
         
         /* 스크롤바 배경 색상 지정 */
         background-color: #c1c1c1;
      }
      /* body 스크롤바 thumb 스타일 지정 */
      body::-webkit-scrollbar-thumb {               
         /* 스크롤바 thumb 색상 지정 */
         background-color: #444444;
      }
        
              
      #canvas_container {   
        width : 70%;
        height : 50%;
        margin : 0 auto;
        padding : 0;
        border : 1px solid #000000;
        /* background-color : #0000ff; */
               
        /* 컨테이너 배치 정렬 실시 */
        float : top;
        position : relative; 
        top : 10%;
        left : 0%;
         
        /* 마우스 커서 스타일 지정 */
        cursor : pointer;   

        /* 브라우저에서 화면 터치 시 파란박스 하이라이트 제거 */
        -webkit-tap-highlight-color : rgba(0,0,0,0);         

        /* div 테두리 영역 둥글게 설정 : 각 모서리 모두 동일 적용 : 일반 설정 */
        border-radius : 20px;
      }



      #url_container {   
        width : 70%;
        height : 10%;
        margin : 0 auto;
        padding : 0;
        border : none;
        background-color : #0000ff; 
               
        /* 컨테이너 배치 정렬 실시 */
        float : top;
        position : relative; 
        top : 13%;
        left : 0%;
         
        /* 마우스 커서 스타일 지정 */
        cursor : pointer;   

        /* 브라우저에서 화면 터치 시 파란박스 하이라이트 제거 */
        -webkit-tap-highlight-color : rgba(0,0,0,0);         

        /* div 테두리 영역 둥글게 설정 : 각 모서리 모두 동일 적용 : 일반 설정 */
        border-radius : 20px;

        /* display 설정 : p 태그 수직 정렬 */
		display : table;
      }




      #url_txt {   
        /* 텍스트 가로 정렬 지정 */
        text-align : center; 

        /* 텍스트 색상 지정 */
        color : #ffffff;

        /* 텍스트 굵기 지정 */
        font-weight : bold;
               
        /* 텍스트 사이즈 지정 */ 
        font-size : 150%;

        /* 텍스트 수직 정렬 실시 */
        display : table-cell;
        vertical-align : middle;
      }




      #picture_container {   
        width : 70%;
        height : 10%;
        margin : 0 auto;
        padding : 0;
        border : none;
        background-color : #339933; 
               
        /* 컨테이너 배치 정렬 실시 */
        float : top;
        position : relative; 
        top : 14%;
        left : 0%;
         
        /* 마우스 커서 스타일 지정 */
        cursor : pointer;   

        /* 브라우저에서 화면 터치 시 파란박스 하이라이트 제거 */
        -webkit-tap-highlight-color : rgba(0,0,0,0);         

        /* div 테두리 영역 둥글게 설정 : 각 모서리 모두 동일 적용 : 일반 설정 */
        border-radius : 20px;

        /* display 설정 : p 태그 수직 정렬 */
		display : table;
      }




      #picture_txt {   
        /* 텍스트 가로 정렬 지정 */
        text-align : center; 

        /* 텍스트 색상 지정 */
        color : #ffffff;

        /* 텍스트 굵기 지정 */
        font-weight : bold;
               
        /* 텍스트 사이즈 지정 */ 
        font-size : 150%;

        /* 텍스트 수직 정렬 실시 */
        display : table-cell;
        vertical-align : middle;
      }




      #delete_container {   
        width : 70%;
        height : 10%;
        margin : 0 auto;
        padding : 0;
        border : none;
        background-color : #ff00ff; 
               
        /* 컨테이너 배치 정렬 실시 */
        float : top;
        position : relative; 
        top : 15%;
        left : 0%;
         
        /* 마우스 커서 스타일 지정 */
        cursor : pointer;   

        /* 브라우저에서 화면 터치 시 파란박스 하이라이트 제거 */
        -webkit-tap-highlight-color : rgba(0,0,0,0);         

        /* div 테두리 영역 둥글게 설정 : 각 모서리 모두 동일 적용 : 일반 설정 */
        border-radius : 20px;

        /* display 설정 : p 태그 수직 정렬 */
		display : table;
      }




      #delete_txt {   
        /* 텍스트 가로 정렬 지정 */
        text-align : center; 

        /* 텍스트 색상 지정 */
        color : #ffffff;

        /* 텍스트 굵기 지정 */
        font-weight : bold;
               
        /* 텍스트 사이즈 지정 */ 
        font-size : 150%;

        /* 텍스트 수직 정렬 실시 */
        display : table-cell;
        vertical-align : middle;
      }   
                                                  
    </style>


    <!-- Jquery CDN 로드 : 항상 최신 버전 사용 -->
    <script  src="https://code.jquery.com/jquery-latest.min.js"></script>


    <!-- 내부 JS 지정 -->
    <script>

       /*
       [JS 요약 설명]
       1. window.onload : 웹 브라우저 로딩 완료 상태를 확인합니다
       2. canvas[0].getContext("2d") : 캔버스 오브젝트를 얻어옵니다
       3. canvas[0].height = div.height(); : 부모 div 크기만큼 영역을 생성합니다
       4. canvas.on("mousedown", pcDraw); : 이벤트를 등록합니다
       5. 참고 : pc 에서는 마우스로 처리, 모바일에서는 터치로 처리해야합니다       
       */


      
       

       /* [전역 변수 선언 부분] */
       var canvas;
       var div;

       var ctx;
       var drawble = false; //플래그값 설정 (그리기 종료)





       /* [html 최초 로드 및 이벤트 상시 대기 실시] */ 
       $(window).load(function(){
          console.log("");
          console.log("[window onload] : [start]");
          console.log("");

          // [초기 전역 변수 객체 등록 실시]
          canvas = $("#canvas");
          div = $("#canvas_container");

          ctx = canvas[0].getContext("2d"); //캔버스 오브젝트 가져온다          

          // [이벤트 등록 함수 호출]
          init();

          // [화면 조절 함수 호출]
          canvasResize();
       });





       /* [이벤트 등록 함수] */
       function init(){
          console.log("");
          console.log("[init] : [start]");
          console.log("");

          //캔버스 사이즈 조절
          $(window).on("resize", canvasResize);

          //PC 이벤트 등록
          canvas.on("mousedown", pcDraw);
          canvas.on("mousemove", pcDraw);
          canvas.on("mouseup", pcDraw);
          canvas.on("mouseout", pcDraw);
 
          //모바일 이벤트 등록
          canvas.on("touchstart", mobileDraw);
          canvas.on("touchend", mobileDraw);
          canvas.on("touchcancel", mobileDraw);
          canvas.on("touchmove", mobileDraw);

          //버튼 클릭 및 이미지 저장 등록
       };





       /* [화면 조절 함수] */
       function canvasResize(){
          console.log("");
          console.log("[canvasResize] : [start]");
          console.log("");

          //캔버스 사이즈 조절
          canvas[0].height = div.height();
          canvas[0].width = div.width();
       };





       /* [PC 그리기 이벤트 처리] */
       function pcDraw(evt){
          console.log("");
          console.log("[pcDraw] : [start]");
          console.log("");
          switch(evt.type){
            case "mousedown" : {
               BodyScrollDisAble(); //body 스크롤 정지
               drawble = true;
               ctx.beginPath();
               ctx.moveTo(getPcPosition(evt).X, getPcPosition(evt).Y);               
            }
            break;

            case "mousemove" : {
               if(drawble){
                  ctx.lineTo(getPcPosition(evt).X, getPcPosition(evt).Y);
                  ctx.stroke();
               }
            }
            break;

            case "mouseup" :
            case "mouseout" : {
               BodyScrollDisAble(); //body 스크롤 허용
               drawble = false;
               ctx.closePath();
            }
            break;
         }
       };

       function getPcPosition(evt){          
          var x = evt.pageX - canvas.offset().left;
          var y = evt.pageY - canvas.offset().top;
          return {X:x, Y:y};
       };





       /* [모바일 그리기 이벤트 처리] */
       function mobileDraw(evt){
          console.log("");
          console.log("[mobileDraw] : [start]");
          console.log("");

          switch(evt.type){
            case "touchstart" : {
               BodyScrollDisAble(); //body 스크롤 정지
               drawble = true;
               ctx.beginPath();
               ctx.moveTo(getMobilePosition(evt).X, getMobilePosition(evt).Y);
            }
            break;

            case "touchmove" : {
               if(drawble){
                  // 스크롤 및 이동 이벤트 중지
                  evt.preventDefault();
                  ctx.lineTo(getMobilePosition(evt).X, getMobilePosition(evt).Y);
                  ctx.stroke();
               }
            }
            break;

            case "touchend" :
            case "touchcancel" : {
               BodyScrollDisAble(); //body 스크롤 허용
               drawble = false;
               ctx.closePath();
            }
            break;
         }
       };

       function getMobilePosition(evt){
          var x = evt.originalEvent.changedTouches[0].pageX - canvas.offset().left;
          var y = evt.originalEvent.changedTouches[0].pageY - canvas.offset().top;
          return {X:x, Y:y};
       }; 





       /* [body 영역 스크롤 관리 부분] */
       function BodyScrollDisAble(){
          console.log("");
          console.log("[BodyScrollDisAble] : [start]");
          console.log("");         

          document.body.style.overflow = "hidden"; //스크롤 막음
       };
       function BodyScrollAble(){  
          console.log("");
          console.log("[BodyScrollAble] : [start]");
          console.log("");        

          document.body.style.overflow = "auto"; //스크롤 허용
       };





       /* [url 저장 부분] */
       function saveUrl(){
          console.log("");
          console.log("[saveUrl] : [start]");
          console.log(""); 

          console.log("");
          console.log("[saveUrl] : [url] : " + canvas[0].toDataURL()); //데이터베이스에 저장
          console.log("");                         
       };




       /* [캔버스 지우기 부분] */
       function savePicture(){
          console.log("");
          console.log("[savePicture] : [start]");
          console.log(""); 

          // a 태그를 만들어서 다운로드를 만듭니다
          var link = document.createElement("a");

          // base64 데이터 링크
          link.href = canvas[0].toDataURL("image/png"); //로컬 pc 다운로드 이미지

          // 다운로드시 파일명 지정
          link.download = "image.png";

          // body에 추가
          document.body.appendChild(link);
          link.click();          

          // 다운로드용 a 태그는 다운로드가 끝나면 삭제
          document.body.removeChild(link);
       };




       /* [캔버스 지우기 부분] */
       function deleteCanvas(){
          console.log("");
          console.log("[deleteCanvas] : [start]");
          console.log(""); 
          canvasResize(); //캔버스 새로고침       
       }; 
       
    </script>

</head>


<body>

<!-- 캔버스 레이아웃 -->
<div id = "canvas_container">
   <canvas id = "canvas"></canvas>
</div>



<!-- url 저장 -->
<div id = "url_container" onclick = "saveUrl();">
   <p id = "url_txt">URL 저장</p>	
</div>



<!-- 그림 저장 -->
<div id = "picture_container" onclick = "savePicture();">
   <p id = "picture_txt">그림 저장</p>	
</div>



<!-- 사인 지우기 -->
<div id = "delete_container" onclick = "deleteCanvas();">
   <p id = "delete_txt">지우기</p>	
</div>

</body>

</html>