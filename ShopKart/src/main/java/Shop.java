import java.io.*;
import java.sql.SQLException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;



	@WebServlet(urlPatterns="/shoppinglist")
	public class Shop extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			System.out.println("inside shop.java ");
			ShopDB c = new ShopDB();
			req.getSession().setAttribute("cartlist", c.JDBCconnect());
			//c.JDBCconnect();
			RequestDispatcher rd = req.getRequestDispatcher("cart.jsp");
			rd.forward(req, res);
			
			
		}
	}