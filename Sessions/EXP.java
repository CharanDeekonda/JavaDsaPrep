package Sessions;
//import java.util.Scanner;
public class EXP {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // //Reverse a number and sum of num
        // int a=123,b=0,c=0,sum=0;
        // while(a!=0){
        //     b=a%10;
        //     sum+=b;
        //     c=c*10+b;
        //     a/=10;
        // }
        // System.out.println(c+" "+sum);

        ////Harmonic series
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        // float f=0;
        // for(int i=1;i<=n;i++){
        //     f+=(1.0/i);
        // }
        // System.out.println(f);
        // sc.close();

        ////Prime number
        int n=16;
        //boolean b=false;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                //b=false;
                System.out.println("Not Prime");
                break;
        }
        else{
            System.out.println("Prime");
            break;
        }
    }
    // if(!b){
    //     System.out.println("Prime");
    // }
    // else{
    //     System.out.println("Not Prime");
    // }
}
}
