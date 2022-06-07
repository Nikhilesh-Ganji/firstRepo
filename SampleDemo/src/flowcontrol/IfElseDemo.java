package flowcontrol;

public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		IfElseDemo d1= new IfElseDemo();
		d1.table(5);
		d1.table(6);
		d1.table(9);
		
		System.out.println("table printing completed");
	}
		
	public void table(int num) {

		System.out.println(num +" table");
		for(int i =1; i<=10;i++) {
			
			int mult = num *i;
			System.out.println(num + " * "+ i +" = "+ mult); 
			
		}
	}

}
