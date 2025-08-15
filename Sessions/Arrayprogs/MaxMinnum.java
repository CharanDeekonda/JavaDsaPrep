package Sessions.Arrayprogs;

import java.util.Arrays;

public class MaxMinnum {
    static int[] cal(int[] a){
        int max=a[0],min=a[0],maxind=0,minind=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
                maxind=i;
            }
            if(min>a[i]){
                min=a[i];
                minind=i;
            }
                
            }
            return new int[]{max,maxind,min,minind};
            // int[] t={max,maxind,min,minind};
            // return t;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int[] s=cal(arr);
        System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]);
        System.out.println(Arrays.toString(s));
    }
}

