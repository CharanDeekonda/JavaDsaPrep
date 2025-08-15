
public class Strrevtrick {
    public static void main(String[] args) {
        String s="stu@de#nt$s";
        char arr[]=s.toCharArray();
        int l=0,r=arr.length-1;
        while (l < r) {
            if (Character.isLetter(arr[l]) && Character.isLetter(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if (!Character.isLetter(arr[l])) {
                l++;
            } else if(!Character.isLetter(arr[r])) {
                r--;
            }
        }
        String str="";
        for(char c:arr){
            str+=c;
        }
        System.out.println(str);
    }
}