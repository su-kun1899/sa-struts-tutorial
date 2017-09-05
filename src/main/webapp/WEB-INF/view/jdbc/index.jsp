<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Welcome to Super Agile Struts</title>

<link rel="stylesheet" type="text/css" href="${f:url('/css/sa.css')}" />
</head>
<body>

<h1>データベースで取得した値を表示するサンプル</h1>

<ul>
<c:forEach var="book" items="${books}">
    <li>${f:h(book.title)}</li>
</c:forEach>
</ul>
</body>
</html>
