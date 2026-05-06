// class Solution {
//     public void setZeroes(int[][] arr) {
//         int r = arr.length; 
//         int c = arr[0].length;
//         int[][] brr = new int[r][c];

//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 brr[i][j] = arr[i][j];
//             }
//         }//helper array

//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 if(brr[i][j] == 0){
//                     for(int k = 0; k<c; k++){
//                         arr[i][k] = 0;
//                     }
//                     for(int l = 0; l<r; l++){
//                         arr[l][j] = 0;
//                     }
//                 }
//             }
//         }

//     }
// } //worst method : M1


class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length; 
        int c = arr[0].length;
         boolean[] row = new boolean[r];
         boolean[] col = new boolean[c];

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(row[i] == true || col[j] == true){
                    arr[i][j] = 0;
                }
            }
        }

    }
}