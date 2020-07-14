void topView(Node root) {
    if(root==null)
    return;

    Queue<Node> q = new LinkedList<Node>();
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    q.add(root);
    // horizontal distance
    int hd = 0;
    root.hd = hd;

    while(!q.isEmpty()) {
        hd = root.hd;
        if(m.get(hd)==null)
        m.put(hd, root.data);

    }
}