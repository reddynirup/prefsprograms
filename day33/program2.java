// Bheemla is working with Binary Trees.
// The elements of the tree is given in the level order format.
// He drawn the lines vertically over the binary tree.
// Bheemla likes to print the nodes of the tree line by line.

// You will be given the root of the binary tree.
// Your task is to help Bheemla to print the nodes according to his wish. 
// Look at the hint for understanding.

// Your task is to implement the class Solution:
// 	- public List<List<Integer>> printTheLines(Node root):
// 	return the list of node values.
	
// NOTE: 
// - Please do consider the node with data '-1' as null node 
// in the given trees.
// - Sort the values in each inner list.

// Input Format:
// -------------
// Space separated integers, elements of the tree.

// Output Format:
// --------------
// Print the list of list of integers


// Sample Input-1:
// ---------------
// 1 2 3 4 5 6 7

// Sample Output-1:
// ----------------
// [[4],[2],[1,5,6],[3],[7]]


// Sample Input-2:
// ---------------
// 3 2 -1 1 -1 4 5

// Sample Output-2:
// ----------------
// [[4],[1],[2,5],[3]]


import java.util.*;

/*
    --Structure of Node for your reference.
    class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }
*/

class Solution {
    void find(Node root,int l,TreeMap<Integer,List<Integer>> hm){
        if(root==null)return;
        if(root.data==-1)return;
        
        if(!hm.containsKey(l)){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            temp.add(root.data);
            hm.put(l,temp);
        }
        else{
            hm.get(l).add(root.data);
        }
        find(root.left,l-1,hm);
        find(root.right,l+1,hm);
    }
    
    public List<List<Integer>> printTheLines(Node root) {
        // implement your code here.
        TreeMap<Integer,List<Integer>> hm=new TreeMap<>();
        find(root,0,hm);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i:hm.keySet()){
            Collections.sort(hm.get(i));
            ans.add(hm.get(i));
        }
        return ans;
        
    }
}
