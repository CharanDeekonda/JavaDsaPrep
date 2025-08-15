package Sessions;
public class Patterns1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        int n1=5;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                System.out.print(i+","+j+" ");
            }
            System.out.println();
        }
    
    System.out.println();



    int n2=5;
    for(int i=1;i<=n2;i++){
        for(int j=1;j<=n2;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();



    int n3=5;
    for(int i=1;i<=n3;i++){
        for(int j=1;j<=n3;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();


    int n4=5;
    for(int i=n4;i>0;i--){
        for(int j=n4;j>0;j--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    System.out.println();

    int n5=5;
    for(int i=n5;i>0;i--){
        for(int j=n5;j>0;j--){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    System.out.println();


    int n6=5;
    for(int i=1;i<=n6;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }

        System.out.println();
    }
System.out.println();
        int n7=5;
        for(int i=1;i<=n7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
            System.out.println();

            int n8=5;
            for(int i=n8;i>0;i--){
                for(int j=n8;j>=i;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
            System.out.println();

            int n9=5;
            for(int i=n9;i>=1;i--){
                for(int j=1;j<=n9;j++){
                    if (j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(j);
                    }
                }
                System.out.println();
            }

            System.out.println();



            int n10=5;
            for(int i=1;i<=n10;i++){
                for(int j=1;j<=n10;j++){
                    if(i==j|| j==n10-i+1){
                        System.out.print("*");
                    }
                    else System.out.print(j);
            }
            System.out.println();
        }


        System.out.println();

        int x=5;
        for(int i=0;i<x;i++){
            for(int j=0;j<x-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();


    
    int d=5;
        for(int i=0;i<d;i++){
            for(int j=0;j<d-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=d-1;i>=0;i--){
        for(int j=0;j<d-i;j++){
            System.out.print(" ");
        }
        for(int k=0;k<i;k++){
            System.out.print(" *");
    }
    System.out.println();
}
System.out.println();


        int o=5,nn=1;
            for(int i=1;i<=o;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(nn+" "); nn++;
                }
                System.out.println();
            }
        System.out.println();
            int g=4,w=0;
            for(int i=1;i<=g;i++){
                if(i%2==0){ w=0; }
                else w=1;
                for(int j=1;j<=i;j++){
                    if(w==1) {
                        System.out.print(w+" ");
                        w=0;
                    }
                    else{
                        System.out.print(w+" ");
                        w=1;
                    }
                    
                }
                System.out.println();
                    
            }
             System.out.println();

            int r=4;
            for(int i=1;i<=r;i++){
                for(int j=1;j<=r-i;j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print(k+"");
                }
                for(int q=i-1;q>=1;q--){
                    System.out.print(q+"");
                }
                System.out.println();
            }
 
System.out.println();
            int r1=4;
            for(int i=1;i<=r1;i++){
                for(int j=1;j<=r1-i;j++){
                    System.out.print(" ");
                }
                for(int k=i;k>1;k--){
                    System.out.print(k+"");
                }
                for(int q=1;q<=i;q++){
                    System.out.print(q+"");
                }
                System.out.println();
            }
 
System.out.println();



    int y=7;
    for(int i=1;i<=y;i++){
        for(int j=1;j<=i;j++){
            if(j==1||j==i||i==y){
                System.out.print(j+" ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    System.out.println();


    int z=6;
    for(int i=0;i<=z;i++){
        int nz = 1;
            for (int j = 0; j <=i; j++) {
                System.out.print(nz);
                nz = nz * (i - j) / (j + 1);
            }
            for (int j = i + 1; j < z; j++) {
                System.out.print(0);
            }
            System.out.println();
    }

    int gg=5;
    System.out.println("*");
    for(int i=1;i<gg;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int k=i-1;k>=1;k--){
            System.out.print(k);
        }
            
        System.out.println("*");
    }
    System.out.println();



    int p=7;
    for(int i=1;i<=p;i++){
        for(int j=1;j<=n-i+2;j++){
            System.out.print(" ");
        }
        System.out.print("*");
        for(int j=1;j<(i-1)*2;j++){
            System.out.print(" ");
        }
        if(i>1){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=p;i>=1;i--){
        System.out.print("*");
        for(int j=1;j<(i-1)*2;j++){
            System.out.print(" ");
        }
        if(i>1){
            System.out.print("*");
        }
        for(int j=n;j>=p-i+2;j--){
            System.out.print(" ");
        }
        System.out.println();
    }
    
}
}



