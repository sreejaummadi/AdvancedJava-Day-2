package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordsFromuser {
	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
			//delete one record
			Scanner sc =new Scanner(System.in);
			System.out.println("");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
