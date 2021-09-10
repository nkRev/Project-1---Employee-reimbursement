package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

import dao.UserDaoImpl;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;


public class LoginServlet extends HttpServlet {
	private UserDaoImpl dao;
	static Logger log = Logger.getRootLogger();


	// technically finished; may need to be revised
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

		log.info("Login Servlet");

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		UserDaoImpl udao = new UserDaoImpl();

		String email = req.getParameter("Username");
		String password = req.getParameter("Password");
		log.info("email: " + email + "password: " + password);
		User u = udao.getUserByEmail(email);

		if (u.getEmail().equals(email) && u.getPassword().equals(password)) {

			if (u.isManager() == true) {

				log.info("Manager? " + u.isManager());
				res.sendRedirect("ManagerTicketListServlet");

			} else {
				log.info("Manager? " + u.isManager());

				res.sendRedirect("EmployeeTicketListServlet?Username=" + u.getEmail());

			}
		} else {
			log.info("Wrong credentials, go back to login");
			out.println("<h3>Wrong login credentials, please try again</h3>");
			res.sendRedirect("Login.html");
		}

	}


}
