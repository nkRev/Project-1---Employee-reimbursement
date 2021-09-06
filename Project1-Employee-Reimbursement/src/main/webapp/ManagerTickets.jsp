<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Ticket view</title>
</head>
<body>
	<table align="center" id="table-1">
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
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="tickets" items="${listReimbursement}">
			<tr>
				<td>$(ticket.id}</td>
				<td>${ticket.status}</td>
				<td>${ticket.email}</td>
				<td>${ticket.type}</td>
				<td>${ticket.amount}</td>
				<td>${ticket.time}</td>
				<td>${ticket.description}</td>
				<td>
					<a href="edit?id=<c:out value='${ticket.id}' />">update status</a>
					
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>