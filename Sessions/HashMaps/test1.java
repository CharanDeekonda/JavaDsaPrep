package Sessions.HashMaps;

import java.util.HashMap;

public class test1{
    public static void main(String[] args){
        int []arr={0,1,2,4,1,3,2};
        int n=arr.length;
        int ans=cal1(arr,n);
        System.out.println(ans);
        int ans2=cal2(arr,n);
        System.out.println(ans2);
    } 
    public static int cal1(int arr[],int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int nz=0;
        for(int i=n-1;i>=0;i--){
            if(arr[i]<=0) nz++;
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])==2){
                return i;
            }
        }
        if(nz==n) return 0;
        return arr[n-1];
    }
    public static int cal2(int arr[],int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        int nz=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=0) nz++;
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])==2){
                return arr[i];
            }
        }
        if(nz==n) return 0;
        return arr[0];
    }
}
//