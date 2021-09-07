package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reimbursement;


public class EmployeeTicketListServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Should work!
	 * 
	 * it retrieves email from the url rewrite then it grabs all the reimbursement
	 * tickets submitted by that employee and then sends it to EmployeeTickets.jsp
	 * 
	 * 
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		
		// gets email... don't ask but login.html has the real answer...
		String email = req.getParameter("Username");

		ReimbursementDAO dao = ReimbursementDaoFactory.getDao();

		List<Reimbursement> reimbursements = dao.getReimbursementByEmail(email);
		
		req.setAttribute("listReimbursements", reimbursements);

		Cookie c = new Cookie("email", email);

		res.addCookie(c);

		RequestDispatcher dispatch = req.getRequestDispatcher("EmployeeTickets.jsp");

		dispatch.forward(req, res);

	}

}
