import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.lang.*;

public class ServerDB {
	
    public String item=null;
    public String price=null;
	
	
	public ServerDB(String it, String price) {
		
		this.item = it;
		this.price = price;

		
	}
	
	public void JDBCconnect()  {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
	
		
		PreparedStatement stmt=con.prepareStatement("insert into user_items values(?,?)");  
		stmt.setString(1,item);  
		stmt.setString(2,price); 
		  
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
