// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//      List<List<Integer>> ans = new ArrayList<>(numRows);
      
//        for(int i = 0; i<numRows; i++) {
//         List<Integer> l = new ArrayList<>();
//         for(int j = 0; j<=i; j++) {
//           l.add(1);
//         }
//         ans.add(l);

//         for(int j = 1; j<i; j++) {
//            ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
//         }
//        }
//        return ans;

//     }
// }




// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//      List<List<Integer>> ans = new ArrayList<>(numRows);
      
//        for(int i = 0; i<numRows; i++) {
//         List<Integer> l = new ArrayList<>();
//         for(int j = 0; j<=i; j++) {
//           l.add(1);
//         }
//         ans.add(l);

//         for(int j = 1; j<i; j++) {
//            ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
//         }
//        }
//        return ans;

//     }
// }



class Solution {
    public List<List<Integer>> generate(int numRows) {
     List<List<Integer>> ans = new ArrayList<>(numRows);
      
       for(int i = 0; i<numRows; i++) {

        List<Integer> l = new ArrayList<>();

        for(int j = 0; j<=i; j++) {
         if(j == 0 || j == i) l.add(1);
         else{
             l.add(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
         }
        }
        ans.add(l);
       }
       return ans;

    }
}