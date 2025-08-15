package Arrayprog;

public class Maxsumarr {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int max1 = Integer.MIN_VALUE;   // or max1=arr[0];
        int res = 0;
        for (int i = 0; i < n; i++) {               //Kadane's Algorithm
            res = Math.max(arr[i], res + arr[i]);
            max1 = Math.max(max1, res);
        }
        System.out.println(max1);
    }
}
