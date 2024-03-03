//kodlama yarım bırakıldı...
package KodlamaVakti;
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.DocumentBuilder;  
import org.w3c.dom.Document;  
import org.w3c.dom.NodeList;  
import org.w3c.dom.Node;  
import org.w3c.dom.Element;  
import java.io.File;  


public class ReadXmlFileExample {

	public static void run() {
		System.out.println("Running...");
		
		try {
		    File fXmlFile = new File("/home/caglar/Downloads/RAPOR_CKS_CKSKayitveGuncellemeListesi.xml");
		    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		    Document doc = dBuilder.parse(fXmlFile);
		    doc.getDocumentElement().normalize();

		    System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		    NodeList nList = doc.getElementsByTagName("Details_Collection");
		    System.out.println("----------------------------");

		    for (int temp = 0; temp < nList.getLength(); temp++) {
		        Node nNode = nList.item(temp);
		        System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
		        if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		            Element eElement = (Element) nNode;
		            System.out.println("Staff id : "
		                               + eElement.getAttribute("NameInfo"));
		            System.out.println("First Name : "
		                               + eElement.getElementsByTagName("NameInfo")
		                                 .item(0).getTextContent());
		            System.out.println("Last Name : "
		                               + eElement.getElementsByTagName("NameInfo")
		                                 .item(0).getTextContent());
		            System.out.println("Nick Name : "
		                               + eElement.getElementsByTagName("NameInfo")
		                                 .item(0).getTextContent());
		            System.out.println("Salary : "
		                               + eElement.getElementsByTagName("NameInfo")
		                                 .item(0).getTextContent());
		        }
		    }
		    } catch (Exception e) {
		    e.printStackTrace();
		    }	
		
		
		
		
	}
	
	
}
