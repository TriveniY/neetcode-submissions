class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(uniqueElements.contains(nums[i])){
                return true;
            }
            uniqueElements.add(nums[i]);
        }
        return false;
    }
}