package Stack;

public class StackDriver {
	public static void main(String[] args) {
		Basics st=new Basics();
		System.out.println(st.capacity);
		st.push("aravind");
		st.push("aadhi");
		st.push("gowtham");
		st.push("ashwin");
		st.push("ashwiththa");
		st.push("ashwini");
		System.out.println((st.peek()==null)?"underflow":st.peek());
		String res=st.pop();
		System.out.println((res==null)?"underflow":st.pop());
		
	}

}
