import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


	@WebServlet(urlPatterns="/server")
	public class Serverlist extends HttpServlet{

		public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException{
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			RequestDispatcher rd = req.getRequestDispatcher("serverlist.jsp");
			rd.forward(req, res);
			out.close();
			
		}
	}