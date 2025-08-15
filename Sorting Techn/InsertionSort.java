import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int size=value.nextInt();
        int num[]=new int[size];
        int i,j;
        for(i=0;i<size;i++){
            num[i]=value.nextInt();
        }

                //O(N^2)
        for(i=1;i<size;i++){
            int curr=num[i];
            j=i-1;
            while(j>=0 && curr<num[j]){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=curr;

        }
        for(i=0;i<size;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
        value.close();
    }
    
}
