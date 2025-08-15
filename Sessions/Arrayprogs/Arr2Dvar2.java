package Sessions.Arrayprogs;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2Dvar2 {
    static void printarr(int[][] a){
        System.out.println("Array: ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int cal(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
        }
        return sum;
    }
    static int poscal(int[][] a){
        int pos=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]>=0) pos++;
            }
        }
        return pos;
    }
    static int minfind(int[][] a){
        int min=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]<min) min=a[i][j];
            }
        }
        return min;
    }
    static int[] calcnt(int[][] a){
        int[] ans=new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                ans[i]++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] arr;
        arr=new int[3][3];
        Scanner sc=new Scanner(System.in);
        // arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Enter the input:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //int[][] arr1=printarr(arr);
        printarr(arr);
        sc.close();
        int res=cal(arr);
        int poscal=poscal(arr);
        int min=minfind(arr);
        int[][] brr={{1,2,3},{4,5},{6,7,8,9}};
        int[] lencnt=calcnt(brr);
        System.out.println("Sum of all elements in the array: "+res);
        System.out.println("Cnt of +ve nums:                  "+poscal);
        System.out.println("Min num in the array:             "+min);
        System.out.println(Arrays.toString(lencnt));
    }
}
