import java.util.ArrayList;


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

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		// Write your code here
        remove(root);
        return root;
	}
    public static BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root){
        if(root==null)
            return null;
        else if(root.left==null&&root.right==null)
            return null;
        root.left=remove(root.left);
        root.right=remove(root.right);
        return root;
    }


}
