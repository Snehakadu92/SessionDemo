package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/hide2")
public class Demohidden2 extends HttpServlet
{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	PrintWriter out=resp.getWriter();
	
	out.println("<html><body>");
	out.print("<h1>hi Welcome hidden page 2 demo</h1>");
	String str=req.getParameter("username");
	out.print(str);
}
}
