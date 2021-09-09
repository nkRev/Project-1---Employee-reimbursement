<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager Ticket Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/table.css">

</head>
<body>

	<div class="container">

		<h1>Tickets</h1>
		<input  type="text" 
				id="myFilter" 
				onkeyup="filterFunction()"
				placeholder="sort by status"
		>

		<table id="table-1">
			<thead>
				<tr>
					<th>Id</th>
					<th>Status</th>
					<th>Employee Email</th>
					<th>Type</th>
					<th>$ amount</th>
					<th>Time Stamp</th>
					<th>Description</th>
					<th>Accept Request</th>
					<th>Reject Request</th>
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
						<td><a
							href="accept-ticket?id=<c:out value='${ticket.reimbursementId}' />">Accept</a>

						</td>
						<td><a
							href="reject-ticket?id=<c:out value='${ticket.reimbursementId}' />">Reject</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<script>
		function filterFunction() {
			var input, filter, table, tr, td, i, txtValue;
			input = document.getElementById("myFilter");
			filter = input.value.toUpperCase();
			table = document.getElementById("table-1");
			tr = table.getElementsByTagName("tr");

			for (i = 0; i < tr.length; i++) {
				td = tr[i].getElementsByTagName("td")[1];
				if (td) {
					txtValue = td.textContent || td.innerText;
					if (txtValue.toUpperCase().indexOf(filter) > -1) {
						tr[i].style.display = "";
					} else {
						tr[i].style.display = "none";
					}
				}
			}
		}
	</script>

</body>
</html>