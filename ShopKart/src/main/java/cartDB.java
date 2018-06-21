import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;

public class cartDB {
	
    public String item=null;
    public String price=null;
	public List<CartObject> cartlist = new ArrayList<CartObject>();

	
	
	public cartDB(String it, String price) {
		
		this.item = it;
		this.price = price;

		
	}
	
	public void JDBCconnect()  {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
	
		
		PreparedStatement smt=con.prepareStatement("insert into user_cart values(?,?)");  
		smt.setString(1,item);  
		smt.setString(2,price); 		  
		int i=smt.executeUpdate();  
		System.out.println(i+" records inserted");  
		
		PreparedStatement stmt=con.prepareStatement("select * from user_items");  
		System.out.println("start to retreive items from cart...");
		ResultSet rs=stmt.executeQuery(); 
		while(rs.next()) {
			String item = rs.getString("item");
			String price = rs.getString("price");
			System.out.println(item + " > " + price);
			cartlist.add(new CartObject(item, price));
			
			
		}
		con.close();
		stmt.close();
		smt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//return cartlist;
	}


	
}
