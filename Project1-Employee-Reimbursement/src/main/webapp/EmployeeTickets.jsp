<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">
		<a href="TicketSubmit.html">Create new Ticket</a>
	</h1>
	<table align="center" id="table-2">
		<caption>Tickets</caption>
		<thead>
			<tr>
				<th>Id</th>
				<th>Status</th>
				<th>Employee Email</th>
				<th>Type</th>
				<th>$ amount</th>
				<th>Time Stamp</th>
				<th>Description</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ticket" items="${listReimbursements}">
				<tr>
					<td><c:out value="${ticket.reimbursementId}" /></td>
					<td><c:out value="${ticket.reimbursementStatus}" /></td>
					<td><c:out value="${ticket.email}" /></td>
					<td><c:out value="${ticket.reimbursementType}" /></td>
					<td><c:out value="${ticket.dollarAmt}" /></td>
					<td><c:out value="${ticket.submitDate}" /></td>
					<td><c:out value="${ticket.description}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>