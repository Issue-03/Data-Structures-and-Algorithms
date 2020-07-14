// Right View: Printing Right View of the Binary Tree is similar to the above approach of printing the 
// Left view of the tree. The idea is to print the last node present at every level. So, perform a level order 
// traversal using a delimeter to identify levels and print the last node present at every level.

void rightView(Node root) {
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
                if(temp.right!=null)
                q.add(temp.right);
                if(temp.left!=null) 
                q.add(temp.left);

                q.remove();

                temp = q.peek();
            }
            q.add(null);
        }
        q.remove();
    }


}