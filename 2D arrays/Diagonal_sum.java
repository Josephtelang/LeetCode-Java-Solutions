// Problem: Diagonal_sum
// Difficulty: easy
// Time Complexity: brute force = O(n^2), optimize method = O()
// Space Complexity: brute force = O(1), optimize method = O()


public class Diagonal_sum {
    public static void main(String arg[]){
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        System.out.println("Sum of primary and secondary diagonal : "+diagonalSum_brute_force(matrix));

    }

    public static int diagonalSum_brute_force(int[][] mat) {
        int sum = 0;
        for (int i =0 ; i<mat.length ; i++){
            for (int j=0 ; j<mat[0].length ; j++){
                if (i==j){
                    sum += mat[i][j];
                }
                else if ( i +j == mat.length-1){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
        
    }
}
