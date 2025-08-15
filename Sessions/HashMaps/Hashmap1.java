package Sessions.HashMaps;

import java.util.*;

public class Hashmap1 {
    static Map<String,Integer> cal1(String s){
        s=s.replace(" ", "");
        Map<String,Integer> map=new HashMap<>();
        String arr[]=s.split("");
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return map;
    }
    static Map<Character,Integer> cal2(String s){
        s=s.replaceAll(" ","");
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int cnt=map.getOrDefault(ch,0);
            map.put(ch,cnt+1);
        }
        return map;
    }

    @SuppressWarnings("unused")
    static char cal3(String s1){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int cnt=map.getOrDefault(ch,0);
            map.put(ch,cnt+1);
        }
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map.get(s1.charAt(i))==1) return s1.charAt(i);
        }
        return '0';
    }
    public static void main(String[] args) {
        String s="hello world";
        Map<String,Integer> map1=cal1(s);
        Map<Character,Integer> map2=cal2(s);
        System.out.println(map1);
        System.out.println(map2);
        String s1="swiss";
        char map3=cal3(s1);
        System.out.println(map3);
    }
}
