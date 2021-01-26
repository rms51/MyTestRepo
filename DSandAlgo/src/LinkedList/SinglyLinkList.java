package LinkedList;

public class SinglyLinkList {
	private ListNode head;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	//Insert node at begining
	public void insertAtBegining(int data)
	{
		ListNode node= new ListNode(data);
		node.next=head;
		head=node;
	}
	//Print a linkedlist
	public void printLinkedList()
	{
		if(head==null)
		{
			System.out.println("null");
			return;
		}
		ListNode current=head;
		System.out.print(current.data);
		current = current.next;
		while(null!=current) {
			System.out.print("---->");
			System.out.print(current.data);
			current=current.next;
		}
	}
	//find length of a linklist
	public void lenght()
	{
		if(head==null)
			return ;
		int count=0;
		while(head!=null)
		{
			head=head.next;
			count++;
		}
		System.out.println();
		System.out.println(count);
	}
	//delete first node
	public void deleteFirstNode()
	{
		if(head==null)
			return;
		ListNode node=head;
		node.next=null;
		head=head.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkList sll=new SinglyLinkList();
		sll.insertAtBegining(15);
		sll.insertAtBegining(19);
		sll.insertAtBegining(12);
		sll.insertAtBegining(11);
		
		sll.printLinkedList();
		sll.lenght();
		sll.deleteFirstNode();
		sll.printLinkedList();
		

	}

}
