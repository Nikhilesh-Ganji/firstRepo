package flowcontrol;

import java.util.Scanner;

public class ArrayUserInput {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 System.out.println("enter array size: ");
	 int size = sc.nextInt();
	 
	 int[] arr = new int[size];
	 
	 System.out.println("enter array values: ");
	 
	 for(int i =0; i<size ;i++) {
		 int val = sc.nextInt();
		 arr[i] = val;
		 
	 }
	
     System.out.println("printing array values: ");
	 
	 for(int i =0; i<size ;i++) {
		 
		 System.out.println(" array value at index :"+i + " is : "+arr[i]);
		 
	 }
	}

}
