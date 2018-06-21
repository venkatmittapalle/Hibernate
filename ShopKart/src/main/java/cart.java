import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/cart")
	public class cart extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Welome to Kart!");
			
			String it = req.getParameter("item");
			String price = req.getParameter("price");
			System.out.println("item "+it);
			System.out.println("item "+price);
			
			
			cartDB c = new cartDB(it,price);
			c.JDBCconnect();
			
			System.out.println("item " + it );
			System.out.println("price " +price);
			//req.getSession().setAttribute("cartlist", c.JDBCconnect());
			//req.getSession().setAttribute("key", it);
			
			req.getSession().setAttribute("key1", it);
			req.getSession().setAttribute("key2", price);
			
			
			//c.JDBCconnect();
			RequestDispatcher rd = req.getRequestDispatcher("checkout.jsp");
			rd.forward(req, res);
			
			
			//RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			//rd.forward(req, res);
			out.close();
			
		}
	}

