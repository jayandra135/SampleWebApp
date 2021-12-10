import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
public class SessionList implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent se)  { 
    System.out.println("Session created");     
    }

	
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	 System.out.println("Session destroyed");
    }
	
}