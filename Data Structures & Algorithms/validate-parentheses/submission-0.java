class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(']','[');
        hm.put(')','(');
        hm.put('}','{');

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && hm.containsKey(ch) && stack.peekLast() == hm.get(ch)){
                stack.removeLast();
            }else{
                stack.offerLast(ch);
            }
        }

        return stack.isEmpty();
    }
}
