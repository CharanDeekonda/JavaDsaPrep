package Sessions.Recurssion;

public class MyClass1 {
    public static void main(String[] args){
        int sum=sum(5);
        System.out.println(sum);
    }
    static int sum(int n){
        if(n==1) return n;
        System.out.println(n);
        return n+sum(n-1);
    }
}
