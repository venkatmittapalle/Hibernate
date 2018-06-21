import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



	@WebServlet(urlPatterns="/shoppingslist")
	public class shopl extends HttpServlet{

		public void doPost(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			
			ShopDB c = new ShopDB();
			req.getSession().setAttribute("cartlist", c.JDBCconnect());
			c.JDBCconnect();
			
		}
	}