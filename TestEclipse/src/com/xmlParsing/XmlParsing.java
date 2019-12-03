package com.xmlParsing;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlParsing {

	/*public static List<String> getDataFromXml() {
		List<String> data = new ArrayList<>();
		File xmlFile = new File(System.getProperty("user.dir") + "/src/com/xmlParsing/Company_Emp_Info.xml");
		System.out.println(xmlFile);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			document.getDocumentElement().normalize();

			// Root Element
			System.out.println("Root Element..." + document.getDocumentElement().getNodeName());

			// Node List
			NodeList nodeList = document.getElementsByTagName("staff");
			System.out.println("----------------------------");

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				System.out.println("\nCurrent Element :" + node.getNodeName());

				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					System.out.println("Staff Id.." + element.getAttribute("id"));
					System.out.println(
							"First Name.." + element.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name" + element.getElementsByTagName("lastname").item(0).getTextContent());
				}
			}
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
	}*/

	public static List<Employee> getXmlData() {
		List<Employee> empList = new ArrayList<>();
		File xmlFile = new File(System.getProperty("user.dir") + "/src/com/xmlParsing/Company_Emp_Info.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document document = builder.parse(xmlFile);
			document.getDocumentElement().normalize();
			System.out.println("Root element :" + document.getDocumentElement().getNodeName());

			// Node List
			NodeList nodeList = document.getElementsByTagName("Employee");
			// now XML is loaded as Document in memory, lets convert it to Object List

			for (int i = 0; i < nodeList.getLength(); i++)
				empList.add(getEmployee(nodeList.item(i)));
			//print Employee Information
			for (Employee employee : empList)
				System.out.println(employee.toString());
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		return empList;
	}

	private static Employee getEmployee(Node node) {
		Employee emp = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			emp.setName(getTagValue("name", element));
			emp.setAge(Integer.parseInt(getTagValue("age", element)));
			emp.setRole(getTagValue("role", element));
			emp.setGender(getTagValue("gender", element));
		}
		return emp;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = nodeList.item(0);
		return node.getNodeValue();
	}
	
	public static void main(String argas[]) {
		List<Employee> info = getXmlData();
		Employee emp = info.get(0);
		System.out.println("List.."+emp.getName());
	}

}
