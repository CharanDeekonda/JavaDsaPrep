package Practice.Easy_Level;

import java.util.*;

public class arrreveKele {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int k=3;
        rotatearrray(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));   
    }
    public static void rotatearrray(int[] arr,int k){   // return type will be int[] if you want to return the rotated array
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);    //if return statement in int[] then "return arr;"
    }
    public static void reverse(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;r--;
        }
    }
}
