class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int longestLen = 0;
        HashSet<Character> uniqueChars = new HashSet<>();
        for(int right=0;right<n;right++){
            char ch = s.charAt(right);

            //failed the condition
            while(uniqueChars.contains(ch)){
                //shrik till valid window(window contains unique elements)
                uniqueChars.remove(s.charAt(left));
                left++;
            }

            //expand window
            uniqueChars.add(ch);
            //update answer
            int len = right-left+1;
            longestLen = Math.max(longestLen,len);
        }
        return longestLen;
    }
}
