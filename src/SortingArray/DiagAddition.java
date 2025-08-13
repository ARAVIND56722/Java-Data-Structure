package SortingArray;
import java.util.*;
public class DiagAddition {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i][i];
		}
		System.out.println(sum);
	}
	

}
