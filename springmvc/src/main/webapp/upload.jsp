<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/upload"
          method="post"
          enctype="multipart/form-data">
        头像：<input type="file" name="touxiang"><br/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>
