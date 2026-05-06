// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int r = matrix.length;
//         int c = matrix[0].length;

//        boolean flag = false;
//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 if(matrix[i][j] == target) {
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag == true) break;
//         }
//         if(flag == true) return true;
//         return false;
//     }
// }



class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;

        int i = 0;
        int j = c-1;

        while(i<r && j>= 0){
            if(matrix[i][j] == target) return true;

            else if(matrix[i][j] > target){
                j--;
            }
            else {
               //matrix[i][j] < target
               i++;

            }
        }
        return false;
    }
}