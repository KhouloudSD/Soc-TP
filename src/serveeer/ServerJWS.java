package serveeer;

import classes.BanqueService;

import javax.xml.ws.Endpoint;



public class ServerJWS {
public static void main(String[]args)
{

    Endpoint.publish("http://localhost:9090/",new BanqueService());
    System.out.println ("Web server deployé sur l'adresse http://localhost:9090/?wsdl");

}
}
