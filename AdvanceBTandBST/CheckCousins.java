import java.util.ArrayList;


public class solution {

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

    public static boolean cousin(BinaryTreeNode<Integer> root,int p, int q)
    {
        if(root == null)
            return false;
        if(root.left != null && root.right != null)
        {
            if(root.left.data == p && root.right.data == q)
                return true;
            else if(root.left.data == q && root.right.data == p)
                return true;
            else
                return cousin(root.left,p,q) || cousin(root.right,p,q);
            
        }
        if(root.right != null)
            return cousin(root.right,p,q);
        else
            return cousin(root.left,p,q);
    }
    public static int height(BinaryTreeNode<Integer> root, int node)
    {
        if(root == null)
            return -1;
        if(node == root.data)
            return 0;
        int left = height(root.left,node);
        if(left != -1)
            return left + 1;
        else
        {
            int right = height(root.right,node);
            if(right != -1)
                return right + 1;
            else
                return -1;
        }
    }
    
	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {
		if(root == null)
            return false;
        else
            return ((height(root,p) == height(root,q)) && (!cousin(root,p,q)));

	}
}
