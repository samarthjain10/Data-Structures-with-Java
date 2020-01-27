public class Solution 
{
    static int sum=0;
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) 
    {
        if(root==null)
            return;
		replaceWithLargerNodesSum(root.right);
        root.data+=sum;
        sum=root.data;
        replaceWithLargerNodesSum(root.left);
	}
}