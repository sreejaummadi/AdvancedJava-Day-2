package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecordsFromUser {
	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
			Scanner sc =new Scanner(System.in);
			//System.out.println("Enter Employee id to update Record");
			System.out.println("Enter Threshold Salary");
			double salary=sc.nextDouble();
			/*update single record 
			 * String sqlQuery="update employee set ename='arjun' ,"
					+"esal=75000, eaddr='bng' where eno="+number+"";*/
			//update multiple records
			String sqlQuery="update employee set esal=50000 where esal<"+salary+"";
			int rowsAffected=st.executeUpdate(sqlQuery);
			if(rowsAffected==1) {
				System.out.println("Records updated successfully");
			}else {
				System.out.println("Record updation failed enter valid eno");
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
	}

}
//update multiple records
//delete one record 
//delete multiple records
