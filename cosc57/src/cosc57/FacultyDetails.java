package cosc57;





import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class FacultyDetails extends HttpServlet {
private static long serialVersionID = 1L;


	public FacultyDetails() {
		super();
	}

	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Connect_Request cr=new Connect_Request();
		Connection con=null;
   		PreparedStatement ps;
   		try {
   		con=cr.getconnection();
		ps = con.prepareStatement("select * from Faculty");
		ResultSet rs;
		rs = ps.executeQuery();
		rs.next();
		System.out.println(rs.next());
		System.out.println(rs+"HERE");
		System.out.println(rs.getString(1));
		System.out.println(rs+"HERE"+rs.getRow());
		
			 }
catch(Exception e)
   		{
	e.printStackTrace();
   		System.out.println("HERE EXCEPTION");
   		}
	
	}
}


