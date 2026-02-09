<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Result</h4> <%=12*12 %>
<%//expression
int a = 9;
int b = 10;
%>
<h2>Sum=</h2><%=a +b %>
<%!  //! is used for method
int square(int x)
{
	return x * x;
}
%>
<h2>square=</h2><%=square(6) %>

<%!

String checkAge(int age){
	if(age>18)
		return "Eligible";
	else
		return "Non eligible";
}
%>
<h1>Result: </h1><%= checkAge(20) %>
</body>
</html>