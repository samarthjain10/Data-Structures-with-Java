public class Solution 
{
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in)
    {
		return helper(pre,in,0,pre.length-1,0,in.length-1);
	}
    public static BinaryTreeNode<Integer> helper(int[] pre,int[] in,int preS,int preE,int inS,int inE)
    {
        if(inS>inE)
            return null;
        int rootdata=pre[preS];
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
        int i=inS;
        while(i<=inE){
            if(in[i]==rootdata)
                break;
            i++;
        }
        int lis=inS;
        int lie=i-1;
        int ris=i+1;
        int rie=inE;
        
        int lps=preS+1;
        int rpe=preE;
        int ll=lie-lis+1;
        int lpe=lps+ll-1;
        int rps=lpe+1;
        
        root.left=helper(pre,in,lps,lpe,lis,lie);
        root.right=helper(pre,in,rps,rpe,ris,rie);
        return root;
    }
}



