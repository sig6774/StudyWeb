<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
		int v1 = (int) request.getAttribute("v1");
		String v2 = (String) request.getAttribute("v2");
%>
<!-- <% %> : 자바코드라는 뜻 -->
<!-- request.getAttribute("v1") : v1이라는 값을 뷰에 보낸다는 뜻  -->
<!-- 컨트롤러의 자바코드를 받아오는 것  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>값을 화면에 받아옴</title>
</head>
<body>
<!-- v1과 v2라고 지정한 값들을 <%= v1 %>처럼 적으면 값을 받아와서 출력 가능   -->
v1값은 <%= v1 %><br>
v2값은 <%= v2 %>
<!-- 값들이 홈페이지에서 값을 받아와서 표시함   -->

</body>
</html>