package EXPS;
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the Input:");
        String orig = value.nextLine();
        String norl=orig.toLowerCase();
        String rev=new StringBuilder(norl).reverse().toString();
        /*System.out.println(""+rev); */
        if(norl.equals(rev)){
            System.out.println(orig+" Is Palindrome");
        }
        else{
            System.out.println(orig+" Is not Palindrome");
        }
        value.close();

    }
    
}
