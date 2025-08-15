package Sessions.Arrayprogs;

//import java.util.Arrays;

public class Arrcntnum {
    static int cal(int[] a,int b){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b) cnt++;
        }  
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={4,7,1,9,3};
        int s=cal(arr,5);
        System.out.println(s);

    }
}
