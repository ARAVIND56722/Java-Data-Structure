package SinglyCircular;
import java.util.*;
public class SinCirLL {
	public static void main(String[] args) {
		CircularLL cll=new CircularLL();
		cll.inBegin(6);
		cll.inBegin(5);
		cll.inBegin(4);
		cll.inBegin(3);
		cll.inBegin(2);
		cll.inBegin(1);
		cll.atEnd(7);
	    cll.delete(7);
		cll.display();
		
	}

}
