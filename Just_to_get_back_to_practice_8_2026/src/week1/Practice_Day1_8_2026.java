package week1;
import java.util.Scanner;


public class Practice_Day1_8_2026 {
	
	

	public static void main(String[]args){
		System.out.println("MY CALCULATOR");
		Scanner scan = new Scanner(System.in); 
       
		System.out.println("PLEASE CHOOSE AN OPTION FOR BELOW"
			            	+ "\n 1.ADD NUMBERS"
			            	+ "\n 2.SUB NUMBERS"
			            	+ "\n 3.DIV NUMBERS"
			            	+ "\n 4.MULT NUMBERS");
		
		
	while(true) {
		System.out.println("===========================================");
	
		System.out.println("Enter first number"); 
		int num1 = scan.nextInt();
		
		System.out.println("Enter second number"); 
		int num2 = scan.nextInt(); 
		
		System.out.println("Now chose your operation"); 
		int User_input = scan.nextInt();
		
	    if (User_input == 1){
	    	System.out.println(Practice_Day1_8_2026.add(num1, num2));}
	    if(User_input == 2) {
	    	System.out.println(Practice_Day1_8_2026.sub(num1, num2));}	    	
	    if(User_input == 3) {
	 	    System.out.println(Practice_Day1_8_2026.div(num1, num2));}
	 	if(User_input == 4) {
	 		System.out.println(Practice_Day1_8_2026.mult(num1, num2));}
	    	
	}
}	
	
	
	
public static int add(int a, int b) {
	return a + b; 
}

public static int sub(int a, int b) {
	return a - b; 
}

public static int div(int a, int b) {
	return a / b;
}

public static int mult(int a, int b) {
	return a * b; 
}
	

}
