public class Solution 
{
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2)
    {
        boolean flag=true;
        if(root1==null&&root2!=null||root2==null&&root1!=null)
            return false;
        else if(root1.data!=root2.data)
            return false;
        else if(root1==null&&root2==null)
            return true;
        for(int i=0;i<root1.children.size();i++)
        {
            flag=flag&&checkIdentical(root1.children.get(i),root2.children.get(i));
        }
        return flag;
	}	
}