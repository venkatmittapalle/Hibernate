import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

public class CheckD {
	
	boolean check=false;
    public String Username=null;
    public String Password=null;
    
    
 public  CheckD(String un, String pwd) {
		
		this.Username = un;
		this.Password = pwd;
		
	}
 /*
 public Connection getMe(){
	 Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		con = DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
 }
 */
	public boolean JDBCconnect()  {
		
//		JDBCDriver driver = new JDBCDriver();
//		Connection con=driver.getMe();
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
	
		
		PreparedStatement stmt= con.prepareStatement("select * from user_details where username = (?)");  
		stmt.setString(1,Username);  
		ResultSet rs=stmt.executeQuery(); 
		
		while(rs.next()) {
			if(rs.getString("username").equals(Username) && rs.getString("pwd").equals(Password)) {
				check = true;
				return check;
			}
			else {
				check = false;
			}
		}
		//int i=stmt.executeUpdate();  
		//System.out.println(i+" records inserted");  
		con.close();
		stmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return check;
	}
	




	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
    

}


