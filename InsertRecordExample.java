package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecordExample {
	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
				String sqlQuery="insert into employee(eno,ename,esal,eaddr)"
						+"values(111,'malli',60000,'hyd')";
				int rowsAffected=st.executeUpdate(sqlQuery);
				if(rowsAffected==1) {
					System.out.println("Records inserted successfully");
				}else {
					System.out.println("Record insertion failed");
				}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
	}

}
