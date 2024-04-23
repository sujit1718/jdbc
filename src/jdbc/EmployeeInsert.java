package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1. Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Establish Connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
		
		//3. Create Statements
		Statement statement = connection.createStatement();
		
		//4. Execute Statements & process the result 
		int result = statement.executeUpdate("INSERT INTO EMPLOYEE VALUES(3, 'Sudhir', 9543210, 3000.00, 'Latur'), (4, 'Amitesh', 9786453, 6000.00, 'Deccan'), (5, 'Om', 87634987, 1000.00, 'Dattawadi')");
		if(result!=0) {
			System.out.println("Data Inserted");
		}
		else {
			System.out.println("Data Not Inserted");
		}
		
		//5. Close Connection
		connection.close();
	}
}
