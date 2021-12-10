package SessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Session1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
		PrintWriter pw=response.getWriter();
		HttpSession ses1=request.getSession();
		
		Integer counter=(Integer)ses1.getAttribute("cnt");
		//pw.println(counter);
		if(counter==null)
			counter=1;
		else
			counter+=1;
		
		ses1.setAttribute("cnt", counter);
		pw.println(counter);
		pw.println(ses1.isNew());
		ses1.setMaxInactiveInterval(5);
		pw.println("Default Session Duriation : "+ses1.getMaxInactiveInterval());
	  ses1.invalidate();
	}

}