package servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import model.Reimbursement;

@WebServlet("/SubmitTicket")
public class SubmitTicketServlet extends HttpServlet {

	// default submit status is pending
	// technically finished.. needs to be tested

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.setContentType("text/html");

		ReimbursementDAO dao = ReimbursementDaoFactory.getDao();

		Reimbursement r = new Reimbursement();

		// for realtime date
		java.util.Date date;
		java.sql.Date sqlDate;

		date = new java.util.Date();
		sqlDate = new java.sql.Date(date.getTime());

		// get input data from html
		Date submitDate = sqlDate;

		String reimburseType = req.getParameter("Ticket");

		double dollarAmt = Double.parseDouble(req.getParameter("Dollar-Amount"));

		String desc = req.getParameter("Reason");

		String status = "pending";

		// read saved cookie from EmployeeTicketListServlet
		Cookie c[] = req.getCookies();

		// just curious on how many cookies would be returned...
		for (Cookie cookie : c) {
			System.out.println(cookie);
		}

		String email = c[1].getValue();

		// set data as Reimbursement Object
		r.setDescription(desc);
		r.setDollarAmt(dollarAmt);
		r.setEmail(email);
		r.setReimbursementStatus(status);
		r.setReimbursementType(reimburseType);
		r.setSubmitDate(submitDate);

		dao.createReimbursement(r);

		res.sendRedirect("/EmployeeTicketListServlet");

	}

}
