package EXPS;
import java.util.Scanner;

public class Largestandsmallestamoung3num{
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=value.nextInt();
        System.out.println("Enter the Second number");
        int b=value.nextInt(); 
        System.out.println("Enter the Third number");
        int c=value.nextInt();
        int largest=largest(a,b,c);
        int smallest=smallest(a,b,c);
        
        System.out.printf("largest of three numbers %d, %d, and %d is : %d %n",
                                   a, b, c, largest);
        System.out.printf("smallest of three numbers %d, %d, and %d is : %d %n", 
                               a, b, c, smallest);
            value.close();
    }

public static int largest(int a,int b,int c){
    int max=a;
    if(b>max){
        max=b;
    }
    if(c>max){
        max=c;
    }
     return max;
}
public static int smallest(int a,int b,int c){
    int min=a;
    if(b<min){
        min=b;
    }
    if(c<min){
        min=c;
    }
    return min;
}
}