<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-25
  Time: 오후 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>trigger 테스트</title>
</head>
<body>
    <div>
        <form id="frm" action="/trigger" method="post">
            <input type="text" name="title" placeholder="글입력">
            <input type="submit" value="등록">
        </form>
    </div>

    <br><br>

    <h2>TEST_BOARD_1 (TABLE) - 일반</h2>
    <div>
        <c:forEach items="${list1}" var="item">
            <div>${item.i_board}</div>
            <div>${item.title}</div>
        </c:forEach>
    </div>

    <br><br>

    <h2>TEST_BOARD_2 (TABLE) - 스팸</h2>
    <div>
        <c:forEach items="${list2}" var="item">
            <div>${item.i_board}</div>
            <div>${item.title}</div>
        </c:forEach>
    </div>
</body>
</html>
