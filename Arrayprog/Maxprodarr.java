package Arrayprog;

//import java.util.Arrays;

public class Maxprodarr {
    public static void main(String[] args) {
        int[] arr={4,1,6,3,7,0};
        int n=arr.length;
        // Arrays.sort(arr);
        // int a=arr[n-1]*arr[n-2];
        //    // int b=arr[0]*[1];
        //    System.out.println(a);

        int max1=arr[0]; //or Integer.MIN_VALUE
        int max2=arr[0];  //or Integer.MIN_VALUE
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2) max2=arr[i]; 
        }
        System.out.println(max1*max2);
        
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // System.out.println(max);

        // int max=nums[0];
        // int min=nums[0];
        // int res=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]<0){
        //         int temp=max;
        //         max=min;
        //         min=temp;
        //     }
        //     max=Math.max(nums[i],max*nums[i]);
        //     min=Math.min(nums[i],min*nums[i]);
        //     res=Math.max(res,max);
        // }
        // return res;



    }
    
}

