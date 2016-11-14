package generatedSource.com.tanmoy.mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-11-14T19:44:22.592+05:30
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "AdditionWebService", 
                  wsdlLocation = "file:/D:/git clone/SOAP-Web-Service-Projects/SimpleApacheCXFContract/src/main/resources/wsdl/hello.wsdl",
                  targetNamespace = "http://service/") 
public class AdditionWebService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service/", "AdditionWebService");
    public final static QName AdditionWebServicePort = new QName("http://service/", "AdditionWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/git clone/SOAP-Web-Service-Projects/SimpleApacheCXFContract/src/main/resources/wsdl/hello.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AdditionWebService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/git clone/SOAP-Web-Service-Projects/SimpleApacheCXFContract/src/main/resources/wsdl/hello.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AdditionWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AdditionWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdditionWebService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public AdditionWebService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public AdditionWebService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public AdditionWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns AdditionWebService
     */
    @WebEndpoint(name = "AdditionWebServicePort")
    public AdditionWebService getAdditionWebServicePort() {
        return super.getPort(AdditionWebServicePort, AdditionWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdditionWebService
     */
    @WebEndpoint(name = "AdditionWebServicePort")
    public AdditionWebService getAdditionWebServicePort(WebServiceFeature... features) {
        return super.getPort(AdditionWebServicePort, AdditionWebService.class, features);
    }

}
