package SinglyCircular;
public class CircularLL {
	Node head=null;
	Node tail=null;
	void inBegin(int data) {
		Node newNode=new Node(data);
	     if(head==null) {
	    	 
	    	 head=newNode;
	    	 tail=newNode;
	    	 newNode.next=head;
	     }
	     else {
	    	newNode.next=head;
	    	head=newNode;
	    	tail.next=head;
	    	 
	     }
	}
	//insert at end
	void atEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			System.out.println("LinkedList is empty");
		}
		else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}	
	}
	//deleting a node
	void delete(int val) {
		if(head==null) {
			System.out.println("singly sircular list is empty");
		}
		//deleting a head node
	
		if(head.data==val) {
			tail.next=head.next;
			head=head.next;
		}
		
		//deleting a tail node
		 Node current=head;
		 Node prev=null;
		 do {
		        prev = current;
		        current = current.next;
		        if(current.data==val) {
			             if(current==tail) {
				         prev.next=head;
				         tail=prev;
	                     }
			             //deleting the middle node
			             else {
			            	 prev.next=current.next;
			             }
			             return;
			             }
           } 
		 while(current.next!=null);
	}

	     void display() {
	    	 if(head==null) {
	    		 System.out.println("SINGLY-CIRCULAR LIST IS EMPTY");
	    		 return;
	    	 }
	    	 
	    	 Node current=head;
	    	 do {
	    		 System.out.print(current.data);
	    		 if(current!=null) {
	    			 System.out.print("------>");
	    		 }
	    		 current=current.next;
	    	 }
	    	 while(current!=head);
	    	 System.out.print(head.data);
	    		
	    		 
	    		 
	    	 }
	     }


