package flowcontrol;

import java.util.Scanner;

public class UserInputExmpl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//to get user inputs
		System.out.println("finding biggest number amoung 3 numbers: ");
		System.out.println("enter input value1 ");
		int n1 =sc.nextInt();
		System.out.println("enter input value2 ");
		int n2 =sc.nextInt();
		System.out.println("enter input value3 ");
		int n3 =sc.nextInt();
		
		if (n1==n2 && n2==n3) {
			System.out.println("all numbers are same");
		}
		else if(n1>n2 && n1>n3) { // 10 10 10
			
			System.out.println("biggest number is  : "+n1);
		}else if (n2>n3) {
			System.out.println("biggest number is  : "+n2);
		}else {
			System.out.println("biggest number is  : "+n3);
		}
		     
	
		
				
	}
	
}
