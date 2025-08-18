package Practice.Arrays;
import java.util.*;
public class ContDup {
    //CONTAINS DUPLICATE
    static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 3, 9, 2};
        boolean result = containsDuplicate(arr);
        System.out.println("Contains duplicate: " + result);
    }
    
}
