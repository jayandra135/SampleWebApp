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

public class HideForm extends HttpServlet {

protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
{
	
	PrintWriter pw=res.getWriter();
	String login  =req.getParameter("log");
	String company =req.getParameter("com");
	
	
	pw.println("<form action=HideForm2>");
	pw.println("<input type=hidden name=loginId value="+login+">");
	pw.println("<input type=hidden name=cname value="+company+">");
	pw.println("<input type=submit value=logging></form>");
	
	
	 

}
}