package java_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginHandler() {
        super();
        
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		RequestDispatcher dispatcher = null;
		
		if(email.equals("simplilearn@gmail.com") && password.equals("simplilearn123")) {
			dispatcher = request.getRequestDispatcher("dashboard.jsp");
			dispatcher.forward(request, response);
		} else {
			dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.include(request, response);
			PrintWriter out = response.getWriter();
			out.print("<span style='color: red; margin-left: 40%'>Invalid Credentials</span>");
		}
	}

}
