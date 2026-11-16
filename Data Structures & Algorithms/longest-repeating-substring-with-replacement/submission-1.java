class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int[] freq = new int[26];
        int len = 0;
        int longestlen = 1;
        for(int right =0;right<n;right++){
            char ch = s.charAt(right);
            freq[ch-'A']++;
            int maxFreq = getMaxFreq(freq);
            int windowLength = right-left+1;
            
            while((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            len = right-left+1;
            longestlen = Math.max(longestlen,len);
        }
        return longestlen;
    }
    public int getMaxFreq(int[] freq){
        int maxCount = 0;

        for(int count:freq){
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
