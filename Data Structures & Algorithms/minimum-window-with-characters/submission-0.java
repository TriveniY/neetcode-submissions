class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();

        HashMap<Character,Integer> windowCount = new HashMap<>();
        HashMap<Character,Integer> tCount = new HashMap<>();
        for(char ch:t.toCharArray()){
            tCount.merge(ch,1,Integer::sum);
        } 

        int reqmatches = tCount.size();
        int matches = 0;
        int left = 0;
        int bestLength = m+1;
        int bestStart = 0;
        for(int right=0;right<m;right++){
            char ch = s.charAt(right);
            windowCount.merge(ch,1,Integer::sum);

            if(tCount.containsKey(ch) && windowCount.get(ch).intValue() == tCount.get(ch).intValue()){
                matches++;
            }

            while(matches == reqmatches){
                if(right-left+1<bestLength){
                    bestStart = left;
                    bestLength = right-left+1;
                }
                
                char leftChar =  s.charAt(left);
                windowCount.merge(leftChar,-1,Integer::sum);
                if(tCount.containsKey(leftChar) && windowCount.get(leftChar).intValue()<tCount.get(leftChar).intValue()){ 
                     matches--;
                }
                left++;
            }
        }
        return bestLength==m+1?"":s.substring(bestStart,bestStart+bestLength);
    }
}
