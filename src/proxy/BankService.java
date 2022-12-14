
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "bankService", targetNamespace = "http://sercice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertEuroToDihms", targetNamespace = "http://sercice/", className = "proxy.ConvertEuroToDihms")
    @ResponseWrapper(localName = "convertEuroToDihmsResponse", targetNamespace = "http://sercice/", className = "proxy.ConvertEuroToDihmsResponse")
    @Action(input = "http://sercice/bankService/convertEuroToDihmsRequest", output = "http://sercice/bankService/convertEuroToDihmsResponse")
    public double convertEuroToDihms(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://sercice/", className = "proxy.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://sercice/", className = "proxy.GetAccountResponse")
    @Action(input = "http://sercice/bankService/getAccountRequest", output = "http://sercice/bankService/getAccountResponse")
    public Account getAccount(
        @WebParam(name = "code", targetNamespace = "")
        Long code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListAccount", targetNamespace = "http://sercice/", className = "proxy.GetListAccount")
    @ResponseWrapper(localName = "getListAccountResponse", targetNamespace = "http://sercice/", className = "proxy.GetListAccountResponse")
    @Action(input = "http://sercice/bankService/getListAccountRequest", output = "http://sercice/bankService/getListAccountResponse")
    public List<Account> getListAccount();

}
