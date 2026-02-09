package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;


public class LoginServlet extends HttpServlet {

	protected void dopost(HttpServletRequest request , HttpServletResponse response)
	     throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Simple validation
		if(userName.equals("admin") && password.equals("1234")) {
			
			Cookie ck = new Cookie("user",userName);
			ck.setMaxAge( 60 * 60);//1 hour (persistant)
			response.addCookie(ck);
		}
		
		else {
			out.println("<h3>login Successful</h3>");
		out.println("<a href=' " + request.getContextPath() + "/login.html'>Try Again</a>");	
		}
 	}
	
	
}
