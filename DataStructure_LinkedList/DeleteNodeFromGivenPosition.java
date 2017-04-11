
public class DeleteNodeFromGivenPosition 
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next=null;
		}
	}
	
	public static void main(String[] args)
	{
		DeleteNodeFromGivenPosition llist = new DeleteNodeFromGivenPosition();
		 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
 
        System.out.println("\nCreated Linked list is: ");
        llist.printList();
 
        llist.deleteNode(2);  // Delete node at position 4
 
        System.out.println("\nLinked List after Deletion at position 2: ");
        llist.printList();
	}
	
	
	private void deleteNode(int position) 
	{
		if(head==null)  // if the list is empty
			return;
		
		Node temp= head;
		
		if(position==0) // if head is to be removed
		{
			head = temp.next;
			return;
		}
		
		for(int i = 0; i<position-1 && temp!=null; i++)  // traversing till the previous node of the node which is to be deleted
		{
			temp = temp.next;
		}
		
		if(temp==null || temp.next==null)
			return;
		
		Node next = temp.next.next;
		temp.next=next;
		
			
	}


	public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
	
	public void printList()
	{
		Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
	}
	

}
