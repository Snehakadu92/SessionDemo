package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

@WebServlet("/second")
public class Two extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	HashMap<String,Integer> hm=(HashMap<String, Integer>) req.getAttribute("orderlist");
     for(String k:hm.keySet())
     {
    	 out.println("key "+k + " value : "+hm.get(k));
     }
}
}
