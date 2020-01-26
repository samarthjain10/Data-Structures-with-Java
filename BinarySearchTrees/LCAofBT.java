public class Solution 
{
	public static int lcaBinaryTree(BinaryTreeNode <Integer> root , int a, int b)
    {
		if(root==null)
            return -1;
        if(root.data==a||root.data==b)
            return root.data;
        int c=lcaBinaryTree(root.left,a,b);
        int d=lcaBinaryTree(root.right,a,b);
        if(c==-1&&d==-1)
            return -1;
        else if(c==-1)
            return d;
        else if(d==-1)
            return c;
        else
            return root.data;
	}
    
    
    
}