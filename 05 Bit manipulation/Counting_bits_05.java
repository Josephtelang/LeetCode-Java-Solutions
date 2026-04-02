// Problem: Counting bits 
// leetCode: 338
// Difficulty: easy
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class Counting_bits_05 {
    public static void main(String arg[]){
        System.out.println(Arrays.toString(countBits(5)));


    }
    public static int[] countBits(int n) {
        int ans[] = new int[n+1];
        for (int i =0 ; i<= n; i++){
            ans[i] = ans[i>>1] + (i & 1);

        }
        return ans;
        
    }
    
}
