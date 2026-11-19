class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int si = 0;
        int ei = n-1;
        int pivot = -1;
        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid]<=nums[n-1]){
                pivot = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }

        if(pivot == 0){//no rotation
            return bs(nums,0,n-1,target);
        }

        int ans = bs(nums,0,pivot-1,target);

        if(ans != -1){
            return ans;
        }

        return bs(nums,pivot,n-1,target);
    }
    public int bs(int[] nums, int si, int ei, int target){
        int ans = -1;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(nums[mid]==target){
                return mid;
            }else if (nums[mid]<target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }
}
