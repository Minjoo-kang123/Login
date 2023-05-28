package com.example.myapp;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement;  
import org.junit.Test;  
public class MssqlTest { 	 
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 	 
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=home_db"; 	 
	private static final String USER = "mjkang"; //DB ����ڸ� 	 
	private static final String PW = "1234";   //DB ����� ��й�ȣ  	 
	@Test 	 public void testConnection() throws Exception{  		 
		Class.forName(DRIVER); //com.microsoft.sqlserver.jdbc.SQLServerDriver JDBC Driver class �ε�  		 
		Connection con = DriverManager.getConnection(URL, USER, PW); // java.sql.Connection ��ü����  		 
		try{ 			 
			System.out.println(con); 			  			 
			System.out.println(con.isClosed()); // connection ���� ����  			 
			Statement stmt = con.createStatement(); // Statement ��ü����  			 
			String sql = "select memberId from member"; // ������  			 
			ResultSet rs = stmt.executeQuery(sql); //   			 
			while(rs.next()) { 				 
				System.out.println(rs.getString("memberId")); 			 
				}  			 
			con.close();  			 
			System.out.println(con.isClosed()); 		 
			}catch (Exception e) { 			 
				e.printStackTrace(); 		 
				}finally { 			
					con.close(); 		 
					} 	
		}
	}
