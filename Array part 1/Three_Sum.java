// Problem: threeSum
// Difficulty: hard
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Three_Sum{
    public static void main(String arg[]){
        int arr[] = {-1,0,1,2,-1,-4};

        System.out.println("The result of 3Sum is : "+threeSum(arr));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        Arrays.sort(nums);
        for(int i= 0 ; i<nums.length-2; i++){
            int high = nums.length-1;
            int low = i+1;

            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> triplet = Arrays.asList(nums[i],nums[low],nums[high]);
                    results.add(triplet);
                    low ++;
                    high --;

                }
                else if(sum<0){
                    low ++;
                }
                else{
                    high --;
                }
            }
    
        }
        return new ArrayList<>(results);
        
    }

}