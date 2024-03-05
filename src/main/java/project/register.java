package project;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String firstname=request.getParameter("fname");
	String lastname=request.getParameter("lname");
	String fathername=request.getParameter("fatname");
	String mothername=request.getParameter("mname");
	String email=request.getParameter("email");
	String gender=request.getParameter("gender");
	String course=request.getParameter("course");
	String address=request.getParameter("address");
	String phone=request.getParameter("phone");
	String dob=request.getParameter("dob");
	
	try {
		String url="jdbc:mysql://localhost:3306/registrationform";
		String username="root";
		String password="Rahulkumar@123";
		String query="insert  into registration values(?,?,?,?,?,?,?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		 PreparedStatement st=con.prepareStatement(query);
		  st.setString(1,firstname);
		  st.setString(2,lastname);
		  st.setString(3,fathername);
		  st.setString(4, mothername);
		  st.setString(5,email);
		  st.setString(6,gender );
		  st.setString(7, course);
		  st.setString(8, address);
		  st.setString(9, phone);
		  st.setString(10, dob);
		  int count=st.executeUpdate();
		  if(count>0)
		  {
			 PrintWriter out=response.getWriter();
			 out.println("SUCESSFULL REGISTER DATA");
		  }
		  else {
			  PrintWriter out=response.getWriter();
				 out.println("SOMTHING WENT WRONG........"); 
		  }
		  st.close();
		  con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String s=request.getParameter("fname");
//		PrintWriter out=response.getWriter();
//		out.println(s);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			}

}
