import java.util.Arrays;
public class movezeros {
    static int[] moveZeros(int[] arr){
        int n=arr.length;
        int r=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[r]=arr[i];
                r++;
            }
        }
        for(int i=r;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] ans= moveZeros(arr);
        System.out.println(Arrays.toString(ans));
    }
}
