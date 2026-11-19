class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int si = 0;
        int ei = n-1;
        int pivot = -1;
        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(si == ei) return nums[si];
            if(nums[mid]<nums[n-1]){
                //pivot = nums[mid];
                ei = mid;
            }else{
                si = mid+1;
            }
        }
        return pivot;
    }
    
}
