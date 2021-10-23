package com;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/first")
public class One extends HttpServlet {
	
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}	
	

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.getWriter().println("hi from tqpp"); 
	HashMap<String,Integer> swiggy=new HashMap<>();
	swiggy.put("Pav bhaji", 2);
	swiggy.put("Dosa", 3);
	req.setAttribute("orderlist", swiggy);
	RequestDispatcher rd=req.getRequestDispatcher("second");
	rd.forward(req, resp);
}
}
