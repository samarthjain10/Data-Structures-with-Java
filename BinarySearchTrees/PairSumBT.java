import java.util.ArrayList;
class Solution 
{
    public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) 
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        helper(root,al);
        for(int i=0;i<al.size();i++)
        {
            for(int j=i+1;j<al.size();j++)
            {
                if(al.get(i)+al.get(j)==sum)
                {
                    if(al.get(i)<al.get(j))
                        System.out.println(al.get(i)+" "+al.get(j));
                    else
                        System.out.println(al.get(j)+" "+al.get(i));
                }
            }
        }
    }
    public static void helper(BinaryTreeNode<Integer> root, ArrayList<Integer> al)
    {
        if(root==null)
            return;
        else
            al.add(root.data);
        helper(root.left,al);
        helper(root.right,al);
    }
}