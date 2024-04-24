
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Driver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.RETURN;



/**
 * author:stiwari@yodlee.com** program to list links from a URL.
 */
public class QADetails {
	String login1="";
	String login2="";
	String login3="";
	String keywords="";

	HashMap<String, String>map=new HashMap<>();
	HashMap<String, String>map1=new HashMap<>();
	public boolean check=false;
	public HashMap<String, String> qaMethod(String baseUrl) throws IOException {

		String URLName="";
		String loginD="LOGIN URL";
		String baseD="BASE URL";
		String contactD="CONTACT URL";
		String registerD="REGISTRATION URL";
		String Url="";
		String favname="FAVICON URL";
		String forgetD="FORGET PASSWORD URL";
		String favURl="";
		String displayName="Display Name";
		String displayD="DISPLAY NAME";
		String logoUrl="";
		String logoD="LOGO URL";
		String keywordsD="KEYWORDS";
		String orgnameD="ORGANIZATION NAME";
		String orgName="";
		String orgName1="";
		Document doc;

		//String baseUrl = "https://www.wellsfargo.com/";
		print("Fetching %s...", baseUrl);
		try{
			doc = Jsoup.connect(baseUrl).get();

		}
		catch(Exception e)
		{
			System.setProperty("webdriver.chrome.driver", "D:/Auto/InternalBugAutomation/Register/chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get(baseUrl);

			doc = Jsoup.parse(driver.getPageSource());
			driver.close();

		}
		try
		{
			System.out.println("inside try");
			Element orgname=doc.select("*:containsOwn(©)").get(0);
			//Element orgname1=doc.select("*:containsOwn(Copyright)").get(0);


			orgName=orgname.text();
			System.out.println("orgname::"+orgName);
			if(orgName.equals("©"))
			{
				orgname=orgname.parent();

				orgName=orgname.text();
			}

			orgName=orgName.replace("Copyright", "");
			orgName = orgName.replaceAll("[0-9]","").trim();

			if(orgName.contains("-"))
			{

				orgName = orgName.replaceAll("-","").trim();
			}
			orgName=orgName.substring(orgName.indexOf("©")+1,orgName.length()).trim();

			if(orgName.toLowerCase().contains("all rights reserved"))
			{
				orgName=orgName.substring(0,orgName.toLowerCase().lastIndexOf("all rights reserved")).trim();
			}


			if(orgName.startsWith("|"))
			{
				orgName=orgName.substring(1,orgName.length());
				orgName=orgName.trim();

			}
			if(orgName.startsWith("|"))
			{
				orgName=orgName.substring(1,orgName.length());
				orgName=orgName.trim();

			}
			System.out.println("outside--if::"+orgName);
			if(orgName.trim().endsWith("."))
			{
				System.out.println("inside--if");
				orgName=orgName.trim().substring(0,orgName.length()-1);
			}
			if(orgName.endsWith(","))
			{
				orgName=orgName.substring(0,orgName.length()-1);
			}

			System.out.println(" checking::"+orgname.text());


		}
		catch(Exception e)
		{  
			System.out.println("inside catch");
			try{
				Element orgname1=doc.select("*:containsOwn(Copyright)").get(0);
				System.out.println("inside try::"+orgname1.text());

				if(orgName1.equals("Copyright"))
				{
					orgname1=orgname1.parent();

					orgName1=orgname1.text();
				}
				orgName1=orgname1.text();
				orgName1= removeReplaceOrgname(orgName1);
				orgName1=orgName1.substring(orgName1.indexOf("Copyright")+9,orgName1.length()).trim();
				if(orgName1.toLowerCase().contains("all rights reserved"))
				{
					orgName1=orgName1.substring(0,orgName1.toLowerCase().lastIndexOf("all rights reserved")).trim();
				}
				System.out.println("outside--if::"+orgName1);
				if(orgName1.trim().endsWith("."))
				{
					System.out.println("inside--if");
					orgName1=orgName1.trim().substring(0,orgName1.length()-1);
				}
				if(orgName1.endsWith(","))
				{
					orgName1=orgName1.substring(0,orgName1.length()-1);
				}

				System.out.println(" checking org Name::"+orgname1.text());

			}
			catch(Exception e1)
			{
				orgName1="Analyst Intervention required.";
			}
		}


		Elements links = doc.select("a[href]");
		Elements meta = doc.select("meta[content]");
		Elements media = doc.select("[src]");
		Elements imports = doc.select("link[href]");
		Elements buttons = doc.select("button[class]");

		displayName=doc.title().trim();
		System.out.println("display Name1::"+displayName);


		if((displayName.toLowerCase().startsWith("savings")||displayName.toLowerCase().startsWith("deposit"))&&displayName.contains("-"))
		{
			displayName=displayName.substring(displayName.indexOf("-")+1,displayName.length());
		}
		if(displayName.toLowerCase().startsWith("welcome to")&&displayName.contains("-"))
		{
			displayName=displayName.substring(displayName.indexOf("welcome to")+1,displayName.length());
		}
		if(displayName.contains("–"))
		{
			displayName=displayName.substring(0,displayName.indexOf("–"));
		}
		if(displayName.contains("-"))
		{
			displayName=displayName.substring(0,displayName.indexOf("-"));
		}
		if(displayName.contains("|"))
		{
			displayName=displayName.substring(0,displayName.indexOf("|"));
		}
		/*	if(displayName.contains("Home"))
		{
			displayName=displayName.replace("Home |", "");
			displayName=displayName.replace("Home|", "");
			displayName=displayName.replace("| Home", "");
			displayName=displayName.replace("Home -", "");
			displayName=displayName.replace("- Home", "");
			displayName=displayName.replace("-Home", "");
		}*/

		if(displayName.contains(","))
		{
			displayName=displayName.substring(0,displayName.indexOf(","));

			if(displayName.toLowerCase().contains("credit union"))
			{
				displayName=displayName.replace("Credit Union", "CU");
			}
			if(displayName.length()>50)
			{
				displayName=displayName.substring(0,50);
			}
		}
		if(displayName.toLowerCase().contains("credit union"))
		{
			displayName=displayName.replace("Credit Union", "CU");
		}

		if(displayName.toLowerCase().startsWith("savings")&&displayName.contains("-"))
		{
			displayName=displayName.substring(displayName.indexOf("-")+1,displayName.length());
		}
		displayName=displayName.trim();
		System.out.println(" Actual display Name::"+displayName);

		keywords=keywordsgen(displayName);


		print("\nMedia: (%d)", media.size());
		for (Element src : media) {
			if (src.tagName().equals("img"))
			{
				System.out.println("logo1 testing::");
				print(" * %s: <%s> %sx%s (%s)",
						src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),src.attributes(),
						trim(src.attr("alt"), 20));
			}
			else
			{
				System.out.println("logo testing::");
				print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
			}
			displayName=displayName.trim();
			System.out.println("logo1 testing::for dis::"+src.attr("alt").contains(displayName));
		

			if(displayName.toLowerCase().contains("for")&&src.attr("abs:src").toLowerCase().contains("logo"))
			{
				displayName=src.attr("alt");	
				if(displayName.toLowerCase().contains("logo"))
				{
					displayName=displayName.replaceAll("Logo", "");
				}
				keywords="";
				keywords=keywordsgen(displayName);
				
				
			}
			if(src.attr("abs:src").toLowerCase().contains("logo")&&(!src.attr("abs:src").toLowerCase().contains("footer"))&&src.attr("alt").contains(displayName))
			{
				
				logoUrl=src.attr("abs:src");
			}
			else if(src.attr("alt").contains(displayName))
			{
				logoUrl=src.attr("abs:src");
			}
		}

		print("\nImports: (%d)", imports.size());
		for (Element link : imports) {
			print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));

			if(link.attr("abs:href").toLowerCase().contains("favicon")&&link.attr("abs:href").toLowerCase().contains(".ico"))
			{
				favURl=link.attr("abs:href");
			}
		}

		print("\nmeta: (%d)", meta.size());

		/*for (Element meta1 : meta) {
			print( meta1.tagName(),meta1.attr("content"),meta1.attr("name"));

			if(meta1.attr("content").toLowerCase().contains("logo"))
			{

				logoUrl=meta1.attr("content");
			}
		}*/

		print("\nLinks: (%d)", links.size());
		for (Element link : links) {
			print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));

			URLName=link.text();
			Url=link.attr("abs:href");
			Url=removeQuestionmark(Url);
			System.out.println("urlName::"+URLName);
			System.out.println("url::"+Url);

			if(URLName.toLowerCase().contains("contact") &&Url.toLowerCase().contains("contact"))
			{
				map.put(contactD, Url);

			}

			if(URLName.toLowerCase().equals("login")&&Url.toLowerCase().contains("login"))
			{
				System.out.println("inside login");
				map.put(loginD, Url);
				login1=Url;
				map1.put(URLName, Url);
			}
			if(URLName.toLowerCase().equals("login"))
			{
				System.out.println("inside login");
				
				Url=removeQuestionmark(Url);
				map.put(loginD, Url);
				login2=Url;
				map1.put(URLName, Url);
			}
			if(URLName.toLowerCase().contains("login")&&Url.toLowerCase().contains("login")&&login3!=Url)
			{
				System.out.println("inside login");
				
				map.put(loginD, Url);
				login3=Url;
		
				map1.put("login", Url);
				
			}
			if(URLName.toLowerCase().contains("login")&&Url.toLowerCase().contains("login")&&(login1==null||login1=="")&&login1!=login3)
			{
				map1.put(URLName, Url);
				login1=Url;
			}
		
			System.out.println("login Details::"+map.get(loginD));
			if(((Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("login"))||URLName.toLowerCase().contains("sign in")||
					URLName.toLowerCase().contains("log in")||URLName.toLowerCase().contains("sign on"))&&(login3!=Url)&&(!(Url.toLowerCase().contains("forgot")||Url.toLowerCase().contains("forget"))))
			{

				map1.put(URLName, Url);
				login2=Url;
			}

			if(map.get(loginD)==null||map.get(loginD)=="")
			{
				if(Url.contains("?"))
				{
					Url=Url.substring(0,Url.indexOf("?"));
				}
				if(((Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("login"))||(URLName.toLowerCase().contains("sign in")&&Url.toLowerCase().contains("sign in"))||
						URLName.toLowerCase().contains("log in")||URLName.toLowerCase().contains("log on")||URLName.toLowerCase().contains("sign on"))&&(!(Url.toLowerCase().contains("forgot")||Url.toLowerCase().contains("forget"))))
				{
					map.put(loginD, Url);
					map1.put(URLName, Url);
					login2=Url;
				}

			}

			if(URLName.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forgot")||URLName.toLowerCase().contains("forgot"))
			{
				System.out.println("inside iff::::");
				map.put(forgetD, Url);

			}

			if(URLName.toLowerCase().contains("sign up")||URLName.toLowerCase().contains("register")||URLName.toLowerCase().contains("registeration")||
					Url.toLowerCase().contains("register"))
			{
				map.put(registerD, Url);
				map1.put(URLName, Url);
			}
			if(map.get(registerD)==null&&(Url.toLowerCase().contains("enroll")||URLName.toLowerCase().contains("enroll")))
			{
				map.put(registerD, Url);
			}

			if(Url.toLowerCase().contains("favicon"))
			{
				map.put(favname, Url);

			}

		}







		if(favURl!=""&&favURl!=null)
		{
			map.put(favname, favURl);
		}


		else
		{
			if(baseUrl.endsWith("/"))
			{
				favURl=baseUrl+"favicon.ico";
			}
			else{
				favURl=baseUrl+"/favicon.ico";
			}
			if(verifyUrl(favURl))
			{
				System.out.println("dsfdsfds");
				urlValidator(favURl);
				map.put(favname, favURl);
			}
			else
			{
				map.put("Favicon URL", "Analyst intervention is required");
			}
		}
		map.put(baseD, baseUrl);
		map.put(displayD, displayName);
		map.put(keywordsD, keywords);

		System.out.println("OrgName:-"+orgName);
		System.out.println("OrgName1:-"+orgName1);
		if(orgName!=null&& orgName !="")
		{
			map.put(orgnameD, orgName);
		}else
		{
			map.put(orgnameD, orgName1);
		}
		if(!logoUrl.isEmpty())
		{
			map.put(logoD, logoUrl);

		}
		else
		{
			map.put(logoD, "Analyst intervention is required");
		}
		System.out.println("dis details"+map.get(displayD));
		System.out.println("Forget details"+map.get(forgetD));
		System.out.println("login details"+map.get(loginD)+"*******"+"loginUrl::"+map.get(Url));
		print("\nbuttons: (%d)", buttons.size());
		for (Element link : buttons) {
			print(" button* %s <%s> (%s)", link.tagName(),link.attr("class"), link.attr("rel"));

			if(link.attr("abs:class").toLowerCase().contains("onlinebanking")||link.text().toLowerCase()=="online banking")
			{

				Url=link.attr("abs:href");
				map.put(loginD, Url);
				map1.put(URLName, Url);
				login3=Url;


			}


		}
		System.out.println("sdfsd::"+map.get(loginD));


		if((map.get(forgetD)==""||map.get(forgetD)==null)&&(map.get(loginD)!=""&&map.get(loginD)!=null))
		{

			if(map.get(loginD)==null||map.get(loginD)==" ")
			{
				map.put(loginD, "Analyst intervention is required");
			}

			System.out.println("inside"+map.get(forgetD));

			Document doc1 = Jsoup.connect(map.get(loginD)).get();


			Elements link1 = doc1.select("a[href]");


			for (Element link : link1) {
				print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));

				URLName=link.text();
				Url=link.attr("abs:href");
				removeQuestionmark(Url);

				System.out.println("Url name::"+URLName);
				if(!Url.equals(""))
				{
					removeQuestionmark(Url);
					if(URLName.toLowerCase().contains("contact") &&Url.toLowerCase().contains("contact"))
					{
						map.put(contactD, Url);

					}
					/*	if(URLName.toLowerCase().equals("login"))
					{
						map.put(loginD, Url);	
						map1.put(loginD, Url);
						login1=Url;
					}
					else if(Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("login")||URLName.toLowerCase().contains("sign in")||URLName.toLowerCase().contains("log in"))
					{
						map.put(loginD, Url);
						map1.put(URLName, Url);
						login2=Url;
					}*/


					if(URLName.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forgot")||URLName.toLowerCase().contains("forgot"))
					{
						map.put(forgetD, Url);

					}
					if(URLName.toLowerCase().contains("sign up")||URLName.toLowerCase().equals("register")||URLName.toLowerCase().contains("registeration")||
							Url.toLowerCase().contains("register")||Url.toLowerCase().contains("enroll")||URLName.toLowerCase().contains("enroll"))
					{
						map.put(registerD, Url);
						map1.put(URLName, Url);
					}

				}


			}


		}
		System.out.println("login1===::"+login1);

		System.out.println("login2::"+login2);

		System.out.println("login3::"+login3);
		if((login1!=""&&login2!="")||(login1!=""&&login3!="")||login2!=""&&login3!="")
		{
			if(login1!=login2&&login2!=login3)
			{


				System.out.println("login1::"+login1);

				System.out.println("login2::"+login2);

				System.out.println("login3::"+login3);
				map.put(loginD, "This site supports more than one login url");
			}

			System.out.println("sdfsd::"+map.get(loginD));


			if(map.get(loginD)==null||map.get(loginD)==" ")
			{
				map.put(loginD, "Analyst intervention is required");
				map1.put(loginD, Url);
			}
		}

		/*
		Iterator it = map.entrySet().iterator();
		System.out.println("\n\n*******--------------QA Analysis-------------*******");
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
		 */

		/*	
		Iterator it1 = map1.entrySet().iterator();
		System.out.println("\n\n--------------Its seems This site support more login and base url please check-------------\n\n");
		while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry)it1.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			it1.remove(); // avoids a ConcurrentModificationException

		}*/


		return map;

	}

	private static void print(String msg, Object... args) {
		System.out.println(String.format(msg, args));
	}

	private static String trim(String s, int width) {
		if (s.length() > width)
			return s.substring(0, width-1) + ".";
		else
			return s;
	}

	/*	if(verifyUrl(loginURL))
	{
		try
		{
			URL myURL = new URL(loginURL);
			HttpURLConnection myConnection = (HttpURLConnection) myURL.openConnection();
			if (myConnection.getResponseCode()==URLStatus.HTTP_OK.getStatusCode()||myConnection.getResponseCode()==URLStatus.MOVED_PERMANENTLY.getStatusCode()) {
				succeededURLS = succeededURLS + "\n" + loginURL + "****** Status message is : "
						+ URLStatus.getStatusMessageForStatusCode(myConnection.getResponseCode());
				System.out.println("succeeded URLS::"+succeededURLS);
			} else {
				failedURLS = failedURLS + "\n" + loginURL + "****** Status message is : "
						+ URLStatus.getStatusMessageForStatusCode(myConnection.getResponseCode());
				finalResults=finalResults+"Please check the login URL|";
				System.out.println("failedURLS ::"+failedURLS);
			}
		} catch (Exception e) {
			System.out.print("For url- " + loginURL+ "" +e.getMessage());
			finalResults=finalResults+e.getMessage()+" "+"Exception in the Login URL|";
		}
	}
	else {
		incorrectURLS += "\n" + loginURL;
		System.out.println("inside else::"+incorrectURLS);
		finalResults=finalResults+"Incorrect Login URL|";
	}*/




	public static boolean verifyUrl(String url) {
		String urlRegex = "^((((https?|ftps?|http?|gopher|telnet|nntp)://)|(mailto:|news:))" +   
				"(%[0-9A-Fa-f]{2}|[-()_.!~*';/?:@&=+$, A-Za-z0-9])+)" + "([).!';/?:, ][[:blank:]])?$";
		Pattern pattern = Pattern.compile(urlRegex);
		Matcher m = pattern.matcher(url); 

		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
	/*	public enum URLStatus {  

		HTTP_OK(200, "OK", "SUCCESS"), NO_CONTENT(204, "No Content", "SUCCESS"),
		MOVED_PERMANENTLY(301, "Moved Permanently", "SUCCESS"), NOT_MODIFIED(304, "Not modified", "SUCCESS"),
		USE_PROXY(305, "Use Proxy", "SUCCESS"), INTERNAL_SERVER_ERROR(500, "Internal Server Error", "ERROR"),
		NOT_FOUND(404, "Not Found", "ERROR");

}
	private int statusCode;
	private String httpMessage;
	private String result;     
	public int getStatusCode() {
		return statusCode;
	}     
	private URLStatus(int code, String message, String status) {
		statusCode = code;
		httpMessage = message;
		result = status;
	}
	public static String getStatusMessageForStatusCode(int httpcode) {
		String returnStatusMessage = "Status Not Defined";
		for (URLStatus object : URLStatus.values()) {
			if (object.statusCode == httpcode) {
				returnStatusMessage = object.httpMessage;
			}
		}
		return returnStatusMessage;
	}

	public static String getResultForStatusCode(int code) {
		String returnResultMessage = "Result Not Defined";
		for (URLStatus object : URLStatus.values()) {
			if (object.statusCode == code) {
				returnResultMessage = object.result;
			}
		}
		return returnResultMessage;
	}*/

	public static boolean urlValidator(String url)
	{
		try {
			new URL(url).toURI();
			return true;
		}
		catch (URISyntaxException exception) {
			return false;
		}

		catch (MalformedURLException exception) {
			return false;
		}
	}
	public String removeQuestionmark(String url)
	{
		if(url.contains("?"))
		{
			url=url.substring(0,url.indexOf("?"));
			return url;
		}
		else
		{
			return url;
		}
	}

	public boolean ifUrlIsnull(String url)
	{
		if(url==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean checking()
	{
		if((login1!=""&&login2!="")||(login1!=""&&login3!="")||login2!=""&&login3!="")
		{
			if(login1!=login2&&login2!=login3)
			{
				check=true;

				System.out.println("login1::"+login1);

				System.out.println("login2::"+login2);

				System.out.println("login3::"+login3);

			}}
		return check;
	}
	public HashMap<String, String> qaMethod1(String baseUrl) throws IOException
	{


		return map1;
	}

	public String removeReplaceOrgname(String org)
	{
		org = org.replaceAll("[0-9]","").trim();
		org = org.replaceAll("-","").trim();
		org=org.replace("Website by LetterBlock.", "");
		org=org.replace("nineteen ninety nine to two thousand and seventeen", "");
		org=org.replace("Privacy Policy", "");
		return org;
	}

	public String keywordsgen(String displayName)
	{

		String key[]=displayName.split(",");
		for(int i=0;i<key.length;i++)
		{
			keywords=keywords+key[i]+",";

		}
		System.out.println("Key length::"+key.length);
		if(key.length<=1)
		{


			String key11[]=keywords.split("\\s+");
			if(key.length<1)
			{
				System.out.println("Key 11::"+key11[0]);

				keywords=keywords+key11[0];
			}


		}
		else
		{
			keywords=keywords.substring(0, keywords.length()-1);
		}


		if(keywords.endsWith(","))
		{
			keywords=keywords.substring(0,keywords.length()-1).trim();
		}
		return keywords;
	}


}
