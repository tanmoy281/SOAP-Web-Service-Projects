
package generatedSource.com.tanmoy.mypackage;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-14T19:49:28.394+05:30
 * Generated source version: 3.1.8
 * 
 */
public final class AdditionWebService_AdditionWebServicePort_Client {

    private static final QName SERVICE_NAME = new QName("http://service/", "AdditionWebService");

    private AdditionWebService_AdditionWebServicePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = AdditionWebService_Service.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        AdditionWebService_Service ss = new AdditionWebService_Service(wsdlURL, SERVICE_NAME);
        AdditionWebService port = ss.getAdditionWebServicePort();  
        
        {
        System.out.println("Invoking deleteTwo...");
        int _deleteTwo_arg0 = 0;
        int _deleteTwo_arg1 = 0;
        int _deleteTwo__return = port.deleteTwo(_deleteTwo_arg0, _deleteTwo_arg1);
        System.out.println("deleteTwo.result=" + _deleteTwo__return);


        }
        {
        System.out.println("Invoking addTwo...");
        int _addTwo_arg0 = 0;
        int _addTwo_arg1 = 0;
        int _addTwo__return = port.addTwo(_addTwo_arg0, _addTwo_arg1);
        System.out.println("addTwo.result=" + _addTwo__return);


        }

        System.exit(0);
    }

}
