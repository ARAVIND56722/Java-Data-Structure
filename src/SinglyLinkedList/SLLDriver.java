package SinglyLinkedList;

import java.util.Arrays;

public class SLLDriver {
	public static void main(String[]args) {
		SinglyLL s11=new SinglyLL();
		s11.inBegin(5); 
		s11.inBegin(15);
		s11.inBegin(17);
		s11.inBegin(19);
		s11.inBegin(25);
		s11.atEnd(30);
		s11.atEnd(35);
		s11.atEnd(40);
		s11.inPosition(10,1);
		s11.delete(40);
		
		s11.printLL();
	}

}
