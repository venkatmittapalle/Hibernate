import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.*;

public class RegisterDBservice {
	
    public String Username=null;
    public String Password=null;
    public String Email=null;
	
	
	public RegisterDBservice(String un, String pwd, String email) {
		
		this.Username = un;
		this.Password = pwd;
		this.Email = email;
		
	}
	
	public void JDBCconnect()  {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
		PreparedStatement stmt=con.prepareStatement("insert into user_details values(?,?,?)");  
		stmt.setString(1,Username);  
		stmt.setString(2,Password); 
		stmt.setString(3, Email);		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		con.close();
		stmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
