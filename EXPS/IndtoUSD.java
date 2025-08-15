package EXPS;
import java.util.Scanner;

public class IndtoUSD {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        double Rate = 83.5; 
        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double inr = value.nextDouble();
        double usd = inr / Rate;
        System.out.printf("The equivalent amount in US Dollars (USD) is: %.2f", usd);
        value.close();
    }

}
