class Solution {
    public void rotate(int[][] matrix) {
        
        int r = matrix.length;
        int c = matrix[0].length;

        for(int i = 0; i<r; i++){
            for(int j = i;  j<c; j++){
                int trans = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = trans;
            }
        }

        for(int i = 0; i<r; i++){
            swap(matrix[i]);
        }

        
    }

    public void swap(int[] arr){
        int i = 0; 
        int j = arr.length-1;
       while(i<=j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
       }
    }
}