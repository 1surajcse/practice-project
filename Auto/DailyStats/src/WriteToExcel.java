//package stats;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.*;

public class WriteToExcel {

	/*XSSFWorkbook workbook = new XSSFWorkbook();

	Sheet dataSheet = workbook.createSheet("Data");
	private static final String FILE_PATH = "C:\\Users\\stiwari\\Desktop\\SuccessStats.xlsx";
	private static final String FILE_NAME = "SuccessStats.xlsx";
	private static final WriteToExcel INSTANCE = new WriteToExcel();
	 */	private static final String NEW_LINE = "\n";
	 private static final String HTML_SNNIPET_1 = "<!DOCTYPE html><head><title>";
	 private static final String HTML_SNNIPET_2 = "</title></head><body><table>";
	 private static final String HTML_SNNIPET_3 = "</table></body></html>";
	 private static final String HTML_TR_S = "<tr>";
	 private static final String HTML_TR_E = "</tr>";
	 private static final String HTML_TD_S = "<td>";
	 private static final String HTML_TD_E = "</td>";
	 private static final String TableStyle = "<style>"
			 +"td"
			 +"{border-left:2px solid black;"
			 +"border-top:1px solid black;"
			 + "border-bottom:1px solid black;}"
			 +"table"
			 +"{border-right:1px solid black;"
			 +"border-bottom:1px solid black;}"
			 +"</style>";

	 /*	public static WriteToExcel getInstance() {
		return INSTANCE;
	}*/

	 private WriteToExcel() {
	 }

	 public static void main(String args[])
			 throws Exception {
		 /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String date1 = sdf.format(date);
		WriteToExcel wte = new WriteToExcel();
		wte.setTenDaysValues();
		List<String> coulumnList = new ArrayList<String>();
		coulumnList.add("Date");
		coulumnList.add("Agent Name");
		coulumnList.add("Total");
		coulumnList.add("Sucess");
		coulumnList.add("Agent");
		coulumnList.add("Site");
		coulumnList.add("UAR");
		coulumnList.add("Windows Success%");
		coulumnList.add("Windows Agent error %");
		coulumnList.add("Windows Latency");
		coulumnList.add("JDapSuccess %");
		coulumnList.add("JDapAgent error %");
		coulumnList.add("JDapLatency");
		coulumnList.add("Diff Success %");
		coulumnList.add("Diff Agent error %");
		coulumnList.add("Diff Latency");
		wte.writecoulumnListToExcel(coulumnList);
		List<Data> DataList = new ArrayList<Data>();
		QueryFeed ob1 = new QueryFeed();

		for (int i = 0; i < ob1.getSizeOfFile(); i++) {

			QueryFeed ob = new QueryFeed();
			ob.setSumInfo(ob.sumInfo, i);
			AgentNamePrgm anp = new AgentNamePrgm(ob.getSumInfo());
			ob.sqlConnect(ob);
			ob.sqlExecute();
			anp.jdbcSetup();
			anp.classNameQuery();
			try {
				DataList.add(new Data(date1, anp.getClassName(), ob.getAvgLatency().get(0), ob.getTotalReq().get(0),
						ob.getSuccess().get(0), ob.getAgentErrors().get(0), ob.getSiteErrors().get(0),
						ob.getUarErrors().get(0), ob.getSuccess_per().get(0), ob.getAgent_err_per().get(0)));

			} catch (IndexOutOfBoundsException aioobe) {
				DataList.add(new Data(date1, anp.getClassName(), 0.00, 0.00, 0.00, 0.00, 0, 0, 0.00, 0.00));
			}
			wte.writeDataListToExcel(DataList);

		}
		wte.closeExcel();
		  *///	sendMail(wte.parse());
		 sendMail();
	 }

	 /*public void writecoulumnListToExcel(List<String> columnList) {		
		int rowIndex = 0;
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle = workbook.createCellStyle();
		Row row = dataSheet.createRow(rowIndex++);
		int cellIndex = 0;
		for (int i = 0; i < columnList.size(); i++) {

			Cell cell = row.createCell(cellIndex++);
			cell.setCellValue(columnList.get(i));
			cellStyle.setFillForegroundColor(HSSFColor.LIGHT_CORNFLOWER_BLUE.index);
	        cellStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
	        cell.setCellStyle(cellStyle);

		}
	}*/

	 /*public void writeDataListToExcel(List<Data> DataList) {
		int rowIndex = 1;
		int i = 0;
		for (Data data : DataList) {
			Row row = dataSheet.createRow(rowIndex++);
			int cellIndex = 0;
			row.createCell(cellIndex++).setCellValue(data.getDate());
			row.createCell(cellIndex++).setCellValue(data.getAgentName());
			row.createCell(cellIndex++).setCellValue(data.getTotalReq());
			row.createCell(cellIndex++).setCellValue(data.getSuccess());
			row.createCell(cellIndex++).setCellValue(data.getAgentErrors());
			row.createCell(cellIndex++).setCellValue(data.getSiteErrors());
			row.createCell(cellIndex++).setCellValue(data.getUarErrors());
			row.createCell(cellIndex++).setCellValue(getSuccess_per().get(i));
			row.createCell(cellIndex++).setCellValue(getAgent_per().get(i));
			row.createCell(cellIndex++).setCellValue(getLatency().get(i));
			row.createCell(cellIndex++).setCellValue(data.getSuccess_percentage());
			row.createCell(cellIndex++).setCellValue(data.getAgent_error_percentage());
			row.createCell(cellIndex++).setCellValue(data.getAvgLatency());
			row.createCell(cellIndex++).setCellValue((data.getSuccess_percentage() - getSuccess_per().get(i)));
			row.createCell(cellIndex++).setCellValue((data.getAgent_error_percentage() - getAgent_per().get(i)));
			row.createCell(cellIndex++).setCellValue(Math.round((data.getAvgLatency() - getLatency().get(i))));			
			i++;
		}
	}
	  */
	 /*public void closeExcel() {

		try {
			FileOutputStream fos = new FileOutputStream(FILE_PATH);
			workbook.write(fos);
			fos.close();
			System.out.println(FILE_PATH + " is successfully written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}*/

	 public List<Double> getSuccess_per() {
		 return success_per;
	 }

	 public void setSuccess_per(List<Double> success_per) {
		 this.success_per = success_per;
	 }

	 public List<Double> getAgent_per() {
		 return agent_per;
	 }

	 public void setAgent_per(List<Double> agent_per) {
		 this.agent_per = agent_per;
	 }

	 public List<Double> getLatency() {
		 return latency;
	 }

	 public void setLatency(List<Double> latency) {
		 this.latency = latency;
	 }

	 List<Double> success_per = new ArrayList<Double>();
	 List<Double> agent_per = new ArrayList<Double>();
	 List<Double> latency = new ArrayList<Double>();

	 public void setTenDaysValues() {
		 ReadExcelFile ref = new ReadExcelFile();
		 ref.readFile();
		 success_per.addAll(ref.success_per);
		 agent_per.addAll(ref.agent_per);
		 latency.addAll(ref.latency);
	 }
	 private static void sendMail() throws Exception {
		 Properties props = new Properties();
		 System.out.println("sending mail ________________________________________________");
		 props.put("mail.smtp.host","192.168.211.175");
		 //192.168.234.200
		 Session session = Session.getInstance(props, null);
		 String from = "New-YCC@yodlee.com";
		// String from = "stiwari@yodlee.com";

		 Vector<String> aliasHolder = new Vector<String>();
		 aliasHolder.add("sdustakar@yodlee.com");
		 aliasHolder.add("IAE-YCC@yodlee.com");
		// aliasHolder.add("New-YCC@yodlee.com");
		// aliasHolder.add("stiwari@yodlee.com");
		 
		 Vector<String> aliasHolderCC = new Vector<String>();
		 // aliasHolderCC.add("stiwari@yodlee.com");
		 // aliasHolderCC.add("@yodlee.com");
		 aliasHolderCC.add("New-YCC@yodlee.com");
		 // aliasHolderCC.add("nsrautomationuser@yodlee.com");
		 // aliasHolderCC.add("");


		 InternetAddress fromAddress = null;
		 MimeMessage msg = new MimeMessage(session);
		 for (int i = 0; i < aliasHolder.size(); i++) {
			 System.out.println("2^^^^^^^aliasHolder:"+aliasHolder.elementAt(i));
			 String add = aliasHolder.get(i);
			 InternetAddress to = new InternetAddress(add);
			 msg.addRecipient(Message.RecipientType.TO, to);
		 }
		 for (int i = 0; i < aliasHolderCC.size(); i++) {
			 System.out.println("2^^^^^^^aliasHolderCC:"+aliasHolderCC.elementAt(i));
			 String add = aliasHolderCC.get(i);
			 InternetAddress cc = new InternetAddress(add);
			 msg.addRecipient(Message.RecipientType.CC, cc);
		 }
		 msg.addRecipient(Message.RecipientType.BCC, new InternetAddress("stiwari@yodlee.com"));

		 try {
			 msg.setFrom();
			 fromAddress = new InternetAddress(from);
			 msg.setFrom(fromAddress);
			 msg.setSubject("Santa Task Reminder!! ");
			 //msg.setSubject("JDAP 24HRS stats::"+ sdf.format(date));
			 // msg.addRecipient(Message.RecipientType.CC, to);
			 msg.setSentDate(new Date());
			 // msg.setText("Attachment");                                               
			 MimeBodyPart messageBodyPart = new MimeBodyPart();
			 MimeBodyPart attachmentBodyPart = new MimeBodyPart();



			 String bodytext="";
			 bodytext = bodytext + "Hi Sathish!!,";
			 bodytext = bodytext + "<br><br>";
			 bodytext = bodytext + "This is reminder of your task.Time is 4 PM:-";
			 bodytext = bodytext + "<br><br>";
			 bodytext = bodytext + "<b>1.You have ask 5 people in your team-I am the king of this jungle So dont mess with me.";
			 //     bodytext=bodytext+"<td style=\"background-color:red\">";
			 bodytext = bodytext + "<br><br>";
			 bodytext = bodytext + "<b>2.You  have to stand in your desk and move like shaktimaan -'on title track of Shaktimaan' for 5 min.";

			 bodytext = bodytext + "<br><br>";

			 bodytext = bodytext + "<b>3.You  have to say 10 people who will pass from YCC bay- Happy New year to you and your Family in advance";
			 bodytext = bodytext + "<br><br>";
			 bodytext = bodytext + "<br><br>";
			 
			 bodytext = bodytext + "Please revert  when you are ready.Make Sure Every one is present.!!!";

			 /*  for(String bodyText : str)
               {
            	   bodytext=bodytext+bodyText;
               }*/
			 bodytext = bodytext + "<br>";
			 bodytext = bodytext + "<br><br>";
			 bodytext = bodytext + "Regards,<br>";
			 bodytext = bodytext + "YCC Team";

			 messageBodyPart.setContent(bodytext,"text/html");

			 /*     // Part two is attachment
               DataSource source = new FileDataSource(FILE_PATH);
               attachmentBodyPart.setDataHandler(new DataHandler(source));                                               
               attachmentBodyPart.setFileName(FILE_NAME); */                                              






			 // Put parts in message
			 Multipart multipart = new MimeMultipart();
			 multipart.addBodyPart(messageBodyPart);                                                
			 // multipart.addBodyPart(attachmentBodyPart);
			 msg.setContent(multipart);
			 /* ******************************************************************** */
			 Transport.send(msg);

			 //    System.out.println("2^^^^^^^fileName "+FILE_NAME);
		 } catch (MessagingException mex) {
			 System.out.println("2^^^^^^^^^^^^^^^^^^^send failed, exception: "+ mex);
		 }
	 }

	 /*private ArrayList<String> parse() throws FileNotFoundException, IOException {
		ArrayList<String> bodyText = new ArrayList<String>();
		bodyText.add(HTML_SNNIPET_1);
		bodyText.add(HTML_SNNIPET_2);
		bodyText.add(TableStyle);
		Iterator<Row> rows = dataSheet.rowIterator();
		Iterator<Cell> cells = null;
		int colNo = 0;
		while (rows.hasNext()) {
			Row row = rows.next();
			cells = row.cellIterator();
			bodyText.add(NEW_LINE);
			bodyText.add(HTML_TR_S);
			while (cells.hasNext()) {

				Cell cell = cells.next();
				String str = cell.toString();
				System.out.println("col no=" + colNo);
				if (str.contains(".")) {
					if (str.length() == 3 && str.charAt(str.indexOf(".") + 1) == '0') {
						System.out.println("here");
						System.out.println(str.substring(0, str.indexOf(".")));
						if(colNo!=16 && colNo%16==0 )
						{
							System.out.println("inside color");
							if (!str.contains("-") && !str.equals("0.0")) {
								bodyText.add("<td style=\"background-color:red\">");
								bodyText.add(str);
							}
							else
							{
								bodyText.add("<td style=\"background-color:green\">");
								bodyText.add(str);
							}
						}
						else{
						bodyText.add(HTML_TD_S);
						bodyText.add(str.substring(0, str.indexOf(".")));
						}


					}


						else {
						bodyText.add(HTML_TD_S);
						bodyText.add(str.substring(0, str.indexOf(".") + 2));
					}
				} 
				else {
					bodyText.add(HTML_TD_S);
					bodyText.add(cell.toString());
					System.out.println(cell.toString());
				}
				colNo++;
				bodyText.add(HTML_TD_E);
			}
			bodyText.add(HTML_TR_E);
		}
		bodyText.add(NEW_LINE);
		bodyText.add(HTML_SNNIPET_3);
		return bodyText;
	}*/




}

