package Sessions.Arrayprogs;

import java.util.Arrays;

public class Arr2Dvar1 {
    static float[] cal(int[][] a,int x,int y ){
        float ans=0;
        float[] crr=new float[x];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
               ans+=a[i][j]; 
            }
            ans/=500;
            float t=ans*100;
            crr[i]+=t;
        }
        return crr;
    }
    static float calm(int[][] a,int x,int y,int sub){
        float ans=0;
        //float crr=0;
        for(int i=0;i<y;i++){
               ans+=a[i][sub]; 
        }
        return ans/x;
    }
    static int calsc(int[][] a,int x,int y,int sub ){
        int cnt=0;
        for(int i=0;i<x;i++){
               if(a[i][sub]>70) cnt++; 
            }
        return cnt;
        }
        static int calmatmax(int[][] a,int x,int y,int sub ){
            int max=a[0][sub];
            int ans=0;
            for(int i=1;i<x;i++){
                  if(max<a[i][sub]) ans=i; 
                
            }
            return ans;
        }
        static int calzerocnt(int[][] a,int x,int y){
            int c=0;
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    if(a[i][j]==0) c++;
                }
            }
            return c;
        }

    public static void main(String[] args) {
        // students & subjects  {std1,std2,std3,std4,std5},{Hindi,Eng,Math,Science,Social}
        int[][] arr={{85,90,90,87,88},{90,76,99,87,93},{98,78,65,76,88},{78,99,71,68,90},{0,92,75,66,91}};
        int n=5,m=5;
        float[] brr=cal(arr,n,m);
        float math=calm(arr,n,m,2);
        int sciencecnt=calsc(arr,n,m,3);
        int mathmax=calmatmax(arr,n,m,2);
        int zerocnt=calzerocnt(arr,n,m);
        System.out.println("Avg of All Subjects:               "+Arrays.toString(brr));
        System.out.println("Avg of All Marks in Math:          "+math);
        System.out.println("Cnt of Marks > 70 in science:      "+sciencecnt);
        System.out.println("Max Marks in Math index:           "+mathmax);
        System.out.println("No.of 0 Scored by std in all subs: "+zerocnt);
    }
}
