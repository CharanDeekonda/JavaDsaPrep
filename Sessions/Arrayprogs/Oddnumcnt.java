package Sessions.Arrayprogs;

public class Oddnumcnt {
    static int calodd(int[] a){
        int cnt=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={5,2,3,1,6};
        int s=calodd(arr);
        System.out.println(s);
    }
}
