
import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;


public class PracticeDemo2 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int result =(int)req.getAttribute("result");
		
		PrintWriter out=res.getWriter();
		out.println("result is :"+result);
	}
}