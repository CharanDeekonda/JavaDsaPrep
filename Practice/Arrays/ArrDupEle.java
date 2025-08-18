package Practice.Arrays;

import java.util.*;

public class ArrDupEle {
    static String cal1(String s){
        s=s.toLowerCase();
        char[] arr = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        String ans="";
        for(char c:map.keySet()){
            if(map.get(c)>1){
                ans+=c+" ";
            }
        }
        return ans;
    }
    static String cal2(String s){
        s=s.toLowerCase();
        char[] arr = s.toCharArray();
        String ans="";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char c:arr){
            map.put(c,map.getOrDefault(c, 0)+1);
            if(map.get(c)==1) ans+=c;
        }
        return ans;

    }
    public static void main(String[] args) {
        String s="hackerearth";
        String ans=cal1(s);
        String ans2=cal2(s);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
