import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/registerplz")
	public class Regservlet extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			rd.forward(req, res);
			out.close();
			
		}
	}
