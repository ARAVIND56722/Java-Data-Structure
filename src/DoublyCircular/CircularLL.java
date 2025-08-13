package DoublyCircular;
import java.util.*;
public class CircularLL {
	Node head=null;
	Node tail=null;
	//insert at begin;
	void inBegin(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
		else {
		    newNode.next = head;
		    newNode.prev = tail;
		    tail.next = newNode;
		    head.prev = newNode; 
		    head = newNode;
		}

	}
	//insert at end
	void atEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			System.out.println("can't insert");
		}
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		tail.next=head;
	}
	void delete(int val) {
		if(head==null) {
			System.out.println("doubly circular linked list is empty");
		    return;
		}
		//deleting the head node
		if(head.data==val) {
			if(head==tail) {
				head = null;
                tail = null;
                return;
			}
			head=head.next;
			head.prev=tail;
			tail.next=head;
			return;
			
		}
		Node current=head.next;
// deleting the tail node
		while(current!=head) {
			if(current.data==val) {
				if(current==tail) {
					tail=tail.prev;
					tail.next=head;
				    head.prev=tail;
					
				}else {
				current.prev.next=current.next;
				current.next.prev=current.prev;
			}
			return;
			
			
		}
		current=current.next;
		}
		
		
	}
	void display() {
		if(head==null) {
			System.out.println("doubly circular linked list is empty");
		}
		Node current=head;
		do {
			System.out.print(current.data);
			current=current.next;
			if(current!=head) {
				System.out.print("---->");
			}
			
		}
		while(current!=head);
		System.out.println();
	}

}
