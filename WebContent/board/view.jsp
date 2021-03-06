<%@page import="com.dto.MemberDTO"%>
<%@page import="com.dto.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width" , initial-scale="1">
<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/custom.css">
<title>글보기</title>
</head>
<body>

	<%
		BbsDTO view = (BbsDTO) session.getAttribute("view");
		int bbsnum = view.getBbsnum();
		String bbstitle = view.getBbstitle();
		String userid = view.getUserid();
		String bbsdate = view.getBbsdate();
		String bbscontent = view.getBbscontent();
		%>
	
	<% 
	MemberDTO login = (MemberDTO) session.getAttribute("login"); 
	%>
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; boder: 1px solid #dddddd;">
				<thead>
					<tr>
						<th colspan="3" style="background-color: #eeeeee; text-align: center;">게시판 글보기</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td style="width: 20%">글 제목</td>
						<td colspan="2" style="text-align: center;"><%=bbstitle%></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td colspan="2" style="text-align: center;"><%=userid%></td>
					</tr>
					<tr>
						<td>작성일자</td>
						<td colspan="2" style="text-align: center;"><%=bbsdate%></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan="2" style="min-height: 200px; text-align: center;"><%=bbscontent%></td>
					</tr>
				</tbody>
			</table>
			<a href="ListServlet" class="btn btn-primary">목록</a>

			<%
				 if (login != null && userid.equals(login.getU_id()))  {
			%>
			<a href="update.jsp?bbsnum=<%=bbsnum%>" class="btn btn-primary">수정</a>
			<a href="DeleteServlet?bbsnum=<%=bbsnum%>" class="btn btn-primary" onclick="return confirm('정말로 삭제하시겠습니까?')">삭제</a>
			<%
				}
			%>
		</div>
	</div>
</body>
</html>