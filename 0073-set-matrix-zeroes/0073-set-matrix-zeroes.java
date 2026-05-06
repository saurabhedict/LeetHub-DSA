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
// } //worst method : M1 : m*n





// class Solution {
//     public void setZeroes(int[][] arr) {
//         int r = arr.length; 
//         int c = arr[0].length;
//          boolean[] row = new boolean[r];
//          boolean[] col = new boolean[c];

//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 if(arr[i][j] == 0) {
//                     row[i] = true;
//                     col[j] = true;
//                 }
//             }
//         }

//         for(int i = 0; i<r; i++){
//             for(int j = 0; j<c; j++){
//                 if(row[i] == true || col[j] == true){
//                     arr[i][j] = 0;
//                 }
//             }
//         }

//     }
// } //M2 : m+n





class Solution {
    public void setZeroes(int[][] arr) {
        int r = arr.length; 
        int c = arr[0].length;
        boolean r1 = false;
        boolean c1 = false;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(i == 0 || j == 0){
                    if(i == 0 && arr[i][j] == 0) r1 = true;
                    if(j == 0 && arr[i][j] == 0) c1 = true;
                }
            }
        }

        for(int i = 1; i<r; i++){
            for(int j = 1; j<c; j++){
                 if(arr[i][j] == 0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                 }
            }
        }

        for(int i = 1; i<r; i++){
            for(int j = 1; j<c; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        if(r1 == true){
            for(int i = 0; i<1; i++){
            for(int j = 0; j<c; j++){
                arr[0][j] = 0;
            }
        }
        }

        if(c1 == true){
            for(int i = 0; i<r; i++){
            for(int j = 0; j<1; j++){
                arr[i][0] = 0;
            }
        }
        }

    }
} //M2 : m+n