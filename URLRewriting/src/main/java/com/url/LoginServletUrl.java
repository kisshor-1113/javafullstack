package com.url;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServletUrl
 */
@WebServlet("/LoginServletUrl")
public class LoginServletUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServletUrl() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
	    HttpSession session=request.getSession();//create the session
	    session.setAttribute("username","Student");
	
	    //url writing
	    String url = response.encodeURL("welcome");
	    out.println("<html> <body>");
	    out.println("<h2>login succesful</h2>");
	    out.println("<a href= '"+url+"'>go to Welcome page</a>");
	    out.println("</body></html>");
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
