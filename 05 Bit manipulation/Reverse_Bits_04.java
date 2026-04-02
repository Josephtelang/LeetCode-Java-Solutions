// Problem: Reverse bit 
// Difficulty: easy
// Time Complexity: O(1)
// Space Complexity: O(1)

public class Reverse_Bits_04 {
    public static void main(String arg[]){
        int n = 43261596;
        System.out.println("The reverse of "+n+" in binary is : "+reverseBits(n));

    }
    public static int reverseBits(int n) {
        int total_result =0 ;
        for (int i=0 ; i<32 ; i++){
            int result = n & 1;
            total_result <<= 1;
            total_result |= result;
            n >>= 1;

            
        }
        return total_result;
        
    }
    
}
