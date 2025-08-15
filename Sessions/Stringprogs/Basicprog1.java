package Sessions.Stringprogs;

import java.util.Arrays;

public class Basicprog1 {
    @SuppressWarnings("unused")
    static int findlen(String str){
        char arr[]=str.toCharArray();
        int len=0;
        for(int i:arr){
            len++;
        }
        return len;
    }
    static String contst(String str1,String str2){
        String ans="";
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        for(int i=0;i<arr1.length;i++){
            ans+=arr1[i];
        }
        ans+=" ";
        for(int i=0;i<arr2.length;i++){
            ans+=arr2[i];
        }
        return ans;
    }
    static String strrev(String str){
        String ans="";
        char arr[]=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
        }
        return ans;
    }
    static int wordcntvar1(String str){
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        int c=0;
        boolean bool=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' ' && bool ){
                c++;bool=false;
        }
        else if(arr[i]==' ') bool = true;
    }
        return c;
    }
    static int wordcntvar2(String str){
        int c=0;
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>0){
                c++;
            }
        }
        return c;
    }
    static String wordcntvar3(String str){
        String ans="";
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>0){
                ans+=arr[i]+" ";
            }
        }
        return ans.substring(0,ans.length()-1);
    }
    static String wordcntvar4(String str){
        String ans="";
        char arr[]=str.toCharArray();
        int check=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=' '){
                ans+=arr[i];
                check=0;
            }
            else if(check==0){
                ans+=" ";
               check=1;
            }
        }
        return ans;
    }

    static int[] findmax(String str){
        str=str.trim();
        String res="";
        int[] arr1=new int[str.length()];
        int idx=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='0' && ch<='9'){
                res+=ch;
            }
            else if(res.length()>0){
                    arr1[idx++]=Integer.parseInt(res);
                    res="";
    
            }
        }
        if(str.charAt(str.length()-1)>='0' && str.charAt(str.length()-1)<='9'){
            arr1[idx++]=Integer.parseInt(res);
        }
        return Arrays.copyOf(arr1, idx);
    }
    static int vowelcnt(String str){
        str=str.toLowerCase();
        char arr[]=str.toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e'|| arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                c++;
            }
        }
        return c;
    }
    static int charocc(String str, char c){
        int ans=0;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==c){ ans++; }
        }
        return ans;
    }
    static String convup2lw(String str){
        String ans="";
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>='A' && arr[i]<='Z'){
                ans+= (char)(arr[i]+32);
            }
            else{
                ans+=arr[i];
            }
        }
        return ans;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str1="Charan Sai";
        String str2="Deekonda";
        int len=findlen(str1);   //str.length() 
        System.out.println("Length of the string is: "+len);
        String contst=contst(str1,str2); //str1.concat(str2);
        System.out.println("String concat: "+contst);
        String strrev=strrev(str2); //stre.reverse();
        System.out.println("Str Rev: "+strrev);
        String wcn="ab bb chf     hy hhy    ";
        int wordcntvar1=wordcntvar1(wcn);
        int wordcntvar2=wordcntvar2(wcn); //str1.split(" ").length;
        String wordcntvar3=wordcntvar3(wcn);
        String wordcntvar4=wordcntvar4(wcn);
        String s="bhn 7 8 ksmakn 98 326 kjh 897";
        int[] arr1=findmax(s);
        System.out.println("Wrd cnt1: "+wordcntvar1);
        System.out.println("Wrd cnt2: "+wordcntvar3);
        System.out.println("Wrd cnt3: "+wordcntvar4);
        System.out.println(Arrays.toString(arr1));
        int vowelcnt=vowelcnt(str1); 
        System.out.println("Vowel cnt: "+vowelcnt);
        int charocc=charocc(str1,'a');
        System.out.println("Occurance of Char 'a' in str1: "+charocc);
        String str3="ABCDe";
        String convup2lw=convup2lw(str3);
        System.out.println("Convert up 2 lw: "+convup2lw);

    }

}
