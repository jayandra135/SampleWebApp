import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterServlet extends HttpServlet {

protected void doGet(HttpServletRequest req ,HttpServletResponse res) throws ServletException,IOException
{
	/*
	 * PrintWriter pw=res.getWriter();
	 * 
	 * 
	 * ServletContext sc=getServletContext(); RequestDispatcher
	 * rd=sc.getRequestDispatcher("/InitParam"); pw.println("Dispatching");
	 * rd.forward(req, res);
	 */

	
	String no=req.getParameter("eno");
	String name=req.getParameter("ename");
	String sal=req.getParameter("esal");
	
	PrintWriter pw=res.getWriter();
	pw.println(no+" "+name+" "+sal);
	ServletContext sc=getServletContext();
	
	/* res.sendRedirect("HelloWorld?"+no+" "+name+" "+sal); */

	
	 RequestDispatcher rd=sc.getRequestDispatcher("/HelloWorld");
	 pw.println("dispatching");
	 
	 rd.include(req, res);
	 

}
}