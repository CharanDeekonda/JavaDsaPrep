package Sessions.Stringprogs;

import java.util.Arrays;

public class Stradvprog {
    static boolean anagram1(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    arr1[i]='0';
                    arr2[j]='0';
                    break;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!='0') return false;
        }
        return true;
        
    }
    static boolean anagram2(String str1,String str2){
        str1 = str1.replace(" ", "").toLowerCase().trim();
        str2 = str2.replace(" ", "").toLowerCase().trim();
        //System.out.println(str2);
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    static boolean palindrome(String str){
        str=str.replace(" ", "").toLowerCase();
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[arr.length-1-i]) return false;
        }
        return true;
    }
    static String anagram3(String words[]){
        String ans="";
        boolean[] check=new boolean[words.length];
        for(int i=0;i<words.length;i++){
            if(check[i]==false){
                String str=words[i];
                check[i]=true;
            for(int j=i+1;j<words.length;j++){
                if(anagram2(words[i],words[j])){
                    str+=" "+words[j];
                    check[j]=true;
                }
            }
            ans+=str+"\n";
            }
        }
        return ans.trim();
    }
    static int lngcmnprefix(String arr[]){
        int min=arr[0].length();
        int c=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i].length()<min) min=arr[i].length();
        }
        for(int i=0;i<min;i++){
            char ch=arr[0].charAt(i);
            for(int j=1;j<arr.length;j++){
                if(arr[j].charAt(i)!=ch) return c;
            }
            c++;
        }
        return c;
    }

    static String encryption1(String str){
        String ans="";
        int c=1;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                c++;
            } else {
                //System.out.print(str.charAt(i) + "" + c);
                ans+=c;
                ans+=str.charAt(i);
                c= 1;
            }
        }
        return ans;
    }
    @SuppressWarnings("unused")
    static String encryption2(String str){
        String ans="";
        str=str.replace(" ", "");
        int n = (int) Math.ceil(Math.sqrt(str.length())); 
        String[] arr=new String[n];
        Arrays.fill(arr,"");
        //System.out.println(n);
        for (int i = 0; i < str.length(); i++) {
            arr[i % n] += str.charAt(i); 
            //System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));
        return String.join(" ", arr).trim(); 
    }

    
    public static void main(String[] args) {
        String str1="Conversation";
        String str2="Voices rant on";
        boolean bool1=anagram1(str1,str2);
        System.out.println("Anagram check method1: "+bool1);
        boolean bool2=anagram2(str1,str2);
        System.out.println("Anagram check method2: "+bool2);
        String ch="Race car";
        Boolean palindrome=palindrome(ch);
        System.out.println("Palindrome check:      "+palindrome);
        String words[]={"act","cat","dog","god","tac"};
        String anagram=anagram3(words);
        System.out.println("Anagram grup separation: "+anagram);
        String ar[]={"app","approx","apps","apple","ape"};
        int lngcmnprefix=lngcmnprefix(ar);
        System.out.println("Longest prefix int the Array String: "+lngcmnprefix);

        //encryption-1
        String enc="aaaaaabbfgwbbbccccccccp";
        String encryption1=encryption1(enc);
        System.out.println("String Encryption-1: "+encryption1);

        //encryption-2
        String enc2="having a nice day";
        String encryption2=encryption2(enc2);
        System.out.println("String Encryption-2: "+encryption2);
    }
}
