package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/naming")
public class NameSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NameSearch() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name");

		request.setAttribute("names", name);
		RequestDispatcher rd = request.getRequestDispatcher("/Output.jsp");
		rd.forward(request, response);
		
		HttpSession session=request.getSession();
		session.setAttribute("name1", name);
		
		/*PrintWriter pe=response.getWriter();
		pe.print("<a href='next1'>click here</a>");*/
	}

	
}
