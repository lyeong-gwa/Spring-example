<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>city : ${ city }</P>
	<P>code : ${ code }</P>

	<form action="insert" method="post">


		<div>
			<label for="content">내 용:</label>
			<textarea class="form-control" id="content" name="content"></textarea>
		</div>

		<div>
			<label for="count">카운트:</label> <input type="text" name="count">
		</div>

		<button type="submit">Submit</button>
	</form>

	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>정보</th>
				<th>카운트</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ list }" var="row">
				<tr>
					<td>${row.num }</td>
					<td>${row.content}</td>
					<td>${row.count }</td>
					<td><a href="delete?num=${row.num}">삭제하기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
