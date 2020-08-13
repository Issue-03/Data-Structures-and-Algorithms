// Given a Binary Search Tree. The task is to find the minimum element in this given BST.
/*class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
*/

class Tree {

  int minValue(Node node) {
    if (node == null) return -1;
    int ans = node.data;
    while (node.left != null) {
      ans = node.left.data;
      node = node.left;
    }
    return ans;
  }
}
