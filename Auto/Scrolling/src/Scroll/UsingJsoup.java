package Scroll;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJsoup {

	/*public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Auto/InternalBugAutomation/Register/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("file:///C:/Users/stiwari/Desktop/gg.html");

		Document doc = Jsoup.parse(driver.getPageSource());
		Elements dateElements = doc.getElementsByAttributeValueContaining("class", "mcf-col mcf-col-date");
		Elements desElements = doc.getElementsByAttributeValue("class","mcf-mutationdetail-description");
		Elements debitElements = doc.getElementsByAttributeValueContaining("class", "mcf-col mcf-col-amountmin");
		Elements creditElements = doc.getElementsByAttributeValueContaining("class", "mcf-col mcf-col-amountplus");
		Elements runningElements = doc.getElementsByAttributeValueContaining("data-tl", "Mutations-SaldoNaBoeking");
		
	
		System.out.println("Dsize::"+dateElements.size());
		System.out.println("desElements Size:"+desElements.size());
		System.out.println("debitElements Size:"+debitElements.size());
		System.out.println("creditElements Size:"+creditElements.size());
		System.out.println("runningElements Size:"+runningElements.size());
		if(dateElements.size()==desElements.size()&&debitElements.size()==desElements.size())
		{
		for (int i = 0; i < dateElements.size(); i++) {
			System.out.println("Date::" + dateElements.get(i).text());
			System.out.println("debit::" + debitElements.get(i).text());
			System.out.println("creditPlus::" + creditElements.get(i).text());

			System.out.println("Description::" + desElements.get(i).text());
			System.out.println("runningBal::" + runningElements.get(i).nextElementSibling().text());
			System.out.println("runningBal::" + runningElements.get(i).nextElementSibling().text().substring(1).trim());

		}
		}
		else
		{
		System.out.println("transaction page has been changed");
		}


		 doc = Jsoup.parse(driver.getPageSource());
		Elements amountElements = doc.getElementsByAttributeValueContaining("class", "mcf-col mcf-col-amountmin");
		amountElements.get(2);
				
		System.out.println("amount::"+amountElements.get(i).text());

		 doc = Jsoup.parse(driver.getPageSource());
		Elements valueElements = doc.getElementsByAttributeValueContaining("class", "mcf-mutationdetail-value");
		
		System.out.println("Value::"+valueElements.get(0).text());
		
				
	
		}*/
				
	}


