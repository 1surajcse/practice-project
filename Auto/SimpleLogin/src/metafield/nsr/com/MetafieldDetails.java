package metafield.nsr.com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 * author:stiwari@yodlee.com** program to list links from a URL.
 */

public class MetafieldDetails  {
	static Element link1;
	static Element link2;
	static Element link3;
	static boolean pass=false;
	Elements nameData ;
	Elements idLinks ;
	Elements textlinks ;
	Document doc;
	String Url="";
	HashMap<String, String>map=new HashMap<>();
	HashMap<String, String>map1=new HashMap<>();
	public HashMap<String, String> getLoginMetaDatawithName(String loginUrl) throws IOException, InterruptedException {
		//public static void main(String args[]) throws IOException, InterruptedException
		//{



		//String  loginUrl="https://www.kotak.com/en.html";

		print("Fetching %s...", loginUrl);

		doc = Jsoup.connect(loginUrl).get();

System.out.println("doc1::"+doc);





		nameData = doc.select("input[name]");
		idLinks = doc.select("input[id]");
		textlinks = doc.select("input[text]");
		if(nameData.size()==0&&idLinks.size()==0&&textlinks.size()==0)
		{


			System.setProperty("webdriver.chrome.driver", "D:/Auto/InternalBugAutomation/Register/chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.get(loginUrl);
		
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			printFrames(driver);

			doc = Jsoup.parse(driver.getPageSource());
			
			System.out.println("doc2::"+doc);
			try{
				Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_F12);
				robot.keyRelease(KeyEvent.VK_F12);

			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			} 

			JavascriptExecutor js = (JavascriptExecutor) driver;  

			
		
			driver.close();
			Elements elementsByTag = doc.getElementsByTag("input");
			//js.executeScript("document.getElementsByTagName('input').size");
			System.out.println("================>"+	js.executeScript("document.getElementsByTagName('input')[0]"));
			System.out.println("================>"+	js.executeScript("document.getElementsByTagName('input').size"));
			nameData = doc.select("input[name]");
			idLinks = doc.select("input[id]");
			textlinks = doc.select("input[text]");
		}


		print("\nNamelinks: (%d)", nameData.size());
		for (Element link : nameData) {
			print(" * input: <%s>  (%s)", link.attr("name"), trim(link.text(), 35),link.attr("type"),link.attr("size"),link.attr("maxlength"));

			if(!link.attr("type").contains("hidden")&&!link.attr("type").contains("checkbox"))
			{

				Url=link.attr("name");
				System.out.println("Meta field Name::"+Url);
				System.out.println("Meta field size::"+link.attr("size"));
				System.out.println("Meta field maxlength::"+link.attr("maxlength"));

				if((Url.toLowerCase().contains("user")||Url.toLowerCase().contains("number")||Url.toLowerCase().equals("onlineid1"))&&!Url.toLowerCase().contains("password"))
				{
					if(link.attr("placeholder")!=null&&link.attr("placeholder")!="")
					{
						if(link.attr("size")!=null&&link.attr("size")!=""||link.attr("maxlength")!=null&&link.attr("maxlength")!="")
						{
							map.put(link.attr("placeholder").trim(), Url+":"+link.attr("size")+":"+link.attr("maxlength"));
						}else
						{
							map.put(link.attr("placeholder").trim(), Url);
						}
					}
					else

					{

								link1=(Element) link.parent();
						if(link1!=null)
						{
						link1=(Element) link1.parent();					//	System.out.println("link3::"+link1.text());
						}
						link2=(Element) link1.parent();
						if(link2.text()!=null)
						{

						System.out.println("Previous1::"+link1.text());
						}
						link3=(Element) link.previousSibling().parent().previousSibling().previousSibling();
						if((link3!=null))
						{

						System.out.println("Previous3::"+link3.text());
						}
						if((Element) link1.parent()!=null)
						{
					link= (Element) link.previousSibling().parent().previousSibling().previousSibling();
					System.out.println("link1::"+link.text());
						}

						if(link.attr("size")!=null&&link.attr("size")!=""||link.attr("maxlength")!=null&&link.attr("maxlength")!="")
						{
							map.put("UserName", Url+":"+link.attr("size")+":"+link.attr("maxlength"));
						}
						else
						{
							map.put("UserName", Url);
						}
					}
				}
				if(Url.toLowerCase().contains("pass")||Url.contains("pin")&&link.attr("type").contains("password"))
				{
					if(link.attr("placeholder")!=null&&link.attr("placeholder")!="")
					{
						if(link.attr("size")!=null&&link.attr("size")!=""||link.attr("maxlength")!=null&&link.attr("maxlength")!="")
						{
							map.put(link.attr("placeholder").trim(), Url+":"+link.attr("maxlength")+":"+link.attr("size"));
						}else
						{
							map.put(link.attr("placeholder").trim(), Url);
						}
						
					}
					else
					{
						/*link1= (Element) link.previousSibling().parent().parent().previousSibling().previousSibling();
						System.out.println("link1::"+link1.text());*/
						/*
					link3=(Element) link.previousSibling().previousSibling().previousSibling();
					System.out.println("link3::"+link3.text());*/


						if(link.attr("size")!=null&&link.attr("size")!=""||link.attr("maxlength")!=null&&link.attr("maxlength")!="")
						{
							map.put("Password", Url+":"+link.attr("maxlength")+":"+link.attr("size"));
						}else
						{
							map.put("Password", Url);
						}

				
					}
				}
				if(Url.toLowerCase().contains("dob"))
				{
					if(link.attr("placeholder")!=null&&link.attr("placeholder")!="")
					{
						map.put(link.attr("placeholder").trim(), Url);
					}
					else
					{
						/*link3=(Element) link.previousSibling().previousSibling();
						System.out.println("link3::"+link3.text());*/
						map.put("DOB", Url);
					}


				}
			}
		}
		return map;


	}
	public HashMap<String, String> getLoginMetaDatawithID(String loginUrl) throws IOException {

		print("\nLinks: (%d)", idLinks.size());
		for (Element link : idLinks) {
			//print(" * a: <%s>  (%s)", link.attr("name"), trim(link.text(), 35),link.attr("type"),link.attr("size"),link.attr("metafield"));

			if(!link.attr("type").contains("hidden")||!link.attr("type").contains("checkbox"))
			{

				Url=link.attr("id");
				System.out.println("Meta field Name::"+Url);

				if(Url.toLowerCase().contains("user")||Url.toLowerCase().contains("id")||Url.toLowerCase().contains("login")||Url.toLowerCase().contains("email")||Url.toLowerCase().equals("onlineid1")&&!Url.toLowerCase().contains("password"))
				{
					if(link.attr("placeholder")!=null&&link.attr("placeholder")!="")
					{
						map1.put(link.attr("placeholder").trim(), Url);
						if((link.attr("size")!=null&&link.attr("size")!="")||(link.attr("maxlength")!=null&&link.attr("maxlength")!=""))
						{
							map1.put(link.attr("placeholder").trim(), Url+":"+link.attr("size")+":"+link.attr("maxlength"));
						}else
						{
							map1.put(link.attr("placeholder").trim(), Url);
						}
					}

					else
					{
						System.out.println("Previous::"+link.text());
						map1.put("UserName", Url);
					}
				}
				if(Url.toLowerCase().contains("pass")||Url.contains("pin")&&link.attr("type").contains("password"))
				{
					if(link.attr("placeholder")!=null&&link.attr("placeholder")!="")
					{
						if((link.attr("size")!=null&&link.attr("size")!="")||(link.attr("maxlength")!=null&&link.attr("maxlength")!=""))
						{
							map1.put(link.attr("placeholder").trim(), Url+":"+link.attr("size")+":"+link.attr("maxlength"));
						}
						else{
							map1.put(link.attr("placeholder").trim(), Url);
						}
					}
					else
					{
						
						map1.put("Password", Url);
					}
				}
				if(Url.toLowerCase().contains("dob"))
				{
					map1.put("Dob", Url);
				}
			}
		}




		Iterator it1 = map1.entrySet().iterator();
		System.out.println("\n\n*******--------------Meta field Details with Id Atribute------------*******");


		/*	while (it1.hasNext()) {
			Map.Entry pair = (Map.Entry)it1.next();

			if(pair.getKey()!=null&&!pair.getKey().toString().isEmpty())
			{
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
			it1.remove(); // avoids a ConcurrentModificationException
		}
		Iterator it = map.entrySet().iterator();
		System.out.println("\n\n*******--------------Meta field Details with name Attribute------------*******");


		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();

			if(pair.getKey()!=null&&!pair.getKey().toString().isEmpty())
			{
				System.out.println(pair.getKey() + " : " + pair.getValue());
			}
			it.remove(); // avoids a ConcurrentModificationException
		}*/
		return map1;



		/*try {
	        String url = "https://www.aigcorporate.com/_20_306214.html";
	        Connection.Response response = Jsoup.connect(url).method(Connection.Method.GET).execute();

	        response = Jsoup.connect(url)
	               // .cookies(response.cookies())
	                .data("Action", "Login")
	                .data("User", "your_login")
	                .data("Password", "your_password")
	                .method(Connection.Method.POST)
	                .followRedirects(true)
	                .execute();

	        String document = response.parse().getElementsByTag("form").text();
	        System.out.println(document);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }*/
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

	public static void printFrames(WebDriver driver) {


		System.out.println("Inside print frames...");

		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));

		System.out.println("frames are: "+frames.size());
		System.out.println("iframes are: "+ iframes.size());

		if(frames.size()==0 && iframes.size()==0){
			return;
		}

		for(WebElement frame: frames){
			try{
				System.out.println("frame id is: "+frame.getAttribute("id"));
				System.out.println("frame name is: "+frame.getAttribute("name"));
				System.out.println("frame src is: "+frame.getAttribute("src"));
				driver.switchTo().frame(frame);
				System.out.println("11111");

				System.out.println("1111122");
				printFrames(driver);
				driver.switchTo().parentFrame();
			}catch(Exception e){

				driver.switchTo().frame(frame);
				System.out.println("11111555555");

				System.out.println("11111225555");
				printFrames(driver);
				driver.switchTo().parentFrame();
			}
		}

		for(WebElement frame: iframes){
			try{
				System.out.println("iframe id is: "+frame.getAttribute("id"));
				System.out.println("iframe name is: "+frame.getAttribute("name"));
				System.out.println("iframe src is: "+frame.getAttribute("src"));
				driver.switchTo().frame(frame);
				System.out.println("22222");

				System.out.println("2222233333");
				printFrames(driver);
				driver.switchTo().parentFrame();
			}catch(Exception e){

				driver.switchTo().frame(frame);
				System.out.println("22222");

				System.out.println("2222233333");
				printFrames( driver);
				driver.switchTo().parentFrame();
			}
		}

	}
}

