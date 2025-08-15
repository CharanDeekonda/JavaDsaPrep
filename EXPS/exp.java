package EXPS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import java.util.HashSet;
// import java.util.List;

public class exp {
    public static void main(String[] args)
    {

        // Get the Arrays
        int intArr[] =  { 10, 20, 15, 22, 35 } ;
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.binarySearch(intArr, 22));


        // Get the second Arrays
        int intArr1[] =  { 10, 15, 22 };
        // To compare both arrays
        System.out.println(Arrays.compare(intArr, intArr1));
        System.out.println(Arrays.toString(Arrays.copyOf(intArr, 10))+"");

System.out.println();
System.out.println();


        // Create two ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 8, 7, 5, 10));
        Collections.sort(list2);
        System.out.println(list2);
        Collections.copy(list2,list1);
        
        // Print the ArrayLists
        System.out.println( list2);
        Collections.reverse(list2);
        for(int i=0;i<list2.size();i++){
            
            System.out.print(list2.get(i)+" ");
        }
        System.out.println();
        System.out.println(list1);
        
  
        // Print all elements of list in reverse order 
        // using reverse() method 
    }

}
