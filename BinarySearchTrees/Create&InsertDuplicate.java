public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/ 
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		// Write your code here
		if(root==null)
            return;
        BinaryTreeNode<Integer> temp=new BinaryTreeNode<Integer>(root.data);
        temp.left=root.left;
        root.left=temp;
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
	}
}
