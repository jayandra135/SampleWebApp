import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class InitParam extends HttpServlet
{
	
public void doGet(HttpServletRequest req ,javax.servlet.http.HttpServletResponse res) throws ServletException,IOException 
	{
	
	PrintWriter pw=res.getWriter();
	ServletConfig sc=getServletConfig();
	
	pw.println("<body bgcolor=yellow>");
	pw.println("name of company : "+sc.getInitParameter("company"));
	pw.println("venue of company : "+sc.getInitParameter("venue"));
	
		
	
	}
}