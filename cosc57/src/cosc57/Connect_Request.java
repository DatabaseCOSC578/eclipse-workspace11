package cosc57;




import java.sql.*;

public class Connect_Request {
 
 static final String userName="root";//put your MySQL user name
    static final String password="root";//put your MySQL password
    private static Connection connection=null;
   
    public  Connection  getconnection() throws  SQLException {
        
    	 Connection con=null;
    	 
    	 try{
    		 Class.forName("com.mysql.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cosc578","root","root");
    		System.out.println("Connection Object"+con);
   
    }
    catch(Exception e){
    e.printStackTrace();	
    }
    return con;
    	}
    	public static void closeConnection(Connection con)  {
    try{
    		if (con != null)
    			
    			con.close();
    System.out.println("CLOSED");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    		}
    }
        
    }
 





