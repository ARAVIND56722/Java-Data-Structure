package SortingArray;
import java.util.*;
public class PracticeProgram {
	boolean keyBoardVerify(String st) {
		String stArr[]= {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
	    char ch=st.charAt(0);
	    int ind=-1;
	    for(int i=0;i<stArr.length;i++) {
	    	if(stArr[i].indexOf(ch)>=0) {
	    		ind=i;
	    		break;
	    	}
	    }
	    for(int i=1;i<st.length();i++) {
	    	ch=st.charAt(i);
	    	if(stArr[ind].indexOf(ch)<0) {
	    		return false;
	    	}
	    			
	    }
	    return true;
}
	public static void main(String[]args) {
		PracticeProgram r=new PracticeProgram();
		if(r.keyBoardVerify("alaska")) {
			System.out.println("It is matched");
		}
		else {
			System.out.println("Not matched");
		}
		
	}
}