package Sessions.Arrayprogs;

//import java.util.Arrays;

public class Arr2Dvar3 {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,1,2,4,1,3,5};
        int n = 10;
        int freq[] = new int[n + 1];
        int max = 1;
        for(int i = 0 ; i < arr.length; i++)
        {
            int ele = arr[i];
            freq[ele] = freq[ele] + 1;
            if(max < freq[ele])
            {
                max = freq[ele]; 
            }
        }
        
        // System.out.println(Arrays.toString(freq));
        // System.out.println(max);
        // // [1,3,4,2,5,6,7,8,9,10]

        int brr[][] = new int[max][n];
        int colInsert[] = new int[max]; 
        
        for(int i = 1;i<freq.length;i++)
        {
            if(freq[i] == 0)
            {
                continue;
            }
            else 
            {
                int dups = freq[i];
                int ele = i; 
                for(int j = 0; j < dups;j++)
                {
                    brr[j][colInsert[j]++] = ele; 
                } 
            }
        }
        System.out.println("The 2D array is: ");
        for(int i = 0; i < max; i++)
        {
            for(int j = 0; j < colInsert[i]; j++)
            {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
