package serveeer;
import classes.SecondService;
import javax.xml.ws.Endpoint;



public class SecondServiceServer {
        public static void main(String[]args)
        {
                Endpoint.publish("http://localhost:9091/second", new SecondService());
                System.out.println("SecondService deployed on http://localhost:9091/second/?wsdl");
        }
    // Publish the SecondService


}
