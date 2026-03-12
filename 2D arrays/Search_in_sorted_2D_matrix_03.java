public class Search_in_sorted_2D_matrix_03 {
    public static void main(String arg[]){
        int matrix[][]= {
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,60}
        };

        System.out.println(searchMatrix_using_left_top_el(matrix, 5));
        System.out.println(searchMatrix_using_bottom_left_el(matrix,30));
    }

    public static boolean searchMatrix_using_left_top_el(int[][] matrix, int target) {
        int row = 0 ,  col = matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if ( matrix[row][col] == target){
                System.out.println("target found at index : ("+row+","+col+")");
                return true; 
            }
            else if (matrix[row][col] >  target){
                col--;
            }
            else{
                row++;
            }
        }

        return false;
    }

    public static boolean searchMatrix_using_bottom_left_el(int[][] matrix, int target) {
        int row = matrix.length-1 ,  col = 0;
        while(col < matrix[0].length && row >=0){
            if ( matrix[row][col] == target){
                System.out.println("target found at index : ("+row+","+col+")");
                return true; 
            }
            else if (matrix[row][col] >  target){
                row--;
            }
            else{
                col++;
            }
        }

        return false;
    }
    
}
