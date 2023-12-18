<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
<style type="text/css">
	table{
		width: 800px;
		height: 600px;
		border: 1px solid black;
		text-align: center;
	}
	tr td{
		border: 1px solid black;
	}
	a{
		transition: background-color 0.5s;
		text-decoration: none; 
	}
	a : hover{
		background-color: green;
	}
	#title{
		height: 100px;
	}
</style>
</head>
<body>
	<div>
		<h1>게시판 만들기</h1>
		<table>
			<tr>
				<p>현재 시간 : ${serverTime}</p>
			</tr>
			<tr>
				<th colspan="5" style="height: 50px;">유형</th>
			</tr>
			<tr>
				<td><a href="./noticeboard/listType.do">일반형태 게시판</a></td>
				<td><a href="./noticeboard/webMagazineType.do">웹진형태 게시판</a></td>
				<td><a href="./noticeboard/galleryType.do">갤러리형태 게시판</a></td>
				<td><a href="./noticeboard/FAQType.do">FAQ형태 게시판</a></td>
				<td><a href="https://www.naver.com">등록형태(온라인 문의) 게시판</a></td>				
			</tr>
		</table>
	</div>
	
</body>
</html>