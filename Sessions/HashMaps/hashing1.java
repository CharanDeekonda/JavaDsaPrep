package Sessions.HashMaps;

//import java.sql.Array;
import java.util.Arrays;

public class hashing1 {
    public static void main(String[] args) {
        int arr[]={10,13,35,90,15};
        // int hashingint=hashingint(arr.length,arr);
        // System.out.println(hashingint);
        HashIntStructure hash=new HashIntStructure(arr.length);
        for(int i=0;i<arr.length;i++){
            hash.put(arr[i]);
        }
        hash.get(35);
        System.out.println(Arrays.toString(hash.hashtable));
    }
}
class HashIntStructure{
    int size;
    int hashtable[];
    HashIntStructure(int n){
        size=n;
        hashtable=new int[size];
    }
    int hashkey(int ele){
        return ele%size;    
    }
    void put(int ele){
        int key=hashkey(ele);
        while(hashtable[key]!=0){
            key=(key+1)%size;
        }   
    }
    boolean get(int ele){
        int key=hashkey(ele);
        int cnt=0;
        while(cnt<size && hashtable[key]!=ele){
            key=(key+1)%size;
            cnt++;
             }
             if(cnt<size){
                return false;
             }
             return true;
        
    }
}   