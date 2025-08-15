package Sessions.SortingTechprogs;

import java.util.Arrays;

public class Ques2 {
    static int[][] Countcal(int[] arr){
        Arrays.sort(arr);
        int ind=0;
        boolean[] check=new boolean[arr.length];
        int[][] ans=new int[arr.length/2][2];
        for(int i=0;i<arr.length;i++){
           if (check[i]==false) {
            check[i]=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==0){
                    ans[ind][0]=arr[i];
                    ans[ind][1]=arr[j];
                    check[j]=true;
                    ind++;
                    break;
                }
            }
        }
        }
        return Arrays.copyOf(ans, ind);
    }
    static int chocodis(int[] arr,int m){
        Arrays.sort(arr);
        int max=arr[m-1]-arr[0];
        for(int i=0;i<arr.length;i++){
            int j=i+m-1;
            if(j<arr.length){
                int dif=arr[j]-arr[i];
            if(dif<max){
                max=dif;
            }
        }
        }
        return max;
    }
    static boolean solcal(int[]a,int[]b){
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    static int traincal(int[] arr,int[] dep){
        int c=0;
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            if(arr[i]<dep[j]){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr={6,1,8,0,4,-9,-1,10,-6,-5,10,-10,-10};
        int[][] ans=Countcal(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(Arrays.toString(ans[i])+" ");
        }
        System.out.println();
        int[] arr1={3,4,1,9,56,7,9,12};
        int cal=chocodis(arr1,5);
       System.out.println("Chocolate packates min: "+cal);
       int[] a={1,2,5,4,0};
       int[] b={2,4,5,0,1};
       boolean res=solcal(a,b);
       System.out.println("Array equal check: "+res);
        int[] arr2={900,1235,1100};
        int[] dep={1000,1240,1200};
        int traincal=traincal(arr2,dep);
        System.out.println("Train question: "+traincal);
    }    
}
