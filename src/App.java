import java.text.NumberFormat;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annaulInterest = scanner.nextFloat();
        float monthlyInterest = annaulInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayment = years * MONTHS_IN_YEAR;

        double mortgage =  principal 
        * (monthlyInterest * (Math.pow(1+monthlyInterest, numberOfPayment))) 
        / (Math.pow(1+monthlyInterest, numberOfPayment) - 1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
