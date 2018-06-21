import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnect {
	
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

}
