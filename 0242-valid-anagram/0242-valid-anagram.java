class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] ch = s.toCharArray();
        char[] kh = t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(kh);

        if(ch.length != kh.length) return false;
        for(int i = 0; i<ch.length; i++){
            if(ch[i] != kh[i]) return false;
        }

        return true;
    }
}