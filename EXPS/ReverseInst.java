package EXPS;
import java.util.Scanner;
public class ReverseInst {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int var=value.nextInt();
        int rev=0;
        while(var!=0){
            int dig=var%10;
             rev=rev*10+dig;
             var=var/10;
        }
        System.out.println(rev);
        value.close();
    }
    
}
