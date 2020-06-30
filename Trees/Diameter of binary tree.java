// Given a Binary Tree, find diameter of it.
// +The diameter of a tree is the number of nodes on the longest path between two leaves in the tree.
// The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest
// path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).

class Tree {

  /* Complete the function to get diameter of a binary tree */
  int diameter(Node root) {
    // Your code here
    if (root == null) return 0;
    /* get the height of left and right sub trees */
    int lheight = height(root.left);
    int rheight = height(root.right);

    /* get the diameter of left and right subtrees */
    int ldiameter = diameter(root.left);
    int rdiameter = diameter(root.right);

    return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
  }

  static int height(Node node) {
    /* base case tree is empty */
    if (node == null) return 0;

    /* If tree is not empty then height = 1 + max of left
           height and right heights */
    return (1 + Math.max(height(node.left), height(node.right)));
  }
}
