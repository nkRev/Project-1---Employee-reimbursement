package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import model.Reimbursement;


@jakarta.servlet.annotation.WebServlet("/accept-ticket")
public class AcceptTicketServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>fsdad</h1>");
		
		ReimbursementDAO dao = ReimbursementDaoFactory.getDao();
		
		Reimbursement r;
		
		//get ticket id
		int id = Integer.parseInt(req.getParameter("id"));
		
		r = dao.getReimbursementsById(id);
		
		System.out.println(r.getReimbursementStatus());
		
		r.setReimbursementStatus("accepted");
		
		System.out.println(r.getReimbursementStatus());
		
		dao.updateReimbursement(r);
		
		
	}
	
	
}
