<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>

<body>
<h1>
	Hello world!  
</h1>
<%= session.getAttribute("userinfo") %>

<c:if test="${sessionScope.userinfo != null}">
	<form action="logout" method="post">
		<input type="submit" value="logout"/>
	</form>
	
	<form action="fileUpload" method="post" enctype="multipart/form-data">
		<label for="upfile">파일:</label>
		<input type="file" id="upfile" name="upfile" multiple="multiple">
		<input type="submit" value="파일업로드"/>
	</form>
	
	<ul>
		<div class="mt-3">
			<ul>
				<c:forEach var="file" items="${userinfo.fileInfos}">
					<li>${file.originalFile} 
					<a class="filedown" href="#" sfolder="${file.saveFolder}" sfile="${file.saveFile}" ofile="${file.originalFile}">[다운로드]</a>
				</c:forEach>
			</ul>
		</div>
	</ul>
</c:if>
<form action="login" method="post">
	<input type="text" name="id"></input>
	<input type="text" name="password"></input>
	<input type="submit" value="login"/>
</form>

<form id="downform" action="${root}/file/download">
	<input type="hidden" name="sfolder">
	<input type="hidden" name="ofile">
	<input type="hidden" name="sfile">
</form>
</body>
<script>
function download(file){
	let form = document.createElement('form');
	form.setAttribute('method', 'post');
	form.setAttribute('action', 'download');
		
	let sfolder = document.createElement('input');
	let sfile = document.createElement('input');
	let ofile = document.createElement('input');
	sfolder.value = file.sfolder;
	sfile.value = file.sfile;
	ofile.value = file.ofile;
	form.appendChild(sfolder);
	form.appendChild(sfile);
	form.appendChild(ofile);

	form.submit();
}

let files = document.querySelectorAll(".filedown");
files.forEach(function(file) {
	file.addEventListener("click", function() {
		document.querySelector("[name='sfolder']").value = file.getAttribute("sfolder");
		document.querySelector("[name='ofile']").value = file.getAttribute("ofile");
		document.querySelector("[name='sfile']").value = file.getAttribute("sfile");
		document.querySelector("#downform").submit();
	});
});
</script>
</html>
