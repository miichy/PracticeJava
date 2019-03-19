package searchMatrix;

public class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        if (row <= 0){
            return false;
        }

        int m = 0;
        int n = matrix[0].length - 1;

        while (n >= 0 && m < matrix.length){
            if (matrix[m][n] == target){
                return true;
            } else if(matrix[m][n] < target){
                m++;
            } else {
                n--;
            }
        }

        return false;
    }

}
