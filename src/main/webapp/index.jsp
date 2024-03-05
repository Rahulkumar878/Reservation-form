<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration From</h1>
<form action="register" method="post">
 
<table>
<tr>
<td>First Name:</td><td><input type="text" name="fname" ></td>
</tr>
<tr>
<td>Last Name:</td><td><input type="text" name="lname" ></td>
</tr>
<tr>
<td>Father Name:</td><td><input type="text" name="fatname" ></td>
</tr>
<tr>
<td>Mother Name:</td><td><input type="text" name="mname" ></td>
</tr>
<tr>
<td>Date of Birth:</td><td><input type="date" name="dob" ></td>
</tr>
<tr>
<td>Email:</td><td><input type="email" name="email" ></td>
</tr>
<tr><td>Gender:</td><td><input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female</td></tr>
<tr><td>Choose Course:</td><td>
<select name="course">
<option value="C">C</option>
<option value="C++">C++</option>
<option value="java">JAVA</option>
</select>
<tr><td>Address:</td><td><textarea name="address"></textarea></td></tr>
<tr>
<td>Phone:</td><td><input type="number" name="phone" ></td>
</tr>
<tr><td></td></tr>
</table>
 <input type="submit">
</form>
</body>
</html>