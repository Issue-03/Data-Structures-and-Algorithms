// Given a binary tree and data value of two of its nodes. Find the number of turns needed to reach from 
// one node to another in the given binary tree. If the two nodes are in a straight line, 
// ie- the path does not involve any turns, return -1.
// Example:
// Sample Input: 
// 3
// 1 2 3
// 2 3
// 1 2 3 4 5 6 7 8 N N N 9 10 N N
// 5 10
// 1 2 3 4 5 6 7 8 N N N 9 10 N N
// 1 4

// Sample Output:
// 1 
// 4
// -1
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Tree
{
    static int Count;
    static Node lca(Node root, int n1,int n2) {
       if(root==null)
       return null;
       
       if(root.data==n1 || root.data==n2)
       return root;
       
       Node left_lca = lca(root.left,n1,n2);
       Node right_lca = lca(root.right,n1,n2);
       
       if(left_lca!=null && right_lca!=null)
       return root;
       
       return (left_lca != null) ? left_lca : right_lca;
   }
   static boolean CountTurn(Node root, int key, boolean turn) { 
        if (root == null) 
            return false; 
  
        // if found the key value in tree 
        if (root.data == key) 
            return true; 
  
        // Case 1: 
        if (turn == true) { 
            if (CountTurn(root.left, key, turn)) 
                return true; 
            if (CountTurn(root.right, key, !turn)) { 
                Count += 1; 
                return true; 
            } 
        } else // Case 2: 
        { 
            if (CountTurn(root.right, key, turn)) 
                return true; 
            if (CountTurn(root.left, key, !turn)) { 
                Count += 1; 
                return true; 
            } 
        } 
        return false; 
    } 
    static int NumberOfTurns(Node root, int first, int second)
    {
        //your code here
        Node LCA = lca(root,first,second);
        
        if(LCA==null)
        return -1;
        
        Count = 0;
        
        if(LCA.data!=first && LCA.data!=second) {
            // count number of turns needs to reached 
            // the second node from LCA 
            if (CountTurn(LCA.right, second, false) 
                    || CountTurn(LCA.left, second, true)) 
                ; 
  
            // count number of turns needs to reached 
            // the first node from LCA 
            if (CountTurn(LCA.left, first, true) 
                    || CountTurn(LCA.right, first, false)) 
                ; 
            return Count + 1; 
        }
        
        if (LCA.data == first) { 
  
            // count number of turns needs to reached 
            // the second node from LCA 
            CountTurn(LCA.right, second, false); 
            CountTurn(LCA.left, second, true); 
            return Count; 
        } else { 
  
            // count number of turns needs to reached 
            // the first node from LCA1 
            CountTurn(LCA.right, first, false); 
            CountTurn(LCA.left, first, true); 
            return Count; 
        } 
    }
}