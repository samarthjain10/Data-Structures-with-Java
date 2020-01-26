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

	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        if(root==null)
            return null;
        else if(root.data==k)
            return root;
        
        BinaryTreeNode<Integer>temp1=searchInBST(root.left,k);
        BinaryTreeNode<Integer>temp2=searchInBST(root.right,k);
        if(temp1==null)
            return temp2;
        else
            return temp1;
	}
}