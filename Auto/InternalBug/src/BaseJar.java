import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseJar {


	protected  static void execute(String agentname,String summary,String desc,String username,String password,String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", url);
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.banorte.com/wps/portal/ixe/Home/inicio/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLdjQwtPIydDbz9XQPNDBydgwJdwzzdPCwDDIAKIoEKDHAARwNC-sP1o8BKnN0dPUzMfQwM_E3cjQwcLfy8TIJNLY0MPM2gCvBYUZAbYZDpqKgIAM9eOM0!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/");

		Thread.sleep(5000);
	//	driver.findElement(By.id("userid")).sendKeys("12344");

		//driver.findElement(By.id("password")).sendKeys(password);

	//	driver.findElement(By.xpath("//*[@id='btn_lgn_entrar']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='nonFooter']/table[2]/tbody/tr[2]/td[2]/table[3]/tbody/tr[2]/td/table/tbody/tr[3]/td[2]/b/a")).click();
		Thread.sleep(100);
		System.out.println("after click on bugzilla");
		//driver.findElement(By.xpath("#account")).click();

		driver.get("https://www.insuranceonline.nrma.com.au/oss/en_US/access/ssclogin.html?TAM_OP=login&URL=%2Foss%2FGTConnect%2FUnifiedAcceptor%2FSelfServiceCentre.Main%2FbrandId%2Fnrma");
		Thread.sleep(5000);
	    //driver.switchTo().defaultContent();
		//driver.switchTo().frame("f_main");

		driver.findElement(By.id("username")).sendKeys("Mona");

		driver.findElement(By.id("password")).sendKeys("Lisa");

		driver.findElement(By.id("buttonLogin")).click();
		

		System.out.println("after click on bugzilla login");

		driver.findElement(By.xpath("//*[@id='links-actions']/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//*[@id='bugzilla-body']/table/tbody/tr[24]/th/a")).click();

		driver.findElement(By.xpath("//*[@id='expert_fields_controller']")).click();

		System.out.println("after click on PFM");

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


		//driver.findElement(By.xpath("//*[@id='commit']")).click();
		System.out.println("New Internal bug is created");

	}

}

