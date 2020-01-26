public class Solution 
{
	public static void preOrder(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
		if(root==null)
            return;    
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
	}	
}