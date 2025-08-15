package Arrayprog;

public class Removechar {
    public static void main(String[] args) {
        String a="Tiger";
        String b="Ti";
        String c="";        //ger
        for(int i=0;i<a.length();i++){
            if(b.indexOf(a.charAt(i)) == -1){
                c+=a.charAt(i);
            }
    }
    System.out.println(c);
}
}
