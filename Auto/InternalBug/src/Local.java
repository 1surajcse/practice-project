import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Local {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver", "D:/Auto/InternalBugAutomation/Register/chromedriver.exe");
		
		
		downloadimage("https://www.americanbank.com/images/logos/logo.png");
		/*
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ()  ;     
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				WebDriver driver = new ChromeDriver (handlSSLErr);
	

		String baseUrl="https://leplb0470.portal.hewitt.com/web/abbvie/login?forkPage=false";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		WebDriver driver = new ChromeDriver();

		
		//issueUrl::http://resources.hewitt.com/abbvie 
		try
		{
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			
		driver.get("http://resources.hewitt.com/abbvie");
		String redirect=driver.getCurrentUrl();
		System.out.println("after redirect::"+redirect);
	
		
		
		}
		catch(Exception e)
		{
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			System.out.println("inside catch");
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			js1.executeScript("$('meta[http-equiv=Refresh]').remove()");
	
			String redirect=driver.getCurrentUrl();
			
			System.out.println("after redirect::"+redirect);
			
		 redirect=fetchRedirectURL("http://tinyurl.com/KindleWireless");
			
			
			System.out.println("inside Redirect url::"+redirect);
			
		}
	
	Document doc=Jsoup.connect("https://leplb0470.portal.hewitt.com/web/abbvie/login?forkPage=false").get();
	
	String RURl=doc.baseUri();
	System.out.println("see::"+RURl);
	URLConnection con = new URL( "http://tinyurl.com/KindleWireless" ).openConnection();
	System.out.println( "orignal url: " + con.getURL() );
	
	con.connect();
	System.out.println( "connected url: " + con.getURL() );
	InputStream is = con.getInputStream();
	System.out.println( "redirected url: " + con.getURL() );
	is.close();
	
	HttpURLConnection con1 = (HttpURLConnection)(new URL( "https://leplb0470.portal.hewitt.com/web/abbvie/login?forkPage=false" ).openConnection());
	con1.setInstanceFollowRedirects( false);
	con1.connect();
	int responseCode = con1.getResponseCode();
	System.out.println( "responseCode::"+responseCode );
	String location = con1.getHeaderField( "Location");
	URL location1 = con1.getURL();
	
	System.out.println( "loacation:::"+location1 );
	*/
	
	//driver.manage().window().maximize();

		// String password="123456";
		/*	 for(String winHandle : driver.getWindowHandles()){
	       driver.switchTo().window(winHandle);
	   }
		 driver.findElement(By.id("ctl00_c_ucDob_txtPinPad")).click();
		 */

		/* driver.findElement(By.id("campoDesdeBuscador")).clear();
	  driver.findElement(By.id("campoDesdeBuscador")).sendKeys("02/01/1994");
		 driver.findElement(By.id("campoHastaBuscador")).clear();
	  driver.findElement(By.id("campoHastaBuscador")).sendKeys("03/03/1995");*/

		//  driver.findElement(By.cssSelector("#loginActMgr > div > div.contentPanel > div.canvasContentList > div > div > div.horizontalButtonBar.clearfix > div > a")).click();



		/*		IHTMLElement ele=HTMLUtils.getElementWithAttribute(pRobot, ScriptConstants.INPUT_TAG, ScriptConstants.NAME_ATB, "username",false);
		ele.setValue(username);

YDataLogger.out("pass word length::"+password.length());

for(int i=0;i<password.length()-1;i++)
	{
	String a=String.valueOf(i);
	YDataLogger.out("letter   ::"+a);
	IHTMLElement ele1=HTMLUtils.getElementWithAttribute(pRobot, "td", ScriptConstants.INNERTEXT_ATB,a,false );
	YDataLogger.out("letter outer Html  ::"+ele1.getOuterHTML());

	ele1.click();

	}*/


		/*  driver.findElement(By.linkText("2")).click();
      driver.findElement(By.linkText("6")).click();
      driver.findElement(By.linkText("4")).click();*/
		// driver.switchTo().frame(driver.findElement(By.id("IframeresetId")));
		// String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window

		// Switch to new window opened
		/*   for(String winHandle : driver.getWindowHandles()){
       driver.switchTo().window(winHandle);
   }

   driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);*/
		// Perform the actions on new window

		// Close the new window, if that window no more required
		// driver.close();
		//  driver.findElement(By.cssSelector("#userTypePopup-0")).click();

		//((JavascriptExecutor)driver).executeScript("document.getElementById('userTypePopup-0').click();");  
		//driver.findElement(By.cssSelector("#userTypePopup-0")).click();

		//((JavascriptExecutor)driver).executeScript("document.getElementById('inputPassword').removeAttribute('readonly');"); 

		// ((JavascriptExecutor)driver).executeScript("document.getElementById('form_fakePassword').type = 'password'");  
		//((JavascriptExecutor)driver).executeScript("document.querySelector('#key-task-wrapper > p:nth-child(2) > a').click();");  

		System.out.println("2^^^^^^after click on Mobileno Tab");

/*		String URLName="";
		String Url="";
		String favname="";
		String favURl="";
		String display="";

		String logoUrl="";

		HashMap<String, String>map=new HashMap<>();

		List<WebElement> element=driver.findElements(By.tagName("a"));

		List<WebElement> favele=driver.findElements(By.tagName("link"));

		display=driver.getTitle().trim();

		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		for(WebElement imageFromList:allImages){
			String ImageUrl=imageFromList.getAttribute("src");
			System.out.println("image::"+ImageUrl);

			if(ImageUrl.toLowerCase().contains("logo"))
			{
				logoUrl=ImageUrl;
			}
		}
		System.out.println("QA analysis::-");
		for(WebElement fav:favele)
		{
			if(fav.getAttribute("href").contains("favicon.ico"));
			{
				favname="Favicon URL";
				favURl=fav.getAttribute("href");
			}
		}

		for(WebElement ele:element)
		{
			URLName=ele.getText();
			Url=ele.getAttribute("href");
				
			System.out.println("urlName::"+URLName+" "+"Attribute:"+Url);
    	System.out.println("urls::"+ele);
			if(Url!=null)
			{
				if(URLName.toLowerCase().contains("contact")||URLName.toLowerCase().equals("login")||Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("sign in")
						||URLName.toLowerCase().contains("forget password")||URLName.toLowerCase().contains("sign up")||URLName.toLowerCase().equals("register")||URLName.toLowerCase().contains("log in")
						||URLName.toLowerCase().contains("favicon"))
				{
					if(URLName.toLowerCase().contains("sign up"))
					{
						URLName="Registered URl";
					}
					map.put(URLName, Url);
				}
			}
		}
		map.put(favname, favURl);
		map.put("Base Url", baseUrl);
		map.put("DisplayName", display);
		if(!logoUrl.isEmpty())
		{
			map.put("Logo URL", logoUrl);
		}
		else
		{
			map.put("Logo URL", "NA");
		}

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			//*/ // avoids a ConcurrentModificationException
		//}


		//driver.findElement(By.className("form-element")).findElement(By.tagName("input")).sendKeys("05/07/2017");


		// driver.findElement(By.id("inputPassword")).click();
		// driver.findElement(By.id("birthDateMonth")).sendKeys("01");
		// driver.findElement(By.cssSelector("body > div:nth-child(13) > div > div > div > div > div > div > div > div > div.slds-small-show.page-bg.slds-p-top--xx-large.slds-p-bottom--xx-large > div.slds-grid > div:nth-child(2) > div > div.slds-grid.slds-grid--align-center.slds-p-top--large > div > div > button")).click();

		//((JavascriptExecutor)driver).executeScript("document.querySelector('#header > div.container.container--middle > div > div:nth-child(2) > div > div.row > div > form > button').click();"); 
		// driver.findElement(By.linkText("Me connecter")).click();


		// String accname="65+ Guaranteed Growth Bonds";
		//System.out.println("2^^^printing ::::  "+driver.findElement(By.xpath("//a[text()='"+accname+"']")).getAttribute("href"));

		//int no_of_holdings=driver.findElements(By.xpath("//div[@class='data-table__cell data-table__cell--fixed__heading']")).size();
		//System.out.println(no_of_holdings);

	}
	public static void  downloadimage(String url) throws InterruptedException, AWTException
	{
			WebDriver driver=new ChromeDriver();   
		WebElement ele=null;
	//	url="https://www.americanbank.com/images/logos/logo.png";
		driver.get(url);
		Robot robot = new Robot();
		Thread.sleep(2000);
		if(url.contains(".svg"))
		{
			WebElement svgObj = driver.findElement(By.xpath("//*[@id='Layer_1']"));
			Actions actionBuilder = new Actions(driver);
			actionBuilder.contextClick(svgObj).build().perform();


			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_S);

		}
		else
		{
			ele=driver.findElement(By.cssSelector("body > img"));
			Actions action=new Actions(driver);
			action.contextClick(ele).build().perform();
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_SHIFT);
			// robot.keyPress(KeyEvent.KEY_PRESSED);
			robot.keyPress(KeyEvent.VK_V);
		}

		// To press D key.
		//robot.keyPress(KeyEvent.VK_D);
		System.out.println("d press");
		// To press : key.
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		System.out.println("d press");
		// To press : key.
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_SEMICOLON);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_BACK_SLASH);

		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_K);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_7);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyPress(KeyEvent.VK_P);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_G);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_A);

		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_BACK_SLASH);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);

		// To press Save button.
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		File file=new File("D:/WorkSpace/stiwari_nov2017/gatherer/nsr-automation/NSR Project/WebContent/Logo_Favicon/vico.png");//File path
		try
		{
			if(file.delete()){
				System.out.println(file.getName() + " is deleted!");
			}else{
				System.out.println("Delete operation is failed.");
			}

		}catch(Exception e){

			e.printStackTrace();

		}
	}
	
	public static String fetchRedirectURL(String url) throws IOException
    {
HttpURLConnection con =(HttpURLConnection) new URL( url ).openConnection();
System.out.println( "orignal url: " + con.getURL() );
con.setInstanceFollowRedirects(false);
con.connect();

InputStream is = con.getInputStream();
if(con.getResponseCode()>=300 && con.getResponseCode() <400)
    return con.getHeaderField("Location");
else return null;
    }


	//


}

