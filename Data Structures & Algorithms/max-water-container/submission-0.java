class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int si =0; int ei = n-1;

        while(si<ei){
            int area = (Math.min(heights[si],heights[ei]))*(ei-si);
            maxArea = Math.max(area,maxArea);
            if(heights[si]<heights[ei]){
                si++;
            }else{
                ei--;
            }
        }
        return maxArea;
    }
}
