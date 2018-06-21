import java.io.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(urlPatterns="/venkiloginn")

public class welcomservlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res, HttpSession session) 
			throws ServletException, IOException{
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		/*
		String un = req.getParameter("user");
		String pwd = req.getParameter("password");
		
		CheckD c = new CheckD(un,pwd);
		c.JDBCconnect();
		
		if(c.check) {
			res.sendRedirect("welcome.jsp");
		}
		else
		{
			res.sendRedirect("login.jsp");
		}
		
		*/
	


		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, res);
		out.close();
		
	}
	}



