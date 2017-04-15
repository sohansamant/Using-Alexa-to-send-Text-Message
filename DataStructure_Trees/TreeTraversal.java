
class TNode
	{
		int key;
		Node left, right;
		
		TNode(int item)
		{
			key = item;
			left=right=null;
			
		}
	}

public class TreeTraversal 
{
	static Node root;
	
	TreeTraversal(int key)
	{
		root = new Node(key);
		
	}
	
	TreeTraversal()
	{
		root = null;
	}
	public static void main(String[] args) throws Exception
	{
		TreeTraversal tr = new TreeTraversal();
		
		tr.root= new Node(100); // root of the tree
		
		tr.root.left=new Node(50); // left child of root
		tr.root.right=new Node(120); // right child of root
		
		tr.root.left.left=new Node(30);
		tr.root.left.right=new Node(60);
		tr.root.left.left.left=new Node(20);
		tr.root.left.left.right=new Node(35);
		
		tr.root.right.left=new Node(110);
		tr.root.right.right=new Node(130);
		
		System.out.println("Inorder Traversal: ");
		tr.InOrder(root);	
		
		System.out.println();System.out.println();
		
		System.out.println("Preorder Traversal: ");
		tr.PreOrder(root);
		
		System.out.println();System.out.println();
		
		System.out.println("Postorder Traversal: ");
		tr.PostOrder(root);
		
	}
	
	public void InOrder(Node root)  // InOrder Tree Traversal
	{
		if(root!=null)
		{
			InOrder(root.left);
			System.out.printf(" "+root.key);
			InOrder(root.right);
		}
	}
	
	public void PreOrder(Node root) // PreOrder Tree Traversal
	{
		if(root!=null)
		{
			System.out.printf(" "+root.key);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	
	public void PostOrder(Node root)
	{
		if(root!=null)
		{
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.printf(" "+root.key);
		}
	}
}


