package Sessions;

public class Days {
    public static void main(String[] args) {
        int put=1114;
        int year=put/365;
        int remdays=put%365;
        int weeks=remdays/7;
        int days=remdays%7;
        System.out.println(year+" years "+weeks+" weeks and "+days+" days");
    }
}
