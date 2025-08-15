package Arrayprog;

public class Movearr0 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 0;
        }
        for (int i=0;i<n;i++) {
            System.out.print(arr[i]);
            if(i<n-1) 
            System.out.print(",");
        }
    }
    
}


// for moving zeros to front
// package Arrayprog;

// public class Movearr0 {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 0, 3, 12};
//         int n = arr.length;
//         int count = n - 1;

//         // Move non-zero elements to the end of the array
//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] != 0) {
//                 arr[count--] = arr[i];
//             }
//         }

//         // Fill the beginning of the array with zeroes
//         while (count >= 0) {
//             arr[count--] = 0;
//         }

//         // Print the modified array
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
