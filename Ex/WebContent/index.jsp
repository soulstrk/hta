<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/index.css?ver=4">
<script type="text/javascript" src="js/yong.js"></script>
<%
	String w = (String)request.getAttribute("loginFail");
	if(w == null){ w = "1"; }
	if(w.equals("-1")){
%>
	<script type="text/javascript">alert('로그인이 실패하였습니다.');</script>
<%
	}
%>
</head>
<style>
</style>
<body>
	<form action="existId.do" method="post">
		<div class="container">
			<label for="uname"><b>Username</b></label>
			<input type="text" placeholder="아이디를 입력하세요" name="id" required>
			<label for="psw"><b>Password</b></label>
			<input type="password" placeholder="비밀번호를 입력하세요" name="pwd" required>
			<button type="submit">로그인</button>
			<button type="button" class="joinBtn" onclick="location.href='join.jsp'">회원가입</button>
			<button type="button" class="id_pw">아이디/비밀번호 찾기</button>
		</div>
	</form>
</body>
</html>