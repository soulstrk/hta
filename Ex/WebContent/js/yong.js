/**
 * 
 */

var regxId = /^[a-zA-Z0-9]{8,12}$/; // 아이디 8~12자 입력, 영대소문자 와 숫자
var regxPwd = /^(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,20}$/;
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
	openWin = window.open("openIdChk.jsp?id="+id+"",'_blank',"resizable=no,top=200,left=100,width=400,height=400");
}


