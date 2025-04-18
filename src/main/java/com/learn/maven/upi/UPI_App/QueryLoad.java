package com.learn.maven.upi.UPI_App;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class QueryLoad {

	static Properties property=new Properties();
	
     static
	{
	    try
	    {
		     InputStream input = QueryLoad.class.getResourceAsStream("queries.properties");
		     property.load(input);
	    }
	     catch (Exception e)
	     {
		    e.printStackTrace();
	     }

	 }
     
     public static String getProperty(String key)
     {
    	 return property.getProperty(key);
     }
	
}
