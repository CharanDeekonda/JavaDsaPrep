package Sessions.SlidingWindowprogs;
public class LngSubArrSum {
    //Longest Subarray with Sum<=K
    public static void main(String[] args) {
        int arr[]={3,5,4,2,1,6,3,2};
        int k=12,max=0;
        int n=arr.length;
        int l=0,r=0,curr=0;
        while(r<n){
            curr+=arr[r];
            if(curr>k){
                curr-=arr[l];
                l++;
            }
            if(curr==k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        System.out.println(max);
        for(int i=l;i<l+max;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

