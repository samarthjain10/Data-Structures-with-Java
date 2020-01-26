public class Solution {

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
        return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
    public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max) {
        if(root==null)
            return true;
        else if(root.data<min||root.data>max)
            return false;
        boolean flag1=isBST(root.left,min,root.data);
        boolean flag2=isBST(root.right,root.data,max);
        return flag1&&flag2;
    }
}