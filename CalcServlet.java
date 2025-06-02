package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Calculation;
import beans.OperationDataBean;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		OperationDataBean ope = new OperationDataBean();
		
		Calculation calc = new Calculation(ope);
		

		
		String str1 = request.getParameter("inputData1"); // サーブレットでパラメータ
		double inputData1 = Double.parseDouble(str1); 
		
		String str2 = request.getParameter("inputData2"); // サーブレットでパラメータ
		double inputData2 = Double.parseDouble(str2);
		
		String operator = request.getParameter("operator");
		
		ope.setInputData1(inputData1);
		ope.setInputData2(inputData2);
		ope.setOperator(operator);
		
		calc.exec();
		double result = ope.getResult();
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Servlet版電卓</title>");
		out.println("</head>");
		
		
		out.println("<body>");;
		out.println("<h1>Servlet版電卓</h1>");
		out.println("<p>" + inputData1 + operator + inputData2 +"の結果は" + result + "でした</p>");
		
		out.println("<p><a href = index.html>もどる</a></p>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
