package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/hide1")
public class Demohidden extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
PrintWriter out=resp.getWriter();
	String s=req.getParameter("fname");
	out.println("<html><body>");
	out.print("<h1>hi Welcome hidden rewriting demo</h1>");
	out.print("<form action='hide2'>");
	out.print("<input type='hidden' name='username' value='aarti'>");
	out.println("<a href='hi?unm=aarti'>Next</a>");
	out.print("<input type='submit' value='submit'");
	
	out.print("</body></html>");
}
}
