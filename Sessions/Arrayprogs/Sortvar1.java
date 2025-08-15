package Sessions.Arrayprogs;

public class Sortvar1 {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,0,5};
        int n=6,temp=0,c=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]>arr[j]){
        //                c++;
        //             temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
                    
        //         }
        //     }
        // }
        // for(int i:arr){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
        // System.out.println(c);


        for(int i=0;i<n;i++){
            // if(arr[i]==i){
            //     c++;
            // }
            while(arr[i]!=i){
                c++;
                temp=arr[i];
                arr[i]=arr[temp];
                arr[temp]=temp;
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(c);
    }
}
