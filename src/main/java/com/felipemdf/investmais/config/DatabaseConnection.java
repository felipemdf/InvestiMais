package com.felipemdf.investmais.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static final String DATABASE_URL = "jdbc:sqlite:investmais.db";
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(DATABASE_URL);
    }
}