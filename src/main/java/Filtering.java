

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class Filtering implements Filter {


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		PrintWriter pw=response.getWriter();
	
		
		String name=request.getParameter("uname");
		String password=request.getParameter("pass");
		//pw.println("password :" +password);
		
			
		 if(name.equals("admin") && password.equals("admin"))
		 { 
			 chain.doFilter(request, response);
		

		 }
		 else
		 {
			 pw.println("wrong user and pass");
			 RequestDispatcher rd=request.getRequestDispatcher("/Filter.html");
			 rd.include(request, response);
		 }
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
