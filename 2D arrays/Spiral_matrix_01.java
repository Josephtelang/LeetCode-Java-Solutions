// Problem: Spiral matrix
// Difficulty: medium
// Time Complexity: O(n * m)
// Space Complexity: O(n * m)


import java.util.*;
public class Spiral_matrix_01 {

    public static void main(String arg[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        int matrix2[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        System.out.println(spiralOrder(matrix2));


    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int start_row = 0;
        int start_col =0;
        int end_row= matrix.length-1;
        int end_col= matrix[0].length-1;

        List<Integer> result = new ArrayList<>();

        while(start_row <= end_row && start_col <= end_col){
            // top
            for (int j =start_col ; j<= end_col ; j++){
                result.add(matrix[start_row][j]);
            }

            // right
            for (int i=start_row +1 ; i<= end_row ; i++){
         
                result.add(matrix[i][end_col]);
            }

            // bottom
            for (int j = end_col -1 ; j>= start_col ; j--){
                if (start_row == end_row){
                    return result;
                }
        
                result.add(matrix[end_row][j]);
            }

            // left
            for (int i = end_row -1 ; i>= start_row+1 ; i-- ){
                if (start_col == end_col){
                    return result;
                }
                
                result.add(matrix[i][start_col]);
            }
            start_row ++;
            start_col ++;
            end_row --;
            end_col --;
        }
       
        return result;
        
    }
    
}
