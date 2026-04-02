// Problem: Missing number 
// leetCode: 268  ->  Amazon, Microsoft
// Difficulty: easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Missing_number_06 {
    public static void main(String arg[]){
        int arr[] = {3,0,1};
        System.out.println("The missing number from array is : "+missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {
        int result = 0;
        int n = nums.length;
        for (int i=0  ; i<n ; i++){
            result ^= nums[i] ^ i;

        }  
        result ^= n;
        return result;    
    }
    
}
