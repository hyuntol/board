<%@page import="com.dto.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width", initial-scale="1">
<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<title>글쓰기</title>
</head>
<body>
<%
	BbsDTO view = (BbsDTO)session.getAttribute("view");
	String bbstitle = view.getBbstitle();
	String bbscontent = view.getBbscontent();
%>
	<div class="container">
		<div class="row">
			<form method="post" action="UpdateServlet">
				<table class="table table-striped" style="text-align: center; boder: 1px solid #dddddd;">
					<thead>
						<tr>
							<th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 글 수정</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input type="text" class="form-control" placeholder="글 제목" name="bbstitle" maxlength="50" value="<%=bbstitle%>"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="글 내용" name="bbscontent" maxlength="2048" style="height: 350px;"><%=bbscontent%></textarea></td>
						</tr>
					</tbody>
				</table>
				<input type="submit" class="btn btn-primary" value="글수정">
			</form>
		</div>
	</div>
</body>
</html>