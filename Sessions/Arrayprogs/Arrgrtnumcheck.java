package Sessions.Arrayprogs;

import java.util.Arrays;

public class Arrgrtnumcheck {
    static boolean[] cal(int[] a){
        boolean[] bool=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    bool[i] = true;
                      break;
                }
            }
        }
        return bool;
    }
    static int[] cal1(int [] a){
        int[] cnt=new int[a.length];
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    c++;
                    cnt[i]=c;
                }
            }
            c=0;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr={45,20,500,1000,3,99};
        boolean[] s=cal(arr);
        int[] s1=cal1(arr);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));
    }
}
