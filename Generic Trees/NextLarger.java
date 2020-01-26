public class Solution 
{
    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        TreeNode<Integer> large=new TreeNode<Integer>(1000);
        QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<TreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            int a=q.size();
            TreeNode<Integer> temp=null;
            for(int i=0;i<a;i++)
            {
                try{
                    temp=q.dequeue();
                }
                catch(Exception e){

                }
                if(temp.data>n)
                {
                    if(large.data>temp.data)
                        large.data=temp.data;
                }
                for(int j=0;j<temp.children.size();j++)
                {
                    q.enqueue(temp.children.get(j));
                }
            }
        }
        return large;
    }	
}