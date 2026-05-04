class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int ans[][] = new int[c][r];

        for(int j = 0; j<c; j++) {
            for(int i = 0; i<r; i++){
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }
}


// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;

//         // int ans[][] = new int[c][r];

//         for(int i = 0; i<c; i++) {
//             for(int j = i; j<r; j++){
//                int trans = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = trans;
//             }
//         }

//         return matrix;
//     }
// } //work only for squre matrix