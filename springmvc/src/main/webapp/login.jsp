<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function(){
            $("#loginBtn").click(function(){
                // 发送异步请求
                $.ajax({
                    url:"${pageContext.request.contextPath}/user/login",
                    type: "POST",
                    data: $("#form").serialize(),
                    dataType: "json",
                    success: function(respData){
                        console.info(respData);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <form id="form">
        用户名：<input type="text" name="username"><br/>
        密码：<input type="text" name="password"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="button" id="loginBtn" value="登录"/>
    </form>
</body>
</html>
