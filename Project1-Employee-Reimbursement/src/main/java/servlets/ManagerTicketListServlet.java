package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Reimbursement;

@WebServlet("/ManagerTicketListServlet")
public class ManagerTicketListServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<h1>fsdad</h1>");
		
		ReimbursementDAO dao = ReimbursementDaoFactory.getDao();
		
		List<Reimbursement> reimbursements = dao.getAllReimbursements();
		
		req.setAttribute("listReimbursements", reimbursements);
		
		RequestDispatcher dispatch = req.getRequestDispatcher("ManagerTickets.jsp");
		
		dispatch.forward(req, res);
		
	}
	
	
}
