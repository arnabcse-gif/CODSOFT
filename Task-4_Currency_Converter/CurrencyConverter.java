
import java.util.Scanner;


public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Currency Converter ===");
        System.out.println("1. USD");
        System.out.println("2. INR");
        System.out.println("3. EUR");
        System.out.println("4. GBP");

        System.out.print("Choose Base Currency (1-4): ");
        int base = sc.nextInt();

        System.out.print("Choose Target Currency (1-4): ");
        int target = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        double result = convert(base, target, amount);

        if (result == -1) {
            System.out.printf("Invalid currency selection.%n");
        } else {
            System.out.printf("Converted Amount: %.2f%n", result);
        }
        sc.close();
    }
    private static double convert(int base, int target, double amount) {
        double usd =1.0, inr = 82.0, eur = 0.91, gbp = 0.78;
       double baseRate = getRate(base, usd, inr, eur, gbp);
         double targetRate = getRate(target, usd, inr, eur, gbp);

         if(baseRate == -1 || targetRate == -1) 
             return -1;

        double usdAmount = amount / baseRate;
        return usdAmount * targetRate;     
         
    }
    private static double getRate(int currency, double usd, double inr, double eur, double gbp) {
        switch (currency) {
            case 1: return usd;
            case 2: return inr;
            case 3: return eur;
            case 4: return gbp;
            default: return -1;
        }
    }
}

