package EXPS;
import java.util.Scanner;

public class Myarrayexp {
    public static void main(String[] args){
        System.out.println("Enter the size of array:");
        Scanner arr=new Scanner(System.in);
        int size=arr.nextInt();
        int num[]=new int[size];
        System.out.println("Enter the inputs:");
        for(int i=0;i<size;i++){
            num[i]=arr.nextInt();
        }
        System.out.println("Enter the key value to find:");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        for(int i=0;i<size;i++){
            if(key==num[i]){
                System.out.println("The index of key value is:"+i);
            }
        }
        arr.close();;
        sc.close();
    }
}