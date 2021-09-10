package servlets;

import java.io.IOException;
import java.sql.Date;

import org.apache.log4j.Logger;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import model.Reimbursement;

@WebServlet("/SubmitTicket")
public class SubmitTicketServlet extends HttpServlet {

	static Logger log = Logger.getRootLogger();

	// default submit status is pending
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

		String email = c[0].getValue();

		// set data as Reimbursement Object
		r.setDescription(desc);
		r.setDollarAmt(dollarAmt);
		r.setEmail(email);
		r.setReimbursementStatus(status);
		r.setReimbursementType(reimburseType);
		r.setSubmitDate(submitDate);

		dao.createReimbursement(r);

		log.info(r.getEmail() + "'s ticket is submitted; pending approval");
		res.sendRedirect("EmployeeTicketListServlet?Username=" + email);


	}

}
