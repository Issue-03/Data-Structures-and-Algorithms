// Given a binary tree, print preorder traversal of it.
// Example:
// Input:
// 2
// 1 4 N 4 2
// 6 3 2 N 1 2
// Output:
// 1 4 4 2
// 6 3 1 2 2

// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }

class BinaryTree {

  static ArrayList<Integer> preorder(Node root) {
    ArrayList<Integer> preorder = new ArrayList<Integer>();
    preorderUtil(root, preorder);
    return preorder;
  }

  static void preorderUtil(Node root, ArrayList<Integer> preorder) {
    if (root == null) return;

    preorder.add(root.data);
    preorderUtil(root.left, preorder);
    preorderUtil(root.right, preorder);
  }
}
