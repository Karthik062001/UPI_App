package com.learn.maven.upi.UPI_App;

import java.sql.*;

import org.json.JSONArray;
import org.json.JSONObject;

public class DataConnect {


	public static void transaction(String reciever, int amount, int balance) 
	{
		try {
		Connection con=DatabaseConnection.getConection();
		String sql=QueryLoad.getProperty("insertProperties");
		PreparedStatement ps=con.prepareStatement(sql);
	
		ps.setString(1, reciever);
		
		ps.setInt(2, amount);
		
		ps.setInt(3,balance);
		
		ps.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
	}
	public static void getTransactionHistory()
	{
		JSONArray arr= new JSONArray();
		try {
			Connection con=DatabaseConnection.getConection();
			String sql1=QueryLoad.getProperty("getPaymentHistory");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql1);
			
			while(rs.next())
			{
				JSONObject json=new JSONObject();
				json.put("Id", rs.getInt("id"));
				json.put("Reciever name", rs.getString("reciever_name"));
				json.put("Amount sent", rs.getInt("Amount_sent"));
				json.put("Balance", rs.getInt("balance"));
				arr.put(json);
			//	System.out.println(arr);
				//System.out.println("Id : "+rs.getInt("id")+",   Reciever name : "+rs.getString("reciever_name")+",   Amount sent : "+rs.getInt("Amount_sent")+",   Balance : "+rs.getInt("balance"));
			}
			System.out.println(arr);
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
