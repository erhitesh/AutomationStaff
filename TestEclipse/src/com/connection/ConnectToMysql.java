package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class ConnectToMysql {
	
	//Global Declarations;
	static Connection conn;
	static Statement smt;
	static ResultSet result;
	
	// Global Variable Declarations
	static String driverClassName = "com.mysql.jdbc.Driver";
	static String dbUrl = "jdbc:mysql://localhost:3307/kiwitech";
	static String userName = "root";
	static String userPassword = "kiwitech";
	static String sqlQuery = "select * from employee;";
	static String queryResult = "";
	
	// Register Driver CLass
	public static void registerDriverClass() {
		try {
			Class.forName(driverClassName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCreateConnction() {
		try {
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// Create Statement
	public static Statement getStatement() {
		try {
			smt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return smt;
	}
	
	public static List<String> executeQuery() {
		List<String> info = null;
		try {
			result = smt.executeQuery(sqlQuery);
			while (result.next())
				queryResult = result.getString(2) + " " +result.getString(3);
				//info.add(result.get);
				System.out.println(queryResult);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return info;
	}
	
	public static void createConnection() {
		registerDriverClass();
		getCreateConnction();
		getStatement();
		executeQuery();
	}
	
	public static void main(String args[]) {
		createConnection();
	}

}
