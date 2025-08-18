package Practice.Arrays;
import java.util.*;
public class MergSrtArr {
    //MERGE SORTED ARRAYS
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int n= arr1.length,m= arr2.length;
        //int i=n-1,j=m-1;
        int k=0;
        int[] ans = new int[m+n];
        // while(i>=0 && j>=0){
        //     if(arr1[i]>arr2[i]) ans[k--]=arr1[i--];
        //     else ans[k--]=arr2[j--];
        // }
        // while(i>=0){
        //     ans[k--]=arr1[i--];
        // }
        // return ans;
        for(int x:arr1){
            ans[k++]=x;        
        }
        for(int x:arr2){
            ans[k++]=x;        
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
