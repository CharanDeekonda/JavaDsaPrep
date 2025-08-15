package Leet75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class FindDiffof2array {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int n:nums1){
            h1.add(n);
        }
        for(int n:nums2){
            h2.add(n);
        }
        for(int n:nums2){
            if(h1.contains(n)){
                h1.remove(n);
                h2.remove(n);
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>(h1));
        res.add(new ArrayList<>(h2));

        return res;
    }

    public static void main(String[] args) {
        FindDiffof2array solution = new FindDiffof2array();

        // Hardcoded input values
        int[] nums1 = {1, 2, 3, 4, 5}; // First array
        int[] nums2 = {4, 5, 6, 7};     // Second array

        // Calculate and print the difference between the two arrays
        List<List<Integer>> result = solution.findDifference(nums1, nums2);
        System.out.println("Difference between the two arrays:");
        System.out.println("Unique elements in the first array: " + result.get(0));
        System.out.println("Unique elements in the second array: " + result.get(1));
    }
}
