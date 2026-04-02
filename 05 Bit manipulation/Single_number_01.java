// Problem: Single Number
// Difficulty: easy
// Time Complexity: O(n)
// Space Complexity: O(1)

public class Single_number_01 {
    public static void main(String arg[]){
        int arr[] = {4,1,2,1,2};
        System.out.println("The single number in array is : "+singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int result =0;
        int n = nums.length;
        for (int i =0 ; i<n ; i++){
            result = nums[i]^result;
        }
        return result;
 
        
    }
    
}
