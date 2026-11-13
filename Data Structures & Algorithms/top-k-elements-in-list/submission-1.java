class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        ArrayList<Integer>[] buckets = new ArrayList[n+1];
        for(int i =1;i<=n;i++){
            buckets[i] = new ArrayList<>();
        }
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i =0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for(int i =n;i>0 && index<k;i--){
            for(int num:buckets[i]){
                res[index] = num;
                index++;
                if(index==k) break;
            }
        }
        return res;
    }
}
