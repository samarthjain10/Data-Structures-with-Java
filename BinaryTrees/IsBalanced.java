public class Solution {

    /*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

    public static boolean checkBalanced(BinaryTreeNode<Integer> root){
        if(root==null)
            return true;
        int a=height(root.left,0);
        int b=height(root.right,0);
        if(a-b>1||b-a>1)
            return false;
        else
        {
            boolean flag1=checkBalanced(root.left);
            flag1=flag1&&checkBalanced(root.right);
            return flag1;
        }
    }
    public static int height(BinaryTreeNode<Integer> root,int count) {
        if(root==null)
            return count;
        count++;
        int a=height(root.left,count);
        int b=height(root.right,count);
        if(a>b)
            count=a;
        else
            count=b;
        return count;
    }


}
