/**
 * 
 */

var regxId = /^[a-zA-Z0-9]{8,12}$/; // 아이디 8~12자 입력, 영대소문자 와 숫자
var regxPwd = /^(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$/;
var regxPhone = /^\d{3}-\d{3,4}-\d{4}$/; //핸드폰번호 정규식

function idLiveCheck() {
	var img = document.getElementById('checkImg');
	var id = document.getElementById('id').value; //입력된 아이디 값
	var bool = regxId.test(id);
	if(bool === true){
		img.src = "/Ex/images/o.png";
		img.style.display = "block";
		return true;
	}else if(bool === false){
		img.src = "/Ex/images/x.jpg";
		img.style.display = "block";
		return false;
	}
}

function idCheck(chkId) { //중복화면창 입력된 아이디 값
	var bool = regxId.test(chkId);
	if(bool === true){
		return true;
	}else if(bool === false){
		return false;
	}
}

function pwd1LiveCheck() { //비밀번호 유효성 검사
	var img = document.getElementById('checkImg1');
	var pwd = document.getElementById('pwd').value; 
	var bool = regxPwd.test(pwd);
	
	if(bool === true){
		img.src = "/Ex/images/o.png";
		img.style.display = "block";
		return true;
	}else if(bool === false){
		img.src = "/Ex/images/x.jpg";
		img.style.display = "block";
		return false;
	}
}

function pwd2LiveCheck() { //비밀번호 재확인
	var img = document.getElementById('checkImg2');
	var pwd1 = document.getElementById('pwd').value; 
	var pwd2 = document.getElementById('pwd2').value; 
	var checkSpan = document.getElementsByClassName('checkSpan1')[0];
	
	if(pwd1 === pwd2){
		checkSpan.innerHTML = "비밀번호가 일치합니다!"
		return true;
	}else{
		checkSpan.innerHTML = " ";
		return false;
	}
}


function openIdChk() { //중복확인 클릭시 뜨는 화면
	var id = document.getElementById('id').value;
	window.name = "parentForm";
	openWin = window.open("openIdChk.jsp?id="+id+"",'_blank',"resizable=no,top=200,left=100,width=600,height=200");
}

function checkId() {
	var chkId = document.getElementById('chkId').value;
	var chkDiv = document.getElementById('chkDiv');
	var bool = idCheck(chkId);
	if(bool){
		location.href = "checkId.do?id="+chkId+"";
	}else{
		chkDiv.innerHTML = "(8~12자 영대소문자와 숫자)";
		$(document).ready(function() {
			$('#chkDiv').css('color','red');
		});
	}
}

function phoneChk() {
		var phone = document.getElementById('phone').value; //입력된 아이디 값
		var bool = regxPhone.test(phone);
		if(bool === true){
			return true;
		}else if(bool === false){
			return false;
		}
	}


function finalCheck() {
			if(!(idLiveCheck())){
				alert('아이디를 올바르게 입력해주세요.');
				return false;
			};
			if(!(pwd1LiveCheck())){
				alert('비밀번호를 올바르게 입력해주세요.');
				return false;
			};
			if(!(pwd1LiveCheck())){
				alert('비밀번호가 일치하지 않습니다.');
				return false;
			};
			if(!(pwd2LiveCheck())){
				alert('비밀번호가 일치하지 않습니다.');
				return false;
			};
			if(!(phoneChk())){
				alert('번호를 올바르게 입력해주세요.');
				return false;
			};
			alert('회원가입이 완료되었습니다.');
}

function existId() {
	
}




