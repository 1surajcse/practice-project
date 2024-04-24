import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class BaseJarV1 {


	protected  static void execute(String agentname,String summary,String desc,String username,String password,String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();



		Thread.sleep(100);
		System.out.println("after click on bugzilla");
		//driver.findElement(By.xpath("#account")).click();

		driver.get("https://blrbugzilla.yodlee.com/?GoAheadAndLogIn=1");
		Thread.sleep(100);

		driver.findElement(By.id("Bugzilla_login")).sendKeys(username);

		driver.findElement(By.id("Bugzilla_password")).sendKeys(password);

		driver.findElement(By.id("log_in")).click();

		System.out.println("after click on bugzilla login");

		driver.findElement(By.xpath("//*[@id='links-actions']/ul/li[2]/a")).click();
		System.out.println("after click on New");
		Thread.sleep(200);
		WebElement ele=	driver.findElement(By.cssSelector("#bugzilla-body > table > tbody > tr:nth-child(25) > th > a"));

		System.out.println("elel::"+ele.getText());
	
		ele.click();
		System.out.println("after click on PFM");

		driver.findElement(By.xpath("//*[@id='expert_fields_controller']")).click();

		System.out.println("after click on Show");

		Select dropdown = new Select(driver.findElement(By.id("component")));

		dropdown.selectByVisibleText("IAE-Data Agent");

		Select drop = new Select(driver.findElement(By.id("cf_department")));

		drop.selectByVisibleText("IAE");

		Select dropen = new Select(driver.findElement(By.id("cf_environment")));

		dropen.selectByVisibleText("Production");
		Select dropSource = new Select(driver.findElement(By.id("cf_backend_frontend")));

		dropSource.selectByVisibleText("Preventive Fixes");
		Select dropVersion = new Select(driver.findElement(By.id("version")));

		dropVersion.selectByVisibleText("IAE-Unspecified");

		Select dropwork = new Select(driver.findElement(By.id("cf_workflow")));

		dropwork.selectByVisibleText("IAE");

		Select dropcust = new Select(driver.findElement(By.id("cf_customer")));

		dropcust.selectByVisibleText("All");

		driver.findElement(By.id("comment")).sendKeys(desc);


		driver.findElement(By.id("short_desc")).sendKeys(summary);

		driver.findElement(By.id("cf_agents")).sendKeys(agentname);


		//	driver.findElement(By.xpath("//*[@id='commit']")).click();
		System.out.println("New Internal bug is created");

	}

}




