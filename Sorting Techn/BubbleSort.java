import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int size=value.nextInt();
        int num[]=new int[size];
        int i,j;
        for(i=0;i<size;i++){
            num[i]=value.nextInt();
        }
            //time complexity =O(n^2)
        for(i=0;i<size-1;i++){      //n-1 times
            for(j=0;j<size-i-1;j++){ //n-i-1
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }

        for(i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
        value.close();
    }

}
    

