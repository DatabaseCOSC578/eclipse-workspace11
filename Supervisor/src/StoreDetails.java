

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StoreDetails
 */
@WebServlet("/StoreDetails")
public class StoreDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StoreDetails() {
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
	   		//PreparedStatement ps;
	   		
	   		//RequestDispatcher rd1;
	   		PrintWriter out=response.getWriter();
	   		response.setContentType("text/html");
	   		String fname=request.getParameter("fname").toString();
	   		//System.out.println(request.getParameter("lname").toString()+"HEREHERE");
	   		String lname1=request.getParameter("lname1").toString();
	   		System.out.println(lname1);
	   		String items=request.getParameter("items").toString();
	   		String email=request.getParameter("email").toString();
	   		String returnv=request.getParameter("return");
	   		String sdate=request.getParameter("sdate").toString();
	   		String rdate=request.getParameter("rdate").toString();
	   		Store st=new Store();
	   		st.setEmail(email);
	   		st.setFname(fname);
	   		st.setLname(lname1);
	   		st.setItems(items);
	   		st.setReturnv("0");
	   		st.setSdate(sdate);
	   		st.setRdate(rdate);
	   		con=cr.getconnection();
	   		Dao d1=new Dao();
	   		int x=d1.store_details(con,st);
	   		System.out.println(x+"VALUE");
	   		if(x!=0) {
	   			PrintWriter out1=response.getWriter();
	   			out1.println("Inserted Successfuly");
	   			con.close();
	   			        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Supervisor.jsp");
            dispatcher.forward(request, response);
	   		}
		}
	catch(Exception e)
		{
		e.printStackTrace();
		}

}
}
