

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetriveServlet")
public class RetriveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
		//Call Connection Method
			Connection con=DBConnection.getMyConnection();
		//Write sql command
			String str="select * from productdetails";
			
			//to execute query create object of Statement
			Statement  ps=con.createStatement();
			//get ResultSet
			ResultSet ans =ps.executeQuery(str);
			//next method checks for nextrecord
			PrintWriter out=response.getWriter();
			out.println("<table border=2>");
			out.println("<tr><th>pid</th><th>pname</th><th>price</th></tr>");
			while(ans.next()) {
				out.println("<tr>");
				out.print("<td>"+ans.getInt("pid")+"</td>");
				out.print("<td>"+ans.getString("pname")+"</td>");
				out.print("<td>"+ans.getDouble("price")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			con.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
