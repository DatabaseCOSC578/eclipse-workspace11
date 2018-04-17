import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

	public String login_authentication(Connection con, LoginDetails ld) {
		if((ld.getUsername().equals("user"))&&(ld.getPassword().equals("password")))
				{
		return "Valid";
				}
		else
			return "Invalid UserName/Password";
		
	}
	
	public int store_details(Connection con, Store sd) {
		int v=99,zero = 0;
		try {
			
	System.out.println(sd.getLname()+"ABCDHEREHERE");
String query = "insert into supervision.items(email,fname,lname,items,isreturn,supplyd,returnd) values ('"+sd.getEmail()+"','"+sd.getFname()+"','"+sd.getLname()+"','"+sd.getItems()+"','"+zero+"','"+sd.getSdate()+"','"+sd.getRdate()+"')";

      PreparedStatement preparedStmt = con.prepareStatement(query);
      v=preparedStmt.executeUpdate(query);
      
      System.out.println(v);
     
	}
		catch(Exception e) {
			e.printStackTrace();
		}
		return v;	
		}
		
		
	}
