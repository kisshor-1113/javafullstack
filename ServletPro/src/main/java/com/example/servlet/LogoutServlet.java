package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/LogoutServlet")
public class LogoutServlet  extends HttpServlet{
	
	protected void doGet(HttpServletRequest request , HttpServletResponse response)
        throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck = new Cookie("user","");
		ck.setMaxAge(0);//delete cookie
		response.addCookie(ck);
		
		out.println("<h3>you are logged out</h3>");
		out.println("<a href ='"+request.getContextPath()+"/login.html'>Login Again</a>");
	}
}
