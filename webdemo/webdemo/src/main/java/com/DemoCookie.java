package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cook1")
public class DemoCookie extends HttpServlet
{
 
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	PrintWriter out=resp.getWriter();
	
	out.println("<html><body>");
	out.print("<h1>hi Welcome cookie demo</h1>");
	Cookie[] arr=req.getCookies();
	
	for(Cookie c:arr)
	{
		
		out.println(c.getName()+ "-->" + c.getValue());
	}
	//out.println()
	out.print("</body></html>");
}
}
