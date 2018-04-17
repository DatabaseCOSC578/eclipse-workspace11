

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SupervisorShow
 */
@WebServlet("/SupervisorShow")
public class SupervisorShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupervisorShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out=response.getWriter();
		 out.println("<script type=\"text/javascript\"><br/><br/>");
		 Database db=new Database();
		 try {
			 
		 
		 Connection con1=db.getconnection();
		 Store dt=new Store();
		 PreparedStatement ps=con1.prepareStatement("select * from supervision.items");
		 ResultSet rs=ps.executeQuery();
		 System.out.println(rs.getRow()+"HERERERERRRR");
		 rs.beforeFirst();
		 //System.out.println(rs.isBeforeFirst());
		 System.out.println(rs.getRow()+"HERERABCDRR");
			
		 int i=1;
		 while(rs.next()&&i<8){
			
			 response.getWriter().println(rs.getString(i)+"      "+rs.getString(2)+"                  "+rs.getString(3)+"                  "+rs.getString(4)+"                  "+rs.getString(5)+"      "+rs.getString(6)+"      "+rs.getString(7));
		 
		 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 response.getWriter().print("ABCD SUCCESSFUL");
		 out.println("<script type=\"text/javascript\"><br/><br/>");
   		 
		   out.println("<form name=\"inputdetails\" method=\"post\" id=\"form1\">\n" + 
		   		"<div><b>Details</b> \n" + 
		   		"<button id =\"b1\" type=\"submit\" formaction=\"Supervisor.jsp\">Enter Details</button>\n" + 
		   		"</div>\n" + 
		   		"<fieldset>\n" + 
		   		"<TABLE  BORDER=\"3\" colspan=\"2\"  WIDTH=\"100%\"   CELLPADDING=\"8\" CELLSPACING=\"5\">\n" + 
		   		"   <TR>\n" + 
		   		"      <TD><b>FirstName</b></TD>\n" + 
		   		"      <TD><b>Last Name</b></TD>\n" + 
		   		"      <TD><b>Email Id</b></TD>\n" + 
		   		"      <TD><b>Items</b></TD>\n" + 
		   		"      <TD><b>SupplyDate</b></TD>\n" + 
		   		"      <TD><b>Return Date</b></TD>\n" + 
		   		"      <TD><b>is Returned</b> </TD>\n" + 
		   		"   </TR>\n" + 
		   		"</TABLE>");
		         out.println("</script>");

		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}