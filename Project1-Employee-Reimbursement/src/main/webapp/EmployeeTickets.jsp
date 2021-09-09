<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home Page</title>

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/table.css">

</head>
<body>
	<div class="container">
		<h1 style="padding-bottom: .5rem;">
			Tickets <br> <a href="TicketSubmit.html" class="btn btn-primary">Create
				New Ticket</a>
		</h1>
		<table align="center" id="table-2">
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
	</div>

</body>
</html>