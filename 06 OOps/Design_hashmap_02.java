import java.util.Arrays;

// Problem: Design Hashmap 
// leetCode: 706
// Difficulty: easy
// Time Complexity: O(1)
// Space Complexity: O(n)

public class Design_hashmap_02 {
    public static void main(String arg[]){
        MyHashMap obj = new MyHashMap();
        obj.put(5,4);
        System.out.println("The value at index or key '5' is : "+obj.get(5));


    }
    
}

class MyHashMap {
    int array[];

    public MyHashMap() {
        this.array = new int[1000001];
        Arrays.fill(array,-1);
        
    }
    
    public void put(int key, int value) {
        this.array[key] = value;
        
    }
    
    public int get(int key) {
        return this.array[key];
        
    }
    
    public void remove(int key) {
        this.array[key] = -1;
        
    }
}
