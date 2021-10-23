package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/hi", "/hello" }, initParams = {
		@WebInitParam(name = "email", value = "aarti@gmail.com") }, loadOnStartup = 2)
public class Servlet2 extends HttpServlet {

	public Servlet2() {
		System.out.println("in servlet2 constructor");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("Welcome Second" + req.getParameter("fname"));
		ArrayList itemlist = (ArrayList) req.getAttribute("items");
		System.out.println(itemlist);

		ServletContext ctx = getServletContext();
		String data = ctx.getInitParameter("url");
		ServletConfig cfg = getServletConfig();
		String e = cfg.getInitParameter("email");
		String u = cfg.getInitParameter("mobile");

		out.println("Data context" + data);
		out.println("hi Data config" + u);
		out.println("hi Data config email" + e);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
