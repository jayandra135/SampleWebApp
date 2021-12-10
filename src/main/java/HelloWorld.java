import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
//@WebServlet("/HelloWorld")

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet
{
	
public void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException 
	{
	
	//PrintWriter obj=res.getWriter();
	
	   // TODO Auto-generated method stub
    PrintWriter out=res.getWriter();
    
    String name=req.getParameter("eno");
    
    out.println("Emp info"+name);
	
	/*
	 * String name=req.getParameter("n1");
	 * obj.println("play games when ur free"+name);
	 * 
	 * 
	 * ServletContext sc=getServletContext();
	 * obj.println(sc.getInitParameter("dept"));
	 * obj.println(sc.getInitParameter("technology"));
	 */
		
	
	}
}