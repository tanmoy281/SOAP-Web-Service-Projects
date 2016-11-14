
package generatedSource.com.tanmoy.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generatedSource.com.tanmoy.mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddTwo_QNAME = new QName("http://service/", "addTwo");
    private final static QName _AddTwoResponse_QNAME = new QName("http://service/", "addTwoResponse");
    private final static QName _DeleteTwo_QNAME = new QName("http://service/", "deleteTwo");
    private final static QName _DeleteTwoResponse_QNAME = new QName("http://service/", "deleteTwoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generatedSource.com.tanmoy.mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddTwo }
     * 
     */
    public AddTwo createAddTwo() {
        return new AddTwo();
    }

    /**
     * Create an instance of {@link AddTwoResponse }
     * 
     */
    public AddTwoResponse createAddTwoResponse() {
        return new AddTwoResponse();
    }

    /**
     * Create an instance of {@link DeleteTwo }
     * 
     */
    public DeleteTwo createDeleteTwo() {
        return new DeleteTwo();
    }

    /**
     * Create an instance of {@link DeleteTwoResponse }
     * 
     */
    public DeleteTwoResponse createDeleteTwoResponse() {
        return new DeleteTwoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTwo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addTwo")
    public JAXBElement<AddTwo> createAddTwo(AddTwo value) {
        return new JAXBElement<AddTwo>(_AddTwo_QNAME, AddTwo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTwoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "addTwoResponse")
    public JAXBElement<AddTwoResponse> createAddTwoResponse(AddTwoResponse value) {
        return new JAXBElement<AddTwoResponse>(_AddTwoResponse_QNAME, AddTwoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTwo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteTwo")
    public JAXBElement<DeleteTwo> createDeleteTwo(DeleteTwo value) {
        return new JAXBElement<DeleteTwo>(_DeleteTwo_QNAME, DeleteTwo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTwoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "deleteTwoResponse")
    public JAXBElement<DeleteTwoResponse> createDeleteTwoResponse(DeleteTwoResponse value) {
        return new JAXBElement<DeleteTwoResponse>(_DeleteTwoResponse_QNAME, DeleteTwoResponse.class, null, value);
    }

}
