

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con=null;
	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.jdbc.Driver");  //com.mysql.jdbc.driver //com.mysql.cj.jdbc.Driver  //oracle.jdbc.driver.OracleDriver
			 
			//step2 create  the connection object 
			 
		con=DriverManager.getConnection("jdbc:mysql://localhost:8080/product","root","nitin");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return con;
		
		}

}
