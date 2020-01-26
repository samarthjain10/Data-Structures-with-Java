public class Solution 
{
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x)
    {
        if(root==null)
            return false;
        else if(root.data==x)
            return true;
        boolean flag=false;
        flag=flag||isNodePresent(root.left,x);
        flag=flag||isNodePresent(root.right,x);
        return flag;
	}
}