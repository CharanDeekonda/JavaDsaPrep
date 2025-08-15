package Sessions.HashMaps;

import java.util.ArrayList;

public class Arrlast1 {
    public static void main(String[] args) {
    String arr[]={"hi","abc","hi","qwe","abc"};
    ArrayList<String> list=cal1(arr);  
    System.out.println(list);  
    }
    static ArrayList<String> cal1(String arr[]){
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        //System.out.println(list);
        return list;
    }
}
