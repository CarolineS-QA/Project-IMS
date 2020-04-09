package com.qa.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ims {

	private Connection conn;
	private Statement stmt;

	public Ims() throws SQLException {
		conn = DriverManager.getConnection(DBConfig.DB_URL, DBConfig.USER, DBConfig.PASS);
		stmt = conn.createStatement();
	}

	public void close() throws SQLException {
		conn.close();
	}

	// CRUD methods
	public void createCustomer(String fName, String lName) throws SQLException {
		stmt.executeUpdate(
				"INSERT INTO customer (`first_name`, `last_name`)" + " VALUES ('" + fName + "', '" + lName + "')");
	}

	public void readCustomer() throws SQLException {
		ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
		while (rs.next()) {
			String name = rs.getString("first_name") + " " + rs.getString("last_name");
			System.out.println(name);
		}
	}

	public void updateCustomer(String fName, String lName, int id) throws SQLException {
		stmt.executeUpdate(
				"UPDATE actor SET first_name = '" + fName + "', last_name = '" + lName + "' WHERE customer_id = " + id);
	}

	public void deleteCustomer(int id) throws SQLException {
		stmt.executeUpdate("DELETE FROM customer WHERE customer_id = " + id);
	}
}
