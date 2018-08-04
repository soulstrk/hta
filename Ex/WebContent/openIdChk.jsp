<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script type="text/javascript" src="js/yong.js"></script>

</head>
<%
	String chkId = request.getParameter("id");
	
	String check = (String)request.getAttribute("check");
	if(check == null){
		check = " ";
	}else if(check == "이미 존재하는 아이디 입니다."){
%>
	<script type="text/javascript">
	$(document).ready(function() {
		$('div').css('color','red');
	});
	</script>
<%
	}else if(check == "사용 가능한 아이디 입니다!"){
%>
	<script type="text/javascript">
	$(document).ready(function() {
		$('div').css('color','blue');
	});
	</script>
<%
	}
%>
<body>
<form name="form1">
	<input type="text" name="chkId" value="<%= chkId %>" id="chkId">
	<button type="button" onclick="checkId()">중복확인</button>
	<div>
		<%= check %>
	</div><br><br>
	<button type="button" onclick="close1()">확인</button>
</form>
	
	
<script type="text/javascript">
	function checkId() {
		var chkId = document.getElementById('chkId').value;
		location.href = "checkId.do?id="+chkId+"";
	}
	function close1() { //parentForm
		var chkId = document.getElementById('chkId').value;
		document.form1.action = "join.jsp";
		document.form1.target = "parentForm";
		document.form1.submit();
		window.close();
		}
</script>
</body>
</html>