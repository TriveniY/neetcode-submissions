class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(String word : strs){

            int[] freq = new int[26];
            for(char ch : word.toCharArray()){
                freq[ch-'a']++;
            }

            StringBuilder keyBuilder = new StringBuilder();
            for(int i =0;i<26;i++){
                if(freq[i]>0){
                    keyBuilder.append(i+'a').append(':').append(freq[i]).append(',');
                }
            }
            String key = keyBuilder.toString();
            hm.putIfAbsent(key, new ArrayList<String>());
            hm.get(key).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
