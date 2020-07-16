// Given a Binary Tree, find vertical sum of the nodes that are in same vertical line. Print all sums through different
// vertical lines starting from left-most vertical line to right-most vertical line.

// Example:
// Input:
// 2
// 1 2 3 4 5 6 7
// 5 2 3 1 7 6 N
// Output:
// 4 2 12 3 7
// 1 2 18 3

/*Complete the function below
Node is as follows:
class Node{
int data;
Node left, right;
Node(int item)
{
    data = item;
    left = right = null
}
}
*/
class Tree {

  public ArrayList<Integer> verticalSum(Node root) {
    // add your code here
    ArrayList<Integer> result = new ArrayList<Integer>();
    if (root == null) return new ArrayList<Integer>();

    TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

    verticalSumUtil(root, 0, treeMap);

    if (treeMap != null) {
      for (Map.Entry ele : treeMap.entrySet()) {
        result.add((Integer) ele.getValue());
      }
    }
    return result;
  }

  private void verticalSumUtil(
    Node root,
    int hD,
    TreeMap<Integer, Integer> hM
  ) {
    // base case
    if (root == null) return;

    // Store the values in hM for left subtree
    verticalSumUtil(root.left, hD - 1, hM);

    // Update vertical sum for hD of this node
    int prevSum = (hM.get(hD) == null) ? 0 : hM.get(hD);
    hM.put(hD, prevSum + root.data);

    // Store the values in hM for right subtree
    verticalSumUtil(root.right, hD + 1, hM);
  }
}
