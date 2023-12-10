package client;


import classes.BanqueService;
import classes.Compte;
import classes.SecondService;

import java.util.Scanner;

public class WebServiceClient {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Create instances of the web services
        BanqueService banqueService = new BanqueService();
        SecondService secondService = new SecondService();

        System.out.print("Enter code for BanqueService: ");
        int banqueCode = scanner.nextInt();
        Compte compte = banqueService.getCompte(banqueCode) ;
        System.out.println("Banque compte de num " + banqueCode + "is " + compte.getCode());


        // Invoke methods on BanqueService
        double conversionResult = banqueService.conversion(100.0);
        System.out.println("BanqueService Conversion Result: " + conversionResult);



        // Get user input for SecondService
        System.out.print("Enter input for SecondService: ");
        String secondServiceInput = scanner.next();
        // Invoke methods on SecondService with dynamic input
        String operationResult = secondService.performOperation(secondServiceInput);
        System.out.println("SecondService Result: " + operationResult);

        // Close the scanner
        scanner.close();
    }
}
