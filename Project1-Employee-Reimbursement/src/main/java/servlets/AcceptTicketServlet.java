package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReimbursementDAO;
import dao.ReimbursementDaoFactory;
import model.Reimbursement;


@WebServlet("/accept-ticket")
public class AcceptTicketServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
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
