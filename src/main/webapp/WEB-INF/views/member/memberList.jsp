<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<!--================Banner Area =================-->
<section class="breadcrumb_area blog_banner_two">
	<div class="overlay bg-parallax" data-stellar-ratio="0.8" data-stellar-vertical-offset="0" data-background=""></div>
	<div class="container">
		<div class="page-cover text-center">
			
		</div>
	</div>
</section>
<!--================Banner Area =================-->

<h2 style="text-align: center">회원목록</h2>
<table class="table table-striped">
  <thead class="table-info">
	<tr>
		<th scope="col">아이디</th>
		<th scope="col">비밀번호</th>
		<th scope="col">회원 이름</th>
		<th scope="col">전화번호</th>
		<th scope="col">이메일</th>
		<th scope="col">회원 등급</th>
	</tr>
	</thead>
	 <tbody class="table-group-divider">
	<c:forEach items="${list}" var="dto">	
		<tr>
			<td>${dto.id}</td>
			<td>${dto.pw}</td>
			<td>${dto.name}</td>
			<td>${dto.phone}</td>
			<td>${dto.email}</td>
			<td><a class="btn btn-warning dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
    ${dto.roleName}
  </a>
   <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#">ADMIN</a></li>
    <li><a class="dropdown-item" href="#">CAMPMANAGER</a></li>
    <li><a class="dropdown-item" href="#">MEMBER</a></li>
  </ul>
  </td>
		</tr>
	</c:forEach>
</div>
	</tbody>
</table>

										<!-- 페이징 -->
				<div class="row">
			<nav aria-label="Page navigation example">
			  <ul class="pagination justify-content-center">
			   <li class="page-item ${pager.before ? 'disabled':''}">
			      <a class="page-link" aria-label="Previous" href="./memberList?page=1">
			      	<span aria-hidden="true">&laquo;</span>
			      </a>
			   	</li>
			    <li class="page-item ${pager.before ? 'disabled':''}">
   			      <a class="page-link" aria-label="Previous" href="./memberList?page=${pager.startNum-1}">
			      	<span aria-hidden="true">&lsaquo;</span>
			      </a>
			   	</li>
			   	<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			    <li class="page-item"><a class="page-link" href="./memberList?page=${i}">${i}</a></li>
			    </c:forEach>
			    <li class="page-item ${pager.after ? 'disabled':''}">
   			      <a class="page-link" aria-label="Previous" href="./memberList?page=${pager.lastNum+1}">
			      	<span aria-hidden="true">&rsaquo;</span>
			      </a>
			   	</li>
 			    <li class="page-item ${pager.after ? 'disabled':''}">
   			      <a class="page-link" aria-label="Previous" href="./memberList?page=${pager.totalPage}">
			      	<span aria-hidden="true">&raquo;</span>
			      </a>
			   	</li>
			  </ul>
			</nav>
		</div>
			
		<!-- 검색창 -->
		<div class="row">
			<form class="row col-md-7 mx-auto" action="./memberList" method="get">
				<div class="col-auto">
					<label for="kind" class="visually-hidden">Kind</label> 
					<select class="form-select" name="kind" id="kind" aria-label="Default select example">
						<option value="name" ${pager.kind eq 'name' ? 'selected' : ''}>회원 이름</option>
						<option value="id" ${pager.kind eq 'id' ? 'selected' : ''}>회원 아이디</option> </select>
						
				</div>
				<div class="col-auto">
					<label for="search" class="visually-hidden">Search</label>
					<input type="text" class="form-control" id="search" name="search" placeholder="검색어를 입력하세요">
				</div>
				<div class="col-auto">
					<button type="submit" class="btn btn-success mb-3">검색</button>
				</div>
			</form>
		</div>
<div class="row col-auto">
<input type="button" value="HOME" class="btn" onclick="location.href='/'">
</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>