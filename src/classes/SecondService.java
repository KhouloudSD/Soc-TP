package classes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "SecondService")
public class SecondService {
    @WebMethod(operationName = "SomeOperation")
    public String performOperation(@WebParam(name = "input") String input) {
        return "Result: " + input;
    }
}


