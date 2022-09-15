package javaservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class home
 */
@WebServlet("/home")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter pw=response.getWriter();
		
		response.setContentType("text/html");
		pw.println("<html><head><title>Employee Home Page</title><link rel=\"stylesheet\" href=\"style.css\"><head>");
		pw.println("<body><div class=\"container1\"><br><br><br><br><br><br><br><br><br><br><form>");
		pw.println("<img src=\"logo5.png\"style=\"width:200px;height:200px;border-radius:150px\">");
		pw.println("<h1>Welcome "+request.getParameter("Name"));
		pw.println("<br><button class=\"btn1\" style=\"background-color:red;color:white;width:200px;height:60px\"><a href='logout'style=\"color:white\">logout</a></button>");
		pw.println("</form></div></body></html>");
		//response.sendRedirect("logout");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
