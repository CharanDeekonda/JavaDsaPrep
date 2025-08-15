package Sessions;

import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        switch(ch){
            case 'a':
                System.out.println(ch+" is Vowel");
                break;
            case 'e':
                System.out.println(ch+" is Vowel");
                break;
            case 'i':
                System.out.println(ch+" is Vowel");
                break;
            case 'o':
                System.out.println(ch+" is Vowel");
                break;
            case 'u':
                System.out.println(ch+" is Vowel");
                break;
            default:
                System.out.println(ch+" is Consonant");
        }
        sc.close();;
    }
}
