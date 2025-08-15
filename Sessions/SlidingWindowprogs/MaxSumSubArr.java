package Sessions.SlidingWindowprogs;
public class MaxSumSubArr {
    public static void main(String[] args) {
        int arr[]={3,6,4,2,1,6,3,2};
        int n=arr.length;
        int curr=0,max=arr[0];
        for(int i=1;i<n;i++){
            curr=arr[i]+arr[i-1];
            if(curr>max){
                max=curr;
            }   
        }
        System.out.println(max);
    }
}
