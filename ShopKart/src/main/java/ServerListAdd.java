import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/serverlistadd")
	public class ServerListAdd extends HttpServlet{

		public void doPost(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Items Added to the Database!");
			
			String it = req.getParameter("item");
			String price = req.getParameter("price");
			

				//res.sendRedirect("login.jsp");
			ServerDB reg = new ServerDB(it,price);
			reg.JDBCconnect();
			
			System.out.println("Item " + it );
			System.out.println("Price " + price);

			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, res);
			
			//RequestDispatcher rd = req.getRequestDispatcher("serverlisting.jsp");
			//rd.forward(req, res);
			out.close();
			
		}
	}