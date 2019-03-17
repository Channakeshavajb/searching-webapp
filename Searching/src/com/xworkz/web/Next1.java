package com.xworkz.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/next1")
public class Next1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession session=request.getSession();
		
		String result=(String) session.getAttribute("name1");
		pw.println("hi this is finally you only\t"+result);
			pw.close();
		*/
	}


}
