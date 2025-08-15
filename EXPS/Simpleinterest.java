package EXPS;
import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        int num1=value.nextInt();
        System.out.println("Enter Time:");
        int num2=value.nextInt();
        System.out.println("Enter the rate:");
        float num3=value.nextFloat();
        float ans=(num1*num2*num3)/100;
        System.out.println("Simple interest is "+ans);
        value.close();
    }
}
