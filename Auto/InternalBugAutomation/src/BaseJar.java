import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseJar {


	protected  static void execute(String agentname,String summary,String desc,String username,String password,String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();
		//driver.get("https://toolcenter.yodlee.com/toolcenter/signin.do");

		/*	driver.findElement(By.id("txtUsername")).sendKeys(username);

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(password);

		driver.findElement(By.xpath("//*[@id='nonFooter']/table[2]/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='nonFooter']/table[2]/tbody/tr[2]/td[2]/table[3]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/b/a")).click();
		Thread.sleep(100);
		System.out.println("after click on bugzilla");
		driver.findElement(By.xpath("#account")).click();
		 */		
		driver.get("https://blrbugzilla.yodlee.com/index.cgi?GoAheadAndLogIn=1");
		Thread.sleep(100);

		driver.findElement(By.id("Bugzilla_login")).sendKeys(username);

		driver.findElement(By.id("Bugzilla_password")).sendKeys(password);

		driver.findElement(By.id("log_in")).click();

		System.out.println("after click on bugzilla login");

		driver.findElement(By.xpath("//*[@id='links-actions']/ul/li[2]/a")).click();
		System.out.println("after click on links login11");

		JavascriptExecutor js = (JavascriptExecutor)driver;		


		WebElement button =driver.findElement(By.linkText("PFM"));			



		//Perform Click on LOGIN button using JavascriptExecutor		
		js.executeScript("arguments[0].click();", button);
		System.out.println("after click on PFM");


		System.out.println("after click on table body");
		Thread.sleep(100);
		WebElement adbutton=driver.findElement(By.xpath("//*[@id='expert_fields_controller']"));


		js.executeScript("arguments[0].click();", adbutton);
		Select dropdown = new Select(driver.findElement(By.id("component")));

		dropdown.selectByVisibleText("IAE-Data Agent");

		Select drop = new Select(driver.findElement(By.id("cf_department")));

		drop.selectByVisibleText("IAE");

		Select dversion = new Select(driver.findElement(By.id("version")));

		dversion.selectByVisibleText("IAE-Unspecified");
		Select dtype = new Select(driver.findElement(By.id("cf_backend_frontend")));

		dtype.selectByVisibleText("Preventive Fixes");



		Select dropen = new Select(driver.findElement(By.id("cf_environment")));

		dropen.selectByVisibleText("Production");
		if(desc.toLowerCase().contains("nsr"))
		{
			Select btype = new Select(driver.findElement(By.id("cf_bugtype")));

			btype.selectByVisibleText("NSR");
		}
		Select dropwork = new Select(driver.findElement(By.id("cf_workflow")));

		dropwork.selectByVisibleText("IAE");

		Select dropcust = new Select(driver.findElement(By.id("cf_customer")));

		dropcust.selectByVisibleText("All");

		driver.findElement(By.id("comment")).sendKeys(desc);


		driver.findElement(By.id("short_desc")).sendKeys(summary);

		driver.findElement(By.id("cf_agents")).sendKeys(agentname);

		WebElement submit=	driver.findElement(By.xpath("//*[@id='commit']"));
		js.executeScript("arguments[0].click();", submit);
		System.out.println("New Internal bug is created");

	}

}

