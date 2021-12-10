import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class InitContext extends HttpServlet
{
	
public void doGet(HttpServletRequest req ,javax.servlet.http.HttpServletResponse res) throws ServletException,IOException 
	{
	
	PrintWriter pw=res.getWriter();
	ServletContext sc=getServletContext();
	
	
	String str1=sc.getInitParameter("dept");
	String str2=sc.getInitParameter("technology");
	
	sc.setAttribute("depart", str1);
	sc.setAttribute("tech", str2);
	
	pw.println(str1);
	/*
	 * pw.println(sc.getInitParameter("dept"));
	 * pw.println(sc.getInitParameter("technology"));
	 */
	
		
	
	}
}