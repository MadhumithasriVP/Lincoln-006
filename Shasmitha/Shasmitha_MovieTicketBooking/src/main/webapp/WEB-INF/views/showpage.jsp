<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Movie Ticket Booking</h1>
<form:form action="calculateCost" modelAttribute="ticket" method="post"><br>
Movie Name <form:input path="movieName" name="movieName"/><br>
Choose Circle: <form:select path="circleType" name="circleType" id="circleType">
<form:options items="${circleList}"/>
</form:select>             
Number of Tickets <form:input path="noOfTickets" name="noOfTickets"/><br>
<input type="submit" name="submit" value="CalculateCost">
</form:form>
</center>

</body>
</html>	 	  	    	    	     	      	 	
