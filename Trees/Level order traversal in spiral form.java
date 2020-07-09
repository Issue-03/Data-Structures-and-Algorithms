// Complete the function to print spiral order traversal of a tree.
// For below tree, function should print 1, 2, 3, 4, 5, 6, 7.

// Example:
// Input:
// 2
// 1 3 2
// 10 20 30 40 60
// Output:
// 1 3 2
// 10 20 30 60 40

/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Spiral {

  void printSpiral(Node node) {
    if (node == null) return;

    Stack<Node> s1 = new Stack<Node>();
    Stack<Node> s2 = new Stack<Node>();

    s1.push(node);

    while (!s1.isEmpty() || !s2.isEmpty()) {
      while (!s1.isEmpty()) {
        Node temp = s1.peek();
        s1.pop();
        System.out.print(temp.data + " ");

        if (temp.right != null) s2.push(temp.right);

        if (temp.left != null) s2.push(temp.left);
      }

      while (!s2.isEmpty()) {
        Node temp = s2.peek();
        s2.pop();
        System.out.print(temp.data + " ");

        if (temp.left != null) s1.push(temp.left);

        if (temp.right != null) s1.push(temp.right);
      }
    }
  }
}
