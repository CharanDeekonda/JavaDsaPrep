package Sessions;
import java.util.regex.*;
public class Regexmail {
    public static void main(String[] args) {
        String para="mail to me charan.05@gmail.com or 987xyzgg.i_o-@gmail.edu.in!! ";
        String regex="([a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(para);
        String ans="";
        while(m.find()){
            ans+=m.group(0)+"\n";
        }
        System.out.println(ans.trim());
    }
}
