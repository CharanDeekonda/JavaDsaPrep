package Arrayprog;

public class Missnumbarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int total = (n + 1) * (n + 2) / 2;
        System.out.println("Missing number is: " + (total - sum));
    }
    
}
