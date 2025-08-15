import java.util.Arrays;
public class SqrSotarr {
    static int[] sortedSuare(int[] arr){
        int n=arr.length;
        int l=0,r=n-1,pos=n-1;
        while(l<=r){
            int left=arr[l]*arr[l];
            int right=arr[r]*arr[r];
            if(left<right){
                arr[pos]=right;
                r--;
            }
            else if(left>right){
                arr[pos]=left;
                l++;
            }
            pos--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={-9,-7,-3,0,1,2,3,5,6};
        int[] ans=sortedSuare(arr);
        System.out.println(Arrays.toString(ans));
    }
}
