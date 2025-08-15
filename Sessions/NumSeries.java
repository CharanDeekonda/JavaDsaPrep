package Sessions;
public class NumSeries {
    public static void main(String[] args) {

        ////Fibonacci series
        // int a=0,b=1,fib=5;
        // System.out.print(a+" "+b+" ");
        // for(int i=2;i<fib;i++){
        //     int c=a+b;
        //     System.out.print(c+" ");
        //     a=b;
        //     b=c;
        // }
        
        ////Fibonacci series sum
        // int a=3,b=6, x=0, y=1,c=0,s=0;
        // if(a>b){
        //     int t=a;
        //     a=b;
        //     b=t;
        // }
        // for(int i=3;i<=Math.max(a,b);i++){
        //     c=x+y;
        //     if(i==a){ s=c;}
        //     x=y;
        //     y=c;
        // }
        // System.out.println(c+" "+s);


        ////Arithmetic series sum
        // int a=2,d=3,sum=0;
        // for(int i=a,s=1;s<=10;i+=d,s++){
        //     sum+=i;
        // }
        // System.out.println(sum);

        ////Geometric series sum
        int a=2,r=3,n=5,sum=0;
        for(int i=1;i<=n-1;i++){
            sum+=a;
            a*=r;
        }
        System.out.println(sum);
    }
}
