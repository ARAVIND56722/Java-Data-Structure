package SortingArray;
import java.util.*;
public class StringConcepts {
	public static void main(String[]args) {
		String name="ngp coLLege";
		String res="";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			res=ch+res;
		    if(ch>=65 && ch<=90) {
		    	ch=(char)(ch+32);
		    }
		    else if(ch>=97 && ch<=122) {
		    	ch=(char)(ch-32);
		    }
			res=res+ch;
		}
		System.out.println(res);
	}

}
