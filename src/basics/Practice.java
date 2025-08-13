package basics;
import java.util.HashMap;
import java.util.Map;
public class Practice {
	public static void main(String[] args) {
        HashMap<Character ,Integer> s=new HashMap<>();
        String st = ("Java is a best Programming Language");
        for(char ch:st.toCharArray()) {
        	s.put(ch, s.getOrDefault(ch, 0)+1);
        }
        System.out.println(s);
	}

}
