package automation_program_exercise;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		char operator ;
		double no1;
		double no2;
		double result;
	
		
		Scanner scan= new Scanner(System.in);
			
			System.out.println("operator = +,-,*,/");
			operator= scan.next().charAt(0);

			System.out.println("number 1 =");
			no1= scan.nextInt();
			System.out.println("number 2 = ");
			no2= scan.nextInt();
			
			switch (operator) {
			case '+':
				result = no1 + no2;
				System.out.println("result = " + result);
				break;

			case '-':
				result = no1 - no2 ;
				System.out.println("result = " + result);
			
			case '*':
				result = no1 * no2 ;
				System.out.println("result = " + result);
				
			case '/':
				result = no1 / no2 ;
				System.out.println("result = " + result);
			default: 
				System.out.println("ivalid");
				break;
			}
			
			
	}

}
