public class Solution {
    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        if(root==null)
            return null;
        else if(root.children.size()==0)
            return null;
        TreeNode<Integer> large=new TreeNode<Integer>(Integer.MIN_VALUE);
        TreeNode<Integer> small=new TreeNode<Integer>(Integer.MIN_VALUE);
        QueueUsingLL<TreeNode<Integer>> q=new QueueUsingLL<TreeNode<Integer>>();
        q.enqueue(root);
        while(!q.isEmpty())
        {
            TreeNode<Integer> temp=null;
            try{
                temp=q.dequeue();
            }
            catch(Exception e){

            }
            if(temp.data>large.data)
            {
                small.data=large.data;
                large.data=temp.data;   
            }
            else if(temp.data<large.data&&temp.data>small.data)
                small.data=temp.data;
            for(int j=0;j<temp.children.size();j++)
                q.enqueue(temp.children.get(j));
        }
        return small;
    }	
}