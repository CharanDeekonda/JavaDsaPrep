package Leet75;

import java.util.Scanner;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);
    }
    private int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        // User input for strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Calculate and print the GCD of the strings
        String result = solution.gcdOfStrings(str1, str2);
        System.out.println(result+"");
        
        scanner.close();
    }
}
