package com.zensar.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.jasper.tagplugins.jstl.core.Catch;

public class DBConnect {
private static String url="jdbc:mysql://localhost:3306/student";
private static String username="root";
private static String password="root";

Connection con=null;

Class.forName("com.mysql.jdbc.Driver");
   con=DriverManager.getConnection(url,username,password);
   System.out.println(con);
   
 
}
