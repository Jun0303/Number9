package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kuku
 */
@WebServlet("/Kuku")
public class Kuku extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
		String today = sdf.format(date);
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>九九サーブレッド</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h1>九九サーブレッド</h1>");
		
		out.println("<p>" + today + "<p>");
		
		
		out.println("<table border='1'>");
		out.println("<tr>");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                out.println("<td>" + (i * j) + "</td>");
            }
            out.println("</tr>");
        }
        out.println("</table >");
        out.println("<p><a href = index.html>もどる");
        
		out.println("</body>");
		out.println("</html>");
		
	}

}
