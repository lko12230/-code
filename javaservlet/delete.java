package javaservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete
 */
@WebServlet("/profile2")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		String Id=request.getParameter("id");
		String Email = request.getParameter("email");
		String Mobile_Number = request.getParameter("mobile");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/trangile";
			String username1 = "root";
			String password1 = "Ayush@123";
			Connection conn = DriverManager.getConnection(url, username1, password1);
			String query = "delete from employee where Id=? and Email=? and Mobile_Number=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1,Integer.parseInt(Id));
			ps.setString(2, Email);
			ps.setString(3, Mobile_Number);
			int rs=ps.executeUpdate();
			if(rs>0)
			{
			pw.println("successfully deleted");
			}
			else {
				pw.println("not deleted");
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	
}

	}