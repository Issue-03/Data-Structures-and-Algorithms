void topView(Node root) {
    class NodeHd {
        Node node;
        int hd; // horizontal distance

        NodeHd(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    if(root==null)
    return;

    Queue<NodeHd> q = new LinkedList<NodeHd>();
    Map<Integer, Node> topViewMap = new HashMap<Integer, Node>();
    q.add(new NodeHd(root, 0));

    while(!q.isEmpty()) {
        NodeHd temp = q.poll();
        if(!topViewMap.containsKey(temp.hd))
        topViewMap.put(temp.hd, temp.root);

        if(temp.node.left!=null)
        q.add(new NodeHd(temp.node.left, temp.hd - 1));

        if(temp.node.right!=null)
        q.add(new NodeHd(temp.node.right, temp.hd + 1));
    }
    for(Entry<Integer, Node> entry : topViewMap.entrySet()) { 
            System.out.print(entry.getValue().data); 
    }
}