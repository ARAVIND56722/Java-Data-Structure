package SinglyLinkedList;
import java.util.Arrays;
public class SinglyLL {
	Node head=null;
	//insert begin
	void inBegin(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		return;
	}
	//insert at end
	void atEnd(int data) {
		if(head==null) {
			inBegin(data);
			return;
		
	}
		Node current = head;
		Node NewNode=new Node(data);
		while(current.next!=null) {
			current=current.next;
		}
		current.next= NewNode;
		return;
	}
	void inPosition(int data,int pos) {
		if(head==null) {
			System.out.println("cant insert");
			return;
		}
		if(pos==0) {
			inBegin(data);
			return;
		}
		int count=1;
		Node current=head;
		while(current.next!=null) {
			if(count==pos) {
				Node newNode=new Node(data);
				newNode.next=current.next;
				current.next=newNode;
				return;
			}
			
			count++;
			current=current.next;
		}
		System.out.println("Index out of bound .");
		
	}
	//delete the node
	void delete(int val) {
		if(head==null) {
			System.out.println("linkedlist is empty ");
			return;
		}
		if(head.data==val) {
			head=head.next;
			return;
		}
		Node current=head;
		while(current.next!=null && current.next.data!=val) {
			current=current.next;
			
		}
		if(current.next!=null ) {
			current.next=current.next.next;
			return;
		
		}
		System.out.println(val+" is not in the list");
	}
	void search(int val) {
		if(head==null) {
			System.out.println("ll is empty");
			return;
		}
		Node current=head;
		int pos=0;
		while(current!=null) {
			if(current.data==val) {
				System.out.println(val+"in the pos"+pos);
				return;
			}
			pos++;
			current=current.next;
		}
		System.out.println(val+" ");
	}
	void printLL() {
		if(head==null) {
			System.out.println("LL is empty");
			return;
		}
		Node current=head;
		while(current.next!=null) {
			System.out.print(current.data+"--->");
			current=current.next;
		}
		System.out.println(current.data);
	}
}
