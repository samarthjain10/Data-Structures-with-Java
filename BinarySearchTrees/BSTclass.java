//1 20 1 10 1 30 1 0 1 15 1 25 1 45 1 -10 1 5 1 12 1 17 2 10 2 15 4
public class BinarySearchTree 
{

    public static BinaryTreeNode<Integer> root;

    
    
    
    public static BinaryTreeNode<Integer> insertData(int data)
    {
        root=insertData(data,root);
        return root;
    }
    public static BinaryTreeNode<Integer> insertData(int data,BinaryTreeNode<Integer> root)
    {
        if(root==null){
            BinaryTreeNode<Integer> node=new BinaryTreeNode<Integer>(data);
            return node;
        }
        else if(data>root.data){
            root.right=insertData(data,root.right);
        }
        else{
            root.left=insertData(data,root.left);
        }
        return root;
    }
    
    
    
    
    public static BinaryTreeNode<Integer> deleteData(int data)
    {
        root=deleteData(data,root);
        return root;
    }
    public static BinaryTreeNode<Integer> deleteData(int data,BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return null;
        else if(root.data==data)
        {
            if(root.left==null&&root.right==null)
                return null;
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                BinaryTreeNode<Integer> temp=root.right;
                BinaryTreeNode<Integer> prev=null;
                while(temp.left!=null)
                {
                    prev=temp;
                    temp=temp.left;
                }
                root.data=temp.data;
                if(prev==null)
                    root.right=temp.right;
                else 
                    prev.left=null;
            }
        }
        else if(root.data>data)
            root.left=deleteData(data,root.left);
        else if(root.data<data)
            root.right=deleteData(data,root.right);
        return root;
    }
    
    
    
    
    public static boolean search(int data)
    {
        return search(data,root);
    }
    public static boolean search(int data,BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return false;
        else if(root.data==data)
            return true;
        else if(root.data>data)
            return search(data,root.left);
        else if(root.data<data)
            return search(data,root.right);
        else
            return false;
    }
    
    
    
    
    public static void printTree()
    {
        printTree(root);
    }
    public static void printTree(BinaryTreeNode<Integer> root)
    {
        if(root==null)
            return;
        System.out.print(root.data+":");
        if(root.left!=null)
            System.out.print("L:"+root.left.data+",");
        if(root.right!=null)
            System.out.println("R:"+root.right.data);
        else
             System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    
    
    
}