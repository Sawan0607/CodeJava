package first;

	
	public class FibonacciW {
	    public static void main(String[] args) {
	        int n = 10; 
	        int firstTerm = 0;
	        int secondTerm = 1;
	        int i = 1;

	        System.out.println("Fibonacci Series up to " + n + " terms:");

	        while (i <= n) {
	            System.out.print(firstTerm + ", ");

	            int nextTerm = firstTerm + secondTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	            i++;
	        }
	        System.out.println("\b\b "); 
	    }
	}


