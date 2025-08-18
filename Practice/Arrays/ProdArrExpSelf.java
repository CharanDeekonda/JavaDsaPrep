package Practice.Arrays;
import java.util.*;
public class ProdArrExpSelf {
    //PRODUCT OF ARRAY EXCEPT SELF
    static int[] productExceptSelf(int[] arr) {
        int n= arr.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            int temp=ans[i-1]*arr[i-1];
            ans[i]=temp;
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix=suffix*arr[i];
        }
        return ans;   
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = productExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }
}
