<%@ page language="java" contentType="text/html" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>Document Upload</title>
</head>
<body>
<h2>Document Upload</h2>
<form action="upload" method="post" enctype="multipart/form-data">
    <pre>
    Id: <input type="text" name="id"/>
    Document: <input type="file" name="document"/>
    <input type="submit" name="submit" value="Upload"/>
    </pre>
</form>
</body>
</html>