package DoublyLinkedList;
import java.util.Arrays;
public class DoublyLL {
	Node head=null;
	// insert atBegin
	void inBegin(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
	}
	//insert atEnd
	void atEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			System.out.println("cant insert");
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
		newNode.prev=current;
	}
	//to display the output
	void display() {
		if(head==null) {
			System.out.println("LL is empty");
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.data);
	
		    if(current.next!=null) {
			     System.out.print("<----->");
		         
		    }
		    current=current.next;
		}	
		
	}
}
