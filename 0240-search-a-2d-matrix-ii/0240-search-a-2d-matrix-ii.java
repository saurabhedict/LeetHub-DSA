class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

       boolean flag = false;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == target) {
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }
        if(flag == true) return true;
        return false;
    }
}