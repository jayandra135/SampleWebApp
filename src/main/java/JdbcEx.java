

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.concurrent.RecursiveAction;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
public class JdbcEx extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SCOTT","TIGER");
		   
		    
		    Statement st=con.createStatement();
		    //st.executeUpdate("insert into student values(100,'jack',12)");
		 
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter your id: ");
			int IDNO = scanner.nextInt();

			System.out.print("Enter your name: ");
			String NAME = scanner.nextLine();

			System.out.print("Enter your average: ");
			int AVG = scanner.nextInt();
			
			 st.executeUpdate("insert into student values('"+IDNO+"','"+NAME+"','"+AVG+"')");
			
	
			/*
			 * PreparedStatement
			 * ps=con.prepareStatement("insert into student values(?,?,?)"); ps.setInt(1,
			 * 600); ps.setString(2,"carry"); ps.setInt(3, 10); ps.executeUpdate();
			 *    ResultSet rs=ps.executeQuery("select * from student");
			 */
			
		    ResultSet rs=st.executeQuery("select * from student");
			/*
			 * while(rs.next()) { out.println(rs.getInt("idno"));
			 * out.println(rs.getString(2)); out.println(rs.getInt(3));
			 * 
			 * }
			 */
		    		
		    //out.println("connection established");
		}
		catch(ClassNotFoundException|SQLException cfe)
		{
				System.out.println(cfe);
		}
	}

	
}
