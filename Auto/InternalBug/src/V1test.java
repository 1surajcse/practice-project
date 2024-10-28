import com.versionone.apiclient.exceptions.V1Exception;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

public class V1test {

	private static String username = "dbhattacharjee";
	private static String password = "version@123";

	public static void main(String[] args) throws IOException, V1Exception {
		System.out.println("started !!!");
		 String backlogID="B-14436";// B-12618  B-12573 B-13946
		//String backlogID="B-10120";
		String finalAnalystString="";
		String requestId="R-04757";  // R-05114 R-05101 R-04757
		String memberName="Member:198439";
		String backLogQuery="B-14436";
		/*String backLogQuery= "{'from':'Story','select':['Custom_AgentName','Custom_BaseClassName','Custom_SiteID2','Custom_DisplayName2','Custom_OrganizationName','Custom_Keywords','Custom_BaseURL2','Custom_LoginURL','Custom_ForgetPasswordURL','Custom_RegistrationURL','Custom_ContactURL','Custom_LogoURL','Custom_FavIconURL','Custom_ContainerType3.Name','Custom_Loginfailuremessage','Custom_Loginmetafields2','Custom_Sitesearchattribute2','Requests.Number','Custom_Locale3.Name'],"
				+ "'where':{'Number':'"+backlogID+"'}}";*/
		backLogQuery= "{'from':'Story','select':['MentionedInExpressions'],"
				+ "'where':{'Number':'"+backlogID+"'}}";
		String requestQuery= "{'from':'Request','select':['Custom_LoginURLURLOnly','Custom_BaseHomeURLURLOnly','Custom_DisplayName','Custom_Locale.Name','Custom_ContainerType2.Name','Status'],"
			+ "'where':{'Number':'"+requestId+"'}}";
		
		/*String requestQuery= "{'from':'Request','select':['MentionedInExpressions'],"
				+ "'where':{'Number':'"+requestId+"'}}";*/
		/*String backLogQuery= "{'from':'Story','select':['Custom_AgentName','Custom_BaseClassName','Custom_BaseURL2','Custom_LoginURL','Status'],"
				+ "'where':{'Number':'"+backlogID+"'}}";*/
		String memberdetails="{ 'from': 'Member','select':['Email'],"
				+ "'where':{'ID':'"+memberName+"'}}";
		String getExpressions=verifyBasicRestConnection(backLogQuery);
		System.out.println(">>"+getExpressions);
		System.out.println("hereeee");
		String finalString= V1test.processFinalString_New(getExpressions);
	//	System.out.println(finalString);
		
		/*String getExpressions=HTTPRequest.verifyBasicRestConnection(backLogQuery);
		System.out.println(">>"+getExpressions);
		ArrayList<String> expressions=new ArrayList<String>();
		expressions=HTTPRequest.processExpressions(getExpressions,expressions);
		System.out.println("list>>>"+expressions);
		// expressionQuery="";
		for (int i = 0; i < expressions.size(); i++) {
			System.out.println("8888888888in for loop----");
			String expressionQuery=HTTPRequest.buildQueryforExpressions(expressions.get(i));
			getExpressions=HTTPRequest.verifyBasicRestConnection(expressionQuery);
			System.out.println("result--------------"+getExpressions);
			if (getExpressions.contains("register url:")&&getExpressions.contains("org name :")&&getExpressions.contains("forgot password url: ")) {
				System.out.println("found expected expression------------");
				finalAnalystString=getExpressions;
				break;
			}
		}
		System.out.println("hereeee");
		// String finalString= HTTPRequest.processFinalString_New(getExpressions);
		System.out.println("final:::"+finalAnalystString);
		//finalAnalystString=finalAnalystString.substring(finalAnalystString.indexOf("Content\": \"")+11, finalAnalystString.indexOf("}"));
		System.out.println("final222:::"+finalAnalystString.toString());
		
		 String finalString= HTTPRequest.processFinalString(finalAnalystString.toString());
		//expressions= getExpression(getExpressions,expressions);
		System.out.println(finalString);*/
	}




	private static String processFinalString_New(String getExpressions) {
		// TODO Auto-generated method stub
		String agentName="",baseClassName="",displayName="",organizationName="",keywords="",baseURL="",
				loginURL="",forgetPasswordURL="",registrationURL="",contactURL="",logoURL="",favIconURL="",
				containerType="",loginFailMsg="",metaFields="",siteSearchAttr="",locale="",siteID="",requestID="";
		String [] separated = getExpressions.split("\\n");
		String finalAnalystString=null;
		for (int i = 0; i <separated.length; i++) {
			System.out.println("tokens:: "+separated[i]);
			String tempString=separated[i];
			System.out.println("temp---"+tempString);
			if(tempString.contains("Custom_AgentName") && tempString.contains(":")&& !tempString.contains("null")){
				agentName=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("agentName"+agentName);
			}
			else if(tempString.contains("Custom_BaseClassName") && tempString.contains(":")&& !tempString.contains("null")){
				baseClassName=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("baseClassName"+baseClassName);
			}
			else if(tempString.contains("Custom_SiteID2") && tempString.contains(":")&& !tempString.contains("null")){
				siteID=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("Custom_SiteID2"+siteID);
			}
			else if(tempString.contains("Custom_DisplayName2") && tempString.contains(":")&& !tempString.contains("null")){
				displayName=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("displayName"+displayName);
			}
			else if(tempString.contains("Custom_OrganizationName") && tempString.contains(":")&& !tempString.contains("null")){
				organizationName=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("organizationName"+organizationName);
			}
			else if(tempString.contains("Custom_Keywords") && tempString.contains(":")&& !tempString.contains("null")){
				keywords=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("keywords"+keywords);
			}
			else if(tempString.contains("Custom_BaseURL2") && tempString.contains(":")&& !tempString.contains("null")){
				baseURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("baseURL"+baseURL);
			}
			else if(tempString.contains("Custom_LoginURL") && tempString.contains(":")&& !tempString.contains("null")){
				loginURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("loginURL"+loginURL);
			}
			/*if(tempString.contains("Status.Name") && tempString.contains(":") && !tempString.contains("null")){
				locale=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("locale"+locale);
			}*/
			else if(tempString.contains("Custom_ForgetPasswordURL") && tempString.contains(":")&& !tempString.contains("null")){
				forgetPasswordURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("forgetPasswordURL"+forgetPasswordURL);
			}
			else if(tempString.contains("Custom_RegistrationURL") && tempString.contains(":")&& !tempString.contains("null")){
				registrationURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("registrationURL"+registrationURL);
			}
			else if(tempString.contains("Custom_ContactURL") && tempString.contains(":")&& !tempString.contains("null")){
				contactURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("contactURL"+contactURL);
			}
			else if(tempString.contains("Custom_LogoURL") && tempString.contains(":")&& !tempString.contains("null")){
				logoURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("logoURL"+logoURL);
			}
			else if(tempString.contains("Custom_FavIconURL") && tempString.contains(":")&& !tempString.contains("null")){
				favIconURL=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("favIconURL"+favIconURL);
			}
			else if(tempString.contains("Custom_ContainerType3.Name") && tempString.contains(":")&& !tempString.contains("null")){
				containerType=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("containerType"+containerType);
			}else if(tempString.contains("Custom_Loginfailuremessage") && tempString.contains(":") && !tempString.contains("null")){
				loginFailMsg=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("Loginfailuremessage"+loginFailMsg);
			}
			else if(tempString.contains("Custom_Loginmetafields2") && tempString.contains(":") && !tempString.contains("null")){
				metaFields=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				if(metaFields.contains("<p>")){
					metaFields=metaFields.replaceAll("<p>", "");
					metaFields=metaFields.replaceAll("</p>", "");
				}
				if(metaFields.contains("<span>")){
					metaFields=metaFields.replaceAll("<span>", "");
					metaFields=metaFields.replaceAll("</span>", "");
				}
				if(metaFields.contains("\r")){
					System.out.println("inside \r");
					metaFields=metaFields.replaceAll("\r", "");
				}
				if(metaFields.contains("\n")){
					System.out.println("inside \n");
					metaFields=metaFields.replaceAll("\n", "");
				}
				System.out.println("Custom_Loginmetafields2"+metaFields);
			}
			else if(tempString.contains("Custom_Sitesearchattribute2") && tempString.contains(":") && !tempString.contains("null")){
				siteSearchAttr=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				if(siteSearchAttr.contains("<p>")){
					siteSearchAttr=siteSearchAttr.replaceAll("<p>", "");
					siteSearchAttr=siteSearchAttr.replaceAll("</p>", "");
				}
				if(siteSearchAttr.contains("<span>")){
					siteSearchAttr=siteSearchAttr.replaceAll("<span>", "");
					siteSearchAttr=siteSearchAttr.replaceAll("</span>", "");
				}
				System.out.println("Custom_Sitesearchattribute2"+siteSearchAttr);
			}
			/*else if(tempString.contains("Requests.Number") && tempString.contains(":") && !tempString.contains("null")){
				requestID=tempString.substring(tempString.indexOf(":")+3,tempString.indexOf("]")).trim();
				System.out.println("request id::"+requestID);
			}*/
			else if(tempString.contains("Custom_Locale3.Name") && tempString.contains(":") && !tempString.contains("null")){
				locale=tempString.substring(tempString.indexOf(":")+3,tempString.length()-3).trim();
				System.out.println("locale"+locale);
			}
			else if(tempString.contains("\"")) {
				System.out.println("hereeeeeeeeeeeee-------"+tempString.trim());
				tempString = tempString.trim();
				requestID = tempString.substring(1,tempString.length()-1);
				System.out.println("request id::"+requestID);
			}
			
		}
		// base url , login, display name, container, locale , class name, base class, org, forget, reg, contact, 
		// logo, favicon, site id, loginfailure, login meta fields, site search
		
		
		/*System.out.println("base url--"+baseURL);
		System.out.println("login url--"+loginURL);
		System.out.println("display name--"+displayName);
		System.out.println("container--"+containerType);
		System.out.println("locale--"+locale);
		System.out.println("class name--"+agentName);
		System.out.println("base class--"+baseClassName);
		System.out.println("org--"+organizationName);
		System.out.println("forget url--"+forgetPasswordURL);
		System.out.println("reg url--"+registrationURL);
		System.out.println("contact url--"+contactURL);
		System.out.println("logo url--"+logoURL);
		System.out.println("favicon url--"+favIconURL);
		System.out.println("site id--"+siteID);
		System.out.println("keywords--"+keywords);
		System.out.println("loginfailure url--"+loginFailMsg);
		System.out.println("login meta fields--"+metaFields);
		System.out.println("site search--"+siteSearchAttr);*/
		
		finalAnalystString=baseURL+"||"+loginURL+"||"+displayName+"||"+containerType+"||"+locale+"||"+agentName+"||"+baseClassName
				+"||"+organizationName+"||"+forgetPasswordURL+"||"+registrationURL+"||"+contactURL+"||"+logoURL
				+"||"+favIconURL+"||"+siteID+"||"+keywords+"||"+loginFailMsg+"||"+metaFields+"||"+requestID;
		
		System.out.println(finalAnalystString);
		return finalAnalystString;
	}




	private static String processFinalString(String finalAnalystString) {
		// TODO Auto-generated method stub

		String baseURL="",loginURL="",className="",displayName="",orgName="",favURL="",logoURL="",contactURL="",regURL="",forgetURL="",locale="",container="", 
				siteID="",baseClass="",keywords="";
		// displayName= finalAnalystString.substring(finalAnalystString.indexOf("display name:"),finalAnalystString.indexOf("\n") );
		//displayName= finalAnalystString.substring(finalAnalystString.indexOf("Custom_DisplayName2:")+20,finalAnalystString.indexOf("\n") );
		System.out.println("split::"+displayName);
		//finalAnalystString=finalAnalystString.replaceAll("", "  ");
		finalAnalystString=finalAnalystString.replace('\\', '&');
		finalAnalystString=finalAnalystString.replaceAll("&n", "  ");
		System.out.println(finalAnalystString);
		String [] separated = finalAnalystString.split("\\n");
		if (finalAnalystString.contains("&r")) {
			System.out.println("inhereeeeeeee");
		}
		//String words[]=finalAnalystString.split("\\ r \\ n|\\ n|\\ r");
		for (int i = 0; i <separated.length; i++) {
			System.out.println("tokens:: "+separated[i].replace("  ", ""));
			String tempString=separated[i].replace("  ", "");
			
			if (tempString.contains("display name:")) {
				displayName=tempString.replace("display name:", "").trim();
				System.out.println("hererere");
			}else if(tempString.contains("org name :")){
				orgName=tempString.replace("org name :", "").trim();
			}
			else if(tempString.contains("agent name :")){
				className=tempString.replace("agent name :", "").trim();
			}
			else if(tempString.contains("base class name :")){
				baseClass=tempString.replace("base class name :", "").trim();
			}
			else if(tempString.contains("Locale:")){
				locale=tempString.replace("Locale:", "").trim();
			}
			else if(tempString.contains("Container:")){
				container=tempString.replace("Container:", "").trim();
			}
			else if(tempString.contains("base url:")){
				baseURL=tempString.replace("base url:", "").trim();
			}
			else if(tempString.contains("login url:")){
				loginURL=tempString.replace("login url:", "").trim();
			}
			else if(tempString.contains("forgot password url:")){
				forgetURL=tempString.replace("forgot password url:", "").trim();
			}
			else if(tempString.contains("register url:")){
				regURL=tempString.replace("register url:", "").trim();
			}
			else if(tempString.contains("contact url:")){
				contactURL=tempString.replace("contact url:", "").trim();
			}
			else if(tempString.contains("logo url:")){
				logoURL=tempString.replace("logo url:", "").trim();
			}
			else if(tempString.contains("favicon url:")){
				favURL=tempString.replace("favicon url:", "").trim();
			}
			else if(tempString.contains("site id:")){
				siteID=tempString.replace("site id:", "").trim();
			}
			else if(tempString.contains("base class name")){
				baseClass=tempString.replace("base class name :", "").trim();
				System.out.println("in here"+baseClass);
			}
			else if(tempString.contains("keywords:")){
				keywords=tempString.replace("keywords:", "").trim();
			}
		}
		
		finalAnalystString=loginURL+"||"+baseURL+"||"+displayName+"||"+container+"||"+locale+"||"+className+"||"+baseClass+"||"+orgName+"||"
				+forgetURL+"||"+regURL+"||"+contactURL+"||"+logoURL+"||"+favURL+"||"+siteID+"||"+keywords;//+base
		
		System.out.println(finalAnalystString);
		return finalAnalystString;
	}




	private static String buildQueryforExpressions(String expressionD) {
		// TODO Auto-generated method stub

		String jsonQuery = "{'from':'Expression','select':['Content'],'where':{'ID':'"+expressionD+"'}}";
		return jsonQuery;
	}


	private static ArrayList<String> processExpressions(String getExpressions, ArrayList<String> expressions) {
		// TODO Auto-generated method stub

		String tempString="";
		String getExpression=getExpressions;
		while(getExpression.contains("Expression:")){
			System.out.println("2nd>>"+getExpression);
			tempString=getExpression.substring(getExpression.indexOf("Expression:"),getExpression.indexOf("Expression:")+21);
			if (tempString.contains("\"")) {
				tempString=tempString.replace("\"", "").trim();
			}
			expressions.add(tempString);
			//	System.out.println("<<<<<<<%%%%%%%%%%>>>>>>>>>"+tempString);
			getExpression=getExpression.replace(tempString, "");

			//	System.out.println(getExpression);
			//processExpressions(getExpression,expressions);

		}

		return expressions;
	}




	private static String jsonQuery1 = "https://www3.v1host.com/YodleeInc/query.legacy.v1";

	public static String verifyBasicRestConnection(String query) throws IOException, V1Exception {CloseableHttpClient  httpclient = HttpClients.createDefault();
	HttpPost httpPost = new HttpPost(jsonQuery1);
	CloseableHttpResponse httpResponse = null;

	//	String jsonQuery = "{'from':'Expression','select':['Content'],'where':{'ID':'Expression:717272'}}";
	String responseBody="";
	try {
		String authString = username + ":" + password;
		byte[] authEncodedBytes = Base64.encodeBase64(authString.getBytes());
		String authEncodedString = new String(authEncodedBytes);

		httpPost.setHeader("Authorization", "Basic " + authEncodedString);
		httpPost.setHeader("User-Agent", "com.YodleeInc.myapp/1.0");
		StringEntity jsonEntity = new StringEntity(query);
		httpPost.setEntity(jsonEntity);
		httpResponse = httpclient.execute(httpPost);
		HttpEntity entity = httpResponse.getEntity();
		responseBody = EntityUtils.toString(entity, "UTF-8");

		/*System.out.println(httpResponse.getStatusLine());
		System.out.println(responseBody);
		 */
		checkResponseStatus(httpResponse, responseBody);

	} catch (ClientProtocolException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		httpResponse.close();
	}
	return responseBody;
	}

	private static void checkResponseStatus(HttpResponse httpResponse, String responseBody) throws V1Exception {

		int errorCode = httpResponse.getStatusLine().getStatusCode();
		String errorMessage = "\n" + httpResponse.getStatusLine() + "\n" + responseBody;

		switch (errorCode) {
		case HttpStatus.SC_OK:
			break;
		case HttpStatus.SC_BAD_REQUEST:
			throw new V1Exception(errorMessage + " VersionOne could not process the request.");
		case HttpStatus.SC_UNAUTHORIZED:
			throw new V1Exception(errorMessage + " Could not authenticate. The VersionOne credentials may be incorrect or the access tokens may have expired.");
		case HttpStatus.SC_NOT_FOUND:
			throw new V1Exception(errorMessage + " The requested item may not exist, or the VersionOne server is unavailable.");
		case HttpStatus.SC_METHOD_NOT_ALLOWED:
			throw new V1Exception(errorMessage + " Only GET and POST methods are supported by VersionOne.");
		case HttpStatus.SC_INTERNAL_SERVER_ERROR:
			throw new V1Exception(errorMessage + " VersionOne encountered a unexpected error occurred while processing the request.");
		default:
			throw new V1Exception(errorMessage);
		}
	}

}
