public class question2 {

    /* Question 2
    * Sorted Matrix Search: 
    * Given an M x N matrix in which each row and each column is sorted 
    * in ascending order, write a method to find an element.
    */

    
    // 0 1 2  3  4   5
    // 1 5 7  9  10  11
    // 4 8 10 11 15  20
    // 6 9 12 17 19  21

    //IKI COZUM DUSUNDUM BIR  [i][i] gitmek, bir de sondan gitmek.
    public int findElement(int[][] matrix, int x){

        int rLength = matrix.length-1;
        int cLength = matrix[0].length-1;

        //check last elements first
        int i = 0;
        while(x > matrix[rLength][i]){
            i++;
        }
        int j = 0;
        while(x > matrix[j][0]){

        }

        return 0;
    }


    public int[] findElementSolution(int[][] matrix, int target) {
        // Check for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return null;
        }
        
        int row = 0;
        int col = matrix[0].length - 1;
        
        // Start from top-right corner and move left or down
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                // Element found, return its position
                return new int[] {row, col};
            } else if (matrix[row][col] > target) {
                // Current value is greater, so move left
                col--;
            } else {
                // Current value is smaller, so move down
                row++;
            }
        }
        
        // Element not found
        return null;
    }
}
