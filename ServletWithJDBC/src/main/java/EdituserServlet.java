

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class EdituserServlet
 */
@WebServlet("/EdituserServlet")
public class EdituserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EdituserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	     
		  int id = Integer.parseInt(req.getParameter("id"));
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/simpld","root","Janni@2026");
			PreparedStatement ps=con.prepareStatement("SELECT * FROM users WHERE id=?");
			
			ps.setInt(1,id);
		    ResultSet rs = ps.executeQuery();
		    
		    req.setAttribute("user",rs);
		    req.getRequestDispatcher("editUser.jsp").forward(req,res);
		    
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	}


