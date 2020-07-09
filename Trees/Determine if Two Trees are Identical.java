// Given two binary trees, the task is to find if both of them are identical or not.
// Example:
// Input:
// 3
// 1 2 3
// 1 2 3
// 1 2 3
// 1 3 2
// 1 2 3 N 3 N 10
// 1 2 3 N 3 N 10
// Output:
// Yes
// No
// Yes

/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

*/
/* Should return true if trees with roots as root1 and 
   root2 are identical */

class Tree {

  boolean isIdentical(Node root1, Node root2) {
    if (root1 == null && root2 == null) return true;

    if (root1 != null && root2 != null) return (
      root1.data == root2.data &&
      isIdentical(root1.left, root2.left) &&
      isIdentical(root1.right, root2.right)
    );

    return false;
  }
}
