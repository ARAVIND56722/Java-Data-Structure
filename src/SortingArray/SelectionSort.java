package SortingArray;
import java.util.Arrays;
import java.util.*;
public class SelectionSort {
	void selectSort(int num[]) {
    for(int i=0;i<num.length-1;i++) {
    	for(int j=i+1;j<num.length;j++) {
    		if(num[i]>num[j]) {
    			int temp=num[i];
    			num[i]=num[j];
    			num[j]=temp;
    		}
    	    
    	}
    }
    System.out.println("selection sort:"+Arrays.toString(num));
    
}
    void bubbleSort(int num[]) {
    	boolean bool =true;
    	while(bool) {
    		bool=false;
    		for(int i=0;i<num.length-1;i++) {
    				if(num[i]>num[i+1]) {
    					int temp=num[i];
    					num[i]=num[i+1];
    	    			num[i+1]=temp;
    	    			bool=true;	
    				}
    			}
    			
    		}
    		
    	}
    public static void main(String[] args) {
    	
    	int num[]= {34,68,90,20,35};
    	System.out.print("unsorted array:");
    	System.out.println(Arrays.toString(num));
    	SelectionSort obj=new SelectionSort();
    	
    	obj.selectSort(num);
    	obj.bubbleSort(num);
    	System.out.println("Bubble sort:"+Arrays.toString(num));
    	
	}
}
