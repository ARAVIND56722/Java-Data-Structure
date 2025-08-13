package SinglyLinkedList;

public class StackDriver {
	public static void main(String[] args) {
	StackLL st=new StackLL();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	int val=st.pop();
	System.out.println((val==Integer.MIN_VALUE)?"stack underflow":val);
	val=st.pop();
	System.out.println((val==Integer.MIN_VALUE)?"stack underflow":val);
	val=st.pop();
	System.out.println((val==Integer.MIN_VALUE)?"stack underflow":val);
	val=st.pop();
	System.out.println((val==Integer.MIN_VALUE)?"stack underflow":val);
	val=st.pop();
	System.out.println((val==Integer.MIN_VALUE)?"stack underflow":val);


}
}