package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeFetch {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");
        while(resultSet.next())
        {
        	System.out.print(resultSet.getInt("id")+".  ");
        	System.out.print(resultSet.getString("name")+"  ");
        	System.out.print(resultSet.getDouble("price")+"  ");
        	System.out.print(resultSet.getDouble("salary")+"  ");
        	System.out.print(resultSet.getString("address")+"  ");
        	System.out.println();
        }
        connection.close();
	}

}
