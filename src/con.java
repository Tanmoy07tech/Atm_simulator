import java.sql.*;
public class con{

	Connection c;
	Statement s;
	public con(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project6","root","dbms123");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
