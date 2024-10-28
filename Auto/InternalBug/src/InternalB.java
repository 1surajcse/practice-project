import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.net.ssl.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * Fix for Exception in thread "main" javax.net.ssl.SSLHandshakeException:
 * sun.security.validator.ValidatorException: PKIX path building failed:
 * sun.security.provider.certpath.SunCertPathBuilderException: unable to find
 * valid certification path to requested target
 */
public class InternalB {
	public static void main(String[] args) throws Exception {
		/* Start of Fix */
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
			public void checkClientTrusted(X509Certificate[] certs, String authType) { }
			public void checkServerTrusted(X509Certificate[] certs, String authType) { }

		} };

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

		// Create all-trusting host name verifier
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session)
			{ 
				return true; 
			}
		};
		// Install the all-trusting host verifier
		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
		/* End of the fix*/

		System.setProperty("webdriver.chrome.driver", "D:/Auto/InternalBugAutomation/Register/chromedriver.exe");
		
		

	/*
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ()  ;     
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				WebDriver driver = new ChromeDriver (handlSSLErr);*/
	

		/*String baseUrl="https://leplb0470.portal.hewitt.com/web/abbvie/login?forkPage=false";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		driver = new ChromeDriver(capabilities);*/
		
		WebDriver driver=new ChromeDriver();

		try
		{
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://leplb0470.portal.hewitt.com/web/abbvie/login?forkPage=false");
		
		Thread.sleep(3000);
		String redirect=driver.getCurrentUrl();
		System.out.println("after redirect::"+redirect);
		}
		catch(Exception e)
		{
			
			System.out.println("inside catch");
			
		}
		URL url = new URL("http://resources.hewitt.com/abbvie");
		HttpURLConnection con1 = (HttpURLConnection)(url).openConnection();
		con1.setInstanceFollowRedirects( false);
		con1.connect();
		System.out.println("url::"+   con1.getURL());
		Reader reader = new InputStreamReader(con1.getInputStream());
		while (true) {
			int ch = reader.read();
			if (ch == -1) 
				break;
			System.out.print((char) ch);
		}
	}
}



























