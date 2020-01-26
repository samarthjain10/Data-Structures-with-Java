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
	public static int height(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return helper(root,0);
	}
    
	public static int helper(BinaryTreeNode<Integer> root,int count) {
        if(root==null)
            return count;
        count++;
        int a=helper(root.left,count);
        int b=helper(root.right,count);
        if(a>b)
            count=a;
        else
            count=b;
        return count;
    }
}
