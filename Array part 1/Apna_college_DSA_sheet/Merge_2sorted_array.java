package Apna_college_DSA_sheet;

// Problem: Majority Merge 2 sorted arrays
// Difficulty: easy
// Time Complexity: O(m+n)
// Space Complexity: O(1)
import java.util.Arrays;
public class Merge_2sorted_array{
    public static void main(String arg[]){
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int n = nums2.length;
        int m = nums1.length - n;

        
        System.out.println("The  merged non decreaseing order arrary : "+Arrays.toString(merge(nums1,m,nums2,n)));
        
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m + n -1;
        while(i>=0 && j>=0){
            
            if (nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
                k--;
            }
            else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }


        }
        

        if (i==-1){
            while(j>=0){
                nums1[k--] = nums2[j--];

            }
        }

        return nums1;

        
        
    }
    
}