package first;

	
	public class CalculatePONF {
	    public static void main(String[] args) {
	        int base = 3;       
	        int exponent = 4;   
	        long result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	    }
	}


