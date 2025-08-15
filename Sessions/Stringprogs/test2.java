package Sessions.Stringprogs;

public class test2 {
    public static void main(String[] args) {
        int arr[]={2,3,6};
        int k=2;
        int nthprime=prime(k);
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[i]+nthprime;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int prime(int k){
        int c=0,num=0;
        while(c<k){
            num++;
            if(isprime(num)){
                c++;
            }
        }
    return num;
    }
    public static boolean isprime(int n){
        if(n<=1) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3;i<(int)Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}
