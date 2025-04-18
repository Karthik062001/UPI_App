package com.learn.maven.upi.UPI_App;

import org.json.JSONArray;
import org.json.JSONObject;
import java.sql.*;

public class JsonFetch extends DataConnect {

	public static JSONObject getJSON()
	{
	
		JSONObject obj1=new JSONObject();
		
//		System.out.println(obj1.get("id", rs.getInt("id")));
//		obj1.get("Reciever name"+rs.getString("reciever_name"));
//		obj1.get("Amount sent"+rs.getInt("Amount_sent"));
//		obj1.get("Balance"+rs.getInt("balance"));
		
		return obj1;
		
	}
}
