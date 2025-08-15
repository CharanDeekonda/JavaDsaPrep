package EXPS;
import java.util.Scanner;

public class StringReverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.toLowerCase();

        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;  
            }
        }

        
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
