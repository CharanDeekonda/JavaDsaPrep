package Sessions.Arrayprogs;

public class Sumofnuminarr {
    static int sums(int[] a){
        int x=0;
        for(int i=0;i<a.length;i++){
            x+=a[i];
        }
        return x;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s=sums(arr);
        System.out.println(s);
    }
    
}
