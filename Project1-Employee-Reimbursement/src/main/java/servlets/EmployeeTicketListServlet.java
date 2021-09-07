package servlets;

import java.io.IOException;
import java.util.List;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Reimbursement;

@WebServlet("/EmployeeTicketListServlet")
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
