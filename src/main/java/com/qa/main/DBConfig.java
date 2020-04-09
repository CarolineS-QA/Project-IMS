package com.qa.main;

public final class DBConfig {

	public static final String DB_URL = "jdbc:mysql://35.242.180.3/ims";
	public static final String USER = "root";
	public static final String PASS = "root";

	private DBConfig() {
	}

}

/*
 * DB_URL = jdbc:mysql://instance_public_ip/name_of_database
 * 
 * user defaults to root when creating instance
 * 
 * pass is set upon GCP instance creation - change as required
 */
