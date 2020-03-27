<%@page import="com.bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<body bgcolor="lavender">
<%
Object obj=request.getAttribute("login");
LoginBean loginBean=(LoginBean)obj;
%>
<h2> Login Successful !!! Welcome <%= loginBean.getUserName() %></h2>
</body>