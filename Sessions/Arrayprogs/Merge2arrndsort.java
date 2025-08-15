package Sessions.Arrayprogs;

import java.util.Arrays;

public class Merge2arrndsort {
    static int[] cal(int[] a,int[] b){
        int n=a.length,m=b.length;
        int[] c=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m){
            if(a[i]<b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(i<n) c[k++]=a[i++];
        while(j<m) c[k++]=b[j++];
        //Arrays.sort(c);
        return c;
    }
    public static void main(String[] args) {
        int[] arr={10,20,25,35};
        int[] crr={2,13,24,25,40};
        int[] ans=cal(arr,crr);
        System.out.println(Arrays.toString(ans));
    }
}

