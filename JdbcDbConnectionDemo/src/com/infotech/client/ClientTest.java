package com.infotech.client;

import java.sql.Connection;

import com.infotech.util.DBUtil;
import com.infotech.util.DBUtil2;
import com.infotech.util.DBUtil3;

public class ClientTest {

	public static void main(String[] args) {

		Connection connection = DBUtil.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection is taken..");
		Connection connection2 = DBUtil2.getConnection();
		if(connection2 != null)
			System.out.println("JDBC:connection is taken..");
		
		Connection connection3 = DBUtil3.getConnection();
		if(connection3 != null)
			System.out.println("JDBC:connection is taken..");
	}

}
