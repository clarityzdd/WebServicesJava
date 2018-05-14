package daw.ws;
import org.apache.cxf.tools.wsdlto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.tools.xjc.XJCFacade;


public class CodeGenerator {

	public static void main(String[] args) throws Throwable {
		 final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);

		 System.setProperty("javax.xml.accessExternalSchema", "all");
		XJCFacade.main(new String[]{
				"-b","src/main/resources/bindings.xml",
				"-d", "src/main/java",
				"src/main/resources/book.xsd"

	});
		System.out.println("Done! ;)");
	}
}
