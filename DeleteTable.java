package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTable {
private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
private static final String username ="root";
private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
			Statement st=con.createStatement()){
			String sqlQuery="drop table if Exists employee";
			int result=st.executeUpdate(sqlQuery);

				System.out.println("Table droped Sucessfully");
			
				//System.out.println("table dropped failure");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
