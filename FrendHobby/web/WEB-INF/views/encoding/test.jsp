<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-27
  Time: 오후 8:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>encoding 테스트</title>
</head>
<body>
    <%-- encoding test   --%>
    <form id="frm" action="/encoding" method="post">
        <input type="text" name="JY" placeholder="TEST">
        <input type="submit" value="등록">
    </form>

    <br><br>

    <div>
        <c:forEach items="${list}" var="item">
            <div>${item.JY}</div>
        </c:forEach>
    </div>
</body>
</html>
