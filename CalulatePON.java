package first;


	public class CalulatePON {
	    public static void main(String[] args) {
	        int base = 3;      
	        int exponent = 4;  
	        long result = 1;

	        int i = 1;
	        while (i <= exponent) {
	            result *= base;
	            i++;
	        }

	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	    }
	}

