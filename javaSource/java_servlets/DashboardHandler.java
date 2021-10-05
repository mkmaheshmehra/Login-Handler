package java_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DashboardHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DashboardHandler() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		PrintWriter out = response.getWriter();
		dispatcher.include(request, response);
		
		out.println("<span style='color: green; font-size: 18px; text-align: center; margin-left: 40%'>"
				+ " Thanks ! Logged Out Successfully !!!</span>");
	}

}
