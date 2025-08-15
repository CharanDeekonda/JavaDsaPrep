package Arrayprog;

public class Stringcompress {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        StringBuilder sb=new StringBuilder();
        int n = str.length();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                //System.out.print(str.charAt(i) + "" + count);
                sb.append(str.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        System.out.println(sb.toString());
    }
}
