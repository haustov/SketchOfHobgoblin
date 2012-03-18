
package net.haustov.hobgoblin.hobservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.haustov.hobgoblin.hobservice package. 
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

    private final static QName _Test_QNAME = new QName("http://hobservice.hobgoblin.haustov.net/", "test");
    private final static QName _TestArray_QNAME = new QName("http://hobservice.hobgoblin.haustov.net/", "testArray");
    private final static QName _TestResponse_QNAME = new QName("http://hobservice.hobgoblin.haustov.net/", "testResponse");
    private final static QName _TestArrayResponse_QNAME = new QName("http://hobservice.hobgoblin.haustov.net/", "testArrayResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.haustov.hobgoblin.hobservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Units }
     * 
     */
    public Units createUnits() {
        return new Units();
    }

    /**
     * Create an instance of {@link TestArrayResponse }
     * 
     */
    public TestArrayResponse createTestArrayResponse() {
        return new TestArrayResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestArray }
     * 
     */
    public TestArray createTestArray() {
        return new TestArray();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hobservice.hobgoblin.haustov.net/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hobservice.hobgoblin.haustov.net/", name = "testArray")
    public JAXBElement<TestArray> createTestArray(TestArray value) {
        return new JAXBElement<TestArray>(_TestArray_QNAME, TestArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hobservice.hobgoblin.haustov.net/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestArrayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hobservice.hobgoblin.haustov.net/", name = "testArrayResponse")
    public JAXBElement<TestArrayResponse> createTestArrayResponse(TestArrayResponse value) {
        return new JAXBElement<TestArrayResponse>(_TestArrayResponse_QNAME, TestArrayResponse.class, null, value);
    }

}
