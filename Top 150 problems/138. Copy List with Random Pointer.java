
class Solution {
    public Node copyRandomList(Node head) {
        Node curNode = head; 
    HashMap<Node, Node> deepCopy = new HashMap<>();
	
    while(curNode != null) {
        deepCopy.put(curNode, new Node(curNode.val));
        curNode = curNode.next;
    }
    
    for (var entry : deepCopy.entrySet()) {
        entry.getValue().next = deepCopy.get(entry.getKey().next);
        entry.getValue().random = deepCopy.get(entry.getKey().random);
    }
    
    return deepCopy.get(head);
    }
}