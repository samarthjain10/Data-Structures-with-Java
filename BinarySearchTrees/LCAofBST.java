public class Solution 
{
	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b)
    {
		if(root==null)
            return -1;
        // if(root.data==a||root.data==b)
        //     return root.data;
        if(a<root.data&&b<root.data)
        {
            return lcaInBST(root.left,a,b);
        }
        else if(a>root.data&&b>root.data)
        {
            return lcaInBST(root.right,a,b);
        }
        // else
        // {
        //     int c=lcaInBST(root.left,a,b);
        //     int d=lcaInBST(root.right,a,b);
        //     if(c==-1&&d==-1)
        //         return -1;
        //     else if(c==-1)
        //         return d;
        //     else if(d==-1)
        //         return c;
        //     else
        // }
        return root.data;
	}
    
    
}