<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    pageContext.setAttribute("name", "page man");
    request.setAttribute("name", "request man");
    session.setAttribute("name", "session man");
    application.setAttribute("name", "application man");
    
    System.out.println("firstPage.jsp : ");
    System.out.println("�ϳ��� ������ �Ӽ� : "+ pageContext.getAttribute("name"));
    System.out.println("�ϳ��� ��û �Ӽ� : "+request.getAttribute("name"));
    System.out.println("�ϳ��� ���� �Ӽ� : "+session.getAttribute("name"));
    System.out.println("�ϳ��� ���ø����̼� �Ӽ� : "+application.getAttribute("name"));
    request.getRequestDispatcher("07_secondPage.jsp").forward(request, response);
    
    
    
    
    
    %>