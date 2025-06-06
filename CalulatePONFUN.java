package first;

	
	public class CalulatePONFUN {

	    public static long power(int base, int exp) {
	        long res = 1;
	        for (int i = 0; i < exp; i++) {
	            res *= base;
	        }
	        return res;
	    }

	    public static void main(String[] args) {
	        int b = 2;
	        int e = 3;
	        long result = power(b, e);
	        System.out.println(b + " raised to " + e + " is: " + result); 
	    }
	}


