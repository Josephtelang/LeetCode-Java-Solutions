// Problem: Single Number
// leetCode: 191   
// Difficulty: easy
// Time Complexity: O(n) and for optimized code O(k) -> k number of 1's in num
// Space Complexity: O(1)


public class Number_of_1_bits_02 {
    public static void main(String arg[]){
        int num = 12;
        System.out.println("The total number of ones in number is : "+hammingWeight(num));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        // int bitmask = 1;
        // while(n!=0){
        //     if((n & bitmask) !=0){
        //         count++;
        //     }
        //     n = n >> 1;
        // }
        

        //Optimized one 
        while(n!=0){
            n = n & (n-1);
            count++;
        }
        
        return count;
    }
    
}
