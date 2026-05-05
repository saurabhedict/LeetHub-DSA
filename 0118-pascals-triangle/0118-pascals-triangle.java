class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> ans = new ArrayList<>(numRows);
      
       for(int i = 0; i<numRows; i++) {
        List<Integer> l = new ArrayList<>();
        for(int j = 0; j<=i; j++) {
          l.add(1);
        }
        ans.add(l);
       }

       for(int i = 0; i<numRows; i++) {
        for(int j = 1; j<i; j++) {
           ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
        }
       }
       return ans;

    }
}