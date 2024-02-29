package dbcon;
import java.sql.*;
import java.util.ArrayList;

import bean.Student;

public class Myconnection 
{
	Connection con = null;
	public Connection getCon() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectsms","root","root@123");
		return con;
	}
	/*
	//Insert Query
	public void saveStudent(Student s)
	{
		try
		{
			con=getCon(); //return connection object
			String sql = "insert into Students(Name,Grade) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, s.getName());
			ps.setString(2, s.getGrade());
			
			ps.executeUpdate();
			
			con.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	*/
	
	// To retrive the data from the database  
	public ArrayList<Student> listStudent() 
	{
		ArrayList<Student> ar = new ArrayList<Student>();
		try
		{
			Student s = null;
			con = getCon();
			String sql = "select * from students";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setGrade(rs.getString(3));
				ar.add(s);
			}
			//	ps.executeUpdate();
			con.close();
			return ar;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return ar;
		
	}

}
