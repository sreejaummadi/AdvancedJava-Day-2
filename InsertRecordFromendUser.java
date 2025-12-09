package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordFromendUser {
	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		// TODO Auto-generated method
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter the number of records to insert");
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {
					System.out.println("Enter Details for Record "+(i+1));
				System.out.println("Enter Employee number");
				int number =sc.nextInt();
				System.out.println("Enter employeee name");
				String name=sc.next();
				System.out.println("Enter salary");
				double salary=sc.nextDouble();
				System.out.println("Enter employee Address");
				String Address=sc.next();
				String insertQuery="insert into employee(eno,ename,esal,eaddr) values"
						+"("+number+",'"+name+ "',"+salary+",'"+Address+"')";
				int rowsAffected=st.executeUpdate(insertQuery);
				//String updateQuery="update employee set ename='"+name+"',"
				if(rowsAffected==1) {
					System.out.println(rowsAffected+"Record Inserted Sucessfully");
				}else {
					System.out.println("record Insertion failure");
				}
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}

	}

}
