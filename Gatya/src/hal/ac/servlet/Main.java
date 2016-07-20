package hal.ac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hal.ac.gatya.Box;
import hal.ac.gatya.Normal;
import hal.ac.gatya.Point;


/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static int point=100;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		
		String gatya=request.getParameter("gatya");
		PrintWriter out=response.getWriter();
		
		Point poi=new Point();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		
		switch(gatya)
		{
		case "1":
			
			Normal normal=new Normal();
			Point.point=Point.point-5;
			
			if(poi.zeroPoint()==false)
			{
				out.println("<title>ノーマルガチャ</title>");
				out.println("<link rel='stylesheet' href='./CSS/layout.css'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div>");
				out.println("<p>利用ポイント：5</p>");
				out.println("<p>残りポイント：");
				out.println(poi.returnPoint());
				out.println("</p>");
				out.println("<table>");
				out.println("<tr><th>No.</th><th>名前</th><th>レアリティ</th></tr>");
				out.println(normal.cardGacha());
				out.println("</table>");
				out.println("</div>");
			}
			else
			{
				out.println("<title>ポイントがーーー！！</title>");
				out.println("<link rel='stylesheet' href='./CSS/layout.css'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div>ポイントが不足しています。</div>");
			}
			
			break;
			
		case "2":
			
			Box box=new Box();
			Point.point=Point.point-20;
			
			if(poi.zeroPoint()==false)
			{
				out.println("<title>ノーマルガチャ</title>");
				out.println("<link rel='stylesheet' href='./CSS/layout.css'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div>");
				out.println("<p>利用ポイント：20</p>");
				out.println("<p>残りポイント：");
				out.println(poi.returnPoint());
				out.println("</p>");
				out.println("<table>");
				out.println("<tr><th>No.</th><th>名前</th><th>レアリティ</th></tr>");
				out.println(box.cardGacha());
				out.println("</table>");
				out.println("</div>");
			}
			else
			{
				out.println("<title>ポイントがーーー！！</title>");
				out.println("<link rel='stylesheet' href='./CSS/layout.css'>");
				out.println("</head>");
				out.println("<body>");
				out.println("<div>ポイントが不足しています。</div>");
			}
			
			break;
			
		case "3":
			
			poi.pointCharge();
			
			out.println("<title>ポイントチャージ</title>");
			out.println("<link rel='stylesheet' href='./CSS/layout.css'>");
			out.println("</head>");
			out.println("<body>");
			out.println("<div>ポイントチャージしました。</div>");
			
			break;
		}
		
		out.println("<p><a href='index.jsp'>トップページへ</a></p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
	}

}
