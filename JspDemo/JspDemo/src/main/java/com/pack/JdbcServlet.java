package com.pack;

import java.io.IOException;
import java.util.ArrayList;

 

@WebServlet("/k")
public class JdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = "Aarti";
//    	 req.setAttribute("user", user);
//    	 RequestDispatcher rd=req.getRequestDispatcher("view.jsp");
//    	 rd.forward(req, resp);

		ArrayList<String> al = new ArrayList<String>();
		al.add("mahi");
		al.add("Suresh");
		al.add("priya");
		al.add("Divya");
		req.setAttribute("user", user);
		req.setAttribute("studentlist", al);
		RequestDispatcher rd = req.getRequestDispatcher("view.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
