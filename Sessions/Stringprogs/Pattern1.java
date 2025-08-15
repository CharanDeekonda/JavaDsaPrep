package Sessions.Stringprogs;

public class Pattern1 {
    static String solpat(int n){
        String arr[]=new String[n+1];
        if(n>=1 && n<=4){
            return arr[n-1];
        }
        else{
            String ans="";
            for(int i=4;i<n;i++){
                ans="";
                String prev=arr[i-1];
                int c=1;
                for(int j=0;j<prev.length()-1;j++){
                    if(prev.charAt(j)==prev.charAt(j+1)) c++;
                    else{
                        ans+=c+prev.charAt(j);
                        c=1;
                    }
                }
                ans+=c+prev.charAt(prev.length()-1);
                arr[i]=ans;
                System.out.println(ans);
            }

        }
        return arr[n-1];
    }
    public static void main(String[] args) {
    int n=5;
    String ans=solpat(n);
    System.out.println(ans);
}
}
