<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/yong.js"></script>
<link rel="stylesheet" href="CSS/join.css?ver=4">
<%
	String id = request.getParameter("chkId");
	System.out.println(id);
	if(id == null){ id = " "; }else{%>
	<script type="text/javascript">
		$(document).ready(function() {
			$('#id').val('<%= id %>'); 
		});
	</script>
<%		
	}
%>
<body>
	<form action="insert.do" name="userInfo">
		<div class="container">
			<h1>회원가입1</h1>
			<label for="id">아이디</label><div class="checkSpan"><img id="checkImg" alt="x" src=""></div>
			<input type="text" name="id" id="id" placeholder="아이디를 입력하세요 (8~12자 영대소문자와 숫자)" required onkeyup="idLiveCheck()"><br>
			<button type="button" onclick="openIdChk()">중복확인</button>
			<input type="hidden" name="idDuplication" value="idUnCheck">
			<label for="pwd">비밀번호</label><div class="checkSpan"><img id="checkImg1" alt="x" src=""></div>
			<input type="password" name="pwd" id="pwd" placeholder="비밀번호를 입력하세요 (8~20자 숫자,특수문자 포함)" required onkeyup="pwd1LiveCheck()"><br>
			<label for="pwd2">비밀번호 재확인</label><span class="checkSpan1"></span>
			<input type="password" name="pw2" id="pwd2" placeholder="비밀번호를 학인하세요" required onkeyup="pwd2LiveCheck()"><br>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" placeholder="이름을 입력하세요" required><br>
			<label for="bday">생년월일</label>
			<input type="date" name="birth" id="birth" placeholder="생년월일을 입력하세요" required><br>
			<div>성별</div><br>
			<div>
				<label class="gen" for="man">남</label>
				<label class="gen" for="woman">여</label>
			</div>
			<input type="radio" name="gender" value="남" id="man" required>
			<input type="radio" name="gender" value="여" id="woman" required><br>
			<label for="phone">휴대전화</label>
			<input type="text" name="phone" id="phone" placeholder="전화번호를 입력하세요" required><br>
			<button type="submit">가입하기</button>
		</div>
	</form>
<script type="text/javascript">
	var gen = document.getElementsByClassName("gen");
	gen[0].onclick = function(){
		var r1 = document.getElementById("woman");
		if(r1.checked == true){
			gen[1].style.border = "none";
		}
		this.style.border = "1px solid #00cc00";
	}
	
	gen[1].onclick = function(){
		var r0 = document.getElementById("man");
		if(r0.checked == true){
			gen[0].style.border = "none";
		}
		this.style.border = "1px solid #00cc00";
	}
</script>
</body>
</html>