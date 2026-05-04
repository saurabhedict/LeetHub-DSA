class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
       int minR = 0;
       int maxR = arr.length-1;
       int minC = 0;
       int maxC = arr[0].length-1;
       List<Integer> ans = new ArrayList<>();

     while(minR <= maxR && minC <= maxC){
        if(minR > maxR || minC > maxC) break;
        for(int i = minC; i<=maxC; i++){
        ans.add(arr[minR][i]);
       } minR++;

       if(minR > maxR || minC > maxC) break;
       for(int i = minR; i<=maxR; i++){
        ans.add(arr[i][maxC]);
       } maxC--;

       if(minR > maxR || minC > maxC) break;
       for(int i = maxC; i>=minC; i--){
        ans.add(arr[maxR][i]);
       } maxR--;

       if(minR > maxR || minC > maxC) break;
       for(int i = maxR; i>=minR; i--){
        ans.add(arr[i][minC]);
       } minC++;
     }
     return ans;

    }
}