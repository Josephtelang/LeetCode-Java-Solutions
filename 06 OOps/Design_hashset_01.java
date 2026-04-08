// Problem: Design HashSet 
// leetCode: 705
// Difficulty: easy
// Time Complexity: O(1)
// Space Complexity: O(n)

class Design_hashset_01{
    public static void main(String arg[]){
        MyHashSet obj = new MyHashSet();
        obj.add(5);
        obj.add(6);
        obj.remove(6);
        System.out.println("does it cantains 5 : "+obj.contains(5)+" , "+"does it contain 6 : "+obj.contains(6));

    }
}
class MyHashSet {
    boolean array[];

    public MyHashSet() {
        this.array = new boolean[1000001]; //1,000,001 -> 10^6+1

        
    }
    
    public void add(int key) {
        array[key] = true;
        
        
    }
    
    public void remove(int key) {
        array[key]= false;
        
        
    }
    
    public boolean contains(int key) {
            return array[key];
    }
        
    
}