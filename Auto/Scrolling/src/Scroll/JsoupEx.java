package Scroll;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Example program to list links from a URL.
 */
public class JsoupEx {
	public static void main(String[] args) throws IOException {

		String URLName="";
		String loginD="Login URL";
		String baseD="Base URL";
		String contactD="Contact URL";
		String registerD="Registered URL";
		String Url="";
		String favname="Favicon URL";
		String forgetD="Forget Password URL";
		String favURl="";
		String displayName="Display Name";
		String displayD="Display Name";
		String logoUrl="";
		String logoD="Logo URL";
		String keywords="";
		String keywordsD="Keywords";
		String orgnameD="Orgnaization Name";
		String orgName="";
		String baseUrl = "https://www.wellsfargo.com/";
		print("Fetching %s...", baseUrl);

		Document doc = Jsoup.connect(baseUrl).get();
		Element orgname=doc.select("p:contains(2017)").get(0);
		orgName=orgname.text();
		
		orgName=orgName.substring(orgName.indexOf("�")+1,orgName.length());
		
		if(orgName.toLowerCase().contains("all rights reserved"))
		{
		orgName=orgName.substring(0,orgName.toLowerCase().lastIndexOf("all rights reserved"));
		}
		System.out.println(" checking::"+orgname.text());


		displayName=doc.title();

		String key[]=displayName.split(",");
		for(int i=0;i<key.length;i++)
		{
			keywords=keywords+key[i]+",";

		}
		if(key.length<1)
		{


			String key11[]=keywords.split("\\s+");

			keywords=keywords+key11[0]+key11[1];

		}
		else
		{
			keywords=keywords.substring(0, keywords.length()-1);
		}

		Elements links = doc.select("a[href]");
		Elements meta = doc.select("meta[content]");
		Elements media = doc.select("[src]");
		Elements imports = doc.select("link[href]");
	
			HashMap<String, String>map=new HashMap<>();
		HashMap<String, String>map1=new HashMap<>();
		print("\nMedia: (%d)", media.size());
		for (Element src : media) {
			if (src.tagName().equals("img"))
				print(" * %s: <%s> %sx%s (%s)",
						src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
						trim(src.attr("alt"), 20));
			else
				print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
			
			if(src.attr("abs:src").toLowerCase().contains("logo"))
			{
				logoUrl=src.attr("abs:src");
			}
		}

		print("\nImports: (%d)", imports.size());
		for (Element link : imports) {
			print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));

			if(link.attr("abs:href").toLowerCase().contains("favicon")&&link.attr("abs:href").toLowerCase().contains(".ico"))
			{
				favname="Favicon URL";
				favURl=link.attr("abs:href");
			}
		}
		for (Element meta1 : meta) {
			print( meta1.tagName(),meta1.attr("content"),meta1.attr("name"));

			if(meta1.attr("content").toLowerCase().contains("logo"))
			{

				logoUrl=meta1.attr("content");
			}
		}

		print("\nLinks: (%d)", links.size());
		for (Element link : links) {
			print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));

			URLName=link.text();
			Url=link.attr("abs:href");
			
				if(URLName.toLowerCase().contains("contact") &&Url.toLowerCase().contains("contact"))
				{
					map.put(contactD, Url);
					
				}

				if(Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("login")||URLName.toLowerCase().contains("sign in")||URLName.toLowerCase().contains("log in"))
				{
					map.put(loginD, Url);
					map1.put(URLName, Url);
				}

				if(URLName.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forgot")||URLName.toLowerCase().contains("forgot"))
				{
					System.out.println("inside iff::::");
					map.put(forgetD, Url);
					
				}

				if(URLName.toLowerCase().contains("sign up")||URLName.toLowerCase().equals("register")||URLName.toLowerCase().contains("registeration")||Url.toLowerCase().contains("register"))
				{
					map.put(registerD, Url);
					map1.put(URLName, Url);
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
			map.put("Favicon URL", "Analyst intervention is required");
		}
		map.put(baseD, baseUrl);
		map.put(displayD, displayName);
		map.put(keywordsD, keywords);
		map.put(orgnameD, orgName);
		if(!logoUrl.isEmpty())
		{
			map.put(logoD, logoUrl);
			
		}
		else
		{
			map.put(logoD, "Analyst intervention is required");
		}
		
		System.out.println("Forget details"+map.get(forgetD));
		System.out.println("Forget details"+map.get(loginD));
		if(map.get(forgetD)==""||map.get(forgetD)==null)
		{
			System.out.println("inside"+map.get(forgetD));
		
		Document doc1 = Jsoup.connect(map.get(loginD)).get();
		Elements link1 = doc1.select("a[href]");
		
		
		for (Element link : link1) {
			print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));

			URLName=link.text();
			Url=link.attr("abs:href");
			if(!Url.equals(""))
			{
				if(URLName.toLowerCase().contains("contact") &&Url.toLowerCase().contains("contact"))
				{
					map.put(contactD, Url);
					
				}

				if(Url.toLowerCase().contains("login")||URLName.toLowerCase().contains("login")||URLName.toLowerCase().contains("sign in")||URLName.toLowerCase().contains("log in"))
				{
					map.put(loginD, Url);
					map1.put(URLName, Url);
				}

				if(URLName.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forget password")||Url.toLowerCase().contains("forgot")||URLName.toLowerCase().contains("forgot"))
				{
					map.put(forgetD, Url);
					
				}
			}
		}
		}
		
	
	Iterator it = map.entrySet().iterator();
	System.out.println("\n\n*******--------------QA Analysis-------------*******");
	while (it.hasNext()) {
		Map.Entry pair = (Map.Entry)it.next();
		System.out.println(pair.getKey() + " = " + pair.getValue());
		it.remove(); // avoids a ConcurrentModificationException
	}

	
/*	
	Iterator it1 = map1.entrySet().iterator();
	System.out.println("\n\n--------------Its seems This site support more login and base url please check-------------\n\n");
	while (it1.hasNext()) {
		Map.Entry pair = (Map.Entry)it1.next();
		System.out.println(pair.getKey() + " = " + pair.getValue());
		it1.remove(); // avoids a ConcurrentModificationException
	
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
}