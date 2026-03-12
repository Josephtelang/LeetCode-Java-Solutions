// Problem: Trapping-rainwater
// Difficulty: medium 
// Time Complexity: O(n)
// Space Complexity: O(n)

public class Trapping_rainwater_02 {
    public static void main(String arg[]){
        int hight[] = {4,2,0,3,2,5};
        System.out.println("The total trapped water is : "+trap(hight));
    }
    public static int trap(int[] height) {
        int n = height.length;
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for (int i =1; i<n ; i++){
            left_max[i] = Math.max(left_max[i-1],height[i]);
        }

        int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for (int i=n-2 ; i>=0 ; i--){
            right_max[i] = Math.max(right_max[i+1],height[i]);
        }
        
        int total_trapped_water = 0;
        for (int i=0 ; i<n ; i++){
            int water_level = Math.min(left_max[i],right_max[i]) - height[i];
            total_trapped_water += water_level;
        }

        return total_trapped_water;
        
    }
}