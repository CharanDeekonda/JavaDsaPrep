package Arrayprog;

public class Charcompress {
    public static void main(String[] args) {
        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        StringBuilder sb=new StringBuilder();
        int n = arr.length;
        char[] arr1=new char[n];
        int c=0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                c++;
            } else {
                arr1[c]=arr[i];
                //System.out.print(arr[i] + "" + (c+1));
                sb.append(arr[i]);
                sb.append(c+1);
                c = 0;
            }
        }
        // System.out.println();
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]);
        // }
        System.out.println();
        System.out.println(arr1.length-1);
        System.out.println(sb.toString().toCharArray());      
    }
}
