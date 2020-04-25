<%--
  Created by IntelliJ IDEA.
  User: ZhangJunjie
  Date: 2020/4/24
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/customer/save.action">
	客户姓名：<input type="text" name="name"/><br>
	客户性别：<br>
	<input type="radio" name="gender" value="男"/>男<br>
	<input type="radio" name="gender" value="女"/>女<br>
	客户电话：<input type="text" name="telephone"/><br>
	客户地址：<input type="text" name="address"/><br>
	<input type="submit" value="保存">
</form>
</body>
</html>