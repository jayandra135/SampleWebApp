
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterEx extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
	
		
		String name=request.getParameter("uname");
		String password=request.getParameter("pass");
		//pw.println("password :" +password);
		
		ServletContext sc=getServletContext();
		RequestDispatcher rd=sc.getRequestDispatcher("/Filter2");
		
		
		 if(name.equals("admin") && password.equals("admin"))
		 { 
			rd.forward(request, response);
		

		 }
		 else
		 {
			 pw.println(" u are not auth user");
			
		 }
		 
	}

	

}
