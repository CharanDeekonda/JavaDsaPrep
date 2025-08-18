package Practice.Arrays;

import java.util.*;
//2sum problem
public class TwoSum {
    static int[] twoSum(int[] arr, int t){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=t-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp), i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
	public static void main(String[] args) {
        int[] nums = {2, 11,7, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
