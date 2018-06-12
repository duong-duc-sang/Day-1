package ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex01.models.UserName;

/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet("/Index")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("txtname");
				
		UserName users = new UserName();
		if(users.checkName(username)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("show.jsp");
			request.setAttribute("userName", username);
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("username.jsp");;
		}
	}

}
