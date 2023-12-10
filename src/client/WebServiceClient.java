package client;


import classes.BanqueService;
import classes.Compte;
import classes.SecondService;

public class WebServiceClient {
    public static void main(String[] args) {
        // Create instances of the web services
        BanqueService banqueService = new BanqueService();
        SecondService secondService = new SecondService();

        // Invoke methods on BanqueService
        double conversionResult = banqueService.conversion(100.0);
        System.out.println("BanqueService Conversion Result: " + conversionResult);

        Compte compte = banqueService.getCompte(1) ;
        System.out.println("Banque compte de num 1 is " + compte.getCode());

        // Invoke methods on SecondService
        String operationResult = secondService.performOperation("World!");
        System.out.println("SecondService Result: " + operationResult);
    }
}
