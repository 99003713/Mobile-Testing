//package com.ltts;
//import java.sql.*;  
//class myfirstjdbc{  
//public static void main(String args[]){  
//try{  
//Class.forName("com.mysql.cj.jdbc.Driver");  
//Connection con=DriverManager.getConnection(  
//"jdbc:mysql://localhost:3306/first","root","harod@123");  
////here first is database name, root is username and password  
//System.out.println("Connected with DataBase");
//System.out.println("1.Create Table\n2.Insert into table\n3.Update table\n4. Delete row  ");
////Statement stmt=con.createStatement();  
////stmt.execute("create table student(studentid int(3), studentname varchar(10))");
//System.out.println("Table is created");
//PreparedStatement stmt=con.prepareStatement("insert into student values(?,?)"); 
//stmt.setInt(1, 2);
//stmt.setString(2,"mithun");
////stmt.executeUpdate();
//
////stmt.executeUpdate("insert into student values(1,'Om')");
//System.out.println("Data inserted into table");
//
//
//ResultSet rs=stmt.executeQuery("select * from student");  
//while(rs.next())  
//System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
//con.close();  
//}catch(Exception e){ System.out.println(e);}  
//}  
//}