package com.java.LibraryManagementJDBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2
{
public static void main(String args[]) throws SQLException
{  
//String url="jdbc:mysql://localhost:3306/university";
//String uname="root";
//String password="root123";
String query="select *from book";
try
{
Class.forName("com.mysql.jdbc.Driver");  
}catch(ClassNotFoundException e)
{ 
e.printStackTrace();
}  

try{ 																				  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymgmt","root","Test123@");  
//here university is database name, root is username and password  
Statement statement=con.createStatement();  
ResultSet result=statement.executeQuery(query);  

while(result.next())  
{
String UniversityData="";
for(int i=1;i<=4;i++)
{
UniversityData += result.getString(i) + ":";
}
System.out.println(UniversityData); 
}  
}
catch (SQLException e)
{
	e.printStackTrace();
}
}
}


