package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
				/*String sqlQuery="update employee set ename='arjun' ,"
				+"esal=75000, eaddr='bng' where eno=111";*/
			String sqlQuery="delete from employee where eno=111";
				int rowsAffected=st.executeUpdate(sqlQuery);
				if(rowsAffected==1) {
					System.out.println("Records deleted successfully");
				}else {
					System.out.println("Record deletion failed");
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
	}

}
