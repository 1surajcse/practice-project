import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Tester {
public static void main(String[] args) throws IOException {

		
			String url = "httpwww.access-online.com.au/sepas/serve?TAM_OP=login&USERNAME=unauthenticated&ERROR_CODE=0x00000000&URL=%2Fhomeloans-online%2F&HOSTNAME=www.access-online.com.au&PROTOCOL=https ";
	
			
		
			System.out.println("Final Redirected::--"+checkHttps(url));
}

			/*URL obj = new URL(url);
			
			URLConnection urlConnection = null;
			try {
				urlConnection = obj.openConnection();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            String redirect1 = urlConnection.getHeaderField("Location");
            for (int i = 0; i < 8 ; i++) {
                if (redirect1 != null) {
                    urlConnection = new URL(redirect1).openConnection();
                    redirect1 = urlConnection.getHeaderField("Location");
                } else {
                    break;
                }
            }
	System.out.println("redirect::"+redirect1);
			HttpURLConnection conn = (HttpURLConnection) obj.openConnection();
			conn.setInstanceFollowRedirects( false);
			conn.setReadTimeout(5000);
			conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
			conn.addRequestProperty("User-Agent", "Mozilla");
			conn.addRequestProperty("Referer", "google.com");

			System.out.println("Request URL ... " + getFinalURL(obj));

			System.out.println("Redirect URL ... " + conn.getHeaderField("Location"));

			boolean redirect = false;

			// normally, 3xx is redirect
			int status = conn.getResponseCode();
			if (status ==HttpURLConnection.HTTP_OK) {
				if (status == HttpURLConnection.HTTP_MOVED_TEMP
						|| status == HttpURLConnection.HTTP_MOVED_PERM
						|| status == HttpURLConnection.HTTP_SEE_OTHER)
					redirect = true;
			}

			System.out.println("Response Code ... " + status);

			if (redirect) {

				// get redirect url from "location" header field
				String newUrl = conn.getHeaderField("Location");

				// get the cookie if need, for login
				String cookies = conn.getHeaderField("Set-Cookie");

				// open the new connnection again
				conn = (HttpURLConnection) new URL(newUrl).openConnection();
				conn.setRequestProperty("Cookie", cookies);
				conn.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
				conn.addRequestProperty("User-Agent", "Mozilla");
				conn.addRequestProperty("Referer", "google.com");

				System.out.println("Redirect to URL : " + newUrl);

			}
			//System.out.println("URL Content... \n" + html.toString());
			System.out.println("Done");

		} 
*/
	
	


public static URL getFinalURL(URL url) {
    try {
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setInstanceFollowRedirects(false);
        con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36");
        con.addRequestProperty("Accept-Language", "en-US,en;q=0.8");
        con.addRequestProperty("Referer", "https://www.google.com/");
        con.connect();
        //con.getInputStream();
        int resCode = con.getResponseCode();
        System.out.println("Response code::"+resCode);
        if (resCode == HttpURLConnection.HTTP_SEE_OTHER||resCode==HttpURLConnection.HTTP_OK
                || resCode == HttpURLConnection.HTTP_MOVED_PERM
                || resCode == HttpURLConnection.HTTP_MOVED_TEMP) {
            String Location = con.getHeaderField("Location");
            System.out.println("location::"+Location);
            if (Location.startsWith("/")) {
                Location = url.getProtocol() + "://" + url.getHost() + Location;
            }
            return getFinalURL(new URL(Location));
        }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    return url;
}



public static String getRedirectdURL(String urlString) throws MalformedURLException {
	
	if(!urlString.equals("")&&urlString!=null)
	{
	URL url=new URL(urlString);
	url=getFinalURL(url);
	
	urlString=url.toString();
	return urlString;
	}
	else
	{
 return null;
	}
}
public static boolean checkHttps(String url)
{ 
	url=url.trim();
	if(url.toLowerCase().startsWith("www"))
	{
		return false;
	}
	else
	{
		return true;
	}
}
}