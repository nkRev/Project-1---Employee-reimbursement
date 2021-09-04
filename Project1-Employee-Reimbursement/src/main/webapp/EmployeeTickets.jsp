<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center"><a href="TicketSubmit.html">Create new Ticket</a></h1>
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