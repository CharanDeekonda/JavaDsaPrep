package EXPS;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Fibonacciseries {

    public static void main(String[] args) {
        try (Scanner value = new Scanner(System.in)) {
            System.out.println("Enter the input:");
            int n=value.nextInt();
            int a=0;
            int b=1;
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                System.out.print(a+" ");
                sum+=a;
                int c=a+b;
                a=b;
                b=c;

            }
        
        //System.out.println(sum);
        }

    }
}