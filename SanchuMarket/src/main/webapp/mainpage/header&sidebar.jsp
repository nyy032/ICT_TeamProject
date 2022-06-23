<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/media/jquery-3.3.1.min.js"></script>
<style type="text/css">

body{
	margin-top: 0px;

}


header{
	position: fixed;
	margin: auto;
	padding-left: 30px;
	padding-right: 30px;
	border-bottom: 1px solid #d3d3d3;
	width: 100%;
	height: 130px;
	background-color: white;
}

.header{
	position: fixed;
	left: 50%;
	transform: translateX( -50% );
	width: 1150px;
	margin: auto;
	margin-top: 20px;
	height: 54px;
	float: left;
}

.logo{
	width: 200px;
	float: left;
	margin-left: 70px;
}
.search{
	width: 500px;
	float: left;
	margin-left: 70px;
}
#search{
	margin-top : 7px;
	width: 400px;
	height: 15px;
	padding: 10px;
	border: 2px solid #20de07;
}

#search:focus{
	outline: none;
}

.btn_place{
	margin-top : 12px;
	width: 260px;
	float: left;
	align-items: center;
}

.btn{  
	text-decoration: none;
	text-align: center;
}

.btn > img {
	vertical-align: middle;
}


.side{
	float: right;
	margin-top:190px;
	margin-right: 350px;
}

li, ul{
	list-style: none;
}

.navi_bar{
	display: inline-block;
	height: 54px;
	clear: both;
	float: left;
	width: 30px;
	margin: auto;
	margin-left: 80px;
	
	margin-top: 15px; 
}


.menu_content{
	list-style:none;	
	width: 150px;
	float: left;
	display : none;
	position : absolute;
	z-index : 1; /*다른 요소들보다 앞에 배치*/
	margin-top : 12px;
	border: 1px solid green;
	background-color : white; 
}


.menu_content a{
	display: block;
	padding: 5px;
	text-decoration: none;
	border: 1px solid green;
}

.navi_bar:hover .menu_content {
  display: block;
}

</style>


</head>
<body>
<div>

<header>
<!-- 고정헤더 -->
	<div class="header">
	<!-- 로고 -->
		<a class="logo" href=""><img src="../image/상추마켓.png" width="200" height="50"></a>
	<!-- 검색창 -->
		<div class="search">
			<input id="search" type="text" >
		</div>
	<!-- 판매,마이페이지 버튼 -->
		<div class="btn_place">
			<a class="btn" href=""><img src="../image/sell.png" width="30px">&nbsp;판매하기</a>
			 &nbsp;&nbsp;|&nbsp;
			<a class="btn" href=""><img src="../image/mypage.png" width="30px">&nbsp;마이페이지</a>
		</div>
	<!-- 반응형 네비게이션 바 -->
		<div class="navi_bar">
			<span class="main_menu"><img src="../image/category.png" width="30px"></span>
			<div class="menu_content">
				<a href="">category1</a>
				<a href="">category2</a>
				<a href="">category3</a>
			</div>
		</div>
	</div>
	<!-- 고정형 사이드바 -->
	<div class="side">
		<%@include file="../sidebar/sideBar.jsp" %>
	</div>
</header>
	
	



</div>

</body>
</html>