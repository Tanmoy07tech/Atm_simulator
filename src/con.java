import java.sql.*;
public class con{

	Connection c;
	Statement s;
	public con(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project6","root","dbms123");
        s=c.createStatement();
        
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
