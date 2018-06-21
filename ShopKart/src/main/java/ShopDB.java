import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.tag.el.core.OutTag;


import java.lang.*;

public class ShopDB {
	//private String item = null;
	//private int price = (Integer) null;
	public List<CartObject> cartlist = new ArrayList<CartObject>();
	
	
	/*public void CartObject(String item, int price) {
		this.item = item;
		this.price = price;
		
		
	}*/
	

	public  List<CartObject> JDBCconnect()  {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//com.mysql.jdbc.Driver
		Connection con=DriverManager.getConnection
		("jdbc:oracle:thin:@localhost:1521/orcl","venkat","venkat");
	
		
		PreparedStatement stmt=con.prepareStatement("select * from user_items");  
		System.out.println("start to retreive items...");
		ResultSet rs=stmt.executeQuery(); 
		while(rs.next()) {
			String item = rs.getString("item");
			String price = rs.getString("price");
			System.out.println(item + " > " + price);
			cartlist.add(new CartObject(item, price));
			
			
		}

		
		con.close();
		stmt.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	
	
	return cartlist;
	}

}
