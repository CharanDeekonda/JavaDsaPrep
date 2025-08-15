package Sessions.SlidingWindowprogs;

import java.util.HashMap;
import java.util.HashSet;

public class LenLngSubStrWNRC {
    static int cal1(String s){
        char[] arr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int l = 0, r = 0, max= 0;
        while (r < arr.length) {
            if (!set.contains(arr[r])) {
                set.add(arr[r]);
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                set.remove(arr[l]);
                l++;
            }
        }
        return max;
    }
    static int cal2(String s){
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0,max = 0;
       for(int r = 0; r < arr.length; r++) {
            if (map.containsKey(arr[r])&& map.get(arr[r]) >= l) {
                l = map.get(arr[r]) + 1;
            }
            map.put(arr[r], r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s="abcdefgchijkalnmojpqrst";
        int max1=cal1(s);
        System.out.println(max1);
        int max2=cal2(s);
        System.out.println(max2);
        
    }
}
