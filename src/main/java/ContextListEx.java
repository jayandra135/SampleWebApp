import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
@WebListener
public class ContextListEx implements ServletContextListener 
{

  public void attributeAdded(ServletContextAttributeEvent arg)
  {
	    System.out.println("Context Attribute added");
	    System.out.println("Attribute name and value"+ arg.getName()+" " +arg.getValue());
	  
  }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Context destroyed");
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context created");
    }
	
}