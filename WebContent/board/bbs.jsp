<%@page import="java.util.List"%>
<%@page import="com.dto.BbsDTO"%>
<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 화면 최적화 -->
<meta name="viewport" content="width-device-width" ,initial-scale="1">
<!-- 루트 폴더에 부트스트랩을 참조하는 링크 -->
<link rel="stylesheet" href="css/bootstrap.css">


<title>게시판</title>

<%
	MemberDTO login = (MemberDTO) session.getAttribute("login");
%>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#write").click(function() { // 로그인 상태 확인
			if (<%=login%> == null) {
				alert("로그인 해주세요.");
				location.href="login.jsp";
				return false;
			}
		})
	})
	
</script>

</head>
<body>
	<div class="container">
		<div class="row">
			<table class="table table-striped" style="text-align: center; boder: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="background-color: #eeeeee; text-align: center;">번호</th>
						<th style="background-color: #eeeeee; text-align: center;">제목</th>
						<th style="background-color: #eeeeee; text-align: center;">작성자</th>
						<th style="background-color: #eeeeee; text-align: center;">작성일</th>
					</tr>
				</thead>
				<%
					List<BbsDTO> list = (List<BbsDTO>)session.getAttribute("list");
					
					for(int i=0; i<list.size(); i++){
						BbsDTO dto = list.get(i);
						
						int bbsnum = dto.getBbsnum();
						String bbstitle = dto.getBbstitle();
						String userid = dto.getUserid();
						String bbsdate = dto.getBbsdate();
			
				%>
				<tbody>
					<tr>
						<td><%=bbsnum%></td>
						<td><a href="ViewServlet?bbsnum=<%=bbsnum%>"><%=bbstitle%></td>
						<td><%=userid%></td>
						<td><%=bbsdate%></td>
					</tr>
				</tbody>
				<%
					}
				%>
			</table>

			<a href="wirte.jsp" class="btn btn-primary" id="write">글쓰기</a>
		</div>
	</div>
</body>
</html>