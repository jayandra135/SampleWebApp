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

public class Cook1 extends HttpServlet {

protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
{
	
	PrintWriter pw=res.getWriter();
	String data =req.getParameter("n1");
	
	Cookie cook =new Cookie("mycook",data);
	res.addCookie(cook);
	
	 Cookie cooks[] =req.getCookies(); for(int i=0;i<cooks.length;i++) {
	 pw.println(cooks[i].getName()+" "+cooks[i].getValue()); }
	 
	
	
	 

}
}