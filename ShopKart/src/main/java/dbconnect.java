import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/checkdb")
	public class dbconnect extends HttpServlet{

		public void doPost(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Welome to Kart!");
			out.println("Account Already Exists");
			
			String un = req.getParameter("user");
			String pwd = req.getParameter("password");
			String email = req.getParameter("email");
			
			CheckR c = new CheckR(un,pwd,email);
			c.JDBCconnect();
			boolean b=c.check;
			System.out.println(c.check);
			System.out.println("--------"+b);
			if(b==false) {
				out.println("Account Already Exists");
				res.sendRedirect("login.jsp");
			}
			else
			{
				//res.sendRedirect("login.jsp");
			RegisterDBservice reg = new RegisterDBservice(un,pwd,email);
			reg.JDBCconnect();
			
			System.out.println("User " + un );
			System.out.println("password " +pwd);
			System.out.println("Email " +email);
			
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
			}
			
//			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
//			rd.forward(req, res);
			out.close();
			
		}
	}