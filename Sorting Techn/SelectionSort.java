import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int size=value.nextInt();
        int num[]=new int[size];
        int i,j;
        for(i=0;i<size;i++){
            num[i]=value.nextInt();
        }

            //time complexity O(N^2)
        for(i=0;i<size-1;i++){
            int small=i;
            for(j=i+1;j<size;j++){
                if(num[small]>num[j])
                small=j;
            }
            int temp=num[small];
            num[small]=num[i];
            num[i]=temp;
        }

        for(i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
        value.close();
    }
    
}
