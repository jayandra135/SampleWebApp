package SessionDemo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

public class ReWrite extends HttpServlet {

protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
{
	
	PrintWriter pw=res.getWriter();
	String name =req.getParameter("n1");
	
	
	pw.println("<a href='ReWrite2?na="+name+"'>click me</a>");
	
	 

}
}