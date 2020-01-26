import java.util.ArrayList;

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

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        ArrayList<Integer> al=new ArrayList<Integer>();
        return findPath(root,data,al);
	}
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data,ArrayList<Integer> al){
        if(root==null)
            return al;
        else if(data==root.data)
        {
            al.add(root.data);
            return al;
        }
        else if(data>root.data)
        {
            al=findPath(root.right,data,al);
            if(al.isEmpty()==false)
            {
                al.add(root.data);
            }
        }
        else
        {
            al=findPath(root.left,data,al);
            if(al.isEmpty()==false)
            {
                al.add(root.data);
            }
        }
        return al;
    }
}