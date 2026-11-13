class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str : strs){
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, slash));
            res.add(str.substring(slash + 1, slash + 1 + len));
            i = slash + 1 + len;
        }
        return res;
    }
}
