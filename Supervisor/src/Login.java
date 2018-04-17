

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Database cr=new Database();
		Connection con=null;
   		PreparedStatement ps;
   		
   		RequestDispatcher rd1;
   		PrintWriter out=response.getWriter();
   		response.setContentType("text/html");
   		String username=request.getParameter("username");
   		String password=request.getParameter("password");
   		LoginDetails ld=new LoginDetails();
   		ld.setUsername(username);;
   		ld.setPassword(password);
   		con=cr.getconnection();
   		Dao d1=new Dao();
   		String x=d1.login_authentication(con,ld);
   			if(x.equals("Invalid UserName/Password")){
   				System.out.println("Not Logged in");
   				out.println("You are not Logged in");
   				rd1 = request.getRequestDispatcher("/login.html");
   	   			rd1.forward(request, response);
   					}
   			else{
   				HttpSession lsession = request.getSession();
   				lsession.setAttribute("id",x );

   				out.println("Successfully Logged in");
   			rd1 = request.getRequestDispatcher("/Supervisor.jsp");
   			rd1.forward(request, response);
   			}
   			
	 }
catch(Exception e)
	{
e.printStackTrace();
	System.out.println("HERE EXCEPTION");
	}
}


}