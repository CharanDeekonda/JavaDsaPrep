package Arrayprog;

// import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
// import java.util.Set;

public class dup {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Set<Integer> h1=new HashSet<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int i : arr){
            if(!h1.contains(i)) h1.add(i);
        }
        //for(int i=0;i<h1.size();i++){
            System.out.print(h1.size());
        //}

        // int[] arr1=new int[n];
        // for(int i:arr){
        //     if(arr1[i]!=arr[i]){
        //         arr1[i]=arr[i];
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     System.out.print(arr1[i]);
        //     if(i<n-1) System.out.print(",");
        // }
        sc.close();;
        

}
    
}
