package first;

public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("Before calling the method.");
        printMessage();
        System.out.println("After calling the method.");
        
        int result = addNumber(5,7);
        		System.out.println(result);
    }
    static void printMessage() {
		System.out.println("Inside method");
		return;

    }
    static int addNumber(int a, int b ) {
    	return a+b;
    }

    
}
