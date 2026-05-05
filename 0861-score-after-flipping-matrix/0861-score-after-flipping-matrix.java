class Solution {
    public int matrixScore(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        //step 1 : leading 0's 1

        for(int i = 0; i<r; i++){

                if(grid[i][0] == 0) {
                    for(int j = 0; j<c; j++){
                    //flip the row :
                   if(grid[i][j] == 0) grid[i][j] = 1;
                   else  grid[i][j] = 0;
                }
                }
              
        }


             for(int j = 1; j<c; j++){
                    int noOfOnes = 0;
                    int noOfZeros= 0;

                for(int i = 0; i<r; i++){
                   if(grid[i][j] == 1)  noOfOnes++;
                }

                 noOfZeros = r - noOfOnes;

                  if(noOfZeros > noOfOnes){
                  for(int i = 0; i<r; i++){
                   if(grid[i][j] == 0)  grid[i][j] = 1;
                   else grid[i][j] = 0;
                }
                }
                }

               int sum = 0;
               for(int i = 0; i<r; i++){
                for(int j = c-1; j>=0; j--){
                   sum += grid[i][j] * Math.pow(2,c-j-1);
                }
               }
               return sum;
              
            }
        }
    
