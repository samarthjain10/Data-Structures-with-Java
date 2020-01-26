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
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
        int arr[]=new int[1000];
		helper(root,k,arr,0);
	}
    public static void helper(BinaryTreeNode<Integer> root, int k,int[] arr,int i)
    {
        if(root==null)
            return;
        else if(root.right==null&&root.left==null)
        {
            arr[i]=root.data;
            i++;
            int sum=0;
            for(int j=0;j<i;j++)
                sum+=arr[j];
            if(sum==k)
            {
                for(int j=0;j<i;j++)
                    System.out.print(arr[j]+" ");
                System.out.println();
            }
        }
        else
        {
            arr[i]=root.data;
            i++;
        }
        helper(root.left,k,arr,i);
        helper(root.right,k,arr,i);
    }
}
