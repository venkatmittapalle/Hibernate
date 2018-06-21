import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.*;

public class CheckR {
	boolean check=false;
    public String Username=null;
    public String Password=null;
    public String Email=null;
	
	
	public CheckR(String un, String pwd, String email) {
		
		this.Username = un;
		this.Password = pwd;
		this.Email = email;
		
	}
	
	public boolean JDBCconnect()  {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
	
		
		PreparedStatement stmt=con.prepareStatement("select * from user_details where username = (?)");  
		stmt.setString(1,Username);  
		ResultSet rs=stmt.executeQuery(); 
		
		while(rs.next()) {
			if(rs.getString("username").equals(Username) && rs.getString("pwd").equals(Password) && rs.getString("email").equals(Email)) {
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
}
