class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int longest = 0;
        for(int i =0;i<n;i++){
            int element = nums[i];
            if(!hs.contains(element-1)){
                int len = 1;
                while(hs.contains(element+1)){
                    len++;
                    element++;
                }
                longest = Math.max(longest,len);
            }
        }
        return longest;
    }
}
