package com.codegnan.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchingRecords {
	private static final String url="jdbc:mysql://localhost:3306/jfs42advjava";
	private static final String username ="root";
	private static final String password="root2";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(url, username, password);
				Statement st=con.createStatement()){
			String selectquery="select *from employee";
			ResultSet resultset=st.executeQuery(selectquery);
			System.out.println("ENO\tEname\tEsal\tEaddr");
			System.out.println("===============================");
			while(resultset.next()) {
				int eno=resultset.getInt(1);
				String ename=resultset.getString(2);
				double esal=resultset.getDouble(3);
				String eaddr=resultset.getString(4);
				System.out.println(eno +"\t" +ename+"\t"+esal+"\t"+ eaddr);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
