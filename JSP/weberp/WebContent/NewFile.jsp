<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>����ޱ�!!</h1>


  <form action="">
       <input type="button" id='btn' value="����" />
  </form>

  <p id="result"> ���:</p>
  <script>
   
    const btn = document.getElementById('btn');
    const result = document.getElementById('result');


    let ran = parseInt(Math.random() * 3);
    console.log(ran);
    btn.addEventListener('click', function () {
      

      if (ran === 0) {
        //��Ʈ�� ����ϱ� ���� result ��ҿ� ���� ����
        result.innerHTML = '<span class="success">�뵷�λ�</span>';
        btn.disabled = true;
      }
      else if (ran === 1) {
        result.innerHTML = '<span class="success">��ȭ ��ǰ�� ����</span>';
        btn.disabled = true;
      }
      else {
        result.innerHTML = '<span class="success">��ǻ�� ���� ���ϱ�</span>';
        btn.disabled = true;
             }
      
     
    });








  </script>
</body>
</html>