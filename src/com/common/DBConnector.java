package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String USER = "osfu";
	private static final String PASSWORD= "12345678";
	private static final String CLASS_NAME = "oracle.jdbc.OracleDriver";
	private static Connection con = null;
	//초기화 부분~~!!!!
	
	public static void setDriver()  {
				try {
					Class.forName(CLASS_NAME);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
}	
	public static void open()  {
		setDriver();
		try {
			 con = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static Connection getCon() {
	open();
	return con;
	}
}