<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트형태 게시판</title>
<style type="text/css">
	#background{
		width: 1280px;
		height: 1000px;
		margin: 0px auto;
	}
	#title{
		text-align: center;
	}
	table{
		border: 1px solid black;
		width: 1000px;
		height: 800px;
		margin: 0px auto;
	}
	tr td{
		border: 1px solid black;
	}
	tr {
		height: 80px;
	}
	.noticeboardNum{
		width: 100px;
	}
	.noticeboardTitle{
		width: 400px;
	}
	.noticeboardWriter{
		width: 300px;
	}
	.noticeboardDate{
		width: 100px;
	}
	.noticeboardView{
		width: 100px;
	}
</style>
</head>
<body>
	<div id="background">
		<h1 id="title">리스트형태 게시판</h1>
<%-- 			${noticeboardList} --%>
		<table>
			<tr>
				<th colspan="5">
					테이블 구조의 리스트 형식으로 구성된 기본적인 게시판
				</th>
			</tr>
			<tr>
				<td class="noticeboardNum" style="height: 50px;">게시글 번호</td>
				<td class="noticeboardTitle" style="height: 50px;">제목</td>
				<td class="noticeboardWriter" style="height: 50px;">작성자</td>
				<td class="noticeboardDate" style="height: 50px;">날짜</td>
				<td class="noticeboardView" style="height: 50px;">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">1</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">2</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">3</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">4</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">5</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">6</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">7</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">8</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">9</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
			<tr>
				<td class="noticeboardNum">10</td>
				<td class="noticeboardTitle">제목</td>
				<td class="noticeboardWriter">작성자</td>
				<td class="noticeboardDate">날짜</td>
				<td class="noticeboardView">조회수</td>
			</tr>
		</table>
	</div>
</body>
</html>