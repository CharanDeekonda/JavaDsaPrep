package Sessions.Arrayprogs;

import java.util.Arrays;

public class Frstndsendlargest {
    static int[] cal(int[] a){
        int frstlarg=a[0],sndlarg=a[0],larind=0,secdind=0;
        for(int i=0;i<a.length;i++){
            if(frstlarg<a[i]){
                sndlarg=frstlarg;
                frstlarg=a[i];
                larind=i;
            }
            if(sndlarg<a[i] || a[i]!=frstlarg){
                sndlarg=a[i];
                secdind=i;
            }
        }
            return new int[]{frstlarg,larind,sndlarg,secdind};
    }
    public static void main(String[] args) {
        int arr[]={5,2,3,1,4};
        int[] s=cal(arr);
        System.out.println(Arrays.toString(s));
    }
    
}
