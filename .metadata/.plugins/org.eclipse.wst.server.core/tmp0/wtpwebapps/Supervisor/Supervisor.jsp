<html>
<head>
    <link href="css/layout1.css" rel="stylesheet">
</head>
<body>
<header><center>Towson University</center></header>
<form name="inputdetails" action="store" method="post" id="form1">
<div><b>Details</b> 

<button id ="b2" type="submit" formaction="login.html">logout</button>
<button id ="b1" type="submit" formaction="Supervisorshow.jsp">View Details</button> 


</div>
<fieldset>
<center>
<b>First Name:</b> <input type=text style="width: 200px;" name="fname" placeholder="firstname"><br><br>
<b>Last Name:</b> <input type=text style="width: 200px;" name="lname1" placeholder="lastname"><br><br>


<b>Email:</b><input type=text style="width: 300px; align:center;" name="email" placeholder="Email "><br><br>
<b>Items:</b></br>
<textarea rows="5" cols="60"  maxlength="260" name="items" placeholder="Please enter Items List">
</textarea> <br><br>
Supplied date<input type=text name="sdate" placeholder="yyyy/mm/dd" ><br><br>
Return date<input type=text name="rdate" placeholder="yyyy/mm/dd" ><br><br>
<input type=submit value=submit> <br><br><br><br><br>
</center></fieldset>
</form>
</body>
<footer> &copy 2018 - Towson University</footer>
</html>