<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>보상받기!!</h1>


  <form action="">
       <input type="button" id='btn' value="보상" />
  </form>

  <p id="result"> 결과:</p>
  <script>
   
    const btn = document.getElementById('btn');
    const result = document.getElementById('result');


    let ran = parseInt(Math.random() * 3);
    console.log(ran);
    btn.addEventListener('click', function () {
      

      if (ran === 0) {
        //멘트를 출력하기 위해 result 요소에 내용 저장
        result.innerHTML = '<span class="success">용돈인상</span>';
        btn.disabled = true;
      }
      else if (ran === 1) {
        result.innerHTML = '<span class="success">문화 상품권 만원</span>';
        btn.disabled = true;
      }
      else {
        result.innerHTML = '<span class="success">컴퓨터 간섭 안하기</span>';
        btn.disabled = true;
             }
      
     
    });








  </script>
</body>
</html>