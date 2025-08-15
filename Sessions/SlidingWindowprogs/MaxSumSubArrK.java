package Sessions.SlidingWindowprogs;
public class MaxSumSubArrK {
    public static void main(String[] args) {
        int arr[]={3,5,4,2,1,6,3,2};
        int k=3;
        int curr=0;
        for(int i=0;i<k;i++){
            curr+=arr[i];
        }
        int max=curr;
        for(int i=k;i<arr.length;i++){
            curr+=arr[i]-arr[i-k];   //curr=curr-arr[i-k]+arr[i]
            if(curr>max) max=curr;
        }
        System.out.println(max);
    }
}
