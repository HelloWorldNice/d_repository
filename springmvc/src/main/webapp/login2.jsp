<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function(){
            $("#loginBtn").click(function(){
                // 1、获取表单数据
                var username = $("input[name='username']").val();
                var password = $("input[name='password']").val();
                var age = $("input[name='age']").val();

                // 2、构造json对象
                var requestData = {"username":username , "password": password , "age":age};

                $.ajax({
                    url:"${pageContext.request.contextPath}/user/login2",
                    type: "POST",
                    data: JSON.stringify(requestData), // JSON.stringify将json对象转换成json格式化字符串
                    contentType: "application/json;charset=utf-8",
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
