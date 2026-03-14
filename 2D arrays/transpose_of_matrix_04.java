// Problem: transpose matrix
// Difficulty: easy
// Time Complexity: O(n * m)
// Space Complexity: O(n * m)


import java.util.*;

public class transpose_of_matrix_04 {
    public static void main(String arg[]){
        int matrix[][] = {
            {1,2,3},
            {4,5,6},
        };

        System.out.println("This is the transpose of matrix : "+Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m ; j++){
                transpose[j][i] = matrix[i][j];

                
            }
        }
        return transpose;
        
    }
    
}
