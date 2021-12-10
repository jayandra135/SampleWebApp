
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PracticeDemo extends HttpServlet
{

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out=res.getWriter();
		
		int j=Integer.parseInt(req.getParameter("n1"));
		int k=Integer.parseInt(req.getParameter("n2"));
		
		int result=j+k;
	
		req.setAttribute("result", result);
		
		RequestDispatcher rd =req.getRequestDispatcher("PracticeDemo2");
		rd.include(req, res);
		
		
		
		/*
		 * int result=j+k; out.println("result is : "+result);
		 */
		
		
		
	}
}