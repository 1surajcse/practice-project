

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

import metafield.nsr.com.MetafieldDetails;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
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
		
		String baseUrl=request.getParameter("baseUrl");
		//String password=request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//request.setAttribute("uname", uname); 
		
		QADetails details=new QADetails();
		HashMap<String, String>map=details.qaMethod(baseUrl);
		HashMap<String, String>map1=details.qaMethod1(baseUrl);
		

		Iterator it = map.entrySet().iterator();
		System.out.println("\n\n*******--------------QA Analysis-------------*******");
		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr>"+"<td>"+"************QA Analysis**********"+"</td>"+"</tr><br><br>");
		if(map.get("DISPLAY NAME")!=null&&map.get("DISPLAY NAME")!="")
		{
		out.println("<tr>"+"<td>"+"DISPLAY NAME"+"="+map.get("DISPLAY NAME")+"</td>"+"</tr>");
		}
		else
		{
			out.println("<tr>"+"<td>"+"DISPLAY NAME"+"="+"Analyst intervention is required"+"</td>"+"</tr>");
			
		}
		if(map.get("ORGANIZATION NAME")!=null&&map.get("ORGANIZATION NAME")!="")
		{
		out.println("<tr>"+"<td>"+"ORGANIZATION NAME"+"="+map.get("ORGANIZATION NAME")+"</td>"+"</tr>");
		}
		if(map.get("BASE URL")!=null)
		{
		out.println("<tr>"+"<td>"+"BASE URL"+"="+map.get("BASE URL")+"</td>"+"</tr>");
		}
		System.out.println("login------------"+map.get("LOGIN URL"));
		if(map.get("LOGIN URL")!=null&&(map.get("LOGIN URL")!=""))	{
		out.println("<tr>"+"<td>"+"LOGIN URL"+"="+map.get("LOGIN URL")+"</td>"+"</tr>");
		}
		else
		{
			out.println("<tr>"+"<td>"+"LOGIN URL"+"="+"Analyst intervention is required"+"</td>"+"</tr>");
			
		}
		if(map.get("CONTACT URL")!=null)
		{
		out.println("<tr>"+"<td>"+"CONTACT URL"+"="+map.get("CONTACT URL")+"</td>"+"</tr>");
		}
		if(map.get("FORGET PASSWORD URL")!=null)
		{
		out.println("<tr>"+"<td>"+"FORGET PASSWORD URL"+"="+map.get("FORGET PASSWORD URL")+"</td>"+"</tr>");
		
		}
		else
		{
			out.println("<tr>"+"<td>"+"FORGET PASSWORD URL"+"="+"Analyst intervention is required"+"</td>"+"</tr>");
			
		}
		if(map.get("REGISTRATION URL")!=null&&map.get("REGISTRATION URL")!="")
		{
		out.println("<tr>"+"<td>"+"REGISTRATION URL"+"="+map.get("REGISTRATION URL")+"</td>"+"</tr>");
		}
		else{
		out.println("<tr>"+"<td>"+"REGISTRATION URL"+"="+"Analyst intervention is required"+"</td>"+"</tr>");
		
			}
		if(map.get("LOGO URL")!=null)
		{
		out.println("<tr>"+"<td>"+"LOGO URL"+"="+map.get("LOGO URL")+"</td>"+"</tr>");
		}
		if(map.get("FAVICON URL")!=null)
		{
		out.println("<tr>"+"<td>"+"FAVICON URL"+"="+map.get("FAVICON URL")+"</td>"+"</tr>");
		}
		if(map.get("KEYWORDS")!=null)
		{
		out.println("<tr>"+"<td>"+"KEYWORDS"+"="+map.get("KEYWORDS")+"</td>"+"</tr>");
		}
		
		
		if(details.checking()==true)
		{
		Iterator it1 = map1.entrySet().iterator();
		System.out.println("\n\n*******--------------other Urls-------------*******");
		out.println("<html><body>");
		out.println("<table>");
		out.println("<tr>"+"<td>"+"************other URls**********"+"</td>"+"</tr>");
		while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry)it1.next();
			out.println("<tr><td>"+pair.getKey() + " = " + pair.getValue()+"</td>"+"<tr>"+"<br>");
			it1.remove(); // avoids a ConcurrentModificationException
		}
		out.println("</table></body></html>");
	
		}
		
		if(map.get("LOGIN URL")!=null)
		{
			MetafieldDetails metadetails=new MetafieldDetails();
			HashMap<String, String> metamapName = null;
			try {
				metamapName = metadetails.getLoginMetaDatawithName(map.get("LOGIN URL"));
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			HashMap<String, String>metamap=metadetails.getLoginMetaDatawithID(map.get("LOGIN URL"));
		
		

			Iterator it11 = metamap.entrySet().iterator();

			out.println("<html><body>");
			out.println("<table>");
			out.println("<tr>"+"<td>"+"<b>"+"********************Metafield details*****************"+"</td>"+"</tr>"+"<br>"+"<br>"+"<br>"+"</br>");



			out.println("<tr>"+"<td>"+"<b>"+"<u>"+"Details with Id Atribute:-"+"</td>"+"</tr>"+"<br>"+"<br>");
			System.out.println("size::"+map.size());
			if(metamap.size()!=0)
			{
				while (it11.hasNext()) {
					Map.Entry pair = (Map.Entry)it11.next();

					out.println("<tr><td>"+pair.getKey() + " :" + pair.getValue()+"</td>"+"<tr>"+"<br>");
					it11.remove(); // avoids a ConcurrentModificationException
				}
			}else
			{
				out.println("<tr><td>"+"There is no Id attribute"+"</td>"+"<tr>"+"<br>");
			}



			Iterator it111 = metamapName.entrySet().iterator();
			System.out.println("\n\n*******---------------------------*******");
			out.println("<html><body>");
			out.println("<table>");
			out.println("<tr>"+"<td>"+"<b>"+"<u>"+"Details with name Attribute:-"+"</td>"+"</tr>");
			while (it111.hasNext()) {
				Map.Entry pair = (Map.Entry)it111.next();
				out.println("<tr><td>"+pair.getKey() + ":" + pair.getValue()+"</td>"+"<tr>"+"<br>");
				it111.remove(); // avoids a ConcurrentModificationException
			}
			out.println("</table></body></html>");



		}

		}
		
	
	/*	while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			out.println("<tr><td>"+pair.getKey() + " = " + pair.getValue()+"</td>"+"<tr>"+"<br>");
			
				
			it.remove(); // avoids a ConcurrentModificationException
		}*/
		
		
		
	

}
