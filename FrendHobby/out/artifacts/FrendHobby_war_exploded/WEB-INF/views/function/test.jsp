<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-29
  Time: 오전 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>function 테스트</title>
</head>
<body>
    <div>
        <form id="frm" action="/function" method="post">
            <input type="number" name="i_board" placeholder="숫자만 입력" />
            <input type="submit" value="전송">
        </form>
    </div>

    <div>
        <h4>값 : ${result}</h4>
        <h4>테스트 : ${test}</h4>
    </div>
</body>
</html>
