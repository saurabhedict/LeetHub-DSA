class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();

        char[] freqS = new char[128];
        char[] freqT = new char[128];

        boolean ans1 = true;
        boolean ans2 = true;

        for(int i = 0; i<n1; i++){
          int num = (int)(s.charAt(i));
          if(freqS[num] == '\u0000' || freqS[num] == t.charAt(i)){
            freqS[num] = t.charAt(i);
          }
          else ans1 = false;
        }
         
         for(int i = 0; i<n2; i++){
          int num = (int)(t.charAt(i));
          if(freqT[num] == '\u0000' || freqT[num] == s.charAt(i)){
            freqT[num] = s.charAt(i);
          }
          else ans2 = false;
        }

        return (ans1 && ans2);
    }
}