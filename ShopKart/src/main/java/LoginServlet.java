import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



	@WebServlet(urlPatterns="/venkilogin")
	public class LoginServlet extends HttpServlet{

		public void doPost(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Inavlid Credentials!");
			
			String un = req.getParameter("user");
			String pwd = req.getParameter("password");

			out.print(un + " : " + pwd);
			CheckD c = new CheckD(un,pwd);
			c.JDBCconnect();
			
			if(c.check) {

				
				res.sendRedirect("welcome.jsp");
			}
			else
			{
				
				req.setAttribute("errorMessage", "Wrong Login Creds");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.include(req, res);
				System.out.println("Error in login !!");

			//	res.sendRedirect("login.jsp");
			}
			out.close();
			
		}
	}