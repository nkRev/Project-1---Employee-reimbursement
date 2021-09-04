<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>$(ticket.id}</td>
				<td>${ticket.status}</td>
				<td>${ticket.email}</td>
				<td>${ticket.type}</td>
				<td>${ticket.amount}</td>
				<td>${ticket.time}</td>
				<td>${ticket.description}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>