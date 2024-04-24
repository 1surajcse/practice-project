package metafield.nsr.com;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Metafieldcheck
 */
@WebServlet("/Metafieldcheck")
public class Metafieldcheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String, String> map;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Metafieldcheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub


		String loginUrl=request.getParameter("loginUrl");
		//String password=request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		//request.setAttribute("uname", uname); 

		MetafieldDetails details=new MetafieldDetails();

		try {
			map = details.getLoginMetaDatawithName(loginUrl);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HashMap<String, String>map1=details.getLoginMetaDatawithID(loginUrl);


		Iterator it = map1.entrySet().iterator();

		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr>"+"<td>"+"<b>"+"********************Metafield details*****************"+"</td>"+"</tr>"+"<br>"+"<br>"+"<br>"+"</br>");



		out.println("<tr>"+"<td>"+"<b>"+"<u>"+"Details with Id Atribute:-"+"</td>"+"</tr>"+"<br>"+"<br>");
		System.out.println("size::"+map.size());
		if(map.size()!=0)
		{
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry)it.next();

				out.println("<tr><td>"+pair.getKey() + " :" + pair.getValue()+"</td>"+"<tr>"+"<br>");
				it.remove(); // avoids a ConcurrentModificationException
			}
		}else
		{
			out.println("<tr><td>"+"There is no Id attribute"+"</td>"+"<tr>"+"<br>");
		}



		Iterator it1 = map.entrySet().iterator();
		System.out.println("\n\n*******---------------------------*******");
		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr>"+"<td>"+"<b>"+"<u>"+"Details with name Attribute:-"+"</td>"+"</tr>");
		while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry)it1.next();
			out.println("<tr><td>"+pair.getKey() + ":" + pair.getValue()+"</td>"+"<tr>"+"<br>");
			it1.remove(); // avoids a ConcurrentModificationException
		}
		out.println("</table></body></html>");



	}

}
