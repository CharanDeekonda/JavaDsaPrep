package Sessions.Stringprogs;

import java.util.*;
class test1{
    public static void main(String[] args) {
        char []arr1={'a','b','c','a'};
        char []arr2={'b','d','e','e'};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum=0;
        Set<Character> set = new HashSet<>();
        for(char i:arr1) set.add(i);
        for(char i:arr2) set.add(i);
        for(char i:set){
            sum+=(int)i;
        }
        while(sum>9){
            int t=0;
            while(sum>0){
            t+=sum%10;
            sum/=10;
            }
            sum=t;
        }
        System.out.println(sum);
    }
}