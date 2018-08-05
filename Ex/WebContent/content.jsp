<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/content.css?ver=4">
<script type="text/javascript" src="js/yong.js"></script>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
%>
	<div id=header>
		<h2><%= id %></h2>
		<a href="logout.do">logout</a>
		<button>글쓰기</button>
	</div>
	<div id="wrapper">
		<div id=center>
			<div id="nav">
				<div class="friend">f1</div>
				<div class="friend">f2</div>
				<div class="friend">f3</div>
				<div class="friend">f4</div>
				<div class="friend">f5</div>
				<div class="friend">f6</div>
				<div class="friend">f7</div>
				<div class="friend">f8</div>
			</div>
			<div id="content">
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
				<div class="item"></div>				
			</div>
		</div>
	</div>
</body>
</html>