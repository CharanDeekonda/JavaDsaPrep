package Sessions.SlidingWindowprogs;
import java.util.HashMap;

public class LngSubArrSumEqlk {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int arr[]={10,5,2,7,1,-10};
        int k=15,max=0,curr=0;
        for(int i=0;i<arr.length;i++){
            curr+=arr[i];
            if(curr == k){
                max=i+1;
            }
            int cal=curr-k;
            if(mp.containsKey(cal)){
                max=Math.max(max, i - mp.get(cal));
            }
            if(!mp.containsKey(curr)){
                mp.put(curr, i);
            }
        }
        System.out.println(max);
    }
}
