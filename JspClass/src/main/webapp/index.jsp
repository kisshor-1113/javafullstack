<%@ page language="java" import="java.util.Date" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="Login.html" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c : out value="Hello jstl" />
Current Date <%=new Date() %>
<h2>Hello jar</h2>

</body>
</html>