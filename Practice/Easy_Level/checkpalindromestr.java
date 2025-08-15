package Practice.Easy_Level;


public class checkpalindromestr {
    public static void main(String[] args) {
        String str="madam";
        int l=0,r=str.length()-1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(l)==str.charAt(r))
            {
                l++;r--;
            }
            else{
                System.out.println("Not a palindrome");
                return; // Exit if not a palindrome
            }
        }
        System.out.println("Palindrome");
        }   
}
