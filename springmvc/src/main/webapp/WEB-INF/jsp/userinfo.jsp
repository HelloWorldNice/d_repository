<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    用户名：${user.username} <br/>
    密码：${user.password} <br/>
    出生日期： <fmt:formatDate value="${user.born}" pattern="yyyy-MM-dd HH:mm:ss"></fmt:formatDate> <br/>
    年龄：${user.age} <br/>

    <c:forEach items="${user.addressList}" var="address">
        省份：${address.province}
        城市：${address.city}
        <br/>
    </c:forEach>


</body>
</html>
