public class Twosum {
    static boolean is2sum(int[] arr,int t){
        int n=arr.length;
        int l=0,r=n-1;
        //int sum=0;
        while(l<=r){
            int sum=arr[l]+arr[r];
            if(sum<t)
                l++;
            else if(sum>t)
                r--;
            else{
                System.out.println("Pairs:"+l+","+r);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,6,7,13,24,56,86};
        int target=63;
        boolean ans=is2sum(arr,target);
        System.out.println(ans);
    }
}
