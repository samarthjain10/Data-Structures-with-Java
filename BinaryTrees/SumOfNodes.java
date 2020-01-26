
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
	
	public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
        if(root==null)
            return 0;    
        int sum=0;
        
        sum+=sum(root.left);
        sum+=sum(root.right);
        sum+=root.data;
        return sum;
	}
	
}
