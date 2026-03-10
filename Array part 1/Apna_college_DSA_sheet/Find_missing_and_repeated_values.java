package Apna_college_DSA_sheet;
import java.util.Arrays;

// Problem: find misssing and repeated values
// Difficulty: easy
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)
public class Find_missing_and_repeated_values{
    public static void main(String arg[]){
        int grid[][] = {{1,3},{2,2}};
        System.out.println("The missing and repeated values are : " + Arrays.toString(findMissingAndRepeatedValues(grid)));
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int freq[] = new int[n * n + 1];
        int repeated = 0, missing = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }

        }

        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == 2) {
                repeated = i;
            }
            if (freq[i] == 0) {
                missing = i;
            }
        }
        return new int[] { repeated, missing };
    }

}