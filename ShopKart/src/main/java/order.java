import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/order")
	public class order extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("Order Sucessfully Placed");
		/*	
			String it = req.getParameter("item");
			String price = req.getParameter("price");
			System.out.println("item "+it);
			System.out.println("item "+price);
			
			
			cartDB c = new cartDB(it,price);
			c.JDBCconnect();
			
			System.out.println("item " + it );
			System.out.println("price " +price);
			req.getSession().setAttribute("cartlist", c.JDBCconnect());
			//c.JDBCconnect();
			RequestDispatcher rd = req.getRequestDispatcher("checkout.jsp");
			rd.forward(req, res);
			
			*/
			RequestDispatcher rd = req.getRequestDispatcher("logut.jsp");
			rd.forward(req, res);
			out.close();
			
		}
	}

