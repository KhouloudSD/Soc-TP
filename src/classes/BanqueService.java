package classes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService( serviceName = "BanqueWS")

public class BanqueService {

    @WebMethod(operationName = "ConversionDinarTO Euro")
    public double conversion(@WebParam(name = "montant") double mt){
        return  (mt * 0.3);
    }
    @WebMethod(operationName = "Compte")
    public Compte getCompte(@WebParam(name = "code") int code){
        Compte c= new Compte(code,Math.random());
        return c;
    }

    @WebMethod
    public List<Compte> getComptes(){
        List <Compte> comptes = new ArrayList<Compte>();

        Compte c1= new Compte(1,1000);
        Compte c2= new Compte(2,1000);
        Compte c3= new Compte(3,1000);

        comptes.add(c1);
        comptes.add(c2);
        comptes.add(c3);
        return comptes;

    }
}
