package JDBC;
import java.sql.*;

import com.mysql.jdbc.Statement;

public class JDBCconnectivity {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root", "9597");
		java.sql.Statement st= cn.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
			int empid=rs.getInt("empno");
			String Name=rs.getString("Name");
			String city=rs.getString("city");
			System.out.println(empid+" "+" "+Name+" "+city);
			
		}
		st.close();

	}

}
