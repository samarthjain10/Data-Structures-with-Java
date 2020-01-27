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

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        return largestBSTSubtree(root,0);
    }
    public static int largestBSTSubtree(BinaryTreeNode<Integer> root,int max) {
        if(root==null)
            return 1;
        boolean c=isBST(root.left,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(c==true)
        {
            int a=height(root.left,0);
            if(a>max)
                max=a;
        }
        boolean d=isBST(root.right,Integer.MIN_VALUE,Integer.MAX_VALUE);
        if(d==true)
        {
            int b=height(root.right,0);
            if(b>max)
                max=b;
        }
        int e=largestBSTSubtree(root.left,max);
        int f=largestBSTSubtree(root.right,max);
        if(e>max)
            max=e;
        if(f>max)
            max=f;
        return max;
    }
    public static int height(BinaryTreeNode<Integer> root,int count) {
        if(root==null)
            return count;
        int a=height(root.left,count+1);
        int b=height(root.right,count+1);
        if(a>b)
            return a;
        else
            return b;
    }
    public static boolean isBST(BinaryTreeNode<Integer> root,int min,int max) {
        if(root==null)
            return true;
        else if(root.data<min||root.data>max)
            return false;
        boolean flag1=isBST(root.left,min,root.data);
        boolean flag2=isBST(root.right,root.data,max);
        return flag1&&flag2;
    }
}







