public class traprainwt {
    static int trap(int arr[]){
        int n=arr.length;
        int l=0,r=n-1;
        int lmax=arr[l],rmax=arr[r];
        int ans=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,arr[l]);
                ans+=lmax-arr[l];
            } 
            else {
                r--;
                rmax=Math.max(rmax,arr[r]);
                ans+=rmax-arr[r];
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,2,3,0,6};
        int ans=trap(arr);
        System.out.println(ans);
    }
}
