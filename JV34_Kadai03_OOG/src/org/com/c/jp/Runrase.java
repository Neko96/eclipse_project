package org.com.c.jp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Runrase
 */
@WebServlet("/Runrase")
public class Runrase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Runrase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		Cars add=new Cars();
		Counter con=new Counter();
		con.pluscon();
		
		String s="S";
		String b="B";
		String e="E";
		
		out.println("<!DOCTYPE html>");
		out.println("<html lang='ja'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>レースではないでしょ</title>");
		out.println("</head>");
		out.println("<body>");	
			
		for(int i=0;i<10;i++)
		{
				out.println("<p>");
				out.println(add.Car()[i]);
				out.println("</p>");
		}		
		
		out.println("<p>");
		out.println(add.Bus()+b);
		out.println("</p>");
		out.println("<p>");
		out.println(add.ElectricCar()+e);
		out.println("</p>");
		out.println("<p>");
		out.println(add.SuperCar()+s);
		out.println("</p>");
		
		out.println("<p>");
		out.println("<a href='Runrase'>clear</a>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		
		//request.getRequestDispatcher("race.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		new Cars();
		new Counter();
		//new Cars();
		//Counter.counter=0;
		//request.getRequestDispatcher("race.jsp").forward(request,response);
	}

}
