// The Inorder traversal of a Binary tree can either be done using recursion or with the use of an auxiliary stack.
// Threaded Binary Trees are used to make the inorder traversal faster and do it without stack and without recursion.
// A binary tree is made threaded by making all right child pointers that would normally be NULL point to the inorder
// successor of the node (if it exists).

// There are two types of threaded binary trees:
// 1. Single Threaded: Where a NULL right pointers is made to point to the inorder successor (if successor exists).
// 2. Double Threaded: Where both left and right NULL pointers are made to point to inorder predecessor and inorder
// successor respectively. The predecessor threads are useful for reverse inorder traversal and postorder traversal.

// Note: The threads are also useful for fast accessing ancestors of a node.

class ThreadedBinaryTree {

  class Node {
    int data;
    Node left, right;
    boolean rightThread;

    public Node(int item) {
      data = item;
      left = right = null;
    }
  }

  public Node leftMost(Node node) {
    if (node == null) return null;

    while (node.left != null) node = node.left;

    return node;
  }

  public void inOrder(Node root) {
    Node lmNode = leftMost(root);

    while (lmNode != null) {
      System.out.print(lmNode.data + " ");

      if (lmNode.rightThread) lmNode = lmNode.left; 
      else lmNode = leftMost(lmNode.right);
    }
  }
}
