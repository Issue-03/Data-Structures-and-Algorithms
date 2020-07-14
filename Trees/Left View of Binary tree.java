// Left View: A simple solution is to notice that the nodes appearing in the left view of the binary tree are 
// the first nodes at every level. So, the idea is to do a level order traversal of the binary tree using a 
// marker to identify levels and print the first node at every level.

void leftView(Node root) {
    if(root==null)
    return;

    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()) {
        Node temp = q.peek();
        if(temp!=null) {
            System.out.print(temp.data," ");
            while(q.peek()!=null) {
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null) 
                q.add(temp.right);

                q.remove();

                temp = q.peek();
            }
            q.add(null);
        }
        q.remove();
    }


}