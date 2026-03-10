// Problem: Majority Element Boyer more voting
// Difficulty: medium
// Time Complexity: O(n)
// Space Complexity: O(1)

package Apna_college_DSA_sheet;
public class Majority_Element{
    public static void main(String arg[]){
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement_Boyer_more_voting(arr));
    }
    public static int majorityElement(int[] nums) {
        
        int appearence = nums.length/2;
        if (nums.length == 1){
            return nums[0];
        }
        
        for (int i=0 ; i<nums.length-1 ; i++){
            int count = 0;
            for (int k = i ; k<nums.length ; k++){
                if(nums[i] == nums[k]){
                    count ++;
                }
            }
            if (count > appearence){
                return nums[i];
                
            }


        }
        return -1;
        
    }

     public int majorityElement_un_optimize(int[] nums) {
        int apperance = nums.length/2;
        for (int i =0 ; i<nums.length ; i++){
            int low = 0;
            int high = nums.length-1;
            int count =0;

            while(low < high){
                if (nums[low]==nums[i]){
                    count++;
                }
                if (nums[high]==nums[i]){
                    count++;
                }
                low++;
                high--;

            }
            if(low==high){
                if (nums[low]==nums[i]){
                    count++;
                }
            }
            if(apperance < count){
                return nums[i];
            }
        }

        return -1;

        
    }

    public static int majorityElement_Boyer_more_voting(int[] nums) {
        int appearance = nums.length/2;
        int candidate = nums[0];
        int count =0 ;
        for (int i =0 ; i<nums.length ; i++){
            if(nums[i] == candidate){
                count ++;
            }
            else{
                count --;
            }
            if(count == 0){
                candidate = nums[i];
                count ++;
            }

        }
        
        int freq=0;
        for (int num : nums){
            if (num == candidate){
                freq++;
            }
        }

        if (freq > appearance){
            return candidate;
        }
        return -1;
        
    }
}