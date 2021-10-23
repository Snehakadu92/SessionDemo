package com;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


@WebListener
public class Listner1 implements HttpSessionListener {
private int activecount=0;
private int totalcount=0;
     
    public Listner1() {
         System.out.println("Listener in default");
    }
 
    public void sessionCreated(HttpSessionEvent se)  { 
         activecount++;
         totalcount++;
         HttpSession session=se.getSession();
         ServletContext context=session.getServletContext();
         context.setAttribute("activeusert", "activecount");
         context.setAttribute("ativeuser", "totalcount");
         System.out.println("listener1 session created");
         
    }
 
    public void sessionDestroyed(HttpSessionEvent se)  {
    	activecount--;
    	HttpSession session=se.getSession();
    	ServletContext context=session.getServletContext();
    	context.setAttribute("activeuser", "activecount");
     }
	
}
