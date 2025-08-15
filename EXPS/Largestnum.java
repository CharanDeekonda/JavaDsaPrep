package EXPS;
import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the First num:");
        int num1= value.nextInt();
        System.out.println("Enter the Second num:");
        int num2= value.nextInt();
        if(num1>num2){
            System.out.println(num1+" Is largest");
        }
        else{
            System.out.println(num2+" Is largest");
        }
        value.close();
    }
    
}
