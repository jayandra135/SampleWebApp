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

public class HideForm2 extends HttpServlet {

protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
{
	
	PrintWriter pw=res.getWriter();
	
	String str1  =req.getParameter("loginId");
	String str2  =req.getParameter("cname");
	
	
	pw.println("Login name: "+str1);
	pw.println("company name: "+str2);

	
	
	 

}
}