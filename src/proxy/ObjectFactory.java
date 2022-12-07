
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetAccount_QNAME = new QName("http://sercice/", "getAccount");
    private final static QName _Account_QNAME = new QName("http://sercice/", "account");
    private final static QName _ConvertEuroToDihms_QNAME = new QName("http://sercice/", "convertEuroToDihms");
    private final static QName _GetAccountResponse_QNAME = new QName("http://sercice/", "getAccountResponse");
    private final static QName _GetListAccount_QNAME = new QName("http://sercice/", "getListAccount");
    private final static QName _ConvertEuroToDihmsResponse_QNAME = new QName("http://sercice/", "convertEuroToDihmsResponse");
    private final static QName _GetListAccountResponse_QNAME = new QName("http://sercice/", "getListAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link ConvertEuroToDihmsResponse }
     * 
     */
    public ConvertEuroToDihmsResponse createConvertEuroToDihmsResponse() {
        return new ConvertEuroToDihmsResponse();
    }

    /**
     * Create an instance of {@link GetListAccountResponse }
     * 
     */
    public GetListAccountResponse createGetListAccountResponse() {
        return new GetListAccountResponse();
    }

    /**
     * Create an instance of {@link GetListAccount }
     * 
     */
    public GetListAccount createGetListAccount() {
        return new GetListAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link ConvertEuroToDihms }
     * 
     */
    public ConvertEuroToDihms createConvertEuroToDihms() {
        return new ConvertEuroToDihms();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDihms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "convertEuroToDihms")
    public JAXBElement<ConvertEuroToDihms> createConvertEuroToDihms(ConvertEuroToDihms value) {
        return new JAXBElement<ConvertEuroToDihms>(_ConvertEuroToDihms_QNAME, ConvertEuroToDihms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "getListAccount")
    public JAXBElement<GetListAccount> createGetListAccount(GetListAccount value) {
        return new JAXBElement<GetListAccount>(_GetListAccount_QNAME, GetListAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDihmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "convertEuroToDihmsResponse")
    public JAXBElement<ConvertEuroToDihmsResponse> createConvertEuroToDihmsResponse(ConvertEuroToDihmsResponse value) {
        return new JAXBElement<ConvertEuroToDihmsResponse>(_ConvertEuroToDihmsResponse_QNAME, ConvertEuroToDihmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sercice/", name = "getListAccountResponse")
    public JAXBElement<GetListAccountResponse> createGetListAccountResponse(GetListAccountResponse value) {
        return new JAXBElement<GetListAccountResponse>(_GetListAccountResponse_QNAME, GetListAccountResponse.class, null, value);
    }

}
