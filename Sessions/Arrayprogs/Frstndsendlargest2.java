package Sessions.Arrayprogs;

import java.util.Arrays;

public class Frstndsendlargest2 {
    static int[] cal(int[] a){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i:a){
            if(i>max1){
                max2=max1;
                max1=i;
            }
            else if(i>max2 && i!=max1){
                max2=i;
            }
        }
        return new int[]{max1,max2};

    }
    public static void main(String[] args) {
        
        int[] arr={5,2,3,1,6};
        int[] s=cal(arr);
        System.out.println(Arrays.toString(s));
    }
}
