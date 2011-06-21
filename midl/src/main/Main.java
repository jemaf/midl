package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import components.Component;
import components.LinearLayout;
import components.TextBox;

public class Main {
	public static void main(String[] args) throws Exception {
		
		testComponents();
		
	}
	
	
	public static void testComponents() throws Exception {
		
		
		TextBox tx = new TextBox("txtTeste");
		LinearLayout ll = new LinearLayout();
		
		ll.addSubComponent(tx);
		
		
		Element e = ll.parse2Android();
		Component.document.appendChild(e);
		
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(Component.document);
		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}
	
	
	public static void testXMLDOM() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number to add elements in your XML file: ");
		String str = bf.readLine();
		int no = Integer.parseInt(str);
		System.out.print("Enter root: ");
		String root = bf.readLine();
		
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.newDocument();
		Element rootElement = document.createElement(root);
		document.appendChild(rootElement);
		
		for (int i = 1; i <= no; i++) {
			
			System.out.print("Enter the element: ");
			String element = bf.readLine();
			System.out.print("Enter the data: ");
			String data = bf.readLine();
			Element em = document.createElement(element);
			em.appendChild(document.createTextNode(data));
			rootElement.appendChild(em);
			
		}
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
	}
}