package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDaoImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private UserDaoImpl dao;
	

	// technically finished; may need to be revised
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		UserDaoImpl udao = new UserDaoImpl();

		String email = req.getParameter("Username");
		String password = req.getParameter("Password");

		User u = udao.getUserByEmail(email);

		if (email == u.getEmail() && password == u.getPassword()) {

			if (u.isManager() == true) {

				res.sendRedirect("/ManagerTicketListServlet");

			} else {

				res.sendRedirect("/EmployeeTicketListServlet?Username=" + u.getEmail());

			}
		} else {

			out.println("<h3>Wrong login credentials, please try again</h3>");

		}

	}
}
