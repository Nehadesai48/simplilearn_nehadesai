


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Reading of data from form
	int pid=Integer.parseInt(request.getParameter("txtpid"));
	String pname=request.getParameter("txtpname");
	double price=Double.parseDouble(request.getParameter("txtprice"));
	try {
	//Call Connection Method
		Connection con=DBConnection.getMyConnection();
	//Write sql command
		String str="Insert into productdetails (pid,pname,price) values(?,?,?)";
		//string str= "update product set salary=? where pid=?"
		//to execute query create object of preparedSatement
		PreparedStatement  ps=con.prepareStatement(str);
		ps.setInt(1, pid);
		ps.setString(2, pname);
		ps.setDouble(3, price);
		int ans =ps.executeUpdate();
		PrintWriter out=response.getWriter();
		if(ans>0)
			out.println("Record inserted");
		else
			out.println("Record not inserted");
		con.close();
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	}

}


