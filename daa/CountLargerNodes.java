/*
Given a binary tree root, a node X in the tree is named Great if in the path 
from root to X there are no nodes with a value greater than X.

Return the number of Great nodes in the binary tree.

You will be given root node of a binary tree return total number of nodes which satisfies above statement.
Input format: space seperated integers
output format: an integer

Example 1:
input=3 1 4 3 -1 1 5
output=4

Explanation: 
Root Node (3) is always a Great node.
Node 4 -> (3,4) is the maximum value in the path starting from the root.
Node 5 -> (3,4,5) is the maximum value in the path
Node 3 -> (3,1,3) is the maximum value in the path.

Example 2:
input= 3 5 1 6 2 9 8 -1 -1 7 4
output=6.
*/



import java.util.*;
class BinaryTreeNode 
{
    public Integer data;
    public BinaryTreeNode left, right;
	public BinaryTreeNode(Integer data) 
	{
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution 
{
    public int greatNodes(BinaryTreeNode root) 
	{
        return greatNodes(root,0,Integer.MIN_VALUE);
    }

    private void greatNodes(BinaryTreeNode root, int count, int max)
	{
        if(root==null || root.data==-1){
            return;
        }
        
        if(root.data>=max){
            count++;
        }
        max=Math.max(max,root.data);
        greatNodes(root.left,count,max);
        greatNodes(root.right,count,max);
    }
}

class countLargerNodes {
    static BinaryTreeNode root;
    void insert(BinaryTreeNode temp, Integer key) {
        if (temp == null) {
            root = new BinaryTreeNode(key);
            return;
        }
		Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(temp);
        // Do level order traversal until we find an empty place.
        while (!q.isEmpty()) {
            temp = q.remove();
            if (temp.left == null) {
				if (key != null ) {
                    temp.left = new BinaryTreeNode(key);
                }
                break;
            } else {
                q.add(temp.left);
            }
            if (temp.right == null) {
				if (key != null) {
                    temp.right = new BinaryTreeNode(key);
                }
                break;
            } else {
                q.add(temp.right);
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        countLargerNodes st = new countLargerNodes();
        BinaryTreeNode root1 = new BinaryTreeNode(Integer.parseInt(str[0]));
        for (int i = 1; i < str.length; i++) 
            st.insert(root1, Integer.parseInt(str[i]));
        Solution sol = new Solution();
        System.out.println(sol.greatNodes(root1));
    }
}