package EXPS;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=value.nextLine();
        System.out.println("Hello, "+name+" Welcome to My Channel!! ");
        value.close();
    }
}
