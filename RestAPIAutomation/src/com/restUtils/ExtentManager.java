package com.restUtils;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Reporter;

import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ResourceCDN;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.restAssuredSessions.DriverSession;


public class ExtentManager {
	
	// Global Variable Declaration
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extent;
	private static InetAddress ip;
	
	public static ExtentReports getInstance() {
		if (extent == null)
			extent = createInstance();
		
		return extent;
	}
	
	public static ExtentReports createInstance() {
		String timeStamp = "";
		String repoName = "";
		try {
			timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss a").format(new Date());
			repoName = "Report" + GlobalParam.slash + "Test-Report-" + timeStamp + ".html";
			
			htmlReporter = new ExtentHtmlReporter(
					GlobalParam.CURRENT_PROJECT_PATH + GlobalParam.slash + "test-output" + GlobalParam.slash + repoName);
			htmlReporter.config().setDocumentTitle(PropertyOperations.getPropertyData("Report", "ReportName"));
			htmlReporter.config().setReportName(PropertyOperations.getPropertyData("Report", "ReportDocumentTitle"));
			htmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
			htmlReporter.config().setEncoding("UTF-8");
			htmlReporter.config().setTheme(Theme.STANDARD);
			htmlReporter.config().setTheme(Theme.DARK);
			htmlReporter.config().setTimeStampFormat("MM/dd/yyyy hh:mm:ss a");
			
			ip = InetAddress.getLocalHost();
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			
			extent.setSystemInfo("User Name", System.getProperty("user.name"));
			extent.setSystemInfo("Env", PropertyOperations.getPropertyData("Report", "Environment"));
			
			extent.setSystemInfo("OS Name", System.getProperty("os.name").toUpperCase());
			extent.setSystemInfo("OS Version", System.getProperty("os.version").toUpperCase());
			extent.setSystemInfo("OS Architecture", System.getProperty("os.arch").toUpperCase());
			extent.setSystemInfo("Host Name", ip.getHostName());
			extent.setSystemInfo("IP", ip.toString());
			extent.setReportUsesManualConfiguration(true);
			extent.setAnalysisStrategy(AnalysisStrategy.TEST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return extent;
	}
	
	/**
	 * Used to print steps in the report.
	 * @param status
	 * @param message
	 */
	public static void logs(Status status, String message) {
		switch (status) {
		case INFO:
			DriverSession.getExtent().log(Status.INFO, MarkupHelper.createLabel(message, ExtentColor.GREEN));
			break;
		
		case PASS:
			DriverSession.getExtent().log(Status.PASS, MarkupHelper.createLabel(message, ExtentColor.GREEN));
			break;
		
		case FAIL:
			DriverSession.getExtent().log(Status.FAIL, MarkupHelper.createLabel(message, ExtentColor.RED));
			break;
			
		case SKIP:
			DriverSession.getExtent().log(Status.SKIP, MarkupHelper.createLabel(message, ExtentColor.YELLOW));
			break;

		default:
			Reporter.log("Not Found Appropriate operation types...");
		}
	}
	
}
