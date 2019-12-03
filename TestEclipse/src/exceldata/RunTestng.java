package exceldata;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;


public class RunTestng {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/*Create XmlSuite Instance*/
		XmlSuite suite = new XmlSuite();
	    /* Set xmlsuite name, verbose and order*/
		suite.setName("Suite For Ios Testing");
		suite.setVerbose(4);
		
		//suite.setPreserveOrder("true");
		
		/*Create instance of xmltest*/
		XmlTest test = new XmlTest(suite);
		test.setName("Regression Testing");
		
		/* Add class to the xmlclass*/
		List<XmlClass> classes = new ArrayList<XmlClass>();
		for ( int i = 0; i < ExcelOperation.getSheetDataValues().size(); i++){
			List<String> sheet_rows_value = (List<String>) ExcelOperation.getSheetDataValues().get(i);
			
			if (sheet_rows_value.get(1).equalsIgnoreCase("y")){
				//System.out.println(classes.add()));
				classes.add(new XmlClass(sheet_rows_value.get(2)));
			}
			
		}
		
		
//		classes.add(new XmlClass("exceldata.HomeTest1"));
//		classes.add(new XmlClass("exceldata.HomeTest2"));
//		classes.add(new XmlClass("exceldata.HomeTest3"));
//		classes.add(new XmlClass("exceldata.HomeTest4"));
//		classes.add(new XmlClass("exceldata.HomeTest5"));
		
		/*Add classes to the xmltest*/
		test.setXmlClasses(classes);
		
		/*Create a list of XmlTests and add the Xmltest above created.*/
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		myTests.add(test);
		
		List<XmlSuite> suites = new ArrayList<XmlSuite>();
		suites.add(suite);
		
		
		/*Create instance of testNg*/
		TestNG testng = new TestNG();
		testng.setXmlSuites(suites);
		
		/*Run testng*/
		testng.run();
	}
}
