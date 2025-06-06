package first;

	
	public class Factorialwhileloop {
	    public static void main(String[] args) {
	        int num = 5; 
	        long factorial = 1;
	        int i = 1;

	        while (i <= num) {
	            factorial = factorial * i;
	            i++;
	        }

	        System.out.println("Factorial of " + num + " is: " + factorial);
	    }
	}

