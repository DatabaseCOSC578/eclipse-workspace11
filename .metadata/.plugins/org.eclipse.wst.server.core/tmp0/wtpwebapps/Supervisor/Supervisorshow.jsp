<%@page import="java.sql.*"%>
<%@page import="java.lang.*"%>
<%@page import="java.util.*"%>
<html>
<head>
    <link href="css/layout1.css" rel="stylesheet">
</head>

<body>
<header><center>Towson university</center></header>
<form name="inputdetails" action="" method="post" id="form1">
<div ><b>Details</b> 

<button id ="b2" type="submit" formaction="login.html">logout</button>
<button id ="b1" type="submit" formaction="Supervisor.jsp">Go back</button> 
</div>
<fieldset><center>

<!-- <b>CustId:</b> <input type=text style="width: 200px;" name="custid " placeholder="customer ID"><br><br> -->
<!-- <b>CustName:</b><input type=text style="width: 300px; align:center;" name="custname" placeholder="customer name "><br><br> -->
<!-- <b>Items:<b/><br/> -->
<!-- <textarea rows="5" cols="60"  maxlength="260" name="items" placeholder="Please enter Items List"> -->
<!-- </textarea> <br><br> -->
<!-- <input type=checkbox name="return" value=1>return<br><br> -->
<!-- Supplied date<input type=text name="sdate" placeholder="Supply Date" ><br><br> -->
<!-- Returned date<input type=text name="rdate" placeholder="Return Date" ><br><br> -->
<!-- <input type=submit value=submit> <br><br><br><br><br> -->

</center></fieldset>
</form>
<%
Connection con=null;
try {
	 
	 
//	 Connection con1=db.getconnection();
	 
	 
	 try{
		 Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/supervision","root","root");
		System.out.println("Connection Object"+con+"HERERERERERERERERER");

}
catch(Exception e){
e.printStackTrace();	
}
	 
	
	 PreparedStatement ps=con.prepareStatement("select * from supervision.items");
	 ResultSet rs=ps.executeQuery();
	 System.out.println(rs.getRow()+"HERERERERRRR");
	 rs.beforeFirst();
	 //System.out.println(rs.isBeforeFirst());
	 System.out.println(rs.getRow()+"HERERABCDRR");
		
	
%>

"<TABLE  BORDER="3" colspan="2"  WIDTH="100%"   CELLPADDING="8" CELLSPACING="5"> 
		   <TR>
		   <TD><b>FirstName</b></TD> 
		    <TD><b>Last Name</b></TD> 
		    <TD><b>Email Id</b></TD> 
		   <TD><b>Items</b></TD> 
		    <TD><b>SupplyDate</b></TD> 
		   <TD><b>Return Date</b></TD>
		   <TD><b>is Returned</b> </TD> 
		   </TR>
		   
	<%  int i=1;
	 while(rs.next()){ %>
		 <TR>
		   <TD><%out.println(rs.getString(1)); %></TD> 
		   <TD><%out.println(rs.getString(2)); %></TD> 
		   <TD><%out.println(rs.getString(3));%></TD> 
		    <TD><%out.println(rs.getString(4)); %></TD> 
		   <TD><%out.println(rs.getString(6)); %></TD>
		   <TD><%out.println(rs.getString(7));%></TD> 
		   <TD><% out.println(rs.getString(5));%></TD>
		   </TR>
		 <% //System.out.println(rs.getString(i)+"      "+rs.getString(2)+"                  "+rs.getString(3)+"                  "+rs.getString(4)+"                  "+rs.getString(5)+"      "+rs.getString(6)+"      "+rs.getString(7));
	%>
		   <% 
	 }
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }	   
con.close();
%>   
		   
		   </TABLE>

</body>
<footer> &copy 2018 - Towson University</footer>
</html>