/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        HashMap<Integer,Node> hm = new HashMap<>();
        dfs(node,hm);
        return hm.get(node.val);
    }
    public void dfs(Node node, HashMap<Integer,Node> hm){
        Node clone = new Node();

        clone.val = node.val;
        clone.neighbors = new ArrayList<>();

        hm.put(clone.val,clone);

        for(Node child:node.neighbors){
            if(!hm.containsKey(child.val)){
                dfs(child,hm);
            }
            clone.neighbors.add(hm.get(child.val));
        }      
    } 
}