package JDBCPrograme1;
import java.sql.*;

public class Programe1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="Adharsh@2000";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			DriverManager.getConnection(url, username, password);
			System.out.println("Connection established successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
