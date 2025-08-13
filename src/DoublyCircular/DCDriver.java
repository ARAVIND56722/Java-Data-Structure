package DoublyCircular;
import java.util.*;
public class DCDriver {
	public static void main(String[] args) {
		CircularLL Cll=new CircularLL();
		Cll.inBegin(6);
		Cll.inBegin(5);
		Cll.inBegin(4);
		Cll.inBegin(3);
		Cll.inBegin(2);
		Cll.inBegin(1);
		Cll.atEnd(7);
		Cll.atEnd(8);
		Cll.delete(3);
		
		Cll.display();
	}

}
