package automation_program_exercise;

public class exercise4 {

	public static void main(String[] args) {
		int sum =0;
		char[] digits= {1,3,4,5,3};
		for (char c : digits) {
	        sum += Character.getNumericValue(c);
	    }
	   // return sum;
	    System.out.println(sum);
	}

	}


