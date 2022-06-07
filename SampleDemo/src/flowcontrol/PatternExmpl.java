package flowcontrol;

import java.util.HashMap;
import java.util.Scanner;

public class PatternExmpl {

	public static void main(String[] args) {
		
		int num =11;
		int h=num/2;
		int v=num/2;
	
		for(int i =1;i<=num ;i++) {
			for(int j=0; j<num;j++) {
				
				if(j==h || j==v) {
					System.out.print("*");
					}else
						System.out.print(" ");	
			}
		if(i<=num/2) {
			h--;
			v++;
		}else {
			h++;
			v--;
		}
			
		
			System.out.println();
			
		
			
		}
	}
	
	
	public void charCount(){
		String city = "mumbai";
		char[] arr = city.toCharArray();

		HashMap<Character,Integer> map = new HashMap<>();

		for(char c : arr) {
			
			if(map.containsKey(c)) {
				int val = map.get(c);
				map.put(c, val++);
			}else {
				map.put(c, 1);
			}
		}
           System.out.println(map);

	}
	
	}





















