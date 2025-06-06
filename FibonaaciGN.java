package first;


	public class FibonaaciGN {
	    public static void main(String[] args) {
	        int limit = 50; 

	        int a = 0;
	        int b = 1;

	        System.out.println("Fibonacci Series up to " + limit + ":");
	        if (a <= limit) System.out.print(a + " ");
	        if (b <= limit) System.out.print(b + " ");

	        while (b <= limit) {
	            int sum = a + b;
	            if (sum <= limit) {
	                System.out.print(sum + " ");
	            } else {
	                break;
	            }
	            a = b;
	            b = sum;
	        }
	        System.out.println();
	    }
	}

