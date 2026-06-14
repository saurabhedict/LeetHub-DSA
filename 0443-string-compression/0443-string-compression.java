// class Solution {
//     public int compress(char[] chars) {
//         int n = chars.length;
//         String s = "";

//         int i = 0;
//         int j = i+1;
//         int count = 1;
//         while(i<n && j<n){
//            if(chars[i] == chars[j]) {
//             count++;
//             j++;
//            }
//            else{
//            s = s + chars[i];
//            if(count != 1) s = s + count;
//            count = 1;
//             i = j;
//             j++;
//            }
//         }
//            s = s + chars[i];
//            if(count != 1) s = s + count;

//            for(int k = 0; k<s.length(); k++){
//               chars[k] = s.charAt(k);
//            }

//             return s.length();
//     }
// }


class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        StringBuilder s = new StringBuilder();

        int i = 0;
        int j = i+1;
        int count = 1;
        while(i<n && j<n){
           if(chars[i] == chars[j]) {
            count++;
            j++;
           }
           else{
           s.append(chars[i]);
           if(count != 1) s.append(count);
           count = 1;
            i = j;
            j++;
           }
        }
           s.append(chars[i]);
           if(count != 1) s.append(count);

           for(int k = 0; k<s.length(); k++){
              chars[k] = s.charAt(k);
           }

            return s.length();
    }
}