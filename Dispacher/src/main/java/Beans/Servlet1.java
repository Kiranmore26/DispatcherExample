package Beans;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("Text/Html");
		PrintWriter pw=response.getWriter();
		
		String Name=request.getParameter("Name");
		String Pass=request.getParameter("Pass");
		
		if(Pass.equalsIgnoreCase("Kiran123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Servlet2");
			rd.forward(request, response);
		}
		else
		{
			pw.print("Sorry ! Wrong Password");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}

}
