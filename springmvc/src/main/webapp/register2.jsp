<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>用户注册</h1>
    <form action="${pageContext.request.contextPath}/user/register5" method="post">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        年龄：<input type="text" name="age"><br/>

        省份1: <input type="text" name="addressMap['address1'].province"><br/>
        城市1: <input type="text" name="addressMap['address1'].city"><br/>

        省份2: <input type="text" name="addressMap['address2'].province"><br/>
        城市2: <input type="text" name="addressMap['address2'].city"><br/>

        省份3: <input type="text" name="addressMap['address3'].province"><br/>
        城市3: <input type="text" name="addressMap['address3'].city"><br/>

        <input type="submit" value="注册"/>
    </form>
</body>
</html>
