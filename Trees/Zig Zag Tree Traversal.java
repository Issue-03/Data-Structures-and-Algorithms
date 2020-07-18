// Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.
// Example:
// Input:
// 2
// 3 2 1
// 7 7 9 8 8 6 N 10 9
// Output:
// 3 1 2
// 7 9 7 8 8 6 9 10

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
// Print the zig zag traversal of tree.
class GFG {

  // return an array containing the zig zag level order traversal of the given tree
  ArrayList<Integer> zigZagTraversal(Node root) {
    //Add your code here.
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) return result;

    Stack<Node> currentLevel = new Stack<Node>();
    Stack<Node> nextLevel = new Stack<Node>();

    currentLevel.push(root);
    boolean leftToRight = true;

    while (!currentLevel.isEmpty()) {
      Node temp = currentLevel.pop();

      result.add(temp.data);

      if (leftToRight) {
        if (temp.left != null) nextLevel.push(temp.left);
        if (temp.right != null) nextLevel.push(temp.right);
      } else {
        if (temp.right != null) nextLevel.push(temp.right);
        if (temp.left != null) nextLevel.push(temp.left);
      }

      if (currentLevel.isEmpty()) {
        leftToRight = !leftToRight;
        Stack<Node> tempStack = currentLevel;
        currentLevel = nextLevel;
        nextLevel = tempStack;
      }
    }
    return result;
  }
}
